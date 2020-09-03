package cn.gdcp.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gdcp.po.Customer;
import cn.gdcp.service.CustomerService;

@Controller
public class CustomerContorller {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("/findCustomerById")
	public String findCustomerById(Integer id,Model model){
		
		Customer customer = customerService.findCustomerById(id);
		
		model.addAttribute("customer",customer);
		
		System.out.println("CustomerService");
		
		return "customer";
		
	}

}
