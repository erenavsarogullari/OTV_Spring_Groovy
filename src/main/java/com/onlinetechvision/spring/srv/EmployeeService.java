package com.onlinetechvision.spring.srv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetechvision.employee.Employee;
import com.onlinetechvision.groovy.srv.IGroovyEmployeeCacheService;

/**
 * EmployeeService Class is implementation of IEmployeeService interface.
 *
 * @author onlinetechvision.com
 * @since 24 Dec 2012
 * @version 1.0.0
 *
 */
@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IGroovyEmployeeCacheService groovyEmployeeCacheService ;
	
	/**
	 * Adds Employee entry to cache
	 *
	 * @param Employee employee
	 *
	 */
	public void addToGroovyEmployeeCache(Employee employee) {
		getGroovyEmployeeCacheService().addToEmployeeCache(employee);
	}
	
	/**
	 * Gets Employee entry from cache
	 *
	 * @param String id
	 * @return Employee employee
	 */
	public Employee getFromGroovyEmployeeCache(String id) {
		return getGroovyEmployeeCacheService().getFromEmployeeCache(id);
	}	
	
	/**
	 * Removes Employee entry from cache
	 *
	 * @param Employee employee
	 *
	 */
	public void removeFromGroovyEmployeeCache(Employee employee) {
		getGroovyEmployeeCacheService().removeFromEmployeeCache(employee);
	}
	
	public IGroovyEmployeeCacheService getGroovyEmployeeCacheService() {
		return groovyEmployeeCacheService;
	}

	public void setGroovyEmployeeCacheService(IGroovyEmployeeCacheService groovyEmployeeCacheService) {
		this.groovyEmployeeCacheService = groovyEmployeeCacheService;
	}	

}
