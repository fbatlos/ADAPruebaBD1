package org.example.ActInstituto

import jakarta.persistence.*
import org.example.Act1.Producto


@Entity
@Table(name = "Proveedores")
data class Proveedor(

    @Column
    val nome: String,

    @OneToMany(mappedBy = "proveedor", cascade = [CascadeType.ALL])
    val instituto: List<Instituto>?,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

)
