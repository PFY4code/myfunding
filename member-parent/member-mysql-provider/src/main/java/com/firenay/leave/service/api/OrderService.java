package com.firenay.leave.service.api;

import com.firenay.leave.entity.vo.AddressVO;
import com.firenay.leave.entity.vo.OrderProjectVO;
import com.firenay.leave.entity.vo.OrderVO;

import java.util.List;


public interface OrderService {

	OrderProjectVO getOrderProjectVO(Integer projectId, Integer returnId);

	/**
	 * 查询用户地址
	 */
	List<AddressVO> getAddressVOList(Integer memberId);

	void saveAddress(AddressVO addressVO);

	/**
	 * 保存用户支付信息
	 */
	void saveOrder(OrderVO orderVO);
}
