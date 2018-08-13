package com.sf.wdx.domain;

import javax.persistence.Table;

@Table(name="demo_cat")
public class Cat {

	private Long id;
	
	private String name;
	
	private Integer age;

	public Cat() {
	}

	public Cat(Long id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
