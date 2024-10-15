package org.example

import jakarta.persistence.Column
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "Empleados")
class Empleado (

    @Id
    val id:String,

    @Column(name = "Nombre")
    val nombre:String,

    @Column(name = "Edad")
    val edad:Int
){
}