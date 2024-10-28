package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute MemberData memberData,
			ModelAndView mv) {
		StringBuilder sb = new StringBuilder();
		sb.append("사용자이름:" + memberData.getUname());
		sb.append(", 기업/회사명 여부:" + memberData.isChk_com());
		sb.append(", 사용자id:" + memberData.getUid());
		sb.append(", 비번: " + memberData.getPwd());
		sb.append(", 비번 확인:" + memberData.getPwd_check());
		sb.append(", 이메일1:" + memberData.getEmail1());
		sb.append(", 이메일2:" + memberData.getEmail2());
		sb.append(", 직장전화번호:" + memberData.getJiktel());
		sb.append(", 신청경로: " + memberData.getJointype());
		sb.append(", 우편번호: " + memberData.getZipcode());
		sb.append(", 주소1: " + memberData.getAddress1());
		sb.append(", 주소2: " + memberData.getAddress2());
		
		mv.setViewName("result");
		mv.addObject("registData", sb.toString());
		return mv;
	}
}
