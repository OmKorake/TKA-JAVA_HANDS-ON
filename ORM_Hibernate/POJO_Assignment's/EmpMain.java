package com.pojoexample;

public class EmpMain {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setFname("Niket");
		e.setLname("Nannaware");
		e.setGender("Male");
		e.setEmail("niket64@gmail.cim");
		e.setPhono(9856585685L);
		e.setRole("Manager");
		e.setSal(45000);
		e.setCity("Pune");
		e.setState("Maharashtra");

		System.out.println(e.getId()+"  "+e.getFname()+"  "+e.getLname()+"  "+e.getGender()+"  "+e.getEmail()+"  "+e.getPhono()+"  "+e.getRole()+"  "+e.getSal()+"  "+e.getCity()+"  "+e.getState());
		
	}

}
