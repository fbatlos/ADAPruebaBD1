package org.example.Ejemplo1

import jakarta.persistence.*

@Entity
@Table(name = "Empleados")
class Empleado(

    @Column(name = "Nombre")
    val nombre:String,

    @Column(name = "Edad")
    val edad:Int,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_dpto")
    val departamento: Departamento?,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long = 0
)