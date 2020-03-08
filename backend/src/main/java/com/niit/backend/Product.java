package com.niit.backend;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
@Id
@GeneratedValue

int productId;
String productName;
String productDesc;
int price;
int quantity;
int categoryId;
int supplierId;
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
public String getProductDesc() {
return productDesc;
}
public void setProductDesc(String productDesc) {
this.productDesc = productDesc;
}
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
public int getCategoryId() {
return categoryId;
}
public void setCategoryId(int categoryId) {
this.categoryId = categoryId;
}
public int getSupplierId() {
return supplierId;
}
public void setSupplierId(int supplierId) {
this.supplierId = supplierId;
}


}
