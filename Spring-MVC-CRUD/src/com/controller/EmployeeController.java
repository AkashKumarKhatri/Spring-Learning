package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmployeeDAO;
import com.model.EmployeeBean;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO; //will inject dao from XML file  
	
	/*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */ 
	@RequestMapping("/empform")
	public String showForm(Model m) {
		m.addAttribute("command", new EmployeeBean());
		return "empform";
	}
	
	 /*It saves object into database. The @ModelAttribute puts request data  
       into model object. You need to mention RequestMethod.POST method   
       because default request is GET*/
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("emp") EmployeeBean employeeBean) {
		employeeDAO.addEmployee(employeeBean);
		return "redirect:/viewemp";
	}
	
	/* It provides list of employees in model object */
	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<EmployeeBean> list = employeeDAO.getAllEmployees();
		m.addAttribute("list", list);
		return "viewemp";
	}
	
	
	 /* It displays object data into form for the given id.   
       The @PathVariable puts URL data into variable.*/    
    @RequestMapping(value="/editemp/{employeeId}")    
	public String edit(@PathVariable Integer employeeId, Model m) {
		EmployeeBean employeeBean = employeeDAO.getEmployeeById(employeeId);
		m.addAttribute("command", employeeBean);
		return "empeditform";
	}
	
    /* It updates model object. */
    @RequestMapping(value = "editsave", method = RequestMethod.POST)
    public String editSave(@ModelAttribute("emp") EmployeeBean employeeBean) {
		employeeDAO.updateEmployee(employeeBean);
		return "redirect:/viewemp";
	}
    
    /* It deletes record for the given id in URL and redirects to /viewemp */
    @RequestMapping(value = "deleteemp/{employeeId}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer employeeId) {
    	employeeDAO.deleteEmployee(employeeId);
    	return "redirect:/viewemp";
    }
    
}
