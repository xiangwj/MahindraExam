package com.selfmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.selfmap.SelfMap;

public class SelfMapTest {

	@Test
	public void put() {
		SelfMap<String,String> map = new SelfMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		assertEquals("value1",map.get("key1"));
		assertEquals("value2",map.get("key2"));
	}
	@Test
	public void getNotNull() {
		SelfMap<String,String> map = new SelfMap();
		map.put("key1", "value1");
		assertNotNull(map.get("key1"));
	}
	@Test
	public void getNull() {
		SelfMap<String,String> map = new SelfMap();
		assertNull(map.get("key1"));
		
	}	
	@Test
	public void removeExist() {
		SelfMap<String,String> map = new SelfMap();
		map.put("key1", "value1");
		assertNotEquals(-1, map.remove("key1"));
	}	
	@Test
	public void removeNotExist() {
		SelfMap<String,String> map = new SelfMap();
		assertEquals(-1, map.remove("key1"));
	}	
	
}
