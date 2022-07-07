package com.samplerecipe.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;


@Entity
public class RecipeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	int recipeId;
	String recipeName;
	String category;
	String recipeType;
	String instructions;
	LocalDate date;
	 
	@OneToMany(targetEntity = IngredientsEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk", referencedColumnName = "recipeId")
	 private List<IngredientsEntity> ingredients;
	
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRecipeType() {
		return recipeType;
	}
	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public RecipeEntity(int recipeId, String recipeName, String category, String recipeType, String instructions,
			LocalDate date, List<IngredientsEntity> ingredients) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.category = category;
		this.recipeType = recipeType;
		this.instructions = instructions;
		this.date = date;
		this.ingredients = ingredients;
	}
	public List<IngredientsEntity> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<IngredientsEntity> ingredients) {
		this.ingredients = ingredients;
	}
	public RecipeEntity() {
		super();
	}
	@Override
	public String toString() {
		return "RecipeEntity [recipeId=" + recipeId + ", recipeName=" + recipeName + ", category=" + category
				+ ", recipeType=" + recipeType + ", instructions=" + instructions + ", date=" + date + ", ingredients="
				+ ingredients + "]";
	}
	
	
	
	
	

	
	
	
	
	

}
