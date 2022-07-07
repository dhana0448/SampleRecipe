package com.samplerecipe.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.samplerecipe.entity.RecipeEntity;
import com.samplerecipe.exceptions.IdNotFoundException;
import com.samplerecipe.exceptions.NoDataException;
import com.samplerecipe.exceptions.NoRecipeFoundException;
import com.samplerecipe.repository.RecipeRepository;


@Service
public class RecipeServiceImpl implements RecipeServiceInterface {
	 @Autowired
	  RecipeRepository rs;

	
	 @Override
	public List<RecipeEntity> getallrecipes() throws NoRecipeFoundException{
		 List<RecipeEntity> m= rs.findAll();
		 if (m.isEmpty()) {
			 throw new NoRecipeFoundException("No Recipes Found");
		 }
		return rs.findAll();
	}

	 
	@Override
	public RecipeEntity addRecipes(RecipeEntity r) {
		return rs.save(r);
	}


	@Override
	public String deleteRecipe(int rId) throws NoDataException {
		Optional<RecipeEntity> m= rs.findById(rId);
		if(!m.isPresent()) {
			throw new NoDataException("Oops we can't find this Id!!");
		}
		rs.deleteById(rId);
		return "Removed";
	   }


	@Override
	public RecipeEntity updateRecipe(int rId,RecipeEntity r) {	
			RecipeEntity m=  rs.findById(rId).get();
				  if(m!=null) { 
				    m.setRecipeName(r.getRecipeName());
				    m.setCategory(r.getCategory());
				    m.setRecipeType(r.getRecipeType());
				    m.setInstructions(r.getInstructions()); 
				    m.setIngredients(r.getIngredients());
				    m.setDate(r.getDate()); 
				    }
				 return rs.save(m);
	}
		
	
	@Override
	public RecipeEntity getRecipesbyId(int rId) throws IdNotFoundException {
        Optional<RecipeEntity> m= rs.findById(rId);
	    if(!m.isPresent()) {
		   throw new IdNotFoundException("Sorry Recipe Id not found!!");
	      }
	   return m.get();
	}

	

	
	
	 
}
