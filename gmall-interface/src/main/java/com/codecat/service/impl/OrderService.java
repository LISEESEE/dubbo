package com.codecat.service.impl;

import java.util.List;

import com.codecat.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
