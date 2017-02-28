package com.mum.market.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.market.user.domain.User;
import com.mum.market.user.repository.UserRepository;
import com.mum.market.user.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);		
		
	}

	@Override
	public void listAllUser() {
		// TODO Auto-generated method stub
		userRepository.findAll();
		
	}

	@Override
	public void getUserById(long id) {
		// TODO Auto-generated method stub
		userRepository.findOne(id);
		
	}

	@Override
	public void getUserByEmail(String email) {
		// TODO Auto-generated method stub
		
		
	}

}
