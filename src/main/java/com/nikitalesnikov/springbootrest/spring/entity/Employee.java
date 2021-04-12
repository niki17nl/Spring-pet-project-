package com.nikitalesnikov.springbootrest.spring.entity;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
//    @NotBlank(message = "name is required field")
//    @Size(min = 2, message = "name must be min two symbols")
    @Column(name = "name")
    private String name;
//    @NotBlank(message = "surname is required field")
//    @Size(min = 2, message = "surname must be min two symbols")
    @Column(name = "surname")
    private String surname;
//    @NotBlank(message = "department is required field")
    @Column(name = "department")
    private  String department;
//    @Min(value = 100, message = "must be greater than 99")
//    @Max(value = 100000, message = "must be less than 100001")
    @Column(name = "salary")
    private int salary;



    public Employee() {
    }

    public Employee(int id, String name, String surname, String department, int salary, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
