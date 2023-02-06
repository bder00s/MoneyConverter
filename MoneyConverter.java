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
            System.out.println("5: bitcoin");

            int currencyNumber = userInput.nextInt();


            // Omrekenen van euro naar gekozen currency



                switch (currencyNumber) {
                    case 1:
                        double output = userPrice * 1.09;
                        System.out.println(userPrice + " euro" + " is " + f.format(output) + " dollar");
                        break;
                    case 2:
                        output = userPrice * 0.88;
                        System.out.println(userPrice + " euro" + " is " + f.format(output) + " GB pond");
                        break;
                    case 3:
                        output = userPrice * 10.90;
                        System.out.println(userPrice + " euro" + " is " + f.format(output) + " Noorse kronen");
                        break;
                    case 4:
                        output = userPrice * 141.17;
                    System.out.println(userPrice + " euro" + " is " + f.format(output) + " Japanse yen");
                        break;
                    case 5:
                        output = userPrice * 0.000046;
                        System.out.println(userPrice + " euro" + " is " + f.format(output) + " Bitcoin");
                        break;
                    default:
                        System.out.println("Dit is geen geldige currency");
                        
                }




            // Nog een keer?
            System.out.println("Wil je nog een bedrag converteren? Y of N");
            String userAnswer = userInput.next();


            // Checken of gebruiker wil stoppen

            switch (userAnswer) {
                case "Y":
                case "y":
                    continueConverter = true;
                    break;
                case "N":
                case "n":
                    System.out.println("\nBedankt voor het gebruiken van de MONEY CONVERTER");
                    continueConverter = false;
                    break;
                default:
                    System.out.println("Dit is geen geldig antwoord, typ 'y' of 'n' ");
            }

            //Einde while loop


        }
    }

}


