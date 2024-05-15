package com.example.OneToMany.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "colleges")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long college_id;
    private String collegeName;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_clg_id",referencedColumnName = "college_id")
    private List<Student> student;




}
