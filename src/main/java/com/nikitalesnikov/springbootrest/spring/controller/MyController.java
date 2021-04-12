package com.nikitalesnikov.springbootrest.spring.controller;

import com.nikitalesnikov.springbootrest.spring.entity.Employee;
import com.nikitalesnikov.springbootrest.spring.exception_handing.NoSuchEmployeeExcept;
import com.nikitalesnikov.springbootrest.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAlEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){

    Employee employee = employeeService.getEmployee(id);
        if(employee==null)

    {
        throw  new NoSuchEmployeeExcept("There is no employee with ID=" + id + "in Database");
    }
        return employee;
}
@PostMapping("/employees")
public Employee addNewEmp(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return  employee;
}
    @PutMapping("/employees")
       public Employee updateEmp(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return  employee;
}
@DeleteMapping("/employees/{id}")
    public String deleteEmp(@PathVariable int id){

    Employee employee = employeeService.getEmployee(id);
    if(employee==null)

    {
        throw  new NoSuchEmployeeExcept("There is no employee with ID=" + id + "in Database");
    }
        employeeService.deleteEmployee(id);
        return "Employee with ID" + id + "was delete";
}

@GetMapping("/employees/name/{name}")
public  List<Employee> showEmpByName(@PathVariable String name){
        List<Employee> employees = employeeService.findAllByName(name);
        return  employees;
}
}
