package com.codecat.gmall.controller;

import java.util.List;

import com.codecat.bean.UserAddress;
import com.codecat.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
		List<UserAddress> userAddresses = orderService.initOrder(userId);
		return userAddresses;
	}

}
