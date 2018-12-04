package com.majkisoft;

import java.util.ArrayList;

public class Main
{

//	public class Osobka extends Person
//	{
//		private int wzrost;
//
//		public Osobka(int height)
//		{
//			wzrost = height;
//		}
//	}

	public static void main(String[] args)
	{
		// write your code here

		Person osoba = new Person("Bolesław");
		osoba.setName("Majki");
//		osoba.age = 24;
		osoba.setAge(32);
		osoba.setName("Adam");

		ArrayList<Person> Osoby = new ArrayList<>();
		Osoby.add(osoba);



//		Osobka daniel = new Osobka();
//		daniel.name = "Danny";
//		daniel.wzrost = 179;
//		daniel.wzrost=150;

		Smartphone S4 = new Smartphone("Samsung", "S4", "7287");

//		System.out.println("Imię: " + osoba.name + ", wiek: " + osoba.age);
//        System.out.println(Person("ala",6));
	}
}