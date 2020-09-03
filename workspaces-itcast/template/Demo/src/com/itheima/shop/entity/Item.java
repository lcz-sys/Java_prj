package com.itheima.shop.entity;

/**
 * 购物项
 */
public class Item implements java.io.Serializable{
	private Product product;//商品
	private int num;//数量
	private double subTotal;//小计
	
	public Item(){}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
}
