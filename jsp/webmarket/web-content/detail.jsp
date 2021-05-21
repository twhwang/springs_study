<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>
<!-- <jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" /> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" />
</head>
<body>
<%@ include file="Web_header.jsp" %>
	<div class="jumbotron">
    	<div class="container">
        	<h1 class="display-3">상품 목록</h1>
    	</div>
    </div>
    <%
    String id = request.getParameter("id");
    ProductRepository dao = ProductRepository.getInstance();
    Product product = dao.getPbID(id);
    //Product product = productDAO.getPbID(id);
    %>
    <div class="container">
    	<div class="row">
    		<div class="col-md-5">
    			<img src="C:/Users/admin/Documents/htw/java/ee_work/webMarket/WebContent/upload/<%=product.getFilename()%>" style="width:100%" >
    		</div>
    		<div class="col-md-6">
    			<h3><%=product.getPname() %></h3>
    			<p><%=product.getDescription() %></p>
    			<p><b>상품코드 : </b><span class="badge badge-danger">
    				<%=product.getProductId() %>
    			</span></p>
    			<p><b>제조사 : </b><%=product.getManufacturer() %></p>
    			<p><b>분류 : </b><%=product.getCategory() %></p>
    			<p><b>재고 : </b><%=product.getUnitInStock() %></p>
    			<h4><%=product.getUnitPrice() %>원</h4>
    			<p><a href="#" class="btn btn-info">상품 주문 &raquo;</a></p>
    			<a href="./product.jsp" class="btn btn-secondary" role="button">상품 목록  &raquo;</a>
    		</div>
    	</div>
    	<hr>
    </div>
    <%@ include file="Web_footer.jsp" %>
</body>
</html>
