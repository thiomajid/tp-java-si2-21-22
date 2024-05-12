package tp1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TechStore {

    public static ArrayList<Integer> idList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
    public static ArrayList<String> referenceList = new ArrayList<String>(
            Arrays.asList("Prelt50", "Eeb21", "SpNo2", "Mu8a3", "SpA4"));
    public static ArrayList<String> nameList = new ArrayList<String>(
            Arrays.asList("PC Portable Dell Vostro 3500", "Écouteur JBL T125BT", "Smartphone INFINIX Hot 10", "Micro Casque 588 Filaire", "Smartphone NOKIA C1"));
    public static ArrayList<Double> pricesList = new ArrayList<Double>();

    static {
        pricesList.add(1999.0);
        pricesList.add(129.0);
        pricesList.add(439.0);
        pricesList.add(9.900);
        pricesList.add(185.0);
    }
    public static int ID = 5;

    public static void main(String[] args) {
        System.out.println("Soyez les bienvenus !!\n\n");
        login();
    }

    /**********************************************************************************************
     *
     * CONNEXION -> ACTION
     *
     ***********************************************************************************************/
    public static void login() {
        Scanner in = new Scanner(System.in);

        System.out.println("Tapez 0 si vous êtes un gérant\n\nTapez 1 si vous êtes un client\n");

        int userType;
        do {
            userType = in.nextInt();

            if (userType < 0 || userType > 1)
                System.out.println("Entrée invalide ! Veuillez rééssayez");

        } while (userType < 0 || userType > 1);

        switch (userType) {

            case 0:
                System.out.println(
                        "\n0:Ajouter un article\n1:Modifier un article\n2:Consulter les articles\n3:Supprimer un article");
                int action;
                do {
                    action = in.nextInt();
                    if (action < 0 || action > 3)
                        System.out.println("Entrée invalide ! Veuillez rééssayez");
                } while (action < 0 || action > 3);

                switch (action) {
                    case 0:
                        System.out.println("Donnez le nom de l'article");
                        String name = in.nextLine();
                        System.out.println("Donnez le prix de l'article");
                        int price = in.nextInt();

                        ajouterArticle(name, price);
                        break;
                    case 1:
                        System.out.println("Donnez la référence du produit à modifier");
                        String ref = in.nextLine();
                        System.out.println("Donnez le nouveau prix du produit");
                        int newPrice = in.nextInt();

                        modifierArticle(ref, newPrice);
                        break;
                    case 2:
                        consulterArticle();
                        break;
                    case 3:
                        System.out.println("Donnez la référence du produit");
                        String reference = in.nextLine();
                        supprimerArticle(reference);
                        break;
                }
                break;
            case 1:
                System.out.println("Bonjour cher/chère client(e)");
                break;
            default:
                System.out.println("Cette action n'est pas autorisée");
                break;
        }
        in.close();
    }

    /**********************************************************************************************
     *
     * GENERATION DE REFERENCE -> AJOUT DU PRODUIT
     *
     ***********************************************************************************************/
    private static String genererReference(String nomProduit, int productID) {
        StringBuilder reference = new StringBuilder();
        for (int i = 0; i < nomProduit.length(); i++) {
            if (i % 5 == 0) {
                if (nomProduit.charAt(i) == ' ')
                    continue;
                else
                    reference.append(nomProduit.charAt(i));
            }
        }
        reference.append((char) productID);
        return reference.toString().trim();
    }

    public static void ajouterArticle(String nomProduit, double prix) {
        nameList.add(nomProduit);
        pricesList.add(prix);
        idList.add(ID);
        referenceList.add(genererReference(nomProduit, ID));
        ID++;

        System.out.println("Ajout effectué avec succès !");

        System.out.println("\n\nNom\tPrix\tRéférence\tID\n");

        int index = nameList.indexOf(nomProduit);
        System.out.println(nameList.get(index) + "\t" + pricesList.get(index) + "\t" + referenceList.get(index) + "\t\t"
                + idList.get(index) + "\n");

    }

    /**********************************************************************************************
     *
     * REFERENCE DU PRODUIT -> UPDATE DU PRIX DU PRODUIT
     *
     ***********************************************************************************************/
    public static void modifierArticle(String reference, double prix) {
        if (referenceList.size() == 0)
            System.out.println("Vous n'avez aucun produit");
        else {
            int index = 0;
            for (String ref : referenceList) {
                if (ref.equals(reference)) {
                    index = referenceList.indexOf(ref);
                    break;
                }
            }

            pricesList.set(index, prix);

            index = referenceList.indexOf(reference);
            System.out.println(nameList.get(index) + "\t" + pricesList.get(index) + "\t" + referenceList.get(index)
                    + "\t\t" + idList.get(index) + "\n\n");
            System.out.println("Modification effectuée avec succès !");

        }
    }

    /**********************************************************************************************
     *
     * AFFICHAGE DU CONTENU DES LISTES(en triant d'abord les listes)
     *
     ***********************************************************************************************/
    private static void sortArrays() {
        for (int i = 0; i < pricesList.size(); i++) {
            for (int j = i + 1; j < pricesList.size(); j++) {
                if (pricesList.get(i) > pricesList.get(j)) {

                    // Décalage du nom
                    swapString(nameList, i, j);

                    // Décalage des références
                    swapString(referenceList, i, j);

                    // Décalage du prix
                    swap(pricesList, i, j);

                    // Décalage des ID
                    swapId(idList, i, j);
                }
            }
        }
    }

    private static void swap(ArrayList<Double> myList, int i, int j) {
        double tmp = myList.get(i);
        myList.set(i, myList.get(j));
        myList.set(j, tmp);
    }

    private static void swapId(ArrayList<Integer> idList,int i,int j)
    {
        int tmp = idList.get(i);
        idList.set(i,idList.get(j));
        idList.set(j,tmp);
    }

    private static void swapString(ArrayList<String> myList, int i, int j) {
        String tmp = myList.get(i);
        myList.set(i, myList.get(j));
        myList.set(j, tmp);
    }

    public static void consulterArticle() {
        if (referenceList.size() == 0)
            System.out.println("Vous n'avez aucun produit");
        else {
            Scanner in = new Scanner(System.in);
            System.out.println(
                    "\nTapez 0 pour afficher par ordre croissant du prix des produits, et tapez 1 pour l'affichage décroissant");
            int filter = in.nextInt();
            in.close();

            switch (filter) {
                case 0:
                    sortArrays();
                    System.out.println("\nNom\tPrix\tRéférence\tID\n");

                    for (int i = 0; i < idList.size(); i++) {
                        System.out.println(nameList.get(i) + "\t" + pricesList.get(i) + "\t" + referenceList.get(i)
                                + "\t\t" + idList.get(i) + "\n");
                    }

                    break;
                case 1:
                    sortArrays();
                    System.out.println("\nNom\tPrix\tRéférence\tID\n");

                    for (int i = idList.size() - 1; i >= 0; i--) {
                        System.out.println(nameList.get(i) + "\t" + pricesList.get(i) + "\t" + referenceList.get(i)
                                + "\t\t" + idList.get(i) + "\n");
                    }
                    break;
            }
        }

    }

    /**********************************************************************************************
     *
     * REFERENCE DU PRODUIT -> SUPPRESSION DE TOUTES SES INFOS DES LISTES
     *
     ***********************************************************************************************/
    public static void supprimerArticle(String reference) {
        if (referenceList.size() == 0)
            System.out.println("Vous n'avez aucun produit");
        else {
            for (String ref : referenceList) {
                if (ref.equals(reference)) {
                    int index = referenceList.indexOf(ref);

                    referenceList.remove(index);
                    pricesList.remove(index);
                    nameList.remove(index);
                    idList.remove(index);
                    break;
                }
            }
        }
    }
}