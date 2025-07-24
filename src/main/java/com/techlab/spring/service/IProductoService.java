package com.techlab.spring.service;
import com.techlab.spring.model.producto.Producto;
import java.util.List;

public interface IProductoService {
    String crearProducto(Producto producto);
    List<Producto> listarProductos();
    Producto buscarPorId(Long id);
    String editarProducto(Long id, Producto producto);
    String eliminarProducto(Long id);
}