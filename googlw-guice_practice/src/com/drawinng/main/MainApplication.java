package com.drawinng.main;



import com.drawinng.module.AppModule;
import com.drawinng.practice.DrawShape;
import com.drawinng.request.Requests;
import com.drawinng.request.RequestsChild;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainApplication {
	private static final String SQUARE_DRAW = "Square";
	
	private static void sendRequest(String shape)
	{
		if(shape.equals("Square"))
		{
			Injector injector = Guice.createInjector(new AppModule());
			DrawShape drawShape = injector.getInstance(DrawShape.class);
			Requests request= injector.getInstance(Requests.class);
		//DrawShape drawShape = new DrawSquare();
		//Requests request= new Requests(drawShape);
		request.makeRequest();
		}
	}
	public static void main(String[] args) {
	
	
		sendRequest(SQUARE_DRAW);
	}

}
