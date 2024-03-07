package com.SpringBootJDataJPA.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Employee;
import com.SpringBootJDataJPA.repo.EmployeeRepository;
//@Component
public class TestEmpRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList( new Employee(101, "Vikram", 2.2),
				new Employee(102, "Vijay", 3.3),
				new Employee(103, "Bantii", 4.4),
				new Employee(104, "Chintu", 5.5),
				new Employee(105, "Katherine", 6.5),
				new Employee(106, "Margott", 7.6),
				new Employee(107, "Gal Gadot", 8.4),
				new Employee(108, "Angelina", 9.6)));
		/*
		
		System.out.println(repo.getEmpById(101));
		System.out.println(repo.getEmpNameByName("Vijay"));
		System.out.println(Arrays.asList((Object[]) repo.getEmpNameAndSalsBySal(4.4)));
		*/
		
		/*
		repo.getAllEmps().forEach(System.out::println);
		System.out.println("-------------------------");
		
		repo.getEmpNames().forEach(System.out::println);
		System.out.println("**************************");

	
//		repo.getEmpNameAndSals()
//		.stream()
//		.map(ob->ob[0]+","+ob[1])
//		.forEach(System.out::println);
//		
		
		List<Object[]> list=repo.getEmpNameAndSals();
		for(Object[] ob: list) {
			System.out.println(ob[0]+" - "+ob[1]);
		}
		*/
	}

}
