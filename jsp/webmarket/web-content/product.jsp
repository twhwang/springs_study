<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.ArrayList" %>
  <%@ page import="dto.Product" %>
  <%@ page import="dao.ProductRepository" %>
 <!--  <jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />  -->
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
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
    	ProductRepository dao = ProductRepository.getInstance();
    	//ArrayList<Product> LOP = productDAO.getAllProducts();
    	ArrayList<Product> LOP = dao.getAllProducts();
    %>
    <div class="container">
    	<div class="row" align="center">
    		<%
    			for(int i = 0 ; i < LOP.size() ; i++){
    				Product product = LOP.get(i);
    		%>
    		<div class="col-md-4">
    			<img src="C:/Users/admin/Documents/htw/java/ee_work/webMarket/WebContent/upload/<%=product.getFilename()%>" style="width:100%">
    			<h3><%=product.getPname()%></h3>
    			<p><%=product.getDescription() %>
    			<p><%=product.getUnitPrice() %>원
    			<p><a href="./detail.jsp?id=<%=product.getProductId() %>" class="btn btn-secondary" role="button">상세 정보 &raquo;</a>
    		</div>
    		<% } %>
    </div>
    <hr />
</div>
<%@ include file="Web_footer.jsp" %>
</body>
</html>
