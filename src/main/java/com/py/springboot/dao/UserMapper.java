package com.py.springboot.dao;

import com.py.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper
 *
 * @author pysasuke
 * @date 2017/9/13
 */
@Mapper //使用@Mapper注解来标识一个接口为MyBatis的接口，MyBatis会自动寻找这个接口
public interface UserMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(User record);

    User selectByPrimaryKey(@Param("id") Long id);

    User selectByUserName(@Param("username") String username);

    int updateByPrimaryKeySelective(User record);
}
