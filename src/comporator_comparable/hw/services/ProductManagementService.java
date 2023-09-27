package comporator_comparable.hw.services;

import comporator_comparable.hw.enteties.Product;

import java.util.List;


public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
