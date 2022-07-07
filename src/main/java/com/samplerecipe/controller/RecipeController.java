package com.samplerecipe.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.samplerecipe.entity.RecipeEntity;
import com.samplerecipe.exceptions.IdNotFoundException;
import com.samplerecipe.exceptions.NoDataException;
import com.samplerecipe.exceptions.NoRecipeFoundException;
import com.samplerecipe.service.RecipeServiceInterface;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
public class RecipeController {
	@Autowired
	RecipeServiceInterface rs;
	
	Logger logger= LoggerFactory.getLogger(RecipeController.class);
	@GetMapping("/showAllRecipes")   //viewall
	public List<RecipeEntity> getallrecipes() throws NoRecipeFoundException{
		logger.info("Message for INFO Logging level");
		logger.info("Message for WARN Logging level");
		logger.info("Message for ERROR Logging level");
		logger.info("Message for DEBUG Logging level");
		logger.info("Message for TRACE Logging level");
	return rs.getallrecipes();
	}
	
	
	  @GetMapping("/recipes/{rId}") //getbyid
	  public RecipeEntity getRecipesbyId(@PathVariable("rId") int rId) throws IdNotFoundException{ 
		    logger.info("Message for INFO Logging level");
		    logger.info("Message for WARN Logging level");
			logger.info("Message for ERROR Logging level");
			logger.info("Message for DEBUG Logging level");
			logger.info("Message for TRACE Logging level");
		  return rs.getRecipesbyId(rId);
	  }
	 
	
	 @PostMapping("/createrecipes")  //add
		public RecipeEntity addRecipes(@RequestBody RecipeEntity r)  {
		    logger.info("Message for INFO Logging level");
		    logger.info("Message for WARN Logging level");
			logger.info("Message for ERROR Logging level");
			logger.info("Message for DEBUG Logging level");
			logger.info("Message for TRACE Logging level");
		return rs.addRecipes(r);
		
		}
	 
	 @DeleteMapping("/deleterecipes/{rId}") //delete
	  public String deleteRecipe(@PathVariable("rId") int rId) throws NoDataException{
		    logger.info("Message for INFO Logging level");
		    logger.info("Message for WARN Logging level");
			logger.info("Message for ERROR Logging level");
			logger.info("Message for DEBUG Logging level");
			logger.info("Message for TRACE Logging level");
		  rs.deleteRecipe(rId);
		  return "Deleted Successfully";
		 
	  }
	 @PutMapping("/updaterecipe/{rId}")   //update
		public RecipeEntity updateRecipe(@PathVariable("rId") int rId, @RequestBody RecipeEntity r)  {
		    logger.info("Message for INFO Logging level");
		    logger.info("Message for WARN Logging level");
			logger.info("Message for ERROR Logging level");
			logger.info("Message for DEBUG Logging level");
			logger.info("Message for TRACE Logging level");
		return rs.updateRecipe(rId,r);
		}
	 



}
