package org.example.Act1

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "Usuarios")
data class Usuario(

    @Id
    val nombre_user: String,

    @Column(nullable = false , length = 20)
    val password: String
)
