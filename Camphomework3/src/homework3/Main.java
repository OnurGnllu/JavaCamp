package homework3;

public class Main {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.setFirstName("Onur");
		student1.setLastName("Gönüllü");
		student1.setId(12345);
		student1.setSchool("IESU");
		student1.setEmail("onur95rt@gmail.com");
		student1.setStudentName("Onur");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
	    instructor1.setLastName("Demirog");
	    instructor1.setId(55950);
	    instructor1.setExperimentArea("Java");
	    instructor1.setInstructorName("Engin");
	    instructor1.setEmail("engindemirog@gmail.com");
	    
	   
	    studentManager studentmanager1 = new studentManager();
	    studentmanager1.studentName(student1);
	    studentmanager1.delete(student1);
	    studentmanager1.getId(student1);
	    studentmanager1.name(student1);
	    studentmanager1.add(student1);
	    studentmanager1.getEmail(student1);
	      
	   instructorManager instructormanager1 = new instructorManager();
	   instructormanager1.instructorName(instructor1);
	   instructormanager1.experimentArea(instructor1);
	   instructormanager1.delete(instructor1);
	   instructormanager1.add(instructor1);
	   instructormanager1.name(instructor1);
	   
	   
	    

	
	
	    
	
	
	
	
	
	
	
	}

}
