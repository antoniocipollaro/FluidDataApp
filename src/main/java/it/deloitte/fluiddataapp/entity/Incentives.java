package it.deloitte.fluiddataapp.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "Incentives")
public class Incentives {


    public String id;
    public String schemeFullData;
    private Map<String, Object> schemalessData;

    public String getSchemeFullData() {
        return schemeFullData;
    }

    public void setSchemeFullData(String schemeFullData) {
        this.schemeFullData = schemeFullData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @JsonAnySetter
    public void add(String key, Object value) {
        if (null == schemalessData) {
            schemalessData = new HashMap<>();
        }
        schemalessData.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> get() {
        return schemalessData;
    }
}