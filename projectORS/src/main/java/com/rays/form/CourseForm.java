package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CollegeDTO;
import com.rays.dto.CourseDTO;

/**
 * Contains Course form elements and their declarative input validations.
 * @author Abhishek Patidar
 *
 */
public class CourseForm extends BaseForm {

	
	private long courseId;
	
	@NotEmpty(message = "please enter course name")
	private String courseName;
	
	@NotEmpty(message = "please enter course duration")
	private String duration;
	
	@NotEmpty(message = "please enter description")
	private String description;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public BaseDTO getDto() {

	CourseDTO dto = initDTO(new CourseDTO());
	dto.setCourseId(courseId);
	dto.setCourseName(courseName);
	dto.setDuration(duration);
	dto.setDescription(description);
	return dto;
	
}
	
}
