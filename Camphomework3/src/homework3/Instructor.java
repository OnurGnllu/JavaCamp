package homework3;

public class Instructor extends User {
	 private String ınstructorName;
	 private String experimentArea;
	
	
	public String getInstructorName() {
		return ınstructorName;
	}
	public void setInstructorName(String instructorName) {
		ınstructorName = instructorName;
	}
	public String getExperimentArea() {
		return experimentArea;
	}
	public void setExperimentArea(String experimentArea) {
		this.experimentArea = experimentArea;
	}
	
	public void instructorName(User name) {
		System.out.println("Eğitmen ID si : " + name.getId());
	}
	
	
}
