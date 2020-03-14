package SpringBootMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import SpringBootMongoDB.Model.SalaryDetails;

@Service
public interface SalaryRepository extends MongoRepository<SalaryDetails, String> {

}
