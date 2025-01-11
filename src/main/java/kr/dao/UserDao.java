package kr.dao;

import kr.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public String getLogin(String user_id){
        return userMapper.getLogin(user_id);
    }
}
