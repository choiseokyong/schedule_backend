package com.planner.cal.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.planner.cal.model.ScheduleVO;

@Mapper
public interface ScheduleMapper {
	// 일정등록
	public int insertSchedule(ScheduleVO sv);
}
