package com.example.demo2;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo2.model.Category;
import com.example.demo2.model.CategoryGraph;


@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		
		/*Example Categories
		 * Root || level 1
		 * Root -> Major appliances | Minor appliances | Law & Garden || level 2
		 * Major appliances -> Kitchen appliances | General Appliances || Minor appliances -> nothing (For testing) || Law & Garden -> Law | Garden | GardeningTools || level 3
		 * Garden -> ropes | water appliances
		 */
		
		List<Category> categories = Arrays.asList( new Category(0,1,"root","Major appliances"),
												   new Category(0,2,"root", "Minor appliances"),
												   new Category(0,3,"root", "Law & Garden"),
												   new Category(1,4,"Major appliances", "Kitchen appliances"),
												   new Category(1,5,"Major appliances", "General Appliances"),
												   new Category(3,6,"Law & Garden", "Law"),
												   new Category(3,7,"Law & Garden", "Garden"),
												   new Category(3,8,"Law & Garden", "GardeningTools"),
												   new Category(7,9,"Garden", "ropes"),
												   new Category(7,10,"Garden", "water appliances"));
		
		CategoryGraph exampleGraph = new CategoryGraph(categories);
		
		CategoryGraph.printCategoriesHierarchies(exampleGraph);
		CategoryGraph.printKeywords("Law & Garden", exampleGraph);
		CategoryGraph.getLevel(1, "Law", exampleGraph);
		CategoryGraph.getLevel(1, "water appliances", exampleGraph);
		
		return;
	}
	
}
