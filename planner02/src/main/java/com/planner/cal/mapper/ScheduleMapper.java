package com.planner.cal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.planner.cal.model.ScheduleVO;

@Mapper
public interface ScheduleMapper {
	// 일정등록
	public int insertSchedule(ScheduleVO sv);
	public List<ScheduleVO> scheduleList(@Param("firstday") String firstday, @Param("lastday") String lastday);
}
