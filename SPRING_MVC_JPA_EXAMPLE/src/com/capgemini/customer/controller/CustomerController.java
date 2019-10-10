package com.capgemini.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.model.Customer;
import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String homePage() {
		return "index";
	}
	

	@RequestMapping(path = "addCustomerPage", method = RequestMethod.GET)
	public String addCustomer(Model model) {
		model.addAttribute("customerForm", new Customer());
		return "addCustomer";
	}
		
	@RequestMapping(path="addCustomer.do", method = RequestMethod.POST)	
	public String processaddCustomer(@Valid @ModelAttribute("customerForm") Customer customer, BindingResult bindingresult /*@RequestParam("reg_id") long id, @RequestParam("reg_name") String name, @RequestParam("reg_email") String email, @RequestParam("reg_address") String address*/) {
		if(bindingresult.hasErrors()) {
			return "addCustomer";
		}
		
		/*Customer customer = new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setEmail(email);
		customer.setAddress(address);*/
		boolean result = getCustomerService().addCustomer(customer);
		if(result)
			return "redirect:viewAllCustomerPage";
		else
			return "error";
	}
	
	@RequestMapping(path = "viewAllCustomerPage", method = RequestMethod.GET)
	public String viewAllTrainee(Model model) {
		List<Customer> list = customerService.getAllCustomers(); 
		if (list.isEmpty()) {
			return "error"; 
			}
		model.addAttribute("customerList", list);
		return "viewAllCustomers";
	}

	@RequestMapping(path="viewAll.do", method = RequestMethod.POST)
	public String viewAllCustomers(Model model){
		List<Customer> list = customerService.getAllCustomers();
		model.addAttribute("customerList", list);
		return "viewAllCustomers";
	}
	
	@RequestMapping(path = "deleteCustomerPage", method = RequestMethod.GET)
	public String deleteCustomer() {
		return "deleteCustomer";
	}
	

	@RequestMapping(path = "deleteCustomerViewPage", method = RequestMethod.POST)
	public String deleteCustomerView(@RequestParam("customerId") long id, Model model) {
		Customer customer = new Customer();
		customer.setId(id);
		customer = getCustomerService().getOneCustomer(customer);
		model.addAttribute("c", customer);
		return "deleteCustomerView";

	}

	@RequestMapping(path = "deleteCustomer.do", method = RequestMethod.POST)
	public String processDeleteCustomer(@RequestParam("customerId") long id) {
		Customer customer = new Customer();
		customer.setId(id);
	/*	Customer customer1 = null;
		customer1 = getCustomerService().getOneCustomer(customer);
		if(customer1 == null)
			return "error";*/
		boolean result = getCustomerService().removeCustomer(customer);
		if (result)
			return "redirect:viewAllCustomerPage";
		else
			return "error";
	}
	
	@RequestMapping(path = "updateCustomerPage", method = RequestMethod.GET)
	public String updateCustomerView() {
		return "updateCustomer";
	}
	
	
	@RequestMapping(path = "updateCustomerViewPage", method = RequestMethod.POST)
	public String updateCustomer(@RequestParam("customerId") long id, Model model) {
		Customer customer = new Customer();
		customer.setId(id);
		customer = getCustomerService().getOneCustomer(customer);
		model.addAttribute("c", customer);
		return "UpdateCustomerView";
	}

	@RequestMapping(path = "updateCustomer.do", method = RequestMethod.POST)
	public String processUpdateTrain(@RequestParam("customerId") int id, @RequestParam("customerName") String name,
			@RequestParam("email") String email, @RequestParam("address") String address) {
		Customer customer = new Customer();
		customer.setId(id);
		customer = getCustomerService().getOneCustomer(customer);
		customer.setName(name);
		customer.setEmail(email);
		customer.setAddress(address);
		boolean result = getCustomerService().modifyCustomer(customer);
		if (result)
			return "redirect:viewAllCustomerPage";
		else
			return "error";
	}
	
	
	@RequestMapping(path = "viewCustomerPage", method = RequestMethod.GET)
	public String viewCustomer() {
		return "retrieveCustomer";
	}

	@RequestMapping(path = "viewCustomer.do", method = RequestMethod.POST)
	public String processViewTrainee(@RequestParam("customerId") long id, Model model) {
		Customer customer = new Customer();
		customer.setId(id);
		/*List<Customer> list = customerService.getAllCustomers();
		model.addAttribute("customerList", list);
		return "viewAllCustomers";*/
		customer = getCustomerService().getOneCustomer(customer);
		model.addAttribute("c", customer);
		
		return "ViewCustomer";
	}
	
	
	

	
	
}
