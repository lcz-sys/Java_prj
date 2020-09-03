package com.itheima.shop.entity;

/*
 * 商品
 */
public class Product implements java.io.Serializable {
	// pid：商品编号
	private int pid;
	// pname：商品名称
	private String pname;
	// market_price：商品的市场价
	private double market_price;
	// shop_price：商品的商城价
	private double shop_price;
	// pimage：商品的图片路径
	private String pimage;
	// pdate：商品的上架时间
	private java.util.Date pdate;
	// is_hot：商品是否热门，1热门，0冷门
	private int is_hot;
	// pdesc：商品的描述
	private String pdesc;
	// pflag：商品是否上架，1上架，0下架
	private int pflag;
	// category：商品所属类别
	private Category category;

	public Product() {
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getMarket_price() {
		return market_price;
	}

	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}

	public double getShop_price() {
		return shop_price;
	}

	public void setShop_price(double shop_price) {
		this.shop_price = shop_price;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public java.util.Date getPdate() {
		return pdate;
	}

	public void setPdate(java.util.Date pdate) {
		this.pdate = pdate;
	}

	public int getIs_hot() {
		return is_hot;
	}

	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public int getPflag() {
		return pflag;
	}

	public void setPflag(int pflag) {
		this.pflag = pflag;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
