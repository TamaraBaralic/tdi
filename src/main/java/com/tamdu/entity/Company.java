package com.tamdu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;

/**
 * Created by dusica on 24.3.17..
 */

@Entity
@AllArgsConstructor
@Data
@Table(name = "company")
public class Company {

    @Id
    private String id;

    @Column
    @Size(max = 40)
    private String name;

    @Column
    @Size(max = 60)
    private String address;

    @Column
    private int telephone;

    @Column
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private Set<Offer> offers;

    public Company() {
        this.id = UUID.randomUUID().toString();
    }

}
