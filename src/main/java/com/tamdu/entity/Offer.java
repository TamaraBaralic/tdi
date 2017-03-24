package com.tamdu.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by dusica on 24.3.17..
 */

@Entity
public class Offer {

    @Id
    private String id;

    @Column
    private String company_id;

    @Column
    @Size(max = 40)
    private String name;

    @Column
    @Size(max = 50)
    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
