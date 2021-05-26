package kodlamaio.hrms.business.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

@Service
public class UserCheckManager implements UserCheckService{

	@Override
	public Result checkIfRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		return new SuccessResult();
	}

}
