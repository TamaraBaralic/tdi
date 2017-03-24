package com.tamdu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by dusica on 24.3.17..
 */

@Entity
@AllArgsConstructor
@Data
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

    public Company() {
        this.id = UUID.randomUUID().toString();
    }

}
