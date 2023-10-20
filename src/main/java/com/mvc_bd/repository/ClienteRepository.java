package com.mvc_bd.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.mvc_bd.model.Cliente;
 
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
 