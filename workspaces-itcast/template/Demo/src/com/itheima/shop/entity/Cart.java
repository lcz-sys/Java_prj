package com.itheima.shop.entity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 购物车
 */
public class Cart implements java.io.Serializable{
	private Map<Integer,Item> map = new LinkedHashMap<>();//购物项集合
	private double total;//总价
	
	public Cart(){}

	public Map<Integer, Item> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Item> map) {
		this.map = map;
	}

	public double getTotal() {
		double temp = 0.0;
		for(Entry<Integer, Item> entry : map.entrySet()){
			temp += entry.getValue().getSubTotal();
		}
		this.total = temp;
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
