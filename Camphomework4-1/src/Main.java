import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		
		// Senaryo gere�i StarBucks Veritaban�na kaydetmek i�in Mernis do�rulamas� istiyor.
		Customer customer1 = new Customer();
		customer1.setFirstName("Onur");
		customer1.setLastName("G�n�ll�");
		customer1.setDateOfBirth(1998);
		customer1.setNationalityId("Bu alan kimlik Numaras�");
		
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer1);

	
	Customer customer2 = new Customer();
	customer2.setFirstName("Ahmet");
	customer2.setLastName("Dari");
	customer2.setDateOfBirth(1995);
	customer2.setNationalityId("342234242");
	
	
	
	
	// Senaryo gere�i Nero Veritaban�na kaydetmek i�in Mernis do�rulamas� istemeyecekti.
	BaseCustomerManager customerManager1=new NeroCustomerManager();
	customerManager1.Save(customer2);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



















}