package SpringBootMongoDB.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import SpringBootMongoDB.Model.SalaryDetails;
import SpringBootMongoDB.Repository.SalaryRepository;

@RestController
@RequestMapping("/salary")
public class SalaryController {
	
	@Autowired
	private SalaryRepository salaryRepository;
	
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public SalaryDetails addSal(@RequestBody SalaryDetails salaryDetails) {
		return salaryRepository.save(salaryDetails);
	}

}
