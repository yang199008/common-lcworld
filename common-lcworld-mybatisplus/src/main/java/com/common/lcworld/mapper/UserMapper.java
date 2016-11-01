package com.common.lcworld.mapper;

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.common.lcworld.entity.User;

import java.util.List;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User> {

	/**
	 * 自定义注入方法
	 */
	int deleteAll();
	List<User> selectAll();

}