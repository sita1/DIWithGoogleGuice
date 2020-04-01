package com.drawinng.practice;

import javax.inject.Inject;

import com.drawinng.annotations.ColorValue;
import com.drawinng.annotations.EdgeValue;

public class DrawSquare implements DrawShape {
	
	private String color;
	
	private Integer edge;
	
	

	@Override
	public void draw() {
		System.out.print("drawing square color : " +color +" edge : "+ edge);
		
	}


   @Inject
	public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

}
