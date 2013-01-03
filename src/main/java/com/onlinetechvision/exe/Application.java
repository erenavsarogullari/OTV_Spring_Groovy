package com.onlinetechvision.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onlinetechvision.spring.srv.EmployeeService;
import com.onlinetechvision.spring.srv.IEmployeeService;
import com.onlinetechvision.employee.Employee;

/**
 * Application Class starts the application
 *
 * @author onlinetechvision.com
 * @since 24 Dec 2012
 * @version 1.0.0
 *
 */
public class Application 
{
	/**
     * Starts the application
     *
     * @param  String[] args
     *
     */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IEmployeeService employeeService = (IEmployeeService) context.getBean(EmployeeService.class);
		
		Employee firstEmployee = new Employee("1", "Jake", "Gyllenhaal");
		Employee secondEmployee = new Employee("2", "Woody", "Harrelson");
				
		employeeService.addToGroovyEmployeeCache(firstEmployee);
		employeeService.getFromGroovyEmployeeCache(firstEmployee.getId());
		employeeService.removeFromGroovyEmployeeCache(firstEmployee);
		
		employeeService.addToGroovyEmployeeCache(secondEmployee);
		employeeService.getFromGroovyEmployeeCache(secondEmployee.getId());
	}
	
}
