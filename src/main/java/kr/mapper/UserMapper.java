package kr.mapper;


import kr.beans.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select user_pw from user_table where user_id = #{user_id}")
    String getLogin(String user_id);
}
