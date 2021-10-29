package com.selfmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class SelfMap<T , U > {
	final int ARRAY_SIZE = 100;
	List<ItemData<T,U>>[] keyvalues = new ArrayList[ARRAY_SIZE];

	public int getHashCodeByKey(T key) {
		int position = Objects.hash(key) % ARRAY_SIZE;
		return position;
	}
	
	public void put(T key, U value) {
		ItemData<T,U> newItem = new ItemData<>(key,value);
		int arrayIndex = getHashCodeByKey(key);
		if (keyvalues[arrayIndex] != null) {
			List<ItemData<T,U>> list = keyvalues[arrayIndex];
			if (list == null) {
				keyvalues[arrayIndex] = new ArrayList<ItemData<T,U>>();
				keyvalues[arrayIndex].add(newItem);
			}else {
				if(!list.contains(newItem)) {
					list.add(newItem);
				}
				
			}
		}else {
			keyvalues[arrayIndex] = new ArrayList<ItemData<T,U>>();
			keyvalues[arrayIndex].add(newItem);
			
		}
	}

	public U get(T key) {
		U value = null;
		int arrayIndex=getHashCodeByKey(key);
		if(keyvalues[arrayIndex] != null) {
			List<ItemData<T,U>> list = keyvalues[arrayIndex];
			if(list!=null) {
				for(ItemData item:list) {
					if (item.getKey().equals(key)) {
						value= (U)item.getValue();
					}
				}
			}else {
				value = null;
			}
			
		}
		return value;
	}
	public int  remove(T key) {
		int result =-1;
		int arrayIndex = getHashCodeByKey(key);
		if (keyvalues[arrayIndex] != null) {
			List<ItemData<T,U>> list = keyvalues[arrayIndex];
			if(list!=null) {
				Iterator<ItemData<T,U>> it = list.iterator();
				while(it.hasNext()) {
					ItemData<T,U> item = it.next();
					if(item.getKey().equals(key)) {
						it.remove();
						result=arrayIndex;
						break;
					}
				}
				
			}
		}
		return result;
	}

}
