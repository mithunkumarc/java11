package com.example.demo.repository;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.Employees;


@Repository
public class EmployeeDao 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
    
    
    public Employee getEmployee(int id) {
    	var empList = list.getEmployeeList().stream()
    	.filter(emp -> emp.getId() == id).collect(Collectors.toList());
    	return empList.get(0);
    }
    
}
