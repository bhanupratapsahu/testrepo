package com.atmecs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

class Factory 
{   
	Logger log=Logger.getLogger(Factory.class.getName());
	public Bike bike;
	Collection<Object> list1=new ArrayList();
	Collection order(int items)
	{
		for(int i=0;i<ShowRoom.items;i++)
		{
			list1.add(new Bike("Honda Activa  ","5G" , "yellow", "60Kmpl" ,109.19,"Petrol ",109 ));
			list1.add(new Bike("TVS Scooty   ","Streak" , "purple", "75Kmpl" ,87.8,"Petrol ",97 ));

		}
		return list1;

	}
	/**
	 * 
	 * @param items
	 * @return bike
	 */
	void model(String mdl)
	{
		if(mdl.contains("Honda"))
		{
			log.info("How Mnay orders do you need?");
			ShowRoom.items=ShowRoom.sc.nextInt();
			order(ShowRoom.items);
		}
		else if(mdl.contains("TVS"))
		{
			log.info("How Mnay orders do you need?");
			ShowRoom.items=ShowRoom.sc.nextInt();
			order(ShowRoom.items);
		}
		else if(mdl.contains("Suzuki"))
		{
			//order(ShowRoom.items);
		}
		else if(mdl.contains("Hero"))
		{
			//order(ShowRoom.items);
		}
		else
		{
			log.info("This Model is Not Available");
			System.exit(0);
		}
	}
}