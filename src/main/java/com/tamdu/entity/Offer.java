package com.tamdu.entity;

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
@Data
@AllArgsConstructor
@Table(name = "offer")
public class Offer {

    @Id
    private String id;

    @Column
    @Size(max = 40)
    private String title;

    @Column
    @Size(max = 50)
    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany(mappedBy = "offers")
    private Set<User> users;

    public Offer() {
        this.id = UUID.randomUUID().toString().substring(0, 32);
    }
}
