package org.example.ActInstituto

import jakarta.persistence.*

@Entity
@Table(name = "Inspector")
data class Inspector(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column
    val nombre: String,

    @Column
    val apellido: String,

    @Column
    val dni: String,

    @OneToMany(mappedBy = "inspector", cascade = [CascadeType.PERSIST])
    val instituto: List<Instituto>?
)
