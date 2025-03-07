package com.pojoexample;

public class HospitalMain {

	public static void main(String[] args) {

		Hospital h = new Hospital();
		h.setId(1);
		h.setName("OSAM  Hospitals");
		h.setCon_no(6854);
		h.setEmail("osam237@gmail.com");
		h.setSide("osam.com");
		h.setCount_doctors(23);
		h.setCount_nurses(54);
		h.setCount_beds(100);
		h.setAddress("23,near by GP collage,Shanti Chowk");
		h.setCity("Solapur");
		h.setPincode(413406);
		h.setState("Maharashtra");
		h.setCountry("India");		
		
		System.out.println(h.getId()+"  "+h.getName()+"  "+h.getCon_no()+"  "+h.getEmail()+"  "+h.getSide()+"  "+h.getCount_doctors()+"  "+h.getCount_nurses()+"  "+h.getCount_beds()+"  "+h.getAddress()+"  "+h.getCity()+"  "+h.getPincode()+"  "+h.getState()+"  "+h.getCountry());
		
	}

}
