package com.android.commands.monkey;

public class ScreenZone {
	
	private float x1;
	private float y1;
	private float x2;
	private float y2;
	
	private float prob;
	
	public ScreenZone(float x1, float y1, float x2, float y2, float prob) 
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		this.prob = prob;
	}

}
