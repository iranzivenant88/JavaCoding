package com.test;
public class TestOne{
	public static void main(String...args){
		int x = 1,y = 1;
		x = ++x + y++;
		y=x-- + --y;
		System.out.println(x+"..."+y);
	}
}