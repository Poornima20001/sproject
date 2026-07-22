package com.sproject.sproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class Usercontroller {
	@Autowired
	private Userservice service;
	@GetMapping("/users")
	public List<ResponseUserDTO>users(){
		
		return service.getAllDetails();
		
	}
	@PostMapping("/create")
	public ResponseUserDTO createNewUser(@RequestBody RequestUserDTO userDTO) {
		return service.getReponse(userDTO);
		
	}

}