package it.deloitte.fluiddataapp.repos;

import it.deloitte.fluiddataapp.entity.DataConfigurationEntity;
import org.springframework.data.repository.CrudRepository;

public interface DataConfigurationRepo extends CrudRepository<DataConfigurationEntity, Long> {
}
