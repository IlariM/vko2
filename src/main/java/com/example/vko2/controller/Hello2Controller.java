package com.example.vko2.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.vko2.domain.Student;

@Controller
public class Hello2Controller {
	@RequestMapping("/hello2")
	public String showList(Model model) {
		Student Student1 = new Student("Kate", "Cole", "email");
		Student Student2 = new Student("Dan", "Brown", "email");
		Student Student3 = new Student("Mike", "Mars", "email");
		ArrayList<Student> Students=new ArrayList<Student>();
		Students.add(Student1);
		Students.add(Student2);
		Students.add(Student3);
		model.addAttribute("Students", Students);
		return "hello2";
		}
}
