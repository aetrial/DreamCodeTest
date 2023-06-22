package com.example.demo2.model;

import java.util.ArrayList;
import java.util.List;

public class CategoryGraph {

	//Adjacent array
	//Locates every relationship into the Category Hierarchy
	List<List<Index>> adjIndex = new ArrayList<>();

	/*
	 * Constructor based on a List of Categories
	 */
	public CategoryGraph(List<Category> categories) {

		System.out.println("*****");
		//Find max edge of the graph (Max sub category) -> n
		int n=0;
		for(Category c: categories) {
			n = Integer.max(n, Integer.max(c.getSourceIndex(),c.getDestIndex()));
		}

		// List of Lists need to allocate memory or we could have issues
		for(int i =0; i<= n; i++) {
			adjIndex.add(i, new ArrayList<>());
		}

		//create the category graph edges

		for(Category current: categories) {
			adjIndex.get(current.sourceIndex).add(new Index(current.destIndex,current.nameSource));
			adjIndex.get(current.destIndex).add(new Index(current.sourceIndex, current.nameDestination));
		}

		System.out.println("*****");

	}

	//Print adjacent hierarchy graph, we will use indexes to find node names

	public static void printCategoriesHierarchies(CategoryGraph categories) {

		//Starting point
		int currentPoint = 0;
		//Finishing point
		int maxSize = categories.adjIndex.size();

		//Prints every node of the graph and his relations contained into the Index class
		while(currentPoint < maxSize) {
			for(Index destination : categories.adjIndex.get(currentPoint)) {
				System.out.println("("+currentPoint+"-->"+destination.getId()+ " Base Category Name:"+ destination.getName() +")\t");
			}
			System.out.println();
			currentPoint++;
		}

	}

	public static void printKeywords(String category, CategoryGraph categories) {

		System.out.println("*****");

		//Starting point
		int currentPoint = 0;
		//Finishing point
		int maxSize = categories.adjIndex.size();

		System.out.println("Keywords for category " + category +": ");

		//Runs throw the adjacent Array and locates all father's and son's names (all Hierarchy as the problem was done as a bidirectional graph)
		while(currentPoint < maxSize) {
			for(Index destination : categories.adjIndex.get(currentPoint)) {
				if( category.equals(destination.getName())) {
					System.out.println(categories.getAdjIndex().get(destination.getId()).get(0).getName());
				}
				currentPoint++;
			}
		}

		System.out.println("*****");

	}

	/*
	 * Gets the level on the graph for a given Category. 
	 * this is a recursive method, the idea is to search for the parent name as it's always located
	 * as the first index of the hierarchy bidirectional Array
	 */
	public static void getLevel(Integer currentLevel, String category, CategoryGraph categories) {

		//Stop condition (Finding root must stop execution)

		if(category.equals("root")) {
			System.out.println("The category level is: " + currentLevel);
			return;
		}

		//Starting point
		int currentPoint = 0;
		//Finishing point
		int maxSize = categories.adjIndex.size();

		//Run throw all adjacent array
		while(currentPoint < maxSize) {
			for(Index destination : categories.adjIndex.get(currentPoint)) {
				//Once i find the node I'm searching for I will Iterate
				if( category.equals(destination.getName())) {
					//Iterate using the parent name
					getLevel(currentLevel+1,  categories.getAdjIndex().get(destination.getId()).get(0).getName() ,categories);
					//stop once iteration start collapsing
					return;
				}
			}
			currentPoint++;
		}
	}


	/*
	 * Getters and Setters
	 */

	public List<List<Index>> getAdjIndex() {
		return adjIndex;
	}

	public void setAdjIndex(List<List<Index>> adjIndex) {
		this.adjIndex = adjIndex;
	}

}
