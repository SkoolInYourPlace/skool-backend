package com.startup.daddyschool.maps.helper;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.startup.daddyschool.maps.entity.GeographicalAdress;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Component
public class DistanceTime {

	private static final String API_KEY = "AIzaSyCKg9ksODKAbusxZGlGqhElqhE05IJk-Oc";
	OkHttpClient client = new OkHttpClient();

	public String calculate(GeographicalAdress origin,List<GeographicalAdress> destinations) throws IOException {
		
		String destinationsParam = DistanceUtility.convertAddressToString(destinations);
		String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + origin.toString() + "&destinations="+destinationsParam+"&key=" + API_KEY;
		
		//http://localhost:8080/schools/distances?origins="12.9816119,77.6949065"&destinations=[{"latitude":"13.0215796","longitude":"77.5540077"},{"latitude":"13.0640058","longitude":"77.5508946"},{"latitude":"13.0150223","longitude":"77.7115741"}]&api=AIzaSyCKg9ksODKAbusxZGlGqhElqhE05IJk-Oc
		Request request = new Request.Builder().url(url).build();

		Response response = client.newCall(request).execute();
		System.out.println("Received response" + response.body().toString());
		return response.body().string();
	}

}
