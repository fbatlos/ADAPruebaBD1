package org.example.ActInstituto

import jakarta.persistence.*

@Entity
@Table(name = "Director")
data class Director(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column
    val nombre: String,

    @Column
    val apellido: String,

    @Column
    val dni: String,

    @OneToOne(mappedBy = "director")
    val instituto: Instituto?
)
