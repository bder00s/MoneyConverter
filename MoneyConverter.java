import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyConverter {
        public static void main(String[] args) {

            // 1 dollar = 0,92 eurocent
            // 1 euro = 1,08 dollar

            //dollar omrekenen naar euro: dollarGetal * 0,92
            //euro omrekenen naar dollar: euroGetal * 1,08

            Scanner userInput = new Scanner(System.in);
            DecimalFormat f = new DecimalFormat("##.00");
            boolean continueConverter = true;

            // De converter begint
            while (continueConverter) {

                System.out.println("Vul het euro bedrag dat je wil converteren");

                double userPrice = userInput.nextDouble();


                //Kies currency
                System.out.println("Kies het nummer van de currency waar je naar wil converteren:");
                System.out.println("1: dollar");
                System.out.println("2: british pound");
                System.out.println("3: norwegian krone");
                System.out.println("4: japanese yen");

                int currencyNumber = userInput.nextInt();



                // Omrekenen van euro naar gekozen currency
                if (currencyNumber == 1) {
                    double output = userPrice * 1.09;
                    System.out.println(userPrice + " euro" + " is " + f.format(output) + " dollar");
                } else if (currencyNumber == 2) {
                    double output = userPrice * 0.88;
                    System.out.println(userPrice + " euro" + " is " + f.format(output) + " GB pond");
                } else if (currencyNumber == 3) {
                    double output = userPrice * 10.90;
                    System.out.println(userPrice + " euro" + " is " + f.format(output) + " Noorse kronen");
                } else if (currencyNumber == 4) {
                    double output = userPrice * 141.17;
                    System.out.println(userPrice + " euro" + " is " + f.format(output) + " Japanse yen");
                } else {
                    System.out.println("geen geldige currency gekozen");
                }

                // Nog een keer?
                System.out.println("Wil je nog een bedrag converteren? Y of N");
                String userAnswer = userInput.next();

                // Checken of gebruiker wil stoppen
                if (userAnswer.equals("N")) {
                    continueConverter = false;
                } else if (userAnswer.equals("Y")) {
                    continueConverter = true;
                } else {
                    System.out.println("Dit is geen geldig antwoord");
                }
            }
            //Einde while loop




            System.out.println("\nBedankt voor het gebruiken van de MONEY CONVERTER");


        }
    }




