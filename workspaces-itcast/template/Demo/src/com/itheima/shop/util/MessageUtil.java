package com.itheima.shop.util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 信息提示工具类
 */
public final class MessageUtil {
	
	private MessageUtil(){}
	
	public static void forward(String message , HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//将错误消息放入域对象
		request.setAttribute("MESSAGE",message);
		//转发到/WEB-INF/message.jsp页面
		request.getRequestDispatcher("/WEB-INF/message.jsp").forward(request,response);
	}
	
}
