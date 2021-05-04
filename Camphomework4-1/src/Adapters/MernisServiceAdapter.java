package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		boolean result=client.TCKimlikNoDogrula(
				
				Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth()
		);
		
		return result;
	}

}