package homework3;

public class Instructor extends User {
	 private String �nstructorName;
	 private String experimentArea;
	
	
	public String getInstructorName() {
		return �nstructorName;
	}
	public void setInstructorName(String instructorName) {
		�nstructorName = instructorName;
	}
	public String getExperimentArea() {
		return experimentArea;
	}
	public void setExperimentArea(String experimentArea) {
		this.experimentArea = experimentArea;
	}
	
	public void instructorName(User name) {
		System.out.println("E�itmen ID si : " + name.getId());
	}
	
	
}
