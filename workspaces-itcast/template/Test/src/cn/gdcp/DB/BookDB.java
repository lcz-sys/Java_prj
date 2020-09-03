package cn.gdcp.DB;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.gdcp.domain.Book;

public class BookDB {
	
	private static Map<String, Book> books = new LinkedHashMap<String , Book>();
	static {
		books.put("1", new Book("1", "java web1开发"));
		books.put("2", new Book("2", "java web2开发"));
		books.put("3", new Book("3", "java web3开发"));
		books.put("4", new Book("4", "java web4开发"));
		books.put("5", new Book("5", "java web5开发"));
	}
	
	public static Collection<Book> getAll(){
		return books.values();
	}
	
	public static Book getBook(String id){
		return books.get(id);
	}
	
}
