
package com.Tienda.dao;
import com.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Alejandro
 */
public interface ProductoDao CategoriaDao extends JpaRepository<Producto,Long>{
    
}
