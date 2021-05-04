import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		
		// Senaryo gereði StarBucks Veritabanýna kaydetmek için Mernis doðrulamasý istiyor.
		Customer customer1 = new Customer();
		customer1.setFirstName("Onur");
		customer1.setLastName("Gönüllü");
		customer1.setDateOfBirth(1998);
		customer1.setNationalityId("Bu alan kimlik Numarasý");
		
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer1);

	
	Customer customer2 = new Customer();
	customer2.setFirstName("Ahmet");
	customer2.setLastName("Dari");
	customer2.setDateOfBirth(1995);
	customer2.setNationalityId("342234242");
	
	
	
	
	// Senaryo gereði Nero Veritabanýna kaydetmek için Mernis doðrulamasý istemeyecekti.
	BaseCustomerManager customerManager1=new NeroCustomerManager();
	customerManager1.Save(customer2);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



















}