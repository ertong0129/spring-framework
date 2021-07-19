package com.demo.entity;

import com.demo.C;

//@Component
public class A implements C {

    private String name;

    //@Autowired
    private B b;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public void testMethod() {
		System.out.println(123);
	}
}


