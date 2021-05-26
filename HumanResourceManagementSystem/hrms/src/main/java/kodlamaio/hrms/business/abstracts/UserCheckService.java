package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface UserCheckService {
	Result checkIfRealPerson(String identityNumber, String firstName, String lastName, int birthYear);
}
