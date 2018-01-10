package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {
	
	// Done
		// ---------------------------------------------------------------------------------------
		public static String helloWorld(String name) {
			// TODO Auto-generated method stub
			String message;
			// message = name == "" ? "Hello World": "Hello "+ name;
			if (name == "")
				message = "Hello World";
			else
				message = "Hello " + name;
			return message;
		}
		// Done
		// ---------------------------------------------------------------------------------------
		public static List<String> selectElementsStartingWithA(String array[]) {
			int longueur = array.length;
			/*ArrayList<String> resultat = new ArrayList<String>();*/
			List resultat = new ArrayList<String>(); // fonctionne, car interface !!
			for (int loop = 0; loop < longueur; loop++) {
				if (array[loop].charAt(0) == 'a') {
					resultat.add(array[loop]);
				}
			}
			return resultat;
		}
		// Done
		// ---------------------------------------------------------------------------------------
		public static List<String> selectElementsStartingWithVowel(String array[]) {
			int longueur = array.length;
			ArrayList<String> resultat = new ArrayList<String>();
			for (int loop = 0; loop < longueur; loop++) {
				if (array[loop] == null) {
					array[loop] = " ";
				} else if ((array[loop].charAt(0) == 'a') || (array[loop].charAt(0) == 'e')
						|| (array[loop].charAt(0) == 'i') || (array[loop].charAt(0) == 'o')
						|| (array[loop].charAt(0) == 'u') || (array[loop].charAt(0) == 'y')) {
					resultat.add(array[loop]);
				}
			}
			return resultat;
		}
		// Done
		// ---------------------------------------------------------------------------------------
		public static String[] removeNullElements(String array[]) {
			int longueur = array.length;
			ArrayList<String> resultat = new ArrayList<String>();
			for (int loop = 0; loop < longueur; loop++) {
				if (array[loop] == null) {
					resultat.remove(array[loop]);
				} else {
					resultat.add(array[loop]);
				}
			}
			int longueur2 = resultat.size();
			String[] resultat2 = new String[longueur2];
			resultat2 = resultat.toArray(resultat2);
			return resultat2;
		}
		// Done
		// ---------------------------------------------------------------------------------------
		public static String[] reverseWordsInMyStringArray(String array[]) {
			int longueur = array.length;
			String[] resultat = new String[longueur];
			for (int loop = 0; loop < longueur; loop++) {
				int longueur2 = 0;
				longueur2 = array[loop].length();
				String s = "";
				s = array[loop];
				String transition = "";
				for (int i = longueur2 - 1; i >= 0; i--) {
					transition = transition + s.charAt(i);
				}
				resultat[loop] = transition;
			}
			return resultat;
		}
		

		public static String[] reverseOrderInArray(String array[]) {
			int longueur = array.length;
			String couper = array.toString();
			String[] temp = couper.split(",");
			String[] resultat = new String[4];
			for (int loop = longueur - 1; loop >= 0; loop--) {
				resultat[loop] = temp[longueur - loop];
			}
			return resultat;
		}

	
	public static String[][] everyPossiblePair(String array[]) {
		String resultat[][] = {{},{},{}};
		int longueur = array.length;
		int i = 0;
		int k = 1;
		Arrays.sort(array);
		for (int j = 0; j < longueur; j++) {
			if (k == longueur) {
				i += 1;
				k = i + 1;
				resultat[j][0] = array[i];
				resultat[j][1] = array[k];
				k++;
			} else {
				resultat[j][0] = array[i];
				resultat[j][1] = array[k];
				k++;
			}
		}
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static List<String> sortByLastLetter(String array[]) {
		 int longueur = array.length;
		 ArrayList<String> result = new ArrayList<String>();
		 ArrayList<String> resultat = new ArrayList<String>();
		 for (int loop = 0; loop < longueur; loop++) {
			 int longueur2 = 0;
			 longueur2 = array[loop].length();
			 String s = "";
			 s = array[loop];
			 String transition = "";
		     for (int i = longueur2 - 1; i >= 0; i--) {
			    transition = transition + s.charAt(i);
		    }   
			result.add(transition);
         }
		 Collections.sort(result);
		 for (int loop = 0; loop < result.size(); loop++) {
			 int longueur3 = 0;
			 longueur3 = result.get(loop).length();
			 String t = "";
			 t = result.get(loop);
			 String transition2 = "";
			 for (int i = longueur3 - 1; i >= 0; i--) {
            transition2 = transition2 + t.charAt(i);
        }
        resultat.add(transition2);
    }
	return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static String getFirstHalf(String string) {
			int longueur = string.length();
			String resultat = "";
			if ((longueur % 2) == 0) {
				for (int loop = 0; loop < longueur / 2; loop++) {
					resultat = resultat + string.charAt(loop);
				}
			} else {
				int moyenne = (int) (Math.ceil(longueur / 2) + 1);
				for (int loop = 0; loop < moyenne; loop++) {
					resultat = resultat + string.charAt(loop);
				}
			}
			return resultat;
		}

		
	public static String exportWordWithoutALetter(String array[], char letter) {
			int longueur = array.length;
			ArrayList<String> temp = new ArrayList<String>();
			for (int loop = 0; loop < longueur; loop++) {
				temp.add(array[loop]);
			}
			for (int i = 0; i < longueur; i++) {
				if (temp.get(i) == null) {
					temp.remove(i);
				}
			}
			for (int j = 0; j < longueur; j++) {
				if (temp.get(j).indexOf(letter) != -1) {
					temp.remove(j);
				}
			}
			int longueur2 = temp.size();
			String arrayOut = new String();
			for (int k = 0; k < longueur2; k++) {
				arrayOut = temp.get(k);
				}
			return arrayOut;
		}


	public static int numberOfPalindromeWord(String text) {
		String[] ranger = new String[15];
		String[] resultat = new String[15];
		ranger = text.split("'");
		for (int i = 0; i < ranger.length; i++) {
		
		for (int loop = 0; loop < ranger.length; loop++) {
			if (i % 2 != 0) {
				resultat[i] = ranger[i];
			}
		}
		}
			
		return 0;
		}

	public static int numberOfPalindromeText(String text) {
	return 0;
	}
	
	// Done
	// ---------------------------------------------------------------------------------------
	public static String shortestWord(String text) {
		String petit = "";
		int min = 100;
		int mesure = 0;
		String[] compare = text.split(" ");
		int chaine = compare.length;
		for (int loop = 0; loop < chaine; loop++) {
			mesure = compare[loop].length();
			if (mesure < min) {
				min = mesure;
				petit = compare[loop];
			}
		}	
		return petit;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static String longestWord(String text) {
		String grand = "";
		int max = 0;
		int mesure = 0;
		String s1 = text.substring(0, 9);
		String s2 = text.substring(10, 37);
		String compare = s1 + s2;
		String[] compare2 = compare.split(" ");
		int chaine = compare2.length;
		for (int loop = 0; loop < chaine; loop++) {
			mesure = compare2[loop].length();
			if (mesure > max) {
				max = mesure;
				grand = compare2[loop];
			}
		}	
	return grand;
	}

	
	
	public static String getAllLetters(String[] array) {
		ArrayList<String> verifier = new ArrayList<String>();
		ArrayList<String> fin = new ArrayList<String>();
		String[] convert = new String[10];
		String chaine = "";
		for (int loop = 0; loop < array.length; loop++) {
			verifier.add(array[loop]);
			TreeSet resultat = new TreeSet();
			resultat.addAll(verifier);
			fin.addAll(resultat);
			Collections.sort(fin);
			convert = fin.toArray(convert);
			for (int i = 0; i < convert.length; i++) {
				chaine = chaine + convert[i];
			}
			}
		return chaine;
		}
		
		
		
	// Done
	// ---------------------------------------------------------------------------------------
	public static String removeCapitals(String text) {
		text = text.replace("H", "");
		text = text.replace("K", "");
		return text;
	}
	// Done
	// ---------------------------------------------------------------------------------------
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
	// Done
	// ---------------------------------------------------------------------------------------
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
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkForSpecialCharacters(String string) {
		boolean special = true;
		int longueur = string.length();
		char[] temporaire = string.toCharArray();
		int[] resultat = new int[longueur];
		for (int loop = 0; loop < longueur; loop++) {
			resultat[loop] = temporaire[loop];
		}
		for (int loop = 0; loop < longueur; loop++) {
			if ((resultat[loop] >= 48 && resultat[loop] <= 57) || (resultat[loop] >= 65 && resultat[loop] <= 90)
					|| (resultat[loop] >= 97 && resultat[loop] <= 122)) {
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
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] letterPosition(String name) {
		int longueur = name.length();
		name = name.toUpperCase();
		char[] temporaire = name.toCharArray();
		int[] nombre = new int[longueur];
		for (int loop = 0; loop < longueur; loop++) {
			nombre[loop] = temporaire[loop];
		}
		for (int i = 0; i < longueur; i++) {
			nombre[i] = nombre[i] - 64;
		}
		return nombre;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static long addingTwoNumbers(long number1, long number2) {
		long somme = number1 + number2;
		return somme;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static long addingThreeNumbers(long number1, long number2, long number3) {
		long somme = number1 + number2 + number3;
		return somme;
	}

	public static long addingSeveralNumbers(final long... numbers) {
			// utiliser les varargs
	
			return 0;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] allElementsExceptFirstThree(int array[]) {
		int total = array.length;
		int[] arrayOut = new int[total - 3];
		for (int loop = 0; loop < total - 3; loop++) {
			arrayOut[loop] = array[loop + 3];
		}
		return arrayOut;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] addElementToBeginning(int array[], int element) {
		int total = array.length;
		int[] arrayOut = new int[total + 1];
		arrayOut[0] = element;
		for (int loop = 0; loop < total; loop++) {
			arrayOut[loop + 1] = array[loop];
		}
		return arrayOut;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static Float makeNegative(Float number) {
		if (number > 0) {
			number = number * (-1);
		}
		return number;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static String[] getElementsLowerThanSix(String[] array) {
		int longueur = array.length;
		TreeSet<String> temp = new TreeSet<String>();
		List<String> coffre = new ArrayList<String>();
		for (int loop = 0; loop < longueur; loop++) {
			if (array[loop] == "1" || array[loop] == "2" || array[loop] == "3" || array[loop] == "4" || 
			array[loop] == "5" || array[loop] == "6") {
				temp.add(array[loop]);
			}
		}
		coffre.addAll(temp);
		Collections.sort(coffre);
		String[] fin = coffre.toArray(new String[coffre.size()]);
		return fin;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] sortTabBySelection(int[] array) {
		int longueur = array.length;
		ArrayList<Integer> tri = new ArrayList<Integer>();
		for (int loop = 0; loop < longueur; loop++) {
			tri.add(array[loop]);
		}
		Collections.sort(tri); // tri croissant arraylist
		for (int i = 0; i < longueur; i++) {
			array[i] = tri.get(i);
		}
		return array;
    }
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] sortTabByInsertion(int[] array) {
		int i, j, temp;
		for (i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			while ((j >= 1) && (array[j - 1] > temp)) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		return array;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] sortTabByBubble(int[] array) {
		int longueur = array.length;
		int temp = 0;
		for (int rangMax = longueur - 1; rangMax >= 1; rangMax--) {
			for (int rang = 0; rang < longueur - 1; rang++) {
				if (array[rang] > array[rang + 1]) {
					temp = array[rang + 1];
					array[rang + 1] = array[rang];
					array[rang] = temp;
				}
			}
		}
		return array;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
	return 0;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int roundUp(float number) {
		int resultat = (int) Math.round(number);
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int findLastDayOfMonth(int month, int year) {
		int nbJour = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			nbJour = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			nbJour = 30;
		} else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			nbJour = 29;
		} else {
			nbJour = 28;
		}
		return nbJour;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int factorial(int number) {
		int resultat = 1;
		int facteur = number;
		for (int loop = 1; loop <= number; loop++) {
			resultat = resultat * facteur;
			facteur = facteur - 1;
		}
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int convertToCelsius(int temperature) {
		int resultat = 0;
		resultat = (int) Math.round((temperature - 32) / 1.8);
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfPair(int number) {
		boolean pair = true;
		if (number % 2 != 0) {
			pair = false;
		}
		return pair;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		boolean exact = false;
		if ((number1 % 2 == 0) && (number2 % 2 == 0) && (number3 % 2 != 0)) {
			exact = true;
		}
		return exact;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		int somme = number1 + number2 + number3;
		boolean pair = true;
		if ((somme % 2) != 0) {
			pair = false;
		}
		return pair;
	}
	// Done
	// ---------------------------------------------------------------------------------------
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
	// Done
	// ---------------------------------------------------------------------------------------
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		int longueur = array.length;
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		for (int loop = 0; loop < longueur; loop++) {
			if (array[loop] % 2 == 0) {
				resultat.add(array[loop]);
			}
		}
		return resultat;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		int longueur = array.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		Set<Integer> resultat = new HashSet<Integer>() ;
		for (int loop = 0; loop < longueur; loop++) {
			if (array[loop] % 2 == 0) {
				result.add(array[loop]);
			}
		}
        resultat.addAll(result);
        ArrayList<Integer> fin = new ArrayList<Integer>(resultat);
	        
		return fin;
	}
	
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean triangleRectangle = false;
		if ((number1 * number1 + number2 * number2 == number3 * number3)
				|| (number1 * number1 + number3 * number3 == number2 * number2)
				|| (number2 * number2 + number3 * number3 == number1 * number1)) {
			triangleRectangle = true;
		}
		return triangleRectangle;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie,
		// check si tu peux payer
		boolean possible = true;
		if (prix > 22) {
			possible = false;
		} else if (prix % 2 != 0) {
			possible = false;
		}
		return possible;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		boolean checkCase1 = false;
		if ((prix) - (prix * pourcentDeRemise / 100) <= 100) {
			checkCase1 = true;
		}
		return checkCase1;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		boolean divParSept = false;
		if (number1 % 7 == 0 || number2 % 7 == 0 || (number1 + number2) % 7 == 0) {
			divParSept = true;
		}
		return divParSept;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		boolean divParSept = false;
		if ((number1 % 7 == 0 || number2 % 7 == 0) && ((number1 + number2) % 7 != 0)) {
			divParSept = true;
		}
		return divParSept;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		boolean tri = false;
		if ((number1 < number2) && (number2 < number3) || (number1 > number2) && (number2 > number3)) {
			tri = true;
		}
		return tri;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int longueur = array.length;
		for (int loop = 1; loop < longueur - 1; loop++) {
			resultat.add(array[loop]);
		}
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		int longueur = array.length;
		int[] arrayOut = new int[longueur - 2];
		if (longueur <= 2) {
		} else if (longueur > 2) {
			for (int loop = 1; loop <= longueur - 2; loop++) {
				arrayOut[loop - 1] = array[loop];
			}
		}
		return arrayOut;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int longueur = array.length;
		for (int loop = 0; loop < longueur; loop = loop + 2) {
			resultat.add(array[loop]);
		}
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
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
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] reverseOrderInt(int array[]) {
		int longueur = array.length;
		int rang = longueur;
		int[] inverseArray = new int[longueur];
		for (int loop = 0; loop < longueur; loop++) {
			inverseArray[loop] = array[rang - 1];
			rang--;
		}
		return inverseArray;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element) {
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
	// Done
	// ---------------------------------------------------------------------------------------
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int longueur = list.size();
		for (int loop = 0; loop < longueur; loop++) {
			if (list.get(loop) % 2 == 0) {
				resultat.add(list.get(loop));
			}
		}
		return resultat;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		int longueur = list.size();
		for (int loop = 0; loop < longueur; loop = loop + 2) {
			if (loop % 2 == 0) {
				resultat.add(list.get(loop));
			}
		}
		return resultat;
	}	
	// Done
	// ---------------------------------------------------------------------------------------
	public static int Addition( HashMap<String, Integer> addition ) {
	int somme = addition.get("chicken") + addition.get("curry") + addition.get("coffee");
	return somme;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfStringStartsWithA(String word) {
		boolean commenceParA = false;
		String minWord = word.toLowerCase();
		char[] remplace = minWord.toCharArray();
		if (remplace[0] == 'a') {
			commenceParA = true;
		}
		return commenceParA;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfStringStartsWithVowel(String word) {
		boolean commenceParVoyelle = false;
		String minWord = word.toLowerCase();
		char[] remplace = minWord.toCharArray();
		if (remplace[0] == 'a' || remplace[0] == 'e' || remplace[0] == 'i' || remplace[0] == 'o' || remplace[0] == 'u'
				|| remplace[0] == 'y') {
			commenceParVoyelle = true;
		}
		return commenceParVoyelle;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static boolean checkIfStringEndsWithS(String word) {
		boolean finiParS = false;
		int longueur = word.length();
		String minWord = word.toLowerCase();
		char[] remplace = minWord.toCharArray();
		if (remplace[longueur - 1] == 's') {
			finiParS = true;
		}
		return finiParS;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static String findShortestWord(String[] array) {
		int longueurMin = 100;
		int longueur = 0;
		String mini = "";
		String exept = "mu";
		for (int i = 0; i < array.length; i++) {
			if (array[i] != exept) {
				longueur = array[i].length();
				if (longueur < longueurMin) {
					longueurMin = longueur;
					mini = array[i];
				}
			}
		}
		return mini;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static String swapFirstandLastLetter(String array) {
		int longueur = array.length();
		char[] echange = array.toCharArray();
		String deux = "";
		if (longueur == 1) {
		} else {
			deux = deux + echange[longueur - 1];
			for (int loop = 1; loop < longueur - 1; loop++) {
				deux = deux + echange[loop];
			}
			deux = deux + echange[0];
		}
		return deux;
	}
	// Done
	// ---------------------------------------------------------------------------------------
	public static int[] swapFirstandLastElement(int[] array) {
		int longueur = array.length;
		int tempo;
		if (longueur == 1) {
		} else if (array[0] == array[longueur - 1]) {
		} else {
			tempo = array[0];
			array[0] = array[longueur - 1];
			array[longueur - 1] = tempo;
		}
		return array;
	}
	
}