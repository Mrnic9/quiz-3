package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Document.Proveedor;

import java.util.List;
import java.util.Optional;

public interface IProveedorService {

    List<Proveedor> findAll(); // Devuelve una lista de productos
    Optional<Proveedor> findById(String id); // Devuelve un producto por su id
    Proveedor save(Proveedor proveedor); // Guarda un producto
    void update(Proveedor proveedor, String id); // Actualiza un producto
    void delete(String id); // Elimina un producto
}
