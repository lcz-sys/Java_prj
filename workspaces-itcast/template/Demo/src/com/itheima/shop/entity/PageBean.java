package com.itheima.shop.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页类
 */
public class PageBean<T> implements java.io.Serializable{
	private int currPageNO;//当前页号OK
	private int perPageNO;//页面大小OK
	private int allRecordNO;//总记录数OK
	private int allPageNO;//总页数OK
	private List<T> list = new ArrayList<T>();//页面内容OK
	
	public PageBean() {
	}

	public int getCurrPageNO() {
		return currPageNO;
	}

	public void setCurrPageNO(int currPageNO) {
		this.currPageNO = currPageNO;
	}

	public int getPerPageNO() {
		return perPageNO;
	}

	public void setPerPageNO(int perPageNO) {
		this.perPageNO = perPageNO;
	}

	public int getAllRecordNO() {
		return allRecordNO;
	}

	public void setAllRecordNO(int allRecordNO) {
		this.allRecordNO = allRecordNO;
	}

	public int getAllPageNO() {
		return allPageNO;
	}

	public void setAllPageNO(int allPageNO) {
		this.allPageNO = allPageNO;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
