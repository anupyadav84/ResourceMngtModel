package com.apptium.resourcemanagementmodel.types;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

public class UserStory implements Serializable {

	private static final long serialVersionUID = 765829410934889721L;
	private String userStoryName;
	private String userStoryDescription;
	private Task[] taskArray;
	private BigDecimal estimatedTime;
	private BigDecimal actualTimeSpent;
	private BigDecimal remainingTime;
	private Name ownerOfUserStory;
	private Status status;
	private Calendar targetDate;

	public UserStory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserStory(String userStoryName, String userStoryDescription, Task[] taskArray, BigDecimal estimatedTime,
			BigDecimal actualTimeSpent, BigDecimal remainingTime, Name ownerOfUserStory, Status status,
			Calendar targetDate) {
		super();
		this.userStoryName = userStoryName;
		this.userStoryDescription = userStoryDescription;
		this.taskArray = taskArray;
		this.estimatedTime = estimatedTime;
		this.actualTimeSpent = actualTimeSpent;
		this.remainingTime = remainingTime;
		this.ownerOfUserStory = ownerOfUserStory;
		this.status = status;
		this.targetDate = targetDate;
	}

	public String getUserStoryName() {
		return userStoryName;
	}

	public void setUserStoryName(String userStoryName) {
		this.userStoryName = userStoryName;
	}

	public String getUserStoryDescription() {
		return userStoryDescription;
	}

	public void setUserStoryDescription(String userStoryDescription) {
		this.userStoryDescription = userStoryDescription;
	}

	public Task[] getTaskArray() {
		return taskArray;
	}

	public void setTaskArray(Task[] taskArray) {
		this.taskArray = taskArray;
	}

	public BigDecimal getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(BigDecimal estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public BigDecimal getActualTimeSpent() {
		return actualTimeSpent;
	}

	public void setActualTimeSpent(BigDecimal actualTimeSpent) {
		this.actualTimeSpent = actualTimeSpent;
	}

	public BigDecimal getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(BigDecimal remainingTime) {
		this.remainingTime = remainingTime;
	}

	public Name getOwnerOfUserStory() {
		return ownerOfUserStory;
	}

	public void setOwnerOfUserStory(Name ownerOfUserStory) {
		this.ownerOfUserStory = ownerOfUserStory;
	}

	public Status getstatus() {
		return status;
	}

	public void setstatus(Status status) {
		this.status = status;
	}

	public Calendar getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Calendar targetDate) {
		this.targetDate = targetDate;
	}

}
