package com.api;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.POJO.Datum;
import com.POJO.Employee;
import com.POJO.Support;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class sample {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException  {
		File file=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reqres.json");
		JsonMapper mapper = new JsonMapper();
		Employee readValue = mapper.readValue(file,Employee.class);
		List<Datum> data = readValue.getData();
	for (Datum datum : data) {
		System.out.println(datum.getAvatar());
		System.out.println(datum.getEmail());
		System.out.println(datum.getFirst_name());
		System.out.println(datum.getId());
		System.out.println(datum.getLast_name());
	}
		int per_page = readValue.getPer_page();
		Support support = readValue.getSupport();
		System.out.println(support.getUrl());
			System.out.println(support.getText());
		
		int total = readValue.getTotal();
		readValue.getTotal_pages();
		int page = readValue.getPage();
		System.out.println(page);
		System.out.println(per_page);
		System.out.println(total);
		System.out.println(total);
		
	}

}
