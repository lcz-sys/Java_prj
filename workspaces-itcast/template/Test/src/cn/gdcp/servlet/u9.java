package cn.gdcp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gdcp.DB.BookDB;
import cn.gdcp.domain.Book;

public class u9 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//��ȡ����ͼ��
		Collection<Book> books = BookDB.getAll();
		//��ӡͼ�����Ϻ͹������ӵ���ҳ
		out.write("��վ�ṩ��ͼ����<br/>");
		if(books != null){
			for (Book book:books){
				String url = "u9Copy?id="+book.getId();
				out.write(book.getName()+"<a href='"+url+"'>�������</a><br/>");
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
