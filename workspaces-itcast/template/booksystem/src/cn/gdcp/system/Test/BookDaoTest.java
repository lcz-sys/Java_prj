package cn.gdcp.system.Test;

import java.util.ArrayList;

import org.junit.Test;

import cn.gdcp.system.dao.BookDao;
import cn.gdcp.system.model.Book;

public class BookDaoTest {
	
	@Test
	public void testSearch() throws Exception{
		BookDao bookDao = new BookDao();
		
		ArrayList<Book> list = bookDao.search("java");
		
//		//普通for循环
//		for(int i = 0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
		//增强for循环
		for(Book book: list){
			System.out.println(book);
		}
		
	}
	
	@Test
	public void testFindAll() throws Exception{
		BookDao bookDao = new BookDao();
		
		ArrayList<Book> list = bookDao.findAllBookS();
		
		//普通for循环
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//增强for循环
		for(Book book: list){
			System.out.println(book);
		}
		
	}

}
