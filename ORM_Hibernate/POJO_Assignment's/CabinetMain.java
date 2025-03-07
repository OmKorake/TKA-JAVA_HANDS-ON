package com.pojoexample;

public class CabinetMain {
	
	public static void main(String[] args) {
		
		Cabinet c = new Cabinet();
	    c.setId(1);
	    c.setStateName("Maharashtra");
	    c.setGovernor("C P Radhakrishnan");
	    c.setChiefminister("Devendra Fadnavis");
	    c.setDeputycm1("Ajit Pawar");
	    c.setDeputycm2("Eknath Shinde");
	    c.setFinance("Ajit Pawar");
	    c.setAgriculture("Manikrao Kokate");
	    c.setSchool_education("Dada Bhuse");
	    c.setHigher_techeducation("Chandrakant Patil");
	    c.setHealth("Prakash Abitkar");
	    c.setTransport("Pratap Sarnaik");
	    c.setEnergy("Devendra Fadnavis");
	    c.setEnvironment("Pankaja Munde");
	    c.setTourism("Shambhuraj Desai");
	    c.setIndustries("Uday Samant");
	    c.setRevenue("Chandrashekhar Bawankule");
	    c.setSports("Dattatray Bharne");
	    c.setRuraldevp("Jaikumar Gore");
	    c.setUrbandevp("Eknath Shinde");
	    c.setSocialwelfare("Sanjay Shirsat");
	    
	    //System.out.println(c.getId()+c.getStateName()+c.getGovernor()+c.getChiefminister()+c.getDeputycm1()+c.getDeputycm2()+c.getFinance()+c.getAgriculture()+c.getSchool_education()+c.getHigher_techeducation()+c.getHealth()+c.getTransport()+c.getEnergy()+c.getEnvironment()+c.getTourism()+c.getIndustries()+c.getRevenue()+c.getSports()+c.getRuraldevp()+c.getUrbandevp()+"  "+c.getSocialwelfare());
	    System.out.println("ID "+c.getId());
		System.out.println("State Name "+c.getStateName());
		System.out.println("Governor:"+c.getGovernor());
		System.out.println("Chief Minister:"+c.getChiefminister());
		System.out.println("Deputy CM 1:"+c.getDeputycm1());
		System.out.println("Deputy CM 2:"+c.getDeputycm2());
		System.out.println("Finance Minister:"+c.getFinance());
		System.out.println("Agriculture Minister:"+c.getAgriculture());
		System.out.println("School Education Minister:"+c.getSchool_education());
		System.out.println("Higher & Technical Education Minister:"+c.getHigher_techeducation());
		System.out.println("Health Minister:"+c.getHealth());
		System.out.println("Transport Minister:"+ c.getTransport());
		System.out.println("Energy Minister: "+c.getEnergy());
		System.out.println("Environment Minister:"+c.getEnvironment());
		System.out.println("Tourism Minister:"+c.getTourism());
		System.out.println("Industries Minister:"+ c.getIndustries());
		System.out.println("Revenue Minister: "+c.getRevenue());
		System.out.println("Sports Minister: "+c.getSports());
		System.out.println("Rural Development Minister: "+c.getRuraldevp());
		System.out.println("Urban Development Minister:"+c.getUrbandevp());
		System.out.println("Social Welfare Minister:"+c.getSocialwelfare());

	    
	}

}
