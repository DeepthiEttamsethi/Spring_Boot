package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.Entity.Emp;
import com.example.Repository.EmpRepository;

@Service
public class EmpService {
	
	private EmpRepository repo;
	
	public void addEmp(Emp e) {
		repo.save(e);
	}
	
	public List<Emp> getAllEmp() {
		return (List <Emp>)repo.findAll();
	}
	
	public Emp getEmpById(int id) {
		Optional<Emp> e = repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteEmp(int id) {
		repo.deleteById(id);
		}
	public Page<Emp> getEmpByPaginate(int CurrentPage, int Size) {
		PageRequest p = PageRequest.of(CurrentPage, Size);
		return repo.findAll(p);
		}
		
	}