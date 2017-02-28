package com.mum.market.user.service;

import com.mum.market.user.domain.User;


public interface UserService {

	public void saveUser(User user);

	public void deleteUser(long id);

	public void updateUser(User user);

	public void listAllUser();

	public void getUserById(long id);

	public void getUserByEmail(String email);
}
