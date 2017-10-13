package co.simplon.recall;

import java.util.*;

import org.junit.Test;

public class PlayingWithAlgo {
	
	//	Done	---------------------------------------------------------------------------------------
	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}
	

	public static List<String> selectElementsStartingWithA(String array[]) {
		int longueur = array.length;
		for (int loop = 0; loop < longueur; loop++) {
			if (array[loop] = 'a') {
				
			}
		}
		return null;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		return null;
	}

	public static String[] removeNullElements(String array[]) {
		return null;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		int longueur = array.length;
		String inverse;
		String arrayOut;
		for (int loop = 0; loop < longueur; loop++) {
			int mesure = array.length;
			for (int i = mesure - 1; i >= 0; i--) {
				inverse = inverse + array[loop];
				}
			arrayOut(loop) = inverse(loop);
		}
		return arrayOut;
	}

	
	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	
	public static String getFirstHalf(String string) {
		int longueur = string.length();
		String resultat = "";
		if ((longueur % 2) == 0) {
			for (int loop = 0; loop < longueur / 2; loop++) {
				resultat = resultat + string.charAt(loop);
			} 
		} 
		else {
			int moyenne = (int)Math.ceil(longueur / 2);
			for (int loop = 0; loop < moyenne; loop++) {
				resultat = resultat + string.charAt(loop);
				}
		}
		return resultat;
	}

	
	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	
	public static int numberOfPalindromeWord(String text) {
		String inverse = "";
		int reponse = 0;
		int longueur = text.length();
		for (int loop = longueur - 1; loop >= 0; loop-- ) {
			inverse = inverse + text.charAt(loop);
			}
		if (inverse.equals(text)) {
			reponse += 1;
		} 
		return reponse;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		int longueur = text.length();
		char[] petit;
		int min = 100;
		char[] compare = text.toCharArray();
		for (int loop = 0; loop < longueur; loop++) {
			int mesure = compare[loop].length();
			if (mesure < min) {
				min = mesure;
				petit =	compare[loop];
			}
		}
			return petit;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static String removeCapitals(String text) {
		text = text.replace("H", "");
		text = text.replace("K", "");
		return text;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static String formatDateNicely(String text) {
		String inverse = "";		
		int longueur = text.length();
		text = text.replaceAll("-", "/");
		for (int loop = longueur - 2; loop < longueur; loop++) {
			inverse = inverse + text.charAt(loop);
		}
		for (int loop = 4; loop < 8; loop++) {
			inverse = inverse + text.charAt(loop);
		}
		for (int loop = 0; loop <= 3; loop++) {
			inverse = inverse + text.charAt(loop);
		}
		return inverse;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static String getDomainName(String email) {
		int longueur = email.length();
		int trouve = 0;
		trouve = email.indexOf('@');
		email = email.substring(trouve + 1, longueur - 4);
		return email;
	}

	
	public static String titleize(String title) {
		return null;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkForSpecialCharacters(String string) {
		boolean special = true;
		int longueur = string.length();
		char[] temporaire = string.toCharArray();
		int[] resultat = new int[longueur];
		for (int loop = 0; loop < longueur; loop++) {
			resultat[loop] = temporaire[loop];
		}
		for (int loop = 0; loop < longueur; loop++) {
			if ((resultat[loop] >= 48 && resultat[loop] <= 57) || (resultat[loop] >= 65 && resultat[loop] <= 90) || (resultat[loop] >= 97 && resultat[loop] <= 122)) {
				special = false;
			} else {
				special = true;
			}
		}
		return special;
	}
	
	
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		int longueur = name.length();
		name = name.toUpperCase();
		char[] temporaire = name.toCharArray();
		int[] nombre;
		for (int loop = 0; loop < longueur; loop++) {
			nombre[loop] = temporaire[loop];				
			}
		for (int i = 0; i < longueur; i++) {
			nombre[i] = nombre[i] - 64;
		}
		return nombre;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static long addingTwoNumbers(long number1, long number2) {
		long somme = number1 + number2;
		return somme;
	}
	

	//	Done	---------------------------------------------------------------------------------------
	public static long addingThreeNumbers(long number1, long number2, long number3) {
		long somme = number1 + number2 + number3;
		return somme;
	}
	

	public static long addingSeveralNumbers(final long... numbers) {
		
		return 0;
	}

	//	Done	---------------------------------------------------------------------------------------
	public static int[] allElementsExceptFirstThree(int array[]) {
		int total = array.length;
		int[]arrayOut = new int[total - 3];
		for (int loop = 0; loop < total - 3; loop++ ) {
			arrayOut[loop] = array[loop + 3];
		}
		return arrayOut;
	}
	

	//	Done	---------------------------------------------------------------------------------------
	public static int[] addElementToBeginning(int array[], int element) {
		int total = array.length;
		int[]arrayOut = new int[total + 1];
		arrayOut[0] = element;
		for (int loop = 0; loop < total; loop++ ) {
			arrayOut[loop + 1] = array[loop];
		}
		return arrayOut;
	}
	
	
	//	Done	---------------------------------------------------------------------------------------
	public static Float makeNegative(Float number) {
		if (number > 0) {
			number = number * (-1);
		}
		return number;
	}
	

	public static String[] getElementsLowerThanSix(String[] array) {
		String[] arrayOut;
		int longueur = array.length;
		for (int loop = 0; loop < longueur; loop++) {
			if (array.charAt(loop) <= 6) {
				arrayOut[loop] = array[loop];
			}
		}
		return arrayOut;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {

		return resultat;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static int roundUp(float number) {
		int resultat = (int)Math.round(number);
		return resultat;
	}
	

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	//	Done	---------------------------------------------------------------------------------------
	public static int factorial(int number) {
		int resultat = 1;
		int facteur = number;
		for (int loop = 1; loop <= number; loop++) {
			resultat = resultat * facteur; 
			facteur = facteur - 1;
		}
		return resultat;
	}
	

	//	Done	---------------------------------------------------------------------------------------
	public static int convertToCelsius(int temperature) {
		int resultat = 0;
		resultat = (int)Math.round((temperature - 32) / 1.8);
		return resultat;
	}
	
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkIfPair(int number) {
		boolean pair = true;
		if (number % 2 != 0) {
			pair = false;
		}
		return pair;
	}
	
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		boolean exact = true;
		if ((number1 % 2 == 0) && (number2 % 2 == 0) && (number3 % 2 != 0)) {
			exact = true;
		}
		return exact;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		int somme = number1 + number2 + number3;
		boolean pair = true;
		if ((somme % 2) != 0) {
			pair = false;
		}
		return pair;
	}
	
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkIfAllElementsPair(int[] array) {
		int longueur = array.length;
		int somme = 0;
		boolean pair = true;
		for (int loop = 0; loop < longueur; loop++) {
			somme = somme + array[loop];
		}
		if (somme % 2 != 0) {
			pair = false;
		}
		return pair;
	}
	
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		return false;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		boolean possible = true;
		if (prix > 22) {
			possible = false;
		} else if (prix % 2 != 0) {
			possible = false;
		}
		return possible;
	}
	
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		boolean checkCase1 = false;;
		if ((prix) - (prix * pourcentDeRemise / 100) <= 100) {
			checkCase1 = true;
		}
		return checkCase1;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		boolean divParSept = false;
		if (number1 % 7 == 0 || number2 % 7 == 0 || (number1 + number2) % 7 == 0) {
			divParSept = true;
		}
		return divParSept;
	}
		
	
	
	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		boolean divParSept = false;
		if (number1 % 7 == 0 || number2 % 7 == 0) {
			divParSept = true;
		} else
		return divParSept;
		
		
		
		
		return false;
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		return false;
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {
		int longueur = array.length;
		
		List arrayOut = new LinkedList();
		for (int loop = 1; loop < longueur - 1); loop++) {
			arrayOut.add(array[loop]);
		}
		return arrayOut;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		int longueur = array.length;
		int[] arrayOut;
		for(int loop = 1; loop <= longueur - 2; loop++) {
		arrayOut[loop] = array[loop];
		}
		return arrayOut;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int longueur = array.length;
		for (int loop = 0; loop < longueur; loop = loop + 2) {
			resultat.add(array[loop]);
		}
		return resultat;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static ArrayList<Integer> reverseOrder(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int longueur = array.length;
		int dim = longueur;
		for (int loop = 0; loop < longueur; loop++) {
			resultat.add(0 + loop, array[dim - 1]);
			dim = dim - 1;
		}
		return resultat;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		
		int longueur = array.length;
		int[] inverseArray = new int[longueur];
		for (int loop = longueur - 1; loop >= 0; loop-- ) {
			inverseArray = inverseArray + array[loop];
			}
		return inverseArray;		
		}

	//	Done	---------------------------------------------------------------------------------------
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int moyenne = 0;
		int dim = array.length;
		for (int loop = 0; loop < dim; loop++) {
			resultat.add(array[loop]);
		}
		int longueur = resultat.size();
		moyenne = longueur / 2;
		if (moyenne % 2 == 0) {
			resultat.add(moyenne, element);
		} else if (moyenne % 2 != 0) {
			moyenne = (int) Math.floor(moyenne);
			resultat.add(moyenne, element);
		}
		return resultat;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkIfStringStartsWithA( String word ) {
		boolean commenceParA = false;
		String minWord = word.toLowerCase();
		char[] remplace = minWord.toCharArray();
		if (remplace[0] == 'a') {
			commenceParA = true;
		}
		return commenceParA;
	}
	
	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkIfStringStartsWithVowel( String word ) {
		boolean commenceParVoyelle = false;
		String minWord = word.toLowerCase();
		char[] remplace = minWord.toCharArray();
		if (remplace[0] == 'a' || remplace[0] == 'e' || remplace[0] == 'i' || remplace[0] == 'o' || remplace[0] == 'u' || remplace[0] == 'y') {
			commenceParVoyelle = true;
		}
		return commenceParVoyelle;
	}
	

	
	//	Done	---------------------------------------------------------------------------------------
	public static boolean checkIfStringEndsWithS( String word ) {
		boolean finiParS = false;
		int longueur = word.length();
		String minWord = word.toLowerCase();
		char[] remplace = minWord.toCharArray();
		if (remplace[longueur - 1] == 's') {
			finiParS = true;
		}
		return finiParS;
	}
	
	
	public static String findShortestWord(String[] array ) {
		int longueurMin = 100;
		String minimum[];
		String mini;
		for (int i = 0; i < array.length; i++) {
			int longueur = array[i].length();
			if (longueur < longueurMin) {
				longueur = longueurMin;
				minimum[i] = array[i];
				mini = minimum[i];
			}
		}
		return mini;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		int longueur = array.length();
		array = replace(array[0], array[longueur - 1]);
		char tempo = ' ';
		char[] echange = array.toCharArray();
		if (longueur == 1) {
		} else {
		tempo = echange[0];
		echange[0] = echange[longueur - 1];
		echange[longueur - 1] = tempo;
		}
		return echange;
	}
	
	//	Done	---------------------------------------------------------------------------------------
	public static int[] swapFirstandLastElement(int[] array ) {
		int longueur = array.length;
		int tempo;
		if (longueur == 1) {
		} 
		else if (array[0] == array[longueur - 1]) {
		} 
		else {
		tempo = array[0];
		array[0] = array[longueur - 1];
		array[longueur - 1] = tempo;
		}
		return array;
	}
	
}	

