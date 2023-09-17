package com.example.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import com.example.Entity.*;


public interface EmpRepository extends CrudRepository<Emp,Integer> {

	Page<Emp> findAll (PageRequest p);

}