package pl.edu.vistula.first_rest_api_spring.product.support;

import java.util.function.Supplier;
import pl.edu.vistula.first_rest_api_spring.product.support.exception.ProductNotFoundException;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> productNotFound (Long id) {
        return () -> new ProductNotFoundException(id);
    }
}