package Tableaux;

public class Operations {

	public static void main(String[] args) {
		
		int[] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
		
		operations(tab);
		
		int[] tab1 = remplir1(5);
		operations(tab1);
		
		int[] tab2 = remplir2(10);
		operations(tab2);
		
		int[] tab3 = remplir3(5);
		operations(tab3);
		
	}
	
	static int[] remplir1(int nb) {
		int[] tab = new int[nb];
		for(int i = 0; i < nb; i++) {
			tab[i] = i;
		}
		return tab;
	}
	
	static int[] remplir2(int nb) {
		int[] tab = new int[nb];
		for(int i = 0; i < nb; i++) {
			tab[i] = i + 5;
		}
		return tab;
	}
	
	static int[] remplir3(int nb) {
		int[] tab = new int[nb];
		for(int i = 0, j = nb; i < nb; i++, j--) {
			tab[i] = j;
		}
		return tab;
	}
	
	static void operations(int[] tab) {
		afficher(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);
	}
	
	static void afficher(int[] tab) {
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			
			System.out.println("  ");
		}
		System.out.println();
	}
	
	static void operation1(int[] tab) {
		int nb = 0;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == 9) {
				nb++;
			}
		}
		System.out.println("Il y a " + nb + " éléments de valeur 9 dans le tableau");
	}
	
	static void operation2(int[] tab) {
		int nb = 0;
		for(int i = 0; i < tab.length; i++) {
			if((tab[i] > 4) || (tab[i] < 2)) {
				nb++;
			}
		}
		System.out.println("Il y a " + nb + " éléments plus grand que 4 ou plus petit que 2");
	}
	
	
	static void operation3(int[] tab) {
		int somme = 0;
		for(int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		System.out.println("La somme des éléments est " + somme);
	}
	
	static void operation4(int[] tab) {
		int somme = 0;
		double moyenne = 0;
		for(int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		moyenne = (somme / tab.length);
		System.out.println("La moyenne arithmétique des éléments est " + moyenne);
	}
	
	static void operation5(int[] tab) {
		int max = tab[0];
		for(int i = 0; i < tab.length; i++) {
			if(max < tab[i]) {
				max = tab[i];
			}
		}
		System.out.println("Le plus grand élément vaut " + max);
	}

}
