package timetable.bean;

public class College {
	
	private Long id;
	private String collegeName;
	private String year;
	
	
	public College() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", year=" + year + "]";
	}
	
	

}
