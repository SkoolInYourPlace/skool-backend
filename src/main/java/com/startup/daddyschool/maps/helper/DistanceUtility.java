package com.startup.daddyschool.maps.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.startup.daddyschool.maps.entity.GeographicalAdress;

public class DistanceUtility {
	public static String convertAddressToString(List<GeographicalAdress> destinations)
	{
		
		return destinations.stream()
              .map(n->n.toString()).collect(Collectors.joining("|"));
	}
	
	public static void main(String args[])
	{
		DistanceUtility dt = new DistanceUtility();
		
	/*	list.add(new GeographicalAdress("12.9816119","77.6949065"));*/
		
		
		/*System.out.println(dt.convertAddressToString(list));*/
	}
	
}
