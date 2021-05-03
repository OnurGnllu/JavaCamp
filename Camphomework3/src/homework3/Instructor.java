package homework3;

public class Instructor extends User {
	 private String ýnstructorName;
	 private String experimentArea;
	
	
	public String getInstructorName() {
		return ýnstructorName;
	}
	public void setInstructorName(String instructorName) {
		ýnstructorName = instructorName;
	}
	public String getExperimentArea() {
		return experimentArea;
	}
	public void setExperimentArea(String experimentArea) {
		this.experimentArea = experimentArea;
	}
	
	public void instructorName(User name) {
		System.out.println("Eðitmen ID si : " + name.getId());
	}
	
	
}
