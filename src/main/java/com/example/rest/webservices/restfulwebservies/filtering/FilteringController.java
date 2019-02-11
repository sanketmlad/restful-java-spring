package com.example.rest.webservices.restfulwebservies.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue retriveSomebean() {
		SomeBean somebean = new SomeBean("value1", "v2", "v3", "v4");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(somebean);
		mapping.setFilters(filters);
		return mapping;
		
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retriveListSomebean() {
		return Arrays.asList(new SomeBean("value1", "v2", "v3", "v4"),
				new SomeBean("v1", "vfs2", "vfs3", "value4"));
	}
}
