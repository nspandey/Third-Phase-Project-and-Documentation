package coms.SportyShoes.service;

import java.util.List;

import coms.SportyShoes.model.User;



public interface UserService {
	public List<User> fetchUserList();
	public User saveUser(User user);
	public void deleteByEmailId(String emailId);
	public User getUser(String emailId);
	public void updateUser(User user);
	public User getUser(String emailId, String password);
}
