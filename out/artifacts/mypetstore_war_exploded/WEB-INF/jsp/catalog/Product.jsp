<%--
  Created by IntelliJ IDEA.
  User: 86137
  Date: 2020/11/15
  Time: 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
    <a href="viewCategory?categoryId=${sessionScope.category.name}">Return to ${sessionScope.category.name}</a>
</div>

<div id="Catalog">

    <h2>${sessionScope.product.name}</h2>

    <table>
        <tr>
            <th>Item ID</th>
            <th>Product ID</th>
            <th>Description</th>
            <th>List Price</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach var="item" items="${sessionScope.itemList}">
            <tr>
                <td>
                    <a href="viewItem?itemId=${item.itemId}">${item.itemId}</a>
                </td>
                <td>${item.product.productId}</td>
                <td>    ${item.attribute1} ${item.attribute2} ${item.attribute3}
                        ${item.attribute4} ${item.attribute5} ${sessionScope.product.name}</td>
                <td><fmt:formatNumber value="${item.listPrice}" pattern="$#,##0.00" /></td>
                <td>
                    <a class="Button" href="#">Add to Cart</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td>
            </td>
        </tr>
    </table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>
