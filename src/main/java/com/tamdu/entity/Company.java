package com.tamdu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

/**
 * Created by dusica on 24.3.17..
 */

@Entity
@AllArgsConstructor
@Data
@EqualsAndHashCode(exclude = "offers")
@ToString(exclude = "offers")
@Table(name = "company")
public class Company implements Serializable{

    @Id
    private String id;

    @NotNull
    @Column
    @Size(max = 40)
    private String name;

    @NotNull
    @Column
    @Size(max = 60)
    private String address;

    @Column
    @Size(max = 20)
    private String telephone;

    @Column
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private Set<Offer> offers;

    public Company() {
        this.id = UUID.randomUUID().toString().substring(0, 32);
    }

}
