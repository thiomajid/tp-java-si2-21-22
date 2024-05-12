package tp3;

import tp4.SystemeExploitation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    static ArrayList<Long> quantityList = new ArrayList<Long>(Arrays.asList((long) 10, (long) 5, (long) 67, (long) 9,
            (long) 8));

    static ArrayList<String> nameList = new ArrayList<String>(
            Arrays.asList("PC Portable Dell Vostro 3500", "Écouteur JBL T125BT", "Smartphone INFINIX Hot 10", "Micro " +
                    "Casque 588 Filaire", "Smartphone NOKIA C1"));

    static ArrayList<Double> priceList = new ArrayList<Double>(
            Arrays.asList((double) 1999, (double) 129, (double) 439, 9.900, (double) 185)
    );
    static Stock myStock = new Stock(nameList, priceList, quantityList);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenue sur TechStore\nTapez 0 si vous êtes un gérant\n\n" +
                "Tapez 1 si vous êtes un client\n");

        int userType;
        do {
            userType = in.nextInt();

            if (userType < 0 || userType > 1)
                System.out.println("Entrée invalide ! Veuillez rééssayez");

        } while (userType < 0 || userType > 1);

        switch (userType) {

            case 0:
                System.out.println("\n0:Ajouter un article\n1:Augmenter la quantité d'un article\n" +
                        "2:Modifier un article\n3:Supprimer un article\n4:Consulter les articles" +
                        "\n5:Quitter");

                myStock.ajouterArticle("Apple iPad 8e Generation", 1269, 10);
                int action;

                do {
                    action = in.nextInt();

                    if (action < 0 || action > 5)
                        System.out.println("Entrée invalide ! Veuillez rééssayez");
                } while (action < 0 || action > 5);

                /*
                 *
                 * AJOUT D'UN ARTICLE DANS LE STOCK
                 *
                 */
                if (action == 0) {
                    System.out.println("0:Ordinateur de bureau\n1:Ordinateur portable\n2:Mobile\n3:Stockage\n" +
                            "4:Periphérique");

                    int option;

                    do {
                        option = in.nextInt();
                        if ((option < 0) || (option > 4))
                            System.out.println("Choix invalide veuillez reprendre");
                    } while ((option < 0) || (option > 4));

                    //Ajout d'un ordinateur de bureau
                    if (option == 0) {
                        System.out.println("Donner le nom");
                        in.nextLine();
                        String nom = in.nextLine();

                        System.out.println("Donner le prix");
                        double prix = in.nextDouble();

                        System.out.println("Donner la resolution de l'ecran");
                        double resolutionEcran = in.nextDouble();

                        System.out.println("Donner le type de processeur");
                        in.nextLine();
                        String processeur = in.nextLine();

                        System.out.println("Donner la ram");
                        long ram = in.nextLong();

                        System.out.println("Donner le type de systeme d'exploitation\n\n0:FreeDos\n1:Windows\n2:Ubuntu" +
                                "\n3:Android\n4:iOS");
                        SystemeExploitation osList[] = SystemeExploitation.values();

                        int osChoice;
                        do {
                            osChoice = in.nextInt();
                            if ((osChoice < 0) || (osChoice >= osList.length))
                                System.out.println("Choix invalide");
                        } while ((osChoice < 0) || (osChoice >= osList.length));

                        System.out.println("Donner la capacite du disque dur");
                        long disqueDur = in.nextLong();

                        System.out.println("Donner le type de carte graphique");
                        in.nextLine();
                        String cartrGraphique = in.nextLine();

                        System.out.println("Donner le type d'alimentation");
                        String alimentation = in.nextLine();

                        myStock.ajouterArticle(nom, prix, resolutionEcran, processeur, ram, osList[osChoice], disqueDur,
                                cartrGraphique, alimentation);
                        System.out.println(myStock.toString());
                    }

                    else if (option == 1) {
                        System.out.println("Donner le nom");
                        in.nextLine();
                        String nom = in.nextLine();

                        System.out.println("Donner le prix");
                        double prix = in.nextDouble();

                        System.out.println("Donner la resolution de l'ecran");
                        double resolutionEcran = in.nextDouble();

                        System.out.println("Donner le type de processeur");
                        in.nextLine();
                        String processeur = in.nextLine();

                        System.out.println("Donner la ram");
                        long ram = in.nextLong();

                        System.out.println("Donner le type de systeme d'exploitation\n\n0:FreeDos\n1:Windows\n2:Ubuntu" +
                                "\n3:Android\n4:iOS");
                        SystemeExploitation osList[] = SystemeExploitation.values();

                        int osChoice;
                        do {
                            osChoice = in.nextInt();
                            if ((osChoice < 0) || (osChoice >= osList.length))
                                System.out.println("Choix invalide");
                        } while ((osChoice < 0) || (osChoice >= osList.length));

                        System.out.println("Donner la capacite du disque dur");
                        long disqueDur = in.nextLong();

                        System.out.println("Donner le type de carte graphique");
                        in.nextLine();
                        String cartrGraphique = in.nextLine();

                        System.out.println("Donner la capacite de la batterie");
                        long capaciteBatterie = in.nextLong();

                        myStock.ajouterArticle(nom, prix, resolutionEcran, processeur, ram, osList[osChoice], disqueDur,
                                cartrGraphique, capaciteBatterie);
                        System.out.println(myStock.toString());
                    }

                    else if (option == 2) {
                        System.out.println("Donner le nom");
                        in.nextLine();
                        String nom = in.nextLine();

                        System.out.println("Donner le prix");
                        double prix = in.nextDouble();

                        System.out.println("Donner la resolution de l'ecran");
                        double resolutionEcran = in.nextDouble();

                        System.out.println("Donner le type de processeur");
                        in.nextLine();
                        String processeur = in.nextLine();

                        System.out.println("Donner la ram");
                        long ram = in.nextLong();

                        System.out.println("Donner le type de systeme d'exploitation\n\n0:FreeDos\n1:Windows\n2:Ubuntu" +
                                "\n3:Android\n4:iOS");
                        SystemeExploitation osList[] = SystemeExploitation.values();

                        int osChoice;
                        do {
                            osChoice = in.nextInt();
                            if ((osChoice < 0) || (osChoice >= osList.length))
                                System.out.println("Choix invalide");
                        } while ((osChoice < 0) || (osChoice >= osList.length));

                        System.out.println("Donner la resolution de la camera arriere");
                        double appareilPhotoArriere = in.nextDouble();

                        System.out.println("Donner la resolution de la camera frontale");
                        double appareilPhotoFrontal = in.nextDouble();

                        System.out.println("Donner le nombre de sim");
                        int nbSim = in.nextInt();

                        System.out.println("Donner la capacite de la batterie");
                        long capaciteBatterie = in.nextLong();

                        myStock.ajouterArticle(nom, prix, resolutionEcran, processeur, ram, osList[osChoice], appareilPhotoArriere,
                                appareilPhotoFrontal, nbSim, capaciteBatterie);
                        System.out.println(myStock.toString());
                    }

                    else if (option == 3) {
                        System.out.println("Donner le nom");
                        in.nextLine();
                        String nom = in.nextLine();

                        System.out.println("Donner le prix");
                        double prix = in.nextDouble();

                        System.out.println("Donner la capacité");
                        int capacite = in.nextInt();

                        myStock.ajouterArticle(nom, prix, capacite);
                        System.out.println(myStock.toString());
                    }

                    else {
                        System.out.println("Donner le nom du peripherique");
                        in.nextLine();
                        String nom = in.nextLine();

                        System.out.println("Donner le prix du produit");
                        double prix = in.nextDouble();

                        System.out.println("Donner la technologie de connexion");
                        in.nextLine();
                        String technologieDeConnexion = in.nextLine();

                        System.out.println("Donner l'interface avec l'ordinateur");
                        String interfaceAvecOrdinateur = in.nextLine();

                        myStock.ajouterArticle(nom, prix, technologieDeConnexion, interfaceAvecOrdinateur);
                        System.out.println(myStock.toString());
                    }

                }

                else if (action == 1) {
                    System.out.println("Donner la référence du produit");
                    String givenReference = in.next();
                    System.out.println(myStock.trouverArticle(givenReference.trim()).toString());

                    System.out.println("Donner la quantité à augmenter");
                    long givenQuantity = in.nextLong();

                    myStock.incrementerQuantite(givenReference, givenQuantity);
                    System.out.println("Opération effectuée avec succès");
                    System.out.println(myStock.trouverArticle(givenReference).toString());

                }

                else if (action == 2) {
                    System.out.println("Donnez la référence du produit à modifier");
                    String reference = in.next();
                    System.out.println(myStock.trouverArticle(reference).toString() + "\n");

                    System.out.println("Donner le nom du produit");
                    in.nextLine();
                    String nom = in.nextLine();
                    System.out.println("Donnez le nouveau prix du produit");
                    int prix = in.nextInt();
                    System.out.println("Donner la quantité");
                    long qte = in.nextLong();

                    myStock.modifierArticle(reference, nom, prix, qte);
                    System.out.println("Opération effectuée avec succès");
                    System.out.println(myStock.toString());
                }

                else if (action == 3) {
                    System.out.println("Donner la référence de l'article à supprimer");
                    String ref = in.next();
                    myStock.supprimerArticle(ref);
                    System.out.println("Opération effectuée avec succès");
                }

                else if (action == 4)
                    System.out.println(myStock.toString());

                else {
                    System.out.println("A la prochaine fois sur TechStore");
                    System.exit(0);
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

}