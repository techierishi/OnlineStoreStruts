package com.teknikstore.dao;

import java.util.List;
import com.teknikstore.domain.User;

public interface UserDAO {

	public void saveUser(User user);
	public List<User> listUser();
}
