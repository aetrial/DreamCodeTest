package com.example.demo2.model;

public class Category {
	int sourceIndex;
	int destIndex;
	String nameSource;
	String nameDestination;
	
	public Category(int sourceIndex, int destIndex, String nameSource, String nameDestination){
		this.sourceIndex = sourceIndex;
		this.destIndex = destIndex;
		this.nameSource = nameSource;
		this.nameDestination = nameDestination;
	}

	public int getSourceIndex() {
		return sourceIndex;
	}

	public void setSourceIndex(int sourceIndex) {
		this.sourceIndex = sourceIndex;
	}

	public int getDestIndex() {
		return destIndex;
	}

	public void setDestIndex(int destIndex) {
		this.destIndex = destIndex;
	}

	public String getNameSource() {
		return nameSource;
	}

	public void setNameSource(String nameSource) {
		this.nameSource = nameSource;
	}

	public String getNameDestination() {
		return nameDestination;
	}

	public void setNameDestination(String nameDestination) {
		this.nameDestination = nameDestination;
	}
	
}
