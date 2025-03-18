package com.peceguini.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.peceguini.course.entities.pk.OrdemItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_order_item")
public class OrdemItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdemItemPK id;
	
	private Integer quantity;
	private Double price;
	
	public OrdemItem(){
		
	}
	public OrdemItem( Order order, Product product, Integer quantity, Double price) {
		super(); 
		id.setOrder(order);
		id.setProduct(product);
		this.quantity=quantity;
		this.price=price;
	}
	
	public Order getOrder() {
		return id.getOrder();
	}
	public void setOrder(Order order ) {
		id.setOrder(getOrder());
	}
	public Product getProduct() {
		return id.getProduct();
	}
	public void setProduct(Product product) {
		id.setOrder(getOrder());
	}
	
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemItem other = (OrdemItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	

}
