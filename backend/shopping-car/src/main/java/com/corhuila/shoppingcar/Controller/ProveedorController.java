package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Document.Producto;
import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IService.IProductoService;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/proveedor")
public class ProveedorController {

    @Autowired
    private IProveedorService service;



    @PostMapping()
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return service.save(proveedor);
    }




}
