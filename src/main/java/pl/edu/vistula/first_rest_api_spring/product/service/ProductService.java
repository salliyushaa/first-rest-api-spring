package pl.edu.vistula.first_rest_api_spring.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.first_rest_api_spring.product.api.request.ProductRequest;
import pl.edu.vistula.first_rest_api_spring.product.api.response.ProductResponse;
import pl.edu.vistula.first_rest_api_spring.product.domain.Product;
import pl.edu.vistula.first_rest_api_spring.product.repository.ProductRepository;
import pl.edu.vistula.first_rest_api_spring.product.support.ProductMapper;
import pl.edu.vistula.first_rest_api_spring.product.support.exception.ProductNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = repository.save(mapper.toProduct(request));
        return mapper.toProductResponse(product);
    }

    public ProductResponse find(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        return mapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll().stream().map(mapper::toProductResponse).collect(Collectors.toList());
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}