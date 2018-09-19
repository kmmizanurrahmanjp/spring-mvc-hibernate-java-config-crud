package xyz.mizan.spring.mvc.repository;

import java.util.List;

import xyz.mizan.spring.mvc.entity.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	 
    public List<Employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
}
