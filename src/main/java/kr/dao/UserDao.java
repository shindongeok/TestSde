package kr.dao;

import kr.beans.User;
import kr.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public User getLogin(String user_idx){
        return userMapper.getLogin(user_idx);
    }
}
