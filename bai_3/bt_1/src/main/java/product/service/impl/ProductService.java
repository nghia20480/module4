package product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.model.Product;
import product.repository.ProductRepository;

import java.util.List;
@Service
public class ProductService implements product.service.ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public boolean create(Product product) {
        return productRepository.create(product);
    }

    @Override
    public boolean update(Product product) {
        return productRepository.update(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        return productRepository.deleteById(id);
    }
}
