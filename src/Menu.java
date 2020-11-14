package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Menu
    Created by: cide
    Date : 12/11/20
    Description:
*/
import java.util.Scanner;
public class Menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option, subOption;

        do {
            System.out.println("Main Menu:");
            System.out.println("1. Books");
            System.out.println("2. Members");
            System.out.println("3. Employees");
            System.out.println("4. Loans");
            System.out.println("5. Statistics");
            System.out.println("6. Exit");
            System.out.println("Enter your option [1,2,3,4,5,6]:");
            option = sc.nextInt();

            switch (option) {
                case 1: {

                    do {
                        System.out.println("Books Sub-Menu:");
                        System.out.println("1. Insert");
                        System.out.println("2. Search");
                        System.out.println("3. Delete");
                        System.out.println("4. Edit");
                        System.out.println("5. List All");
                        System.out.println("6. Exit");
                        System.out.println("Enter your option [1,2,3,4,5,6]:");
                        subOption = sc.nextInt();

                        switch (subOption) {
                            case 1: {
                                System.out.println("in Insert");
                                break;
                            }
                            case 2: {
                                System.out.println("in Search");
                                break;
                            }
                            case 3: {
                                System.out.println("in Delete");
                                break;
                            }
                            case 4: {
                                System.out.println("in Edit");
                                break;
                            }
                            case 5: {
                                System.out.println("in List All");
                                break;
                            }
                            case 6: {
                                System.out.println("in Exit");
                                break;
                            }
                            // option = sc.nextInt();
                        }
                    } while (subOption != 6);
                    break;
                }

                case 2:

                {

                    do {
                        System.out.println("Members Sub-Menu:");
                        System.out.println("1. Insert");
                        System.out.println("2. Search");
                        System.out.println("3. Delete");
                        System.out.println("4. Edit");
                        System.out.println("5. List All");
                        System.out.println("6. Exit");
                        System.out.println("Enter your option [1,2,3,4,5,6]:");
                        subOption = sc.nextInt();

                        switch (subOption) {
                            case 1: {
                                System.out.println("in Insert");
                                break;
                            }
                            case 2: {
                                System.out.println("in Search");
                                break;
                            }
                            case 3: {
                                System.out.println("in Delete");
                                break;
                            }
                            case 4: {
                                System.out.println("in Edit");
                                break;
                            }
                            case 5: {
                                System.out.println("in List All");
                                break;
                            }
                            case 6: {
                                System.out.println("in Exit");
                                break;
                            }
                            // option = sc.nextInt();
                        }
                    } while (subOption != 6);
                    break;
                }

                case 3:

                {

                    do {
                        System.out.println("Employees Sub-Menu:");
                        System.out.println("1. Insert");
                        System.out.println("2. Search");
                        System.out.println("3. Delete");
                        System.out.println("4. Edit");
                        System.out.println("5. List All");
                        System.out.println("6. Exit");
                        System.out.println("Enter your option [1,2,3,4,5,6]:");
                        subOption = sc.nextInt();

                        switch (subOption) {
                            case 1: {
                                System.out.println("in Insert");
                                break;
                            }
                            case 2: {
                                System.out.println("in Search");
                                break;
                            }
                            case 3: {
                                System.out.println("in Delete");
                                break;
                            }
                            case 4: {
                                System.out.println("in Edit");
                                break;
                            }
                            case 5: {
                                System.out.println("in List All");
                                break;
                            }
                            case 6: {
                                System.out.println("in Exit");
                                break;
                            }
                            // option = sc.nextInt();
                        }
                    } while (subOption != 6);
                    break;
                }

                case 4:

                {

                    do {
                        System.out.println("Loans Sub-Menu:");
                        System.out.println("1. Insert");
                        System.out.println("2. Search");
                        System.out.println("3. Delete");
                        System.out.println("4. Edit");
                        System.out.println("5. List All");
                        System.out.println("6. Exit");
                        System.out.println("Enter your option [1,2,3,4,5,6]:");
                        subOption = sc.nextInt();

                        switch (subOption) {
                            case 1: {
                                System.out.println("in Insert");
                                break;
                            }
                            case 2: {
                                System.out.println("in Search");
                                break;
                            }
                            case 3: {
                                System.out.println("in Delete");
                                break;
                            }
                            case 4: {
                                System.out.println("in Edit");
                                break;
                            }
                            case 5: {
                                System.out.println("in List All");
                                break;
                            }
                            case 6: {
                                System.out.println("in Exit");
                                break;
                            }
                            // option = sc.nextInt();
                        }
                    } while (subOption != 6);
                    break;

                }

                case 5: {

                    do {
                        System.out.println("Statistics Sub-Menu:");
                        System.out.println("1. Top 5 Books");
                        System.out.println("2. Top 5 Members");
                        System.out.println("3. Emplyee of the Month");
                        System.out.println("4. List Overdue");
                        System.out.println("5. Exit");
                        System.out.println("Enter your option [1,2,3,4,5]:");
                        subOption = sc.nextInt();

                        switch (subOption) {
                            case 1: {
                                System.out.println("in Top 5 Books");
                                break;
                            }
                            case 2: {
                                System.out.println("in Top 5 Members");
                                break;
                            }
                            case 3: {
                                System.out.println("in Emplyee of the Month");
                                break;
                            }
                            case 4: {
                                System.out.println("in List Overdue");
                                break;
                            }

                            case 5: {
                                System.out.println("in Exit");
                                break;
                            }
                            // option = sc.nextInt();
                        }
                    } while (subOption != 6);
                    break;

                }

                case 6:
                    System.out.println("You selected to Exit");
                    System.exit(0);
                    break;
            }

        } while (option != 6);

    }
}
