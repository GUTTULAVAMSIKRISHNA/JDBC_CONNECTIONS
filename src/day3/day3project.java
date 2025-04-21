package day3;

import java.util.Scanner;

class zomato {
	String Order;
	String Feedback;
	String Address;
	String CustomerName;
	long Customerphonenum;
	public String getOrder() {
		return Order;
	}
	public void setOrder(String order) {
		Order = order;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public long getCustomerphonenum() {
		return Customerphonenum;
	}
	public void setCustomerphonenum(long customerphonenum) {
		Customerphonenum = customerphonenum;
	}
	public zomato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public zomato(String order, String feedback, String address, String customerName, long customerphonenum) {
		super();
		Order = order;
		Feedback = feedback;
		Address = address;
		CustomerName = customerName;
		Customerphonenum = customerphonenum;
	}
	
}
class restaurant extends zomato {
	String restaurantname;
	String Restaurantaddress;
}

public class day3project {
	public static void main(String[] args) {
		restaurant r = new restaurant();
		Scanner scr = new Scanner(System.in);
		int i=0;
		do {
			
		}while(i>0);
	} 

}
