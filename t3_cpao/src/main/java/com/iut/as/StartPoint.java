package com.iut.as;

import java.util.Scanner;

import com.iut.as.modele.Mathematic;

public class StartPoint {

	public static void main(String[] args) {

		// Affichage
		System.out.println("******** CALCULATRICE ********");
		System.out.println("\nVeuillez choisir une opération à effectuer : ");
		System.out.println("\nA. Addition" + "\nB. Soustraction" + "\nC. Multiplication" + "\nD. Division\n");

		// Saisie utilisateur
		Scanner scan = new Scanner(System.in);
		String saisie = scan.nextLine();
		saisie = saisie.toLowerCase();

		Mathematic maths = new Mathematic();
		Integer a = null;
		Integer b = null;

		// Traitement de la demande 
		switch(saisie) {

		case "a":
			System.out.println("\nSaisissez la première valeur : \n");
			a = scan.nextInt();
			System.out.println("\nSaisissez la deuxième valeur : \n");
			b = scan.nextInt();
			System.out.println("Le résultat de " + a + " + " + b + " est : " + maths.addition(a, b));
			break;

		case "b":
			System.out.println("\nSaisissez la première valeur : \n");
			a = scan.nextInt();
			System.out.println("\nSaisissez la deuxième valeur : \n");
			b = scan.nextInt();
			System.out.println("Le résultat de " + a + " - " + b + " est : " + maths.soustraction(a, b));
			break;

		case "c":
			System.out.println("\nSaisissez la première valeur : \n");
			a = scan.nextInt();
			System.out.println("\nSaisissez la deuxième valeur : \n");
			b = scan.nextInt();
			System.out.println("Le résultat de " + a + " x " + b + " est : " + maths.multiplication(a, b));
			break;

		case "d":
			System.out.println("\nSaisissez la première valeur : \n");
			a = scan.nextInt();
			System.out.println("\nSaisissez la deuxième valeur : \n");
			b = scan.nextInt();
			System.out.println("Le résultat de " + a + " / " + b + " est " + maths.division(a, b));
			break;
		}
	}
}
