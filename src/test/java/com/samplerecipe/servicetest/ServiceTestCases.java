package com.samplerecipe.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.samplerecipe.controller.RecipeController;
import com.samplerecipe.entity.RecipeEntity;
import com.samplerecipe.exceptions.IdNotFoundException;
import com.samplerecipe.exceptions.NoDataException;
import com.samplerecipe.exceptions.NoRecipeFoundException;
import com.samplerecipe.service.RecipeServiceInterface;

@SpringBootTest
public class ServiceTestCases {
	
	@InjectMocks
	RecipeController recipecontroller;
	@Mock
	RecipeServiceInterface rs;
	@Mock
	RecipeEntity r;
	@BeforeEach
	void startup() {
	MockitoAnnotations.openMocks(this); r = new RecipeEntity(1, "Chicken 65","veg", "Starters", "Bit Spicy", LocalDate.of(2022,05,16), null);
	}
	@Test
	public void getallrecipes() throws NoRecipeFoundException {
	Mockito.when(rs.getallrecipes()).thenReturn(Arrays.asList(r));
	assertEquals(Arrays.asList(r),rs.getallrecipes());
	Mockito.verify(rs,times(1)).getallrecipes();
	}
	
	
	@Test
	public void testgetRecipesbyId() throws IdNotFoundException {
	RecipeEntity r2 = new RecipeEntity(1, "Chicken 65","veg", "Starters", "Bit Spicy", LocalDate.of(2022,05,16), null);
	Mockito.when(rs.getRecipesbyId(1)).thenReturn(r2);
	assertEquals(r2, rs.getRecipesbyId(1));
	Mockito.verify(rs).getRecipesbyId(1);
	}

	@Test
	public void testupdateRecipe() throws IdNotFoundException {
	RecipeEntity r1 = new RecipeEntity(1, "Chicken 65","veg", "Starters", "Bit Spicy", LocalDate.of(2022,05,16), null);
	Mockito.when(rs.updateRecipe(1, r1)).thenReturn(r1);
	assertEquals(r1,rs.updateRecipe(1, r1));
	Mockito.verify(rs).updateRecipe(1, r1);
	}
	
	@Test
	public void testdeleteRecipe() throws NoDataException {
	RecipeEntity r3 = new RecipeEntity(1, "Chicken 65","veg", "Starters", "Bit Spicy", LocalDate.of(2022,05,16), null);
	when(rs.deleteRecipe(r3.getRecipeId())).thenReturn("REMOVED");
	String status = rs.deleteRecipe(1);
	assertEquals("REMOVED",status); 
	}
	
	@Test
	public void testaddFeedBack() {
	RecipeEntity r4 = new RecipeEntity(1, "Chicken 65","veg", "Starters", "Bit Spicy", LocalDate.of(2022,05,16), null);
	Mockito.when(rs.addRecipes(r4)).thenReturn(r4);
	assertEquals(r4,rs.addRecipes(r4));
	Mockito.verify(rs).addRecipes(r4);
	}


	




}
