package com.drawinng.request;

import javax.inject.Inject;

import com.drawinng.practice.DrawShape;

public class Requests {
	
	DrawShape d;
	
	/* it will say whenever we want instance of Requests so system internally wants inject drawshape*/
	@Inject
	public Requests(DrawShape d)
	{
		this.d=d;
	}

	public void makeRequest()
	{
		d.draw();
	}
}
