package br.com.rbarbioni.store.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by renan on 16/12/15.
 */
@MappedSuperclass
public class DomainEntity {

    public static final String UUID = "uuid";
    public static final String ACTIVE = "active";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    @JsonIgnore
    public Long id;
    @Column(name = "uuid", nullable = false, updatable = false)
    private String uuid = java.util.UUID.randomUUID().toString();

    @Column(name = "creation_date", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public Date creationDate = new Date();

    @Column(name = "active", nullable = false)
    public boolean active = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUUID() {
        return uuid;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
