package pl.edu.vistula.first_rest_api_spring.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.first_rest_api_spring.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}