package com.example.liugang.controller;

import com.example.liugang.manager.HiveCorrectionTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	HiveCorrectionTask hiveCorrectionTask;

	@GetMapping
	public String add(){
		hiveCorrectionTask.add();
		return "success";
	}
}
