package com.saturn.hrm.service.impl;

import org.springframework.stereotype.Service;

import com.saturn.hrm.service.DefaultSerivce;

@Service
public class DefaultServiceImpl implements DefaultSerivce {

	@Override
	public Integer sumOfNumber(int a, int b) {
		Integer sum = a+b;
		return sum;
	}

	@Override
	public void printer() {
		System.out.println("Hi i m a printer function");
	}
	
}
