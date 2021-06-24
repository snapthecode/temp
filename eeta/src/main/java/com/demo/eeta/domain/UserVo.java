package com.demo.eeta.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@Data
public class UserVo {
    int user_idx;
    String id;
    String pw;
    String name;
    int privileges;


}
