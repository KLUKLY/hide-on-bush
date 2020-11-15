package org.csu.klu.service;

import java.util.List;

import org.csu.klu.domain.Category;
import org.csu.klu.domain.Item;
import org.csu.klu.domain.Product;
import org.csu.klu.persistence.CategoryDAO;
import org.csu.klu.persistence.ItemDAO;
import org.csu.klu.persistence.ProductDAO;
import org.csu.klu.persistence.implement.CategoryDAOImpl;
import org.csu.klu.persistence.implement.ItemDAOImpl;
import org.csu.klu.persistence.implement.ProductDAOImpl;

public class CatalogService {
    private CategoryDAO categoryDAO;
    private ProductDAO productDAO;
    private ItemDAO itemDAO;
    public CatalogService(){
        categoryDAO = new CategoryDAOImpl();
        productDAO = new ProductDAOImpl();
        itemDAO = new ItemDAOImpl();
    }

    public List<Category> getCategoryList() {
        return categoryDAO.getCategoryList();
    }

    public Category getCategory(String categoryId) {
        return categoryDAO.getCategory(categoryId);
    }

    public Product getProduct(String productId) {
        return productDAO.getProduct(productId);
    }

    public List<Product> getProductListByCategory(String categoryId) {
        return productDAO.getProductListByCategory(categoryId);
    }

    // TODO enable using more than one keyword
    public List<Product> searchProductList(String keyword) {
        return productDAO.searchProductList("%" + keyword.toLowerCase() + "%");
    }

    public List<Item> getItemListByProduct(String productId) {
        return itemDAO.getItemListByProduct(productId);
    }

    public Item getItem(String itemId) {
        return itemDAO.getItem(itemId);
    }

    public boolean isItemInStock(String itemId) {
        return itemDAO.getInventoryQuantity(itemId) > 0;
    }
}
