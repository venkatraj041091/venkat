package com.apiwrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojowrie.Address;
import com.pojowrie.Emolyee;

public class demowrite {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\wirte.json");
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Address> emp=new ArrayList<Address>();
		
		Address a1=new Address("durai","thermo","trichy");
		Address a2=new Address("durai","thermo","trichy");
		Address a3=new Address("durai","thermo","trichy");
		emp.add(a3);
		emp.add(a2);
		emp.add(a1);
		Emolyee employ=new Emolyee("durai","thermo",56858555,emp);
		mapper.writeValue(file, employ);
		
		
	}

}
