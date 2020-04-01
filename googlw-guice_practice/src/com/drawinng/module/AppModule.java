package com.drawinng.module;

import com.drawinng.annotations.ColorValue;
import com.drawinng.annotations.EdgeValue;
import com.drawinng.practice.DrawShape;
import com.drawinng.practice.DrawSquare;
import com.drawinng.request.Requests;
import com.drawinng.request.RequestsChild;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
	
	@Override   
	protected void configure() {
		// object creation
		bind(DrawShape.class).to(DrawSquare.class);
		bind(Requests.class).to(RequestsChild.class);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("RED");;
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(42);
	}

}
