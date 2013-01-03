package com.onlinetechvision.groovy.srv

import com.onlinetechvision.employee.Employee

/**
 * IGroovyEmployeeCacheService Interface exposes cache functionality.
 *
 * @author onlinetechvision.com
 * @since 24 Dec 2012
 * @version 1.0.0
 *
 */
interface IGroovyEmployeeCacheService {

	/**
	 * Adds employee entry to cache
	 *
	 * @param Employee employee
	 *
	 */
	void addToEmployeeCache(Employee employee);
	
	/**
	 * Gets employee entry from cache
	 *
	 * @param String id
	 * @return Employee employee
	 */
	Employee getFromEmployeeCache(String id);
	
	/**
	 * Removes employee entry from cache
	 *
	 * @param Employee employee
	 *
	 */
	void removeFromEmployeeCache(Employee employee);

}
