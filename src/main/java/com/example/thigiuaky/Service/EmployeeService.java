
package com.example.thigiuaky.Service;

import com.example.thigiuaky.Model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
    public static final Map<Integer,Employee> employees = new HashMap<>();
    static {
        employees.put(1,new Employee(1,"vuong",23,"employee","Developer",10000));
        employees.put(2,new Employee(2,"tuan",24,"employee","Marketing",12000));
        employees.put(3,new Employee(3,"minh",25,"employee","Developer",11000));
        employees.put(4,new Employee(4,"binh",26,"management","Developer",15000));
    }
    @Override
    public List<Employee> showAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(),employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employees.put(id,employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee:employees.values()) {
            if(employee.getName().contains(name)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}
