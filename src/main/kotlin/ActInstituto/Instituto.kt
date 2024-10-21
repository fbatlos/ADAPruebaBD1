package org.example.ActInstituto

import jakarta.persistence.*

@Entity
@Table(name = "Institutos")
data class Instituto(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column
    val nombre: String,

    @OneToOne
    @JoinColumn(name = "id_Director")
    val director: Director?,

    @ManyToMany
    val proveedor: List<Proveedor>?,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_Departamento")
    val departamento: Departamento?,

    @ManyToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "id_Inspector")
    val inspector: Inspector?

)
