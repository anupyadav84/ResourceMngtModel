package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;
import java.math.BigDecimal;

public class Task implements Serializable {

	private static final long serialVersionUID = 4901152751464085103L;
	
	private String taskName;
	private String taskDescription;
	private BigDecimal estimateTime;
	private BigDecimal actualTime;
	private BigDecimal toDoTime;
	private BigDecimal timeSpent;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Task(String taskName, String taskDescription, BigDecimal estimateTime, BigDecimal actualTime,
			BigDecimal toDoTime, BigDecimal timeSpent) {
		super();
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.estimateTime = estimateTime;
		this.actualTime = actualTime;
		this.toDoTime = toDoTime;
		this.timeSpent = timeSpent;
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public BigDecimal getEstimateTime() {
		return estimateTime;
	}
	public void setEstimateTime(BigDecimal estimateTime) {
		this.estimateTime = estimateTime;
	}
	public BigDecimal getActualTime() {
		return actualTime;
	}
	public void setActualTime(BigDecimal actualTime) {
		this.actualTime = actualTime;
	}
	public BigDecimal getToDoTime() {
		return toDoTime;
	}
	public void setToDoTime(BigDecimal toDoTime) {
		this.toDoTime = toDoTime;
	}
	public BigDecimal getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(BigDecimal timeSpent) {
		this.timeSpent = timeSpent;
	}
}
