package kr.beans;

import lombok.Data;

@Data
public class User {

    private int user_idx;
    private String user_id;
    private String user_pw;
    private String user_name;
    private String user_address;

}
