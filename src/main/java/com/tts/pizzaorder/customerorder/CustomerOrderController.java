package com.tts.pizzaorder.customerorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerOrderController {
	
@Autowired
private CustomerOrderRepository customerorderRepository;
	
@GetMapping(value = "/")
public String index(CustomerOrder customerorder) {
		return "customerOrderList/index";
		
}
private CustomerOrder customerorder;
@PostMapping(value = "/")
public String addNewCustomerOrder(CustomerOrder customerorder, Model model) {
	customerorderRepository.save(new CustomerOrder(customerorder.getFirstName(),customerorder.getLastName(),customerorder.getEmail(),customerorder.getPhoneNumber(),customerorder.getNumberOfOrder(),customerorder.getTimeOfOrder(),customerorder.getSignedUp())); 
			
	model.addAttribute("firstName", customerorder.getFirstName());
	model.addAttribute("lastName", customerorder.getLastName());
	model.addAttribute("email", customerorder.getEmail());
	model.addAttribute("phonenumber", customerorder.getPhoneNumber());
	model.addAttribute("numberoforder", customerorder.getNumberOfOrder());
	model.addAttribute("timeoforder", customerorder.getTimeOfOrder());
	
	return "customerOrderList/result";
}


}




