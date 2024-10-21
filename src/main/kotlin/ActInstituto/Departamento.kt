package org.example.ActInstituto

import jakarta.persistence.*

@Entity
@Table(name = "departamentos")
data class Departamento(

    @Column
    val nombre: String,

    @OneToMany(mappedBy = "departamento",cascade = [(CascadeType.ALL)])
    val instituto: List<Instituto>?,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
)
