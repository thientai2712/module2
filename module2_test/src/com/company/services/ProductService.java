package com.company.services;

import com.company.models.Product;
import com.company.utils.CSVUtils;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProductService implements IProductService {
    public final static String PATH = "data/products.csv";
    private static ProductService instance;

    private ProductService() {

    }

    public static ProductService getInstance() {
        if (instance == null)
            instance = new ProductService();
        return instance;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        List<String> records = CSVUtils.read(PATH);
        for (String record : records)
            products.add(Product.parse(record));
        return products;
    }

    @Override
    public void add(Product newProduct) {
        List<Product> products = findAll();
        products.add(newProduct);
        CSVUtils.write(PATH, products);
    }

    @Override
    public void update(Product newProduct) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (product.getId() == newProduct.getId()) {
                String name = newProduct.getName();
                if (name != null && !name.isEmpty())
                    product.setName(newProduct.getName());
                Integer quantity = newProduct.getQuantity();
                if (quantity != null)
                    product.setQuantity(quantity);
                Double price = newProduct.getPrice();
                if (price != null)
                    product.setPrice(price);
                String description = newProduct.getTitle();
                if (description != null && !description.isEmpty())
                    product.setName(newProduct.getTitle());
                CSVUtils.write(PATH, products);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public boolean exist(int id) {
        return findById(id) != null;
    }

    @Override
    public boolean existByName(String name) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (product.getName().equals(name)) return true;
        }
        return false;
    }

    @Override
    public boolean existsById(int id) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (product.getId() == id)
                return true;
        }
        return false;
    }

    @Override
    public void deleteById(int id) {
        List<Product> products = findAll();
        products.removeIf(new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getId() == id;
            }
        });
        CSVUtils.write(PATH, products);
    }

//    @Override
//    public Product findExpenSiveProduct() {
//        List<Product> products = findAll();
//        return products;
//    }

    @Override
    public List<Product> findAllOrderByPriceASC() {
        List<Product> products = new ArrayList<>(findAll());
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o1.getPrice() - o2.getPrice();
                if (result == 0)
                    return 0;
                return result > 0 ? 1 : -1;
            }
        });

        return products;
    }

    @Override
    public List<Product> findAllOrderByPriceDESC() {
        List<Product> products = new ArrayList<>(findAll());
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o2.getPrice() - o1.getPrice();
                if (result == 0)
                    return 0;
                return result > 0 ? 1 : -1;
            }
        });

        return products;
    }
}
