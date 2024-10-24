package com.Tienda.dao;
import com.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Alejandro
 */
public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}
