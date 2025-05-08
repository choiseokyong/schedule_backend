package com.planner.cal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planner.cal.model.ScheduleVO;
import com.planner.cal.service.ScheduleService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ScheduleController {

	@Autowired
	private ScheduleService ss;
	
	@PostMapping("/save")
	public int save(@RequestBody ScheduleVO sv){
		System.out.println("값: " + sv);
		return ss.insertSchedule(sv);
	}
}
