package com.profilepicture.POJO;


public class Profile_picture_Output_POJO {
	private int status;
	private String message;
	private picture data;
	private int cart_count;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public picture getData() {
		return data;
	}
	public void setData(picture data) {
		this.data = data;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}

}
