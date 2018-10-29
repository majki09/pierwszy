package com.majkisoft;

import java.util.Scanner;

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
		int liczba = (int) (Math.random() * 100);
		int zgadywana = 0;
		int i = 0;

		Scanner input = new Scanner(System.in);

		long czasStart = System.currentTimeMillis();

		System.out.println("Zgadnij liczbę całkowitą od 0 do 100:");

		Person osoba = new Person("Bolesław");
		osoba.setName("Majki");
//		osoba.age = 24;
//		osoba.age = 34;
//		osoba.name = "ojc";


		System.out.println(liczba);


		do {
			i++;
			zgadywana = input.nextInt();
			if (zgadywana > liczba)
				System.out.println("Za dużo");
			else if (zgadywana < liczba)
				System.out.println("Za mało");
		}
		while (zgadywana != liczba);

		int czasZgadywania = (int) ((System.currentTimeMillis() - czasStart) / 1000);

//		Osobka daniel = new Osobka();
//		daniel.name = "Danny";
//		daniel.wzrost = 179;
//		daniel.wzrost=150;

		Smartphone S4 = new Smartphone("Samsung", "S4", "7287");

		System.out.println("Twoja szczęśliwa liczba to " + liczba + "! Zgadłeś za " + i + " razem i zajęło Ci to tylko " + czasZgadywania + "s");
//		System.out.println("Imię: " + osoba.name + ", wiek: " + osoba.age);
//        System.out.println(Person("ala",6));
	}
}