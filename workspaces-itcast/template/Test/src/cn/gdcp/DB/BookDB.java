package cn.gdcp.DB;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.gdcp.domain.Book;

public class BookDB {
	
	private static Map<String, Book> books = new LinkedHashMap<String , Book>();
	static {
		books.put("1", new Book("1", "java web1����"));
		books.put("2", new Book("2", "java web2����"));
		books.put("3", new Book("3", "java web3����"));
		books.put("4", new Book("4", "java web4����"));
		books.put("5", new Book("5", "java web5����"));
	}
	
	public static Collection<Book> getAll(){
		return books.values();
	}
	
	public static Book getBook(String id){
		return books.get(id);
	}
	
}
