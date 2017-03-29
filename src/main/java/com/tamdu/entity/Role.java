package com.tamdu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by dusica on 28.3.17..
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    private Integer id;

    @Column(name = "name")
    @Size(max = 40)
    private String name;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private Set<User> users;

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
