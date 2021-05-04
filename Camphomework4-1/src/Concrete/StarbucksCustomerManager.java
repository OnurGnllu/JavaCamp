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
	
	System.out.println("Tebrikler Starbuck kahve al�sveriniz sonras� y�ld�z kazand�n�z. ");
	
			
		}
		

		else {
			System.out.println("Mernis sisteminde "+  customer.getNationalityId()     + " kimlik numaras� ile tan�nmad�n�z �zg�n�m.");
			
			//throw new Exception("Merniste Tan�nmad�n�z."); //Bu k�s�m bize hatalar k�sm�na atar.
		}
	
	}
	

}