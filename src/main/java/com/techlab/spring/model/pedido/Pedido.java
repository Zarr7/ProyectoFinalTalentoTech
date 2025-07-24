package com.techlab.spring.model.pedido;

import com.techlab.spring.model.producto.Producto;
import com.techlab.spring.model.usuario.User;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado; // por ejemplo: "EN_PROCESO", "ENTREGADO"

    @ManyToOne
    private User usuario;

    @ManyToMany
    private List<Producto> productos;
}

