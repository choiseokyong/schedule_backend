package com.planner.cal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		return ss.insertSchedule(sv);
	}
	
	@GetMapping("/scheduleList")
	public List<ScheduleVO> getScheduleList(@RequestParam String firstday,@RequestParam String lastday) {
		System.out.println("값:=========" + firstday);
		return ss.scheduleList(firstday,lastday);
	}
	
}
