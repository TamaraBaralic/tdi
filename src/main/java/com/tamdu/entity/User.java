package com.tamdu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@Data
@EqualsAndHashCode(exclude = "offers")
@ToString(exclude = "offers")
@Entity
@Table(name = "user")
public class User {
    @Id
    private String id;

    @Column(name = "name")
    @Size(max = 40)
    private String name;

    @Column(name = "password")
    @Size(max = 30)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="user_offer", joinColumns = {
            @JoinColumn(name="user_id", nullable = false, updatable = false)
    }, inverseJoinColumns = {@JoinColumn(name="offer_id", nullable = false, updatable = false)})
    private Set<Offer> offers;

    public User(){
        this.id = UUID.randomUUID().toString().substring(0, 32);
    }


}
