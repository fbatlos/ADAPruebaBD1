package org.example.Act1

import jakarta.persistence.*
import org.example.ActInstituto.Proveedor
import java.util.Date

@Entity
@Table(name = "Productos")
data class Producto(

    @Column
    val nombre: String,

    @Column
    val descricao: String,

    @Column
    val precio: Double,

    @Column
    val fecha_alta:Date,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_Proveedor")
    val proveedor: Proveedor?,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null

)
