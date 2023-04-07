package com.simpleexample.kafka_prod_cons;

import java.io.Serializable;

public class SimpleModel implements Serializable {

    private String First_Name;
    private String Last_Name;

    public SimpleModel(){}

	public SimpleModel(String first_Name, String last_Name) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

   
}
