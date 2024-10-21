package org.example

import jakarta.persistence.Persistence
import org.example.Act1.Producto
import org.example.ActInstituto.Proveedor
import org.example.Act1.Usuario
import java.util.Date

fun main() {
    //cargar config

    val emf = Persistence.createEntityManagerFactory("unidadMYSQL")
//Abre conecction con la bd
    var em = emf.createEntityManager()

    //Para las transaciones

    em.transaction.begin()

    val user = Usuario("Paco","12345")
    val producto = Producto("Calamar","Calamar frito con salsa." , 20.30,Date(),null)
    //val prove = Proveedor("Papa S.A", listOf(producto))


    //em.persist(prove)
    em.persist(user)
    em.persist(producto)

    em.transaction.commit()

    em.close()

}