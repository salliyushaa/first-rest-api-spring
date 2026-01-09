package pl.edu.vistula.first_rest_api_spring.product.api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.first_rest_api_spring.product.api.request.ProductRequest;
import pl.edu.vistula.first_rest_api_spring.product.api.response.ProductResponse;
import pl.edu.vistula.first_rest_api_spring.product.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) { this.service = service; }

    @PostMapping
    @Operation(summary = "Create product")
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest request) {
        return new ResponseEntity<>(service.create(request), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find product by id")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        return ResponseEntity.ok(service.find(id));
    }

    @GetMapping
    @Operation(summary = "Find all products")
    public ResponseEntity<List<ProductResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete item")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}