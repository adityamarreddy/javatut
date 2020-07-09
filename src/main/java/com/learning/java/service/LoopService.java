package com.learning.java.service;

import org.springframework.stereotype.Service;

@Service
public class LoopService {

	public long getFactorial(int n) {
		long temp = 1;
		for(int i=1;i<=n;i++) {
			temp = temp*i;
		}
		return temp;
	}
	
	public int getAddition(int n) {
		int sample = Integer.MAX_VALUE;
		for (int i = 0; i<=n; i++) {
			sample = sample+i;
		}
		return sample;
	}
	
}
