package com.common.lcworld.service;

import com.baomidou.framework.service.ISuperService;
import com.common.lcworld.entity.User;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends ISuperService<User> {

	boolean deleteAll();

	List<User> selectAll();

}