package com.atmecs;

import java.util.logging.Logger;

class Bike
{  Logger log=Logger.getLogger(Bike.class.getName());
//public Collection<Object> list=new ArrayList();

String bname;
String type;
String bcolor;
Object mileage;
double engine;
String fuel;
int weight;
Bike(String bname,String type,String bcolor,Object mileage,double engine,String fuel,int weight)
{
	this.bname= bname;
	this.type= type;
	this.bcolor= bcolor;
	this.mileage= mileage;
	this.engine= engine;
	this.fuel= fuel;
	this.weight= weight;

}
}