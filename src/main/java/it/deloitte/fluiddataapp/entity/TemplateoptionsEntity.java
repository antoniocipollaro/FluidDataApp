package it.deloitte.fluiddataapp.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "templateoptions", schema = "fluidapp", catalog = "")
public class TemplateoptionsEntity {
    private long id;
    private String label;
    private String placeholder;
    private Byte required;
    private long dataConfigurationByConfigurationId;
    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label", nullable = true, length = 100)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "placeholder", nullable = true, length = 150)
    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    @Basic
    @Column(name = "required", nullable = true)
    public Byte getRequired() {
        return required;
    }

    public void setRequired(Byte required) {
        this.required = required;
    }

    @Basic
    @Column(name = "configuration_id", nullable = true)
    public long getDataConfigurationByConfigurationId() {
        return dataConfigurationByConfigurationId;
    }

    public void setDataConfigurationByConfigurationId(long dataConfigurationByConfigurationId) {
        this.dataConfigurationByConfigurationId = dataConfigurationByConfigurationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateoptionsEntity that = (TemplateoptionsEntity) o;
        return id == that.id && Objects.equals(label, that.label) && Objects.equals(placeholder, that.placeholder) && Objects.equals(required, that.required);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, placeholder, required);
    }

}
