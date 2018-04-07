package com.holovinova.CustomLinkedList;

public class User implements Comparable<User>{
    private String login;
    private int age;
    
    public String getLogin(){
        return this.login;
    }
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String login, int age){
        this.login = login;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if((obj == null) || !(obj.getClass() == getClass())){
            return false;
        }
        User innerObject = (User) obj;
        return this.login.equals(innerObject.getLogin()) && (this.age == innerObject.age);
    }
    
    @Override
    public String toString(){
        return "User. Login:" + this.login + " Age: " + this.age;
    }
	
	@Override
	public int compareTo(User obj) {
		User innerUser = obj;
		if(!(this.getClass() == obj.getClass())) {
			throw new ClassCastException();
		}
		return this.age - innerUser.age;
	}
}
