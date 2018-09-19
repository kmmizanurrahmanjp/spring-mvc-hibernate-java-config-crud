package xyz.mizan.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xyz.mizan.spring.mvc.entity.Employee;
import xyz.mizan.spring.mvc.repository.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDao;
	
	@Override
	public void addEmployee(Employee employee) {
		empDao.addEmployee(employee);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		empDao.deleteEmployee(employeeId);

	}

	@Override
	public Employee getEmployee(int employeeid) {
		return empDao.getEmployee(employeeid);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empDao.updateEmployee(employee);
	}

}
