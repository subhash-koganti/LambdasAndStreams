package com.ug.codecafe;

public class FunctionalInterfaceTester {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Testing 1");
		TestFunctionalInterface test = new TestFunctionalInterface() {

			@Override

			public boolean testFunctionalInterface() {

				System.out.println("Hellow World");

				return true;

			}

		};
		System.out.println("Testing 2");
		Thread.sleep(5000);

		if (test.testFunctionalInterface()) {

			System.out.println("Heelloo");

		}

		Thread t = new Thread(new Runnable() {

			@Override

			public void run() {

				System.out.println("Testing Threads");

			}

		});

		t.start();

		Thread.sleep(5000);

		System.out.println("Program Ended");

	}

}
