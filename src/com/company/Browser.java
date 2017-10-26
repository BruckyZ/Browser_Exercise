package com.company;

import java.util.ArrayList;

public class Browser
{
	public Browser() //Constructor Empty
	{
	}


private String Name;            //Name String
private ArrayList<Tabs> tabs= new ArrayList<Tabs>();    //Tabs Arraylist



public ArrayList<Tabs> getTabs()

	{
		return tabs;
	}

	public void setTabs(ArrayList<Tabs> tabs)
	{
		this.tabs = tabs;
	}


	public String getName()

	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}


	public void addTabs(Tabs atabs) //Adding the tabs characters into Browser
	{
		tabs.add(atabs);
	}


}
