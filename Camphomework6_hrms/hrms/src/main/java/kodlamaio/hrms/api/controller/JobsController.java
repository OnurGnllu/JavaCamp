package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.bussiness.abstracts.jobService;
import kodlamaio.hrms.entities.concretes.Job;
@RestController
@RequestMapping("/api/jobs")
public class JobsController {

private jobService jobservice;

	
	
	public JobsController(jobService jobservice) {
	super();
	this.jobservice = jobservice;
}



	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobservice.getAll();
		
		
	}
}