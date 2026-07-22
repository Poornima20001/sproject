package com.sproject.sproject;

import java.time.LocalDateTime;
//entity->dto
public class UserMapper {
	public static ResponseUserDTO toDto(User user) {
		ResponseUserDTO userDTO =new ResponseUserDTO();
		userDTO.setUserName(user.getUserName());
		userDTO.setMobileNo(user.getMobileNo());
		userDTO.setEmail(user.getEmail());
		
		return userDTO;
		
		
	}
	//dto->entity
	public static User toEntity(RequestUserDTO userDTO) {
		User user=new User();
		user.setUserName(userDTO.getUserName());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setMobileNo(userDTO.getMobileNo());
		user.setCreatedAt(LocalDateTime.now());
		user.setUpdatedAt(LocalDateTime.now());
		return user;
		
		
		
	}
	

}
