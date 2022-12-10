package org.APIRestAssured;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.POJORead.AddUserAddress_Output_POJO;
import org.POJORead.Address_Delete_Output;
import org.POJORead.CityList_Output_POJO;
import org.POJORead.Getuseraddress_Output_POJO;
import org.POJORead.Login_Output_POJO;
import org.POJORead.Statelist_Output_POJO;
import org.POJORead.UpdateUserAddress_Output_POJO;
import org.POJORead.city;
import org.POJORead.stateid;
import org.POJOwrite.AddUserAddrees_Input_POJO;
import org.POJOwrite.Address_Delete_Input;
import org.POJOwrite.CityLIst_Input_POJO;
import org.baseClass.baseclass;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.endpoints.EndPoints;
import com.profilepicture.POJO.Profile_picture_Output_POJO;
import com.searchproduct.POJO.SearchProduct_Input_POJO;
import com.searchproduct.POJO.Searchproduct_Output_POJO;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class sample extends baseclass {

	String logusertoken;

	int StateIdNumber;

	String statevalue ;

	int CityId;

	String AddressId;

	@Test(priority = 9)
	public void profilepicture() {


		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h2=new Header("Authorization"," Bearer " + logusertoken);
		Header h3=new Header("Content-Type","multipart/form-data");

		listheader.add(h3);
		listheader.add(h2);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		addformdata("profile_picture", new File("C:\\Users\\Jaidurai\\Desktop\\venkat\\APIAutomation\\picture\\baby-behaviour-and-awareness.jpg"));
		Response response = requesttype("POST", EndPoints.UPDATEPICTUREENDPOINT);


		int getstatus = getstatus(response);
		System.out.println(getstatus);	
		Assert.assertEquals(getstatus,200,"verify the status code");

		Profile_picture_Output_POJO as = response.as(Profile_picture_Output_POJO.class);
		String message = as.getMessage();
		Assert.assertEquals(message, "Profile updated Successfully","verify the picture");



	}




	@Test(priority = 8)
	public void searchproducts() {

		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h3=new Header("Content-Type","application/json");

		listheader.add(h3);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		SearchProduct_Input_POJO searchProduct_Input_POJO=new SearchProduct_Input_POJO("nuts");
		addBody(searchProduct_Input_POJO);

		Response response = requesttype("POST",EndPoints.SEARCHPRODUCTENDPOINT);

		int getstatus = getstatus(response);
		System.out.println(getstatus);	
		Assert.assertEquals(getstatus,200,"verify the status code");

		Searchproduct_Output_POJO as = response.as(Searchproduct_Output_POJO.class);
		String message = as.getMessage();
		Assert.assertEquals(message, "OK","verify the search product");



	}

	@Test(priority = 7)
	public void DeleteAccount() {

		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h2=new Header("Authorization"," Bearer " + logusertoken);
		Header h3=new Header("Content-Type","application/json");

		listheader.add(h3);
		listheader.add(h2);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		Address_Delete_Input address_Delete_Input=new Address_Delete_Input(AddressId);
		addBody(address_Delete_Input);

		Response response = requesttype("DELETE",EndPoints.DELETEADDRESSENDPOINT);

		int getstatus = getstatus(response);
		System.out.println(getstatus);	
		Assert.assertEquals(getstatus,200,"verify the status code");

		Address_Delete_Output as = response.as(Address_Delete_Output.class);
		String message = as.getMessage();
		Assert.assertEquals(message, "Address deleted successfully","verify the message");

	}



	@Test(priority = 6)
	public void Getuseraddress() {
		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h2=new Header("Authorization"," Bearer " + logusertoken);

		listheader.add(h2);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		Response response = requesttype("GET", EndPoints.GETADDRESSENDPOINT);

		int getstatus = getstatus(response);
		Assert.assertEquals(getstatus,200,"verify the status code");


		Getuseraddress_Output_POJO as = response.as(Getuseraddress_Output_POJO.class);
		String message = as.getMessage();
		Assert.assertEquals(message, "OK","verift OK the message");


	}

	@Test(priority = 5)
	public void updateAdress() {
		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h2=new Header("Authorization"," Bearer " + logusertoken);
		Header h3=new Header("Content-Type","application/json");

		listheader.add(h3);
		listheader.add(h2);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		org.POJOwrite.UpdateUserAddress_Input_Pojo updateUserAddress_Input_Pojo =new org.POJOwrite.UpdateUserAddress_Input_Pojo(AddressId, "praveen", "raj", "1234567890", "456", StateIdNumber, CityId, 868, "put", "get", "home");	
		addBody(updateUserAddress_Input_Pojo);

		Response response = requesttype("PUT", EndPoints.UPDATEDADDRESSENDPOINT);

		int getstatus = getstatus(response);
		Assert.assertEquals(getstatus,200,"verify the status code");


		UpdateUserAddress_Output_POJO as = response.as(UpdateUserAddress_Output_POJO.class);
		String message = as.getMessage();
		Assert.assertEquals(message, "Address updated successfully","verift Address updated successfully");

	}

	@Test(priority = 3)
	public void getcitylist() {

		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h3=new Header("Content-Type","application/json");

		listheader.add(h3);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		CityLIst_Input_POJO cityLIst_Input_POJO=new CityLIst_Input_POJO(statevalue);
		addBody(cityLIst_Input_POJO);

		Response response = requesttype("POST",EndPoints.CITYENDPOINT);

		int getstatus = getstatus(response);
		System.out.println(getstatus);

		String getprettystring = getprettystring(response);
		System.out.println(getprettystring);

		Assert.assertEquals(getstatus,200,"verify the status code");

		CityList_Output_POJO as = response.as(CityList_Output_POJO.class);

		ArrayList<city> data = as.getData();
		for (city city : data) {
			String name = city.getName();
			if (name.equals("Vriddhachalam")) {
				CityId = city.getId();
				System.out.println(CityId);
				Assert.assertEquals(name, "Vriddhachalam","verify the id");
				break;
			}

		}

	}


	@Test(priority = 2)
	public void getstatelist() {

		addHeader("accept", "application/json");

		Response response = requesttype("GET",EndPoints.STATEENDPOINT);
		int getstatus = getstatus(response);
		Assert.assertEquals(getstatus, 200,"verify the status code");

		Statelist_Output_POJO as = response.as(Statelist_Output_POJO.class);
		ArrayList<stateid> data = as.getData();

		for (stateid stateid : data) {
			String statename = stateid.getName();
			if (statename.equals("Tamil Nadu")) {
				StateIdNumber = stateid.getId();
				System.out.println(StateIdNumber);
				statevalue = String.valueOf(StateIdNumber);
				System.out.println(statevalue);
				Assert.assertEquals(statename,"Tamil Nadu");
				break;
			}
		}

	}


	@Test(priority = 4)
	public void adduseraddress() {

		List<Header>listheader=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h2=new Header("Authorization"," Bearer " + logusertoken);
		Header h3=new Header("Content-Type","application/json");

		listheader.add(h3);
		listheader.add(h2);
		listheader.add(h1);

		Headers header=new Headers(listheader);
		addheaders(header);

		AddUserAddrees_Input_POJO addUserAddrees_Input_POJO = new AddUserAddrees_Input_POJO(
				"praveen", "raj", "1234567890", "456", StateIdNumber, CityId, 868, "put", "get", "home");

		addBody(addUserAddrees_Input_POJO);

		Response response = requesttype("POST",EndPoints.ADDADDRESSENDPOINT);

		int getstatus = getstatus(response);
		System.out.println(getstatus);

		String getprettystring = getprettystring(response);
		System.out.println(getprettystring);

		Assert.assertEquals(getstatus,200,"verify the status code");

		AddUserAddress_Output_POJO as = response.as(AddUserAddress_Output_POJO.class);

		String message = as.getMessage();
		int address_id = as.getAddress_id();
		System.out.println(address_id);
		AddressId = String.valueOf(address_id);
		System.out.println(AddressId);

		Assert.assertEquals(message, "Address added successfully","verify Address added successfully");


	}


	@Test(priority = 1)
	public void simple() {


		addHeader("accept","application/json");

		basicauthentication("venkatraj96805@gmail.com","Venkat@1");

		Response response = requesttype("POST",EndPoints.BASICAUTHPOINT);

		int getstatus = getstatus(response);
		System.out.println(getstatus);

		String getprettystring = getprettystring(response);
		System.out.println(getprettystring);

		Assert.assertEquals(getstatus,200,"verify the status code");

		Login_Output_POJO as = response.as(Login_Output_POJO.class);

		String first_name = as.getData().getFirst_name();

		Assert.assertEquals(first_name,"venkatraj","firstname r checked");

		logusertoken = as.getData().getLogtoken();
		System.out.println(logusertoken);
		

	}}