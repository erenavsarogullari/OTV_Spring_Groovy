package com.onlinetechvision.spring.srv;

import com.onlinetechvision.employee.Employee;

/**
 * IEmployeeService Interface is created to represent Spring Service layer.
 *
 * @author onlinetechvision.com
 * @since 24 Dec 2012
 * @version 1.0.0
 *
 */
public interface IEmployeeService {

	/**
	 * Adds Employee entry to cache
	 *
	 * @param Employee employee
	 *
	 */
	void addToGroovyEmployeeCache(Employee employee);
	
	/**
	 * Gets Employee entry from cache
	 *
	 * @param String id
	 * @return Employee employee
	 */
	Employee getFromGroovyEmployeeCache(String id);
	
	/**
	 * Removes Employee entry from cache
	 *
	 * @param Employee employee
	 *
	 */
	void removeFromGroovyEmployeeCache(Employee employee);
	
	
}
