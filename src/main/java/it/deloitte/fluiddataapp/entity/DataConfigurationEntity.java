package it.deloitte.fluiddataapp.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "data_configuration", schema = "fluidapp", catalog = "")
public class DataConfigurationEntity {
    private long id;
    private String key;
    private String type;
    private TemplateoptionsEntity templateOptions;



    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "key", nullable = true, length = 100)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 100)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Transient
    public TemplateoptionsEntity getTemplateOptions() {
        return templateOptions;
    }

    @Transient
    public void setTemplateOption(TemplateoptionsEntity templateOption) {
        this.templateOptions = templateOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataConfigurationEntity that = (DataConfigurationEntity) o;
        return id == that.id && Objects.equals(key, that.key) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, type);
    }
}
