package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	// 상품 목록 객체 배열 생성
	private ArrayList<Product> LOP = new ArrayList<Product>();
	
	// 새로운 상품 목록 생성
	private static ProductRepository instance = new ProductRepository();
	
	// 상품 목록 생성 후 신규 상품 내용을 담아오는 메서드
	public static ProductRepository getInstance() {
		return instance;
	}
	
	// 상품 목록 내역 세팅
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone6s", 800000);
		phone.setDescription("4.7-inch, 1334x750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitInStock(1000);
		phone.setCondition("New");
		phone.setFilename("img01.jpg");
		
		Product nb = new Product("P1235", "LG PC 그램", 1500000);
		nb.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		nb.setCategory("Tablet");
		nb.setManufacturer("LG");
		nb.setUnitInStock(1000);
		nb.setCondition("Refurbished");
		nb.setFilename("img02.jpg");
		
		Product tb = new Product("P1236", "Galaxy Tab S", 900000);
		tb.setDescription("212.8*125.6*6mm, Super AMOLED display, Octa-core processors");
		tb.setCategory("Tablet");
		tb.setManufacturer("Samsung");
		tb.setUnitInStock(1000);
		tb.setCondition("Old");
		tb.setFilename("img03.jpg");
		
		LOP.add(phone);
		LOP.add(nb);
		LOP.add(tb);
	}
	
	// 모든 상품 내역 반환
	public ArrayList<Product> getAllProducts(){
		return LOP;
	}
	
	// 상품 정보 받아오기
	public Product getPbID(String pID) {
		Product pbID = null;
		
		for (int i = 0 ; i < LOP.size(); i++) {
			Product product = LOP.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(pID)) {
				pbID = product;
				break;
			}
		}
		return pbID;
	}
	
	// LOP 목록에 상품 정보 추가
	public void addProduct(Product product) {
		LOP.add(product);
	}
	
}
