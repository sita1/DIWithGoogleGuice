package com.drawinng.module;

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
	}

}
