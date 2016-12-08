package tuan.login;

import java.io.Serializable;

public class Account implements Serializable{
	private String typeUser;
	private String userName;
	private String passWord;
	
	public Account(String typeUser, String userName, String passWord){
		this.typeUser = typeUser;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void setInfo(String typeUser, String userName, String passWord){
		this.typeUser = typeUser;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String getTypeUser(){
		return this.typeUser;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public String getPassWord(){
		return this.passWord;
	}
}
