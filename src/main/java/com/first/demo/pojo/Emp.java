package com.first.demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.SplittableRandom;

/**
 * 用户实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;//ID
    private String name;//名字
    private String username;//用户名
    private String password;//密码
    private long phone;//电话
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;;//更新时间
}
