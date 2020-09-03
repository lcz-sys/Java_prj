package cn.gdcp.domain;

public class Book {
	
	private static final long seralVersionUID = 1l;
	
	public String name;
	public String id;
	
	public Book(String id, String name){
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
