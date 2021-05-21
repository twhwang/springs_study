<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="com.oreilly.servlet.*" %>
	  <%@ page import="com.oreilly.servlet.multipart.*" %>
	  <%@ page import="java.util.*" %>
	  <%@ page import="dto.Product" %>
      <%@ page import="dao.ProductRepository" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
	String filename = " ";
	// 이미지 절대 경로
	String realFolder = "C:\\Users\\admin\\Documents\\htw\\java\\ee_work\\webMarket\\WebContent\\upload\\";
	// 이미지 최대 크기
	int maxSize = 5*1024*1024;
	// 인코딩 유형
	String encType = "UTF-8";
	
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	
	
	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	String unitInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	
	Integer price;
	
	if(unitPrice.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice);
	
	long stock;
	
	if(unitInStock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitInStock);
	
	Enumeration files = multi.getFileNames();
	String fname = (String)files.nextElement();
	String fileName = multi.getFilesystemName(fname);
	
	ProductRepository dao = ProductRepository.getInstance();
	
	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitInStock(stock);
	newProduct.setCondition(condition);
	newProduct.setFilename(fileName);
	
	dao.addProduct(newProduct);
	
	response.sendRedirect("product.jsp");
	%>
</body>
</html>
