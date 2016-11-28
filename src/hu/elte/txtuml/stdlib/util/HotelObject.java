package hu.elte.txtuml.stdlib.util;

public class HotelObject {
	int hotel_id;
	String hotel_name;
	String hotel_category;
	String hotel_adress;
	String hotel_phone;
	String hotel_email;
	String hotel_description;
	String hotel_images;
	String hotel_type;
	
	
	public HotelObject() {
		super();
	}

	public HotelObject(int hotel_id, String hotel_category, String hotel_adress, String hotel_phone, String hotel_email,
			String hotel_name, String hotel_description, String hotel_images, String hotel_type) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_category = hotel_category;
		this.hotel_adress = hotel_adress;
		this.hotel_phone = hotel_phone;
		this.hotel_email = hotel_email;
		this.hotel_name = hotel_name;
		this.hotel_description = hotel_description;
		this.hotel_images = hotel_images;
		this.hotel_type = hotel_type;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_category() {
		return hotel_category;
	}

	public void setHotel_category(String hotel_category) {
		this.hotel_category = hotel_category;
	}

	public String getHotel_adress() {
		return hotel_adress;
	}

	public void setHotel_adress(String hotel_adress) {
		this.hotel_adress = hotel_adress;
	}

	public String getHotel_phone() {
		return hotel_phone;
	}

	public void setHotel_phone(String hotel_phone) {
		this.hotel_phone = hotel_phone;
	}

	public String getHotel_email() {
		return hotel_email;
	}

	public void setHotel_email(String hotel_email) {
		this.hotel_email = hotel_email;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_description() {
		return hotel_description;
	}

	public void setHotel_description(String hotel_description) {
		this.hotel_description = hotel_description;
	}

	public String getHotel_images() {
		return hotel_images;
	}

	public void setHotel_images(String hotel_images) {
		this.hotel_images = hotel_images;
	}

	public String getHotel_type() {
		return hotel_type;
	}

	public void setHotel_type(String hotel_type) {
		this.hotel_type = hotel_type;
	}

	@Override
	public String toString() {
		return "HotelObject [hotel_id=" + hotel_id + ", hotel_category=" + hotel_category + ", hotel_adress="
				+ hotel_adress + ", hotel_phone=" + hotel_phone + ", hotel_email=" + hotel_email + ", hotel_name="
				+ hotel_name + ", hotel_description=" + hotel_description + ", hotel_images=" + hotel_images
				+ ", hotel_type=" + hotel_type + "]";
	}
	
	
	
}
