package com.ecom.controller;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.beans.Review;
import com.ecom.beans.Vendor;
import com.ecom.service.ReviewService;

@Controller
@RequestMapping("/Reviews")
public class ReviewController {
	@Autowired
	ReviewService ReviewService;
	
	
 @RequestMapping("/addReview")
	public String AddReview(Model model,Review reviewObject)
	{
	 reviewObject.setIsActive('Y');
	model.addAttribute("reviewObject", reviewObject);
	return "add-review";
	}
 
 @RequestMapping("/saveReviews")
 public String SaveReviews(Model model,Review Object)
 {
	 Object.setIsActive('Y');
	 ReviewService.addReviewDetails(Object);
  	 return "redirect:/Reviews/viewreviews";
 }
 
 @RequestMapping("/viewreviews")
   public String viewReviews(Model model)
   {
	 List <Review> Review=ReviewService.getAllReviewDetails();
	 model.addAttribute("Review", Review);
	   return "review";
   }
 
}
