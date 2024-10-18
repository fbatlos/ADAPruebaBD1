package org.example.Act1

import jakarta.persistence.*


@Entity
@Table(name = "Proveedores")
data class Proveedor(

    @Column
    val nome: String,

    @OneToMany(mappedBy = "proveedor")
    val productos:List<Producto>,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

)
