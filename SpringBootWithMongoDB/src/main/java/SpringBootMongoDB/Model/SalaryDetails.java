package SpringBootMongoDB.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SalaryDetails")
public class SalaryDetails {
	
	@Id
	private String id;
	
	private String fullName;
	
	private double salary;
	
	private double taxAmmount;
	
	@Indexed(unique = true)
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getTaxAmmount() {
		return taxAmmount;
	}

	public void setTaxAmmount(double taxAmmount) {
		this.taxAmmount = taxAmmount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SalaryDetails(String id, String fullName, double salary,
			double taxAmmount, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.salary = salary;
		this.taxAmmount = taxAmmount;
		this.email = email;
	}

	public SalaryDetails() {
		super();
	}
	
}
