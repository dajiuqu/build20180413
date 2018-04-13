package com.wl.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wl.model.User;

@RestController
@RequestMapping("api/login")
public class LoginController {

	@PostMapping("in")
	public User loginIn(@RequestBody String body) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		User ss = mapper.readValue(body, User.class);

		// Map<String,String> dic=new HashMap<String,String>();
		// dic.put("isok","true");
		// dic.put("name","ssss");
		// mapper.writeValueAsString(dic);
		// System.out.println(v);
		return ss;

	}

	@PostMapping("in1")
	public String loginIn1(@RequestBody String body) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		User data = mapper.readValue(body, User.class);

		// System.out.println(v);
		return mapper.writeValueAsString(data);

	}

	@GetMapping("get1")
	public List<User> f2() {
		List<User> items = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User obj = new User();
			obj.setName("obj" + i);
			obj.setPassword("objpassword" + i);
			items.add(obj);
		}
		return items;

	}

	@GetMapping("get4")
	public String f4(@RequestBody User obj) {
		return obj.toString();

	}

	@PostMapping(path = "f5")
	public User f5(@RequestBody String body) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		User one = mapper.readValue(body, User.class);
		return one;

	}

	@GetMapping("get2/{s1}/{s2}")
	public String f3(@PathVariable(value = "s1") String s1, @PathVariable(value = "s2") String s2, String s3) {
		return s1 + s2 + s3;

	}

}
