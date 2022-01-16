package it.deloitte.fluiddataapp.repos;

import it.deloitte.fluiddataapp.entity.Incentives;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataMongoRepo extends MongoRepository<Incentives,String> {
}
