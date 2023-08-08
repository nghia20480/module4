package product.repository.impl;

import org.springframework.stereotype.Repository;
import product.model.Branch;
import product.model.Product;
import product.repository.BranchRepository;
import product.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    static BranchRepository branchRepository = new BranchRepositoryImpl();
    public static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1,"Iphone 11",branchRepository.findById(1) , 11000,10));
        productMap.put(2, new Product(2,"Samsung 11",branchRepository.findById(2) , 10000,15));
        productMap.put(3, new Product(3,"Xiaomi Red 11",branchRepository.findById(3) , 13000,25));
        productMap.put(4, new Product(4,"Huawei note 2",branchRepository.findById(4) , 9000,12));
    }

    @Override
    public boolean create(Product product) {
        if(productMap.containsKey(product.getId())){
            return false;
        }
        productMap.put(product.getId(),product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        if(productMap.containsKey(product.getId())){
            productMap.put(product.getId(),product);
            return true;
        }
        return false;
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public boolean deleteById(int id) {
        if(productMap.containsKey(id)){
            productMap.remove(id);
            return true;
        }
        return false;
    }
}
