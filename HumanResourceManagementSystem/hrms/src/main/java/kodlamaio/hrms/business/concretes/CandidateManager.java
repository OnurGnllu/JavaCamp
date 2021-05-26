package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	
	private CandidateDao candidateDao;
	private UserCheckService userCheckService; 

	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService) {
		super();
		this.candidateDao = candidateDao;
		this.userCheckService = userCheckService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		
		if(candidate.getFirstName() == null || candidate.getLastName() == null || candidate.getIdentityNumber() == null || 
				candidate.getBirthYear() == 0 ||  candidate.getEmail() == null || candidate.getPassword() == null)
			return new ErrorResult("Tum alanlarýn girilmesi zorunludur.");
		
		if(!this.userCheckService.checkIfRealPerson(candidate.getIdentityNumber(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getBirthYear()).isSuccess())
			return new ErrorResult("Mernis doðrulamasý basarýsýz oldu.");
		
		if (this.candidateDao.existsByEmail(candidate.getEmail())){
			return new ErrorResult("Bu E-mail adresine ait kullaný daha önce sisteme kayýt olmustur.");
		}
		
		if (this.candidateDao.existsByIdentityNumber(candidate.getIdentityNumber())){
			return new ErrorResult("Bu kimlik adresine ait kullaný daha önce sisteme kayýt olmustur.");
	
		}
		 
		if (!validateEmail(candidate.getEmail())) {
			return new ErrorResult("Bu Email formatý uygun deðildir.");
			}
		
		this.candidateDao.save(candidate);
		return new SuccessResult();
		
	}
	
	
	
	
	 public static Pattern validEmailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	  static boolean validateEmail(String email) {
		Matcher matcher = validEmailAddressRegex.matcher(email);
		return matcher.find();
	}
	
	
	 
		
		
}

