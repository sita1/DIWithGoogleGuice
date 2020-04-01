package com.drawinng.request;


import javax.inject.Inject;     

import com.drawinng.practice.DrawShape;

public class RequestsChild extends Requests {
	
	
	   
	/* it will say whenever we want instance of Requests so system internally wants inject drawshape*/
	@Inject
	public RequestsChild(DrawShape d)          
	{
		super(d);
	}

	@Override
	public void makeRequest()
	{
		System.out.println("IT IS REQUESTCHILD");
		d.draw();
	}
}
