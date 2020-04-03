package com.iut.as.modele;

import com.iut.as.exception.MathematicException;
import com.iut.as.interfaces.IMaths;

/***
 * @description : Classe "Mathematic"
 *  
 * @author stephane.joyeux
 *
 */
public class Mathematic implements IMaths {

	@Override
	// Gestion des paramètres null en utilisant la classe Integer
	public int addition(Integer a, Integer b) {
		// Levée d'exception si l'un des opérateurs est null
		if (a == null || b == null) {
			System.out.println("Un des opérateurs est nul !");
			throw new MathematicException("Un des opérateurs est null");
		}
		return a + b;
	}

	@Override
	public double division(Integer a, Integer b){
		if (a == null || b == null) {
			System.out.println("Un des opérateurs est nul !");
			throw new MathematicException("Un des Operateurs est null");
		}
		try {
			return a / b;
		} catch (ArithmeticException e) {
			// J'attrappe l'erreur et je préviens l'utilisateur (par exemple) :
			System.out.println("Division par zéro non autorisée !!!");
			// Je renvoie mon exception --> Ou je l'encapsule dans une autre exception !
			throw new MathematicException(e, "Division par zero");
		}
	}

	@Override
	public int multiplication(Integer a, Integer b) {
		// Utilisation standard :
		// return a * b;

		// Levée d'exception si l'un des opérateurs est null
		if (a == null || b == null) {
			System.out.println("Un des opérateurs est nul !");
			throw new MathematicException("Un des opérateurs est null");
		}

		// Utilisation de la méthode addition :
		int ret = 0;
		boolean signePositif = true;
		if (a < 0) {
			a = -a;
			signePositif = false;
		}
		for (int i = 0; i < a; i++) {
			// ret += b;
			ret = addition(ret, b);
		}
		if (signePositif) {
			return ret;
		}
		return -ret;
	}

	@Override
	public int soustraction(Integer a, Integer b) {
		// Levée d'exception si l'un des opérateurs est null
		if (a == null || b == null) {
			System.out.println("Un des opérateurs est nul !");
			throw new MathematicException("Un des opérateurs est null");
		}
		return a - b;
	}
}
