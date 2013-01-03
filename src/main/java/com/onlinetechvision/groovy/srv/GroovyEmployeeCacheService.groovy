package com.onlinetechvision.groovy.srv

import com.onlinetechvision.employee.Employee;
import org.springframework.stereotype.Service;

/**
 * GroovyEmployeeCacheService Class is implementation of IGroovyEmployeeCacheService Interface.
 *
 * @author onlinetechvision.com
 * @since 24 Dec 2012
 * @version 1.0.0
 *
 */
@Service
class GroovyEmployeeCacheService implements IGroovyEmployeeCacheService  {
	
	private Map<String, Employee> cache = new HashMap();
	
	/**
	 * Adds employee entry to cache
	 *
	 * @param Employee employee
	 *
	 */
	public void addToEmployeeCache(Employee employee) {
		getCache().put(employee.getId(), employee);
		println print(employee, "added to cache...");
	}

	/**
	 * Gets employee entry from cache
	 *
	 * @param String id
	 * @return Employee employee
	 */
	public Employee getFromEmployeeCache(String id) {
		Employee employee = getCache().get(id);
		println print(employee, "gotten from cache...");
		return employee;
	}

	/**
	 * Removes employee entry from cache
	 *
	 * @param Employee employee
	 *
	 */
	public void removeFromEmployeeCache(Employee employee) {
		getCache().remove(employee.getId());
		println print(employee, "removed from cache...");
		println "Groovy Cache Entries :" + getCache();
	}
	
	public Map<String, Employee> getCache() {
		return cache;
	}

	public void setCache(Map<String, Employee> map) {
		cache = map;
	}
	
	/**
	 * Prints operation information
	 *
	 * @param Employee employee
	 * @param String description
	 * 
	 */
	private String print(Employee employee, String desc) {
		StringBuilder strBldr = new StringBuilder();
		strBldr.append(employee)
		strBldr.append(" ");
		strBldr.append(desc);
		
		return strBldr.toString();
	}
}
