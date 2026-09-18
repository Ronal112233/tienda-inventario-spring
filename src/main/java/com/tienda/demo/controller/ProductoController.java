package com.tienda.demo.controller;

import com.tienda.demo.model.Producto;
import com.tienda.demo.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoRepository repository;

    @GetMapping
    public List<Producto> listar() { return repository.findAll(); }

    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody Producto p) {
        return ResponseEntity.ok(repository.save(p));
    }
}