package org.example

import jakarta.persistence.Persistence
import org.example.ActInstituto.*

fun main() {
    val emf = Persistence.createEntityManagerFactory("unidadMYSQL")
//Abre conecction con la bd
    var em = emf.createEntityManager()

    em.transaction.begin()

    val director = Director(nombre = "Pepe", apellido = "Salmon" , dni = "12345678P", instituto = null)
    val director2 = Director(nombre = "Messi", apellido = "Ronaldo" , dni = "12945678P", instituto = null)
    val proveedor = Proveedor(nome = "Tortugas S.A",null)
    val departamento = Departamento(nombre = "Salmon",null)
    val inspector = Inspector(nombre = "Luis", apellido = "Beckan", dni = "87654321Q",instituto = null)
    val instituto = Instituto(nombre = "IES PAPA" , director = director , proveedor = listOf(proveedor), departamento = departamento, inspector = null)
    val instituto2 = Instituto(nombre = "IES Salmon", director = director2, proveedor = listOf(proveedor), departamento = departamento, inspector = inspector)

    em.persist(instituto)
    em.persist(instituto2)
    em.persist(director)
    em.persist(director2)
    em.persist(inspector)
    em.persist(proveedor)


    em.transaction.commit()

    em.close()


}