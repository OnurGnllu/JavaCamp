package kodlamaio.hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.bussiness.abstracts.jobService;
import kodlamaio.hrms.dataAccess.JobDao;
import kodlamaio.hrms.entities.concretes.Job;


@Service
public class jobManager implements jobService {

private JobDao jobDao;

	@Autowired
	public jobManager(JobDao jobDao) {
	super();
	this.jobDao = jobDao;
}




	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
