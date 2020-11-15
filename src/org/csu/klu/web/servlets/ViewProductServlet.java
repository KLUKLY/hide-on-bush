package org.csu.klu.web.servlets;

import org.csu.klu.domain.Category;
import org.csu.klu.domain.Item;
import org.csu.klu.domain.Product;
import org.csu.klu.service.CatalogService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ViewProductServlet extends HttpServlet {
    private static final String VIEW_PRODUCT = "/WEB-INF/jsp/catalog/Product.jsp";
    private String productId;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        productId = request.getParameter("productId");
        CatalogService service = new CatalogService();
        Product product = service.getProduct(productId);
        List<Item> itemList = service.getItemListByProduct(productId);
        HttpSession session = request.getSession();
        session.setAttribute("product",product);
        session.setAttribute("itemList",itemList);
        request.getRequestDispatcher(VIEW_PRODUCT).forward(request,response);
    }
}
