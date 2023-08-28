<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <table border="1px">
        <tr>
            <th>STT</th>
            <th>Tên sản phẩm</th>
            <th>Giá</th>
            <th>Số lượng</th>
            <th colspan="3">Lựa chọn</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getQuantity()}</td>
                <td><button><a href="">Thêm</a></button></td>
                <td><button><a href="">Sủa</a></button></td>
                <td><button><a href="">Xóa</a></button></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>