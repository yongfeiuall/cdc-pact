package com.izheyi.pact_provider;

public class ProviderModel {
	public String id;
	public String name;
	public Integer age;

	public ProviderModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ProviderModel(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public ProviderModel() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
