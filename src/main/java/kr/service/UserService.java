package kr.service;

import kr.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean getLogin(String user_id, String user_pw){
        String userPassword = userDao.getLogin(user_id);
        if(userPassword != null && userPassword.equals(user_pw)){
            return true;
        }
        return false;
    }


}
