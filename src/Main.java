import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

    int x =12;
    int y = 2;
    int z = 12*2;
    System.out.println(z);

    String word = "Ciao";
    int w =90;
    String conc = word + 90;
    System.out.println(conc);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la prima stringa:");
        String string1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String string2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String string3 = scanner.nextLine();


        System.out.println("Hai inserito le seguenti stringhe:");
        System.out.println("Prima stringa: " + string1);
        System.out.println("Seconda stringa: " + string2);
        System.out.println("Terza stringa: " + string3);
        scanner.close();

        int lato1Ret = 12;
        int lato2Ret = 10;
        int Perimetro = 2 *(lato1Ret + lato2Ret);
        System.out.println(Perimetro);

        int q = 9;
        int result;
        if(q % 2 == 0){
            result = 0;
        }else{
            result = 1;
        }
        System.out.println(result);

        int baseTri = 20;
        int hTri = 10;
        int areaTri = baseTri * hTri / 2;

        System.out.println(areaTri);
}}