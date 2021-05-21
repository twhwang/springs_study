<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" />
</head>
<body>
<%@ include file="Web_header.jsp" %>
	<div class="jumbotron">
    	<div class="container">
        	<h1 class="display-3">상품 등록</h1>
    	</div>
    </div>
    <div class="container">
    	    <form action="./processAddProduct.jsp" class="form-horizontal" method="POST">
        <div class="form-group row">
            <label class="col-sm-2">상품 코드</label>
            <div class="col-sm-3">
                <input type="text" name="productId" id="form-control">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">상품 이름</label>
            <div class="col-sm-3">
                <input type="text" name="name" id="form-control">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">가격</label>
            <div class="col-sm-3">
                <input type="text" name="unitPrice" id="form-control">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">상세 정보</label>
            <div class="col-sm-5">
                <textarea name="description" cols="50" rows="2"></textarea>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">제조사</label>
            <div class="col-sm-3">
                <input type="text" name="manufacturer" id="form-control">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">분류</label>
            <div class="col-sm-3">
                <input type="text" name="category" id="form-control">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">재고</label>
            <div class="col-sm-3">
                <input type="text" name="unitsInStock" id="form-control">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2">상태</label>
            <div class="col-sm-5">
                <input type="radio" name="condition" value="New ">신규 제품
                <input type="radio" name="condition" value="Old ">중고 제품
                <input type="radio" name="condition" value="Refurbished" >재생 제품
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" class="btn btn-primary" value="등록" />
            </div>
        </div>
    </form>
    </div>
<%@ include file="Web_footer.jsp" %>
</body>
</html>