package com.gdcp.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.Customer;
import com.gdcp.utils.MybatisUtils;

public class findCustomerByNameTest {
	
	public static void main(String[] args) {
	    SqlSession session = MybatisUtils.getSession();
	    
	    Customer customer = new Customer();
	    
	    customer.setUsername("jack");
	    customer.setJob("actor");
	    
	    List<Customer> customers = session.selectList("com.gdcp.mapper.CustomerMapper.findCustomerNameAndJob",customer);
	
	    for(Customer customer2 :customers){
	    	System.out.println("customer2");
	    }
	    
	    session.close();
	}

}
