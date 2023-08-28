<%--
  Created by IntelliJ IDEA.
  User: anhph
  Date: 8/28/2023
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<a href="">Danh mục sản phẩm</a>
<a href="">Giỏ hàng</a>
<a href="">Đăng nhâp</a>
<a href="">Đăng ký</a>
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
