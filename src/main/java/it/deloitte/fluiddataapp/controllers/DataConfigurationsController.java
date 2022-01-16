package it.deloitte.fluiddataapp.controllers;

import it.deloitte.fluiddataapp.entity.DataConfigurationEntity;
import it.deloitte.fluiddataapp.services.DataConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataConfigurationsController {

    @Autowired
    DataConfigurationService service;

    @GetMapping("/configuration")
    public Iterable<DataConfigurationEntity> findAll(){
        return service.findAll();
    }

    @PostMapping("/save")
    public void saveRequest(HttpEntity<String> httpEntity){
        service.saveMongoData(httpEntity.getBody());
    }
}
