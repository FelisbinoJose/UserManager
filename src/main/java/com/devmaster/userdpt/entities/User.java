package com.devmaster.userdpt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "tb_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tb_name")
    private String name;

    @Column(name = "tb_name")
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departmentId;


}
