package it.deloitte.fluiddataapp.services;

import it.deloitte.fluiddataapp.entity.DataConfigurationEntity;
import it.deloitte.fluiddataapp.entity.Incentives;
import it.deloitte.fluiddataapp.repos.DataConfigurationRepo;
import it.deloitte.fluiddataapp.repos.DataMongoRepo;
import it.deloitte.fluiddataapp.repos.TemplateOptionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DataConfigurationService {

    @Autowired
    DataConfigurationRepo repo;

    @Autowired
    TemplateOptionsRepo templateRepo;

    @Autowired
    DataMongoRepo mongoRepo;

    public Iterable<DataConfigurationEntity> findAll(){
        Iterable<DataConfigurationEntity> iterable = repo.findAll();
        for ( DataConfigurationEntity e : iterable){
               e.setTemplateOption(templateRepo.findByDataConfigurationByConfigurationId(e.getId()));
        }
        return iterable;
    }

    public void saveMongoData(String jsonBody){
        System.out.println("JSON received:" + jsonBody);
        JsonParser parser = JsonParserFactory.getJsonParser();
        Map<String, Object> values = parser.parseMap(jsonBody);
        Incentives inc = new Incentives();
        for(String k : values.keySet()){
            inc.add(k,values.get(k));
        }
        inc.setSchemeFullData("schemefull");
        mongoRepo.save(inc);
    }
}
