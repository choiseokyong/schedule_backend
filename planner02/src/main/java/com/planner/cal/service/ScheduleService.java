package com.planner.cal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.cal.mapper.ScheduleMapper;
import com.planner.cal.model.ScheduleVO;

@Service
public class ScheduleService {

	@Autowired
	private ScheduleMapper sm;
	
	// 일정 등록
	public int insertSchedule(ScheduleVO sv) {
		return sm.insertSchedule(sv);
	}
}
