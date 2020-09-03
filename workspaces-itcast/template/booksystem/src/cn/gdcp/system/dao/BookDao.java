package cn.gdcp.system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.gdcp.system.model.Book;
import cn.gdcp.system.util.JdbcUtil;

public class BookDao {
	
	public ArrayList<Book> search(String bookName) throws Exception{
		ArrayList<Book> list = new ArrayList<>();
		//链接数据库
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from t_book where name like ?";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, "%"+bookName+"%");
		ResultSet set = prps.executeQuery();
		while(set.next()){
			Book book = new Book();
			String id = set.getString("id");
			String name = set.getString("name");
			double price = set.getDouble("price");
			int bnum = set.getInt("bnum");
			String category = set.getString("category");
			
			book.setId(id);
			book.setName(name);
			book.setPrice(price);
			book.setBnum(bnum);
			book.setCategory(category);
			
			list.add(book);
			
		}
		return list;
	}
 	
	public ArrayList<Book> findAllBookS() throws Exception{
		
		ArrayList<Book> list = new ArrayList<>();
		//链接数据库
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from t_book";
		PreparedStatement prps = conn.prepareStatement(sql);
		ResultSet set = prps.executeQuery();
		while(set.next()){
			Book book = new Book();
			String id = set.getString("id");
			String name = set.getString("name");
			double price = set.getDouble("price");
			int bnum = set.getInt("bnum");
			String category = set.getString("category");
			
			book.setId(id);
			book.setName(name);
			book.setPrice(price);
			book.setBnum(bnum);
			book.setCategory(category);
			
			list.add(book);
			
		}
		return list;
	}
	
	public void deleteBook(String id) throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "delete from t_book where id=?";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, id);
		prps.execute();
		prps.close();
	}
	
	public void addBook(Book book) throws Exception{
		//获取链接
		Connection conn = JdbcUtil.getConnection();
		//获取执行者对象
		String sql = "insert into t_book(id, name, price, bnum,category) value(?,?,?,?,?)";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, book.getId());
		prps.setString(2, book.getName());
		prps.setDouble(3, book.getPrice());
		prps.setInt(4, book.getBnum());
		prps.setString(5, book.getCategory());
		
		//执行sql语句
		prps.execute();
		
		//解析数据集
		//关闭数据库链接
		prps.close();
	}

	public void editBook(Book book) throws Exception {
		Connection conn = JdbcUtil.getConnection();
		String sql = "update t_book set name=?, "
				+ "price=?, bnum=?, category=? where id=?";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, book.getName());
		prps.setDouble(2, book.getPrice());
		prps.setInt(3, book.getBnum());
		prps.setString(4, book.getCategory());
		prps.setString(5, book.getId());
		prps.executeUpdate();
		prps.close();
	}

	public Book queryBook(String id) throws Exception {
		//获取链接
		Connection conn = JdbcUtil.getConnection();
		//获取执行者对象
		String sql = "select * from t_book where id=?";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, id);
		ResultSet set = prps.executeQuery();
		if(set.next()){
			Book book = new Book();
			String name = set.getString("name");
			double price = set.getDouble("price");
			int bnum = set.getInt("bnum");
			String category = set.getString("category");
			
			book.setId(id);
			book.setName(name);
			book.setPrice(price);
			book.setBnum(bnum);
			book.setCategory(category);
			
			return book;
		}
		return null;
	}

}
