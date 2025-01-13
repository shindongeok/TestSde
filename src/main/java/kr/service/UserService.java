package kr.service;

import kr.beans.User;
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
        User user = userDao.getLogin(user_id);
        if(user == null){
            return false;
        }

        if(user.getUser_pw() != null && user.getUser_pw().equals(user_pw)){
            return true;
        }
        return false;
    }


}
