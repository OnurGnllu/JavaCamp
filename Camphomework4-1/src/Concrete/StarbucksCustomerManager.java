package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws Exception {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
	
	System.out.println("Tebrikler Starbuck kahve alýsveriniz sonrasý yýldýz kazandýnýz. ");
	
			
		}
		

		else {
			System.out.println("Mernis sisteminde "+  customer.getNationalityId()     + " kimlik numarasý ile tanýnmadýnýz üzgünüm.");
			
			//throw new Exception("Merniste Tanýnmadýnýz."); //Bu kýsým bize hatalar kýsmýna atar.
		}
	
	}
	

}