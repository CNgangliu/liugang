package com.example.liugang.async;

import com.example.liugang.service.UserBeanPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HiveCorrectionTaskAsync {

	@Autowired
	private UserBeanPriceService userBeanPriceService;

	@Async
	public void createThreadTask() {
		System.out.println(Thread.currentThread().getName());
		userBeanPriceService.statistic();
	}

}
