package com.example.demo2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alumno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alumno extends Base {

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "apellido")
    public String apellido;

    @Column(name = "email")
    public String email;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    public Date createAt;

    @PrePersist
    public void prePersist(){
        this.createAt = new Date();
    }
}
