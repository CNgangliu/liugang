package com.example.liugang.manager;

import com.example.liugang.async.HiveCorrectionTaskAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HiveCorrectionTask {

	@Autowired
	private HiveCorrectionTaskAsync hiveCorrectionTaskAsync;

	public void add(){
		hiveCorrectionTaskAsync.createThreadTask();
	}
}
