package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws Exception {
		
		System.out.println("Saved to DB: " + customer.getFirstName());
	}

}