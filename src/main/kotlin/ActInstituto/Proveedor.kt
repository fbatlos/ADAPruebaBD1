package org.example.ActInstituto

import jakarta.persistence.*
import org.example.Act1.Producto


@Entity
@Table(name = "Proveedores")
data class Proveedor(

    @Column
    val nome: String,

    @ManyToMany
   /* @JoinTable(
        name = "proveerdor_instituto",
        joinColumns = [JoinColumn(name = "proveodores_id")],
        inverseJoinColumns = [JoinColumn(name = "institutos_id")]
    )*/
    val institutos: List<Instituto>?,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

)
