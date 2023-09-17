package com.example.Entity;
import org.springframework.data.repository.CrudRepository;

import com.example.Demo.Entity.Employee;

//This will be AUTO IMPLEMENTED by Spring into Bean called Repository
//CRUD refers Create, Read, Update, Delete

public interface EmployeeRepository extends CrudRepository <Employee, Integer>{

}