package com.ecom.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Cart")
public class CustomerCart {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int cartId;
	private int productId;//Primary key
	private String productName;
	 private String productType;
	 private String productCompany;
	 private double productPrize;
	 private String productCode;
	 private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCartId() {
		return cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public double getProductPrize() {
		return productPrize;
	}
	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	

}
