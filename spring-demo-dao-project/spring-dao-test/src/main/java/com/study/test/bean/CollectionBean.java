package com.study.test.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.stereotype.Repository;

@Repository
public class CollectionBean {
	private Object[] arr;// 数组类型注入
	private List<Object> list;// list/set类型注入
	private Map<Object, Object> map;// map注入
	private Properties prop;// Properties 类型注入

	public Object[] getArr() {
		return arr;
	}

	public void setArr(Object[] arr) {
		this.arr = arr;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public CollectionBean() {
		super();
	}

	public CollectionBean(Object[] arr, List<Object> list, Map<Object, Object> map, Properties prop) {
		super();
		this.arr = arr;
		this.list = list;
		this.map = map;
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list + ", map=" + map + ", prop=" + prop
				+ "]";
	}

}
