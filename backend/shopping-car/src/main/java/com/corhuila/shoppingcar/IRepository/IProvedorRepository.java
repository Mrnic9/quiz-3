package com.corhuila.shoppingcar.IRepository;

import com.corhuila.shoppingcar.Document.Proveedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvedorRepository extends MongoRepository<Proveedor,String> {
}
