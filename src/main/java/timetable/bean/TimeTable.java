package timetable.bean;

public class TimeTable {
	
	private Long id;
	private String day;
	private String startTime;
	private String endTime;
	private String subject;
	private String subjectType;
	private String building;
	private String room;
	private String teacher;
	private Long studyYear;
	
	
	public TimeTable() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	

	public Long getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(Long studyYear) {
		this.studyYear = studyYear;
	}

	@Override
	public String toString() {
		return "Timetable [id=" + id + ", day=" + day + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", subject=" + subject + ", subjectType=" + subjectType + ", building=" + building + ", room=" + room
				+ ", teacher=" + teacher + ", studyYear=" + studyYear + "]";
	}
	
	
	
	
	
	
	

}
