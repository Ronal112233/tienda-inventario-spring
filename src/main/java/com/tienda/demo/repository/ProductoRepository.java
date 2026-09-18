package com.tienda.demo.repository;

import com.tienda.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Los métodos básicos (save, findAll, findById, delete) ya vienen incluidos
    // Puedes agregar consultas personalizadas aquí si lo necesitas
}