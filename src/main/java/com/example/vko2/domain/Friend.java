package com.example.vko2.domain;

public class Friend {
private String name;

public Friend(String name) {
	super();
	this.name = name;
}

public Friend() {
	super();
	this.name=null;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
