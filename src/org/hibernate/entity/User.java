package org.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl.NamespaceWildcardIterator;

public class User {
	private int userid;
	private String name;
	private String password;
	private Set<Address> addresses=new HashSet<>();
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userid,String name,String password,String type){
		this.userid=userid;
		this.password=password;
		this.name=name;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
}
