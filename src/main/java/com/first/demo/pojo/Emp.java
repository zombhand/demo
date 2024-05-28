package com.first.demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private Integer password;//密码
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
