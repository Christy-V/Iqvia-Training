package com.sujata.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("/")
	public ModelAndView mainPageController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/getAllEmps")
	public ModelAndView showAllEmployeesController() {
		
		ModelAndView mv=new ModelAndView();
		
		ArrayList<Employee> empList=employeeService.getAllEmployees();
		mv.addObject("employees", empList);
		mv.setViewName("showAllEmployees");
		
		return mv;
	}
	
	@RequestMapping("/inputEmpIDPage")
	public ModelAndView inputEmpIDPageController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/inputEmpId");
		return mv;
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployee(HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		Employee employee=employeeService.searchEmployeeById(Integer.parseInt(request.getParameter("empId")));
		
		mv.addObject("employee", employee);
		mv.setViewName("showEmp");
		
		return mv;
	}
	
	@RequestMapping("/insertEmployeePage")
	public ModelAndView insertEmployeePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/insertEmployee");
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView insertEmployee(HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		String Id=request.getParameter("empid");
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String uid=request.getParameter("uId");
		String sal=request.getParameter("salary");
		
		Employee employees=new Employee(Integer.parseInt(Id), fn, ln,uid, Integer.parseInt(sal));
		String message=null;
		if(employeeService.insertEmployee(employees))
			message="Employee Saved Successfully";
			else
			message="Employee Insertion Failed";
		
		mv.setViewName("output");
		
		return mv;
	}
	
	@RequestMapping("/deleteEmployeePage")
	public ModelAndView deleteEmployeePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/insertIdForDelete");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
				
		String message=null;
		if(employeeService.deleteEmployee(Integer.parseInt(request.getParameter("empId"))))
			message="Employee deleted Successfully";
			else
			message="Employee deleted Failed";
		
		mv.setViewName("output");
		
		return mv;
	}
}
