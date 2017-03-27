package com.tamdu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column
    @Size(max = 40)
    private String name;

    @Column
    @Size(max = 30)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="user_offer", joinColumns = {
            @JoinColumn(name="user_id", nullable = false, updatable = false)
    }, inverseJoinColumns = {@JoinColumn(name="offer_id", nullable = false, updatable = false)})
    private Set<Offer> offers;

    public User(){
        this.id = UUID.randomUUID().toString();
    }

}
