package cn.gdcp.system.model;
//图书类，匹配t_book表
public class Book {
	private String id;  //书号
	private String name; //书名
	private double price; //价格
	private int bnum; //数量
	private String category; //类别

	
	//构造方法
	public Book(){}
	public Book(String id, String name, double price, int bnum, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.bnum = bnum;
		this.category = category;
	}

	//getter setter方法
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", bnum=" + bnum + ", category=" + category
				+ "]";
	}
	
}
