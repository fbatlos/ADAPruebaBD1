package org.example

import jakarta.persistence.Persistence

fun main() {
    //cargar config

    val emf = Persistence.createEntityManagerFactory("unidadMYSQL")

    val em = emf.createEntityManager()

}