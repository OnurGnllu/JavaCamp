package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public Result add(Employer employer) {
		
		if(employer.getCompanyName() == null || employer.getWebSite() == null || employer.getPhoneNumber() == null || 
				employer.getEmail() == null || employer.getPassword() == null)
			return new ErrorResult("Tüm alanlar zorunludur.");
		
		if(!isRealEmployer(employer)) {
			return new ErrorResult("Geçersiz Email Adresi");
		}
		if (this.employerDao.existsByEmail(employer.getEmail())){
			return new ErrorResult("Bu E-mail adresine ait iþ veren daha önce sisteme kayýt olmuþtur.");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("Baþarýlý þekilde Ýþ veren kaydý oluþturdunuz.");
	}

	
	
	private boolean isRealEmployer(Employer employer) {
		 String regex = "^(.+)@(.+)$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(employer.getEmail());
	     if(!matcher.matches()) {
	    	 return false;
	     }
	     else if(!employer.getEmail().contains(employer.getWebSite())) {
	    	return false; 
	     }
	     return true;
	     
	}
}
