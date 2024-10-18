package org.example

import jakarta.persistence.Persistence
import org.example.Ejemplo1.Departamento
import org.example.Ejemplo1.Empleado
import java.util.*

fun main() {
    //cargar config

    val emf = Persistence.createEntityManagerFactory("unidadMYSQL")
//Abre conecction con la bd
    var em = emf.createEntityManager()

    //Para las transaciones

    em.transaction.begin()
    val d = Departamento("Prog", Date(),null )
    val e = Empleado("Jose",26 , d)

    em.persist(e) // persiste el objeto en Persistence.xml
    em.persist(d)


    //Finaliza la transaccion
    em.transaction.commit()

    //Cerrar la bd
    em.close()

    em = emf.createEntityManager()

    em.transaction.begin()

    val dep2 = Departamento("PDMM",Date(),null)
    em.persist(Empleado("Luis F",16,dep2))
    em.persist(dep2)

    em.transaction.commit()

    em.close()
}