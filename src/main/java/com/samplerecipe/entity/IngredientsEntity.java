package com.samplerecipe.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class IngredientsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	@Column(name="id")
	private int ingredientsid;
	
	@Column(name="ingredients")
    private String ingredientsnames;
    private int quantity;
    
	public int getIngredientsid() {
		return ingredientsid;
	}

	public void setIngredientsid(int ingredientsid) {
		this.ingredientsid = ingredientsid;
	}

	public String getIngredientsnames() {
		return ingredientsnames;
	}

	public void setIngredientsnames(String ingredientsnames) {
		this.ingredientsnames = ingredientsnames;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public IngredientsEntity(int ingredientsid, String ingredientsnames, int quantity) {
		super();
		this.ingredientsid = ingredientsid;
		this.ingredientsnames = ingredientsnames;
		this.quantity = quantity;
	}

	public IngredientsEntity() {
		super();
	}

	@Override
	public String toString() {
		return "IngredientsEntity [ingredientsid=" + ingredientsid + ", ingredientsnames=" + ingredientsnames
				+ ", quantity=" + quantity + "]";
	}

    
    
    
    
    
}