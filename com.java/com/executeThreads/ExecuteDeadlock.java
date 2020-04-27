package com.executeThreads;

import com.threads.java.DeadLockBusinessLogic;

public class ExecuteDeadlock implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread execution started\t");

		for (int i = 0; i < 10; i++) {
			DeadLockBusinessLogic deadlockObj = new DeadLockBusinessLogic();
			try {
				deadlockObj.method1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Method 1 invoked");
			try {
				deadlockObj.method2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Method 2 invoked");
		}

	}

	public static void main(String[] args) {
		ExecuteDeadlock edlObj = new ExecuteDeadlock();
		Thread threadOne = new Thread(edlObj);
		Thread threadTwo = new Thread(edlObj);

		threadOne.start();
		threadTwo.start();

	}

}