package com.tamdu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String id;

    @Column(name = "name")
    @Size(max = 40)
    private String name;

    @Column(name = "password")
    @Size(max = 60)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="user_offer", joinColumns = {
            @JoinColumn(name="user_id", nullable = false, updatable = false)
    }, inverseJoinColumns = {@JoinColumn(name="offer_id", nullable = false, updatable = false)})
    private Set<Offer> offers;

    public User(){
        this.id = UUID.randomUUID().toString().substring(0, 32);
    }

    public String getId() {
        return id;
    }

    public User(String name, String password){
        this();
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
