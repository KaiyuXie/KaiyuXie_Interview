package com.uso.web.user;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uso.params.UserParams;
import com.uso.ret.UserRet;
import com.uso.service.user.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private IUserService service;
	
	@ResponseBody
	@RequestMapping(value = "/saveUser",method=RequestMethod.GET)
	public Map<String, Object> saveUser(String username,byte gender,int age, String address){// 当变量较多时可以以对象方式进行接收
		/*
		 * 参数校验省略不写（包含非空、年龄限制）
		 */
		
		UserParams params = new UserParams();
		params.setUsername("asdf");
		params.setAge(age);
		params.setGender(gender);
		params.setAddress(address);
		
		UserRet ret = new UserRet();
		try{
			int result = service.saveUser(params);
			if(result > 0){
				ret.setCode(1);
				ret.setMsg("插入成功");
			}
		}catch(Exception e){
			logger.error("username=" + username + e);
			ret.setCode(-1);
			ret.setMsg("插入失败");
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ret", ret);
		map.put("obj", params);
		return map;
	}
}