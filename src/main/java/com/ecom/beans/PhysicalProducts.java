package com.ecom.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

 
@Entity
@Table(name = "PhysicalProducts")
public class PhysicalProducts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int productId;
	private String productName;
	private String Rating;
	private double MRPPrice;
	private double DiscountPrice;
	private String Size;
	private String Quantity;
	private String productModel;
	private String productCompany;
	//private double productPrice;
	private int productCategory;
	private int ProductSubCatagory;
	
	private String ShippingInformation;
	private String Details;
	private String Specification;
	@Lob
private String Video;
	private String productCode;
	@Lob

    @Column(length=2147483647)
	private String image;
	 
//	@Lob
//	private String QRcode;
//	public String getQRcode() {
//		return QRcode;
//	}


	  

	public String getDetails() {
		return Details;
	}

	public void setDetails(String details) {
		Details = details;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

	public double getMRPPrice() {
		return MRPPrice;
	}

	public void setMRPPrice(double mRPPrice) {
		MRPPrice = mRPPrice;
	}

	public double getDiscountPrice() {
		return DiscountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		DiscountPrice = discountPrice;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getShippingInformation() {
		return ShippingInformation;
	}

	public void setShippingInformation(String shippingInformation) {
		ShippingInformation = shippingInformation;
	}

	public String getSpecification() {
		return Specification;
	}

	public void setSpecification(String specification) {
		Specification = specification;
	}

	public String getVideo() {
		return Video;
	}

	public void setVideo(String video) {
		Video = video;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductSubCatagory() {
		return ProductSubCatagory;
	}

	public void setProductSubCatagory(int productSubCatagory) {
		ProductSubCatagory = productSubCatagory;
	}



	@Column(columnDefinition = "character(1) DEFAULT 'Y'::bpchar")
	private char isactive;
	private String createdby;
	private LocalDate created;
	private String updatedby;
	private LocalDate updated;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	private String productDescription;

	 

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	 
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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

	public char getIsactive() {
		return isactive;
	}

	public void setIsactive(char isactive) {
		this.isactive = isactive;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public LocalDate getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	 
}
