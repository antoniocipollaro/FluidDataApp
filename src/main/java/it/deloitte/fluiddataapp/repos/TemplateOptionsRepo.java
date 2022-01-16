package it.deloitte.fluiddataapp.repos;

import it.deloitte.fluiddataapp.entity.DataConfigurationEntity;
import it.deloitte.fluiddataapp.entity.TemplateoptionsEntity;
import org.springframework.data.repository.CrudRepository;

public interface TemplateOptionsRepo extends CrudRepository<TemplateoptionsEntity, Long> {

    public TemplateoptionsEntity findByDataConfigurationByConfigurationId(long id);
}
