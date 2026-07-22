package com.sproject.sproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class Userservice {
	@Autowired
	private Userrepository repo;
	
   public ResponseUserDTO getReponse(RequestUserDTO request) {
	   User user=UserMapper.toEntity(request);
	   User response=repo.save(user);
	   return UserMapper.toDto(response);
	   
	   
	  
   }
   public List<ResponseUserDTO>getAllDetails(){
	   List<User>userDto=repo.findAll();
	   //userDto.stream().map(user->UserMapper.toDto(user)).toList();
	   
	return userDto.stream().map(UserMapper::toDto).toList();
	   
   }
	

}
