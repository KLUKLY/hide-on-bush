package org.csu.klu.persistence;

import org.csu.klu.domain.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getCategoryList();//获得所有category

    Category getCategory(String categoryId);//获得某一个category的ID
}
