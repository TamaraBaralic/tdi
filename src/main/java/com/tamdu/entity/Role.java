package com.tamdu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

/**
 * Created by dusica on 28.3.17..
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    private int id;

    @Column(name = "name")
    @Size(max = 40)
    private String name;

    @OneToOne
    private User user;

}
