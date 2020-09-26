package com.kubernetes.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class LazyService {

	public LazyService() {
		System.out.println("Lazy Service:: Constructor loaded");
	}

	public String hello() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("1","emp 1","001"));
		list.add(new Employee("2","emp 2","002"));
		list.add(new Employee("3","emp 3","003"));
		return list.toString();
	}
}
