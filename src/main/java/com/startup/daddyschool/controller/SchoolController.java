package com.startup.daddyschool.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.startup.daddyschool.entity.SchoolEntity;
import com.startup.daddyschool.maps.entity.DistanceResponse;
import com.startup.daddyschool.maps.entity.GeographicalAdress;
import com.startup.daddyschool.maps.helper.DistanceTime;
import com.startup.daddyschool.service.ISchoolService;

@Controller
@RequestMapping("schools")
public class SchoolController {
	@Autowired
	private ISchoolService schoolService;
	private DistanceTime distance;

	@Autowired
	public void setDistance(DistanceTime distance) {
		this.distance = distance;
	}

	
	@GetMapping("school")
	@CrossOrigin
	public ResponseEntity<List<SchoolEntity>> getAllSchools() {
		List<SchoolEntity> list = schoolService.getAllSchools();
		return new ResponseEntity<List<SchoolEntity>>(list, HttpStatus.OK);
	}
	@GetMapping("schoolmap")
	@CrossOrigin
	public void getAllSchool() {
		System.out.println("CROSS  MICRO  SERVICE  CALL RECEIVED.ALL  Schools room  School  Service");
	}

	@PostMapping("distances")	
	public ResponseEntity<DistanceResponse> getAllDistances(@RequestBody List<GeographicalAdress> destinations) {
		
		System.out.println("REceived requ:Krishna");
		ObjectMapper mapper = new ObjectMapper();
		DistanceResponse distanceResponse = new DistanceResponse();

		try {
			
			System.out.println(destinations.toString());
			GeographicalAdress origin = new GeographicalAdress("11.22.33","44.55.66");
			String response = distance.calculate(origin, destinations);
			distanceResponse = mapper.readValue(response, DistanceResponse.class);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		return new ResponseEntity<DistanceResponse>(distanceResponse, HttpStatus.OK);
	}
	
	
	public static void main(String args[])
	{
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		DistanceResponse distanceResponse = new DistanceResponse();

		try {
			
			List<GeographicalAdress> list = new ArrayList<GeographicalAdress>();
			GeographicalAdress ga= new GeographicalAdress("11.22.33", "44.55.66");
			mapper.writeValue(new File("D:/ADDRESS2.json"),ga );
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		
	}
}