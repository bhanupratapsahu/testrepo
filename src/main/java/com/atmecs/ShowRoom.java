package com.atmecs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ShowRoom {
	public static  int items; 
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Factory honda=new Factory();
		Collection<String> model=new ArrayList();
		model.add(" Honda ");
		model.add("TVS  ");
		model.add("Suzuki  ");
		model.add("Hero  ");
		Logger log=Logger.getLogger(ShowRoom.class.getName());
		log.info("Which model do you need?"+model);
		String md=sc.next();
		honda.model(md);  
		for(Object o:honda.list1)
		{
			log.info(""+o);
		}  

		//log.info("Details"+honda.list1);
	}
}
