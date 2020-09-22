package com.project.soar.employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

//import com.practice.rest.webservices.restfulwebservices.user.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;

//	private static List<Employee> employees = new ArrayList<>();

	@PostMapping("/create")
	public String addEmployee(@RequestBody Employee employee) {
		dao.save(employee);
		return "saved!";
	}

	@PostMapping("/login")
	public String verify(@RequestBody String inputJson) {

		String message = "";

		ObjectMapper mapper = new ObjectMapper();
		try {
			Formdata input = mapper.readValue(inputJson, Formdata.class);

			System.out.println("Json id: "+input.getId());

			String ipass = input.getPassword();
			System.out.println("Json password: "+ipass);

			Employee en = dao.findByEmpid(input.getId());
			System.out.println(en.getEmptype());
			
			String pass = en.getPassword();
			System.out.println("Employee password: "+pass);

			if (ipass.equals(pass)) {
				message = en.getEmptype();
				System.out.println(message);
				return message;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "not verified";
	}

	@GetMapping("/profiles")
	public List<Employee> getEmployees() {
		return (List<Employee>) dao.findAll();
	}
}
