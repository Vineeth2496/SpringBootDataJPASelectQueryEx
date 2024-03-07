package com.SpringBootJDataJPA.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.repo.EmployeeRepository;
@Component
public class TestEmpTwoRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository  repo;
	@Override
	public void run(String... args) throws Exception {
		//repo.getEmpsByIdIn(Arrays.asList(101,104,108,120)).forEach(System.out::println);

		//repo.getEmpsByIdBetween(101,109).forEach(System.out::println);
		
		//repo.getAllEmployeesBySql().forEach(System.out::println);;
		
		//repo.getAllEmployeesBySql2().forEach(System.out::println);;
		
		//int count=repo.updateEmployeeNameBySal("KATHERINE LANGFORD", 6.5);
		//System.out.println(count);
		
		int count=repo.deleteEmployeeBySal(6.0);
		System.out.println(count);
		
	}

}
