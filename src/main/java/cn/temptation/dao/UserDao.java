package cn.temptation.dao;

import cn.temptation.domain.User;

public interface UserDao {

	User findbyusername(String username);

}
