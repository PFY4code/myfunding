package com.firenay.leave.service.api;

import com.firenay.leave.entity.po.MemberPO;


public interface MemberService {

	MemberPO getMemberPoByLoginAcct(String loginAcct);

	void saveMember(MemberPO memberPO);
}
