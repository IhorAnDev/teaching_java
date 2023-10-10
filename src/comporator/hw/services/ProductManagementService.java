package comporator.hw.services;

import comporator.hw.enteties.Product;

import java.util.List;


public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
