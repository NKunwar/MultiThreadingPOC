package com.threads.java;

public class DeadLockBusinessLogic {

	public void method1() throws Exception {
		synchronized (String.class) {
			System.out.println("String Class of Method 1");
			synchronized (Integer.class) {
				System.out.println("Integer Class of Method 1");
			}
		}
	}

	public void method2() throws Exception {
		synchronized (Integer.class) {
			System.out.println("Integer Class of Method 1");
			synchronized (String.class) {
				System.out.println("String Class of Method 1");
			}
		}
	}

}