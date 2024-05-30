package com.first.demo.mapper;

import com.first.demo.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmpMapper {


    /**
     * 根据用户名和密码来查找账号
     * @param emp
     * @return
     */
    @Select("select * from employee where username = #{username} and password = #{password}")
    Emp getUsernameAndPassword(Emp emp);

    @Insert("insert into employee(name, username,phone,password, create_time, update_time) values(#{name},#{username},#{phone},#{password},#{createTime},#{updateTime})")
    void add(Emp emp);
}
