package homework2;

public class main {
	
	public static void main(String[] args) {
	
Classes course1 = new Classes();
course1.id=1;
course1.name="JAVA REACT";
course1.instructor="Engin Demirog";

Classes course2= new Classes(1,"C sharp","Engin Demorog");
Classes[] allcourse= {course1,course2};

for (Classes courses : allcourse) {
	System.out.println(courses.name);
	}


ClassesManager takencourse1 = new ClassesManager();
takencourse1.TaketheClass(course1);

ClassesManager takencourse2 = new ClassesManager();
takencourse2.LefttheClass(course2);


Category category1 = new Category();
category1.id= 1;
category1.name= "Kurslarým";

Category category2= new Category(2,"Tüm Kurslar");
Category category3= new Category(3,"Kampa Hazýrlýk");
Category category4= new Category(4,"Sýk Sorulan Sorular");

Category[] allofit = {category1,category2,category3,category4};


for (Category sayac : allofit) {
	System.out.println(sayac.name +": ID SUDUR Ki :"+ sayac.id );
	}





	

	
	
	
	
	
	
	
	
	}
}
	














