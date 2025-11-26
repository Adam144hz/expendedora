import java.util.Scanner;
public class expendedora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Provisional !!
        System.out.println("Registre d'usuaris ");

        int mes = 9;
        String primernom;
        String segonom;
        boolean valid = false;
        String extra;
        String pass;
        String segonapass;
        String extrapass;
        boolean logedin = false;
        boolean registre = false;
        boolean podemseguir = false;
        int opcio = 8;
        int suma_1 = 0;
        int suma_2 = 0;
        int suma_3 = 0;
        int suma_4 = 0;
        do {


            System.out.println("Introdueix el primer usuari que vols registrar");
            primernom = sc.nextLine();
            System.out.println("Introdueix la contrassenya (ha de contenir com a mínim 4 carácters entre els quals hi ha d'haver un digit i un simbol");
            pass = sc.nextLine();
            System.out.println("Introdueix el segon usuari que vols registrar");
            segonom = sc.nextLine();
            System.out.println("Introdueix la contrassenya (ha de contenir com a mínim 4 carácters entre els quals hi ha d'haver un digit i un simbol ");
            segonapass = sc.nextLine();


            int llargariapassu = pass.length();
            int llargariapassdos = segonapass.length();
            if ((primernom.equals("admin") || segonom.equals("admin"))) {
                boolean tedigit = false;
                boolean tesimbol = false;
                boolean tedigit_u = false;
                boolean tesimbol_u = false;
                for (int cont = 0; cont < pass.length(); cont++) {
                    char c = pass.charAt(cont);
                    if (Character.isDigit(c)) {
                        tedigit = true;
                    }
                    if (c == '@' || c == '#' || c == '%' || c == '&') {
                        tesimbol = true;
                    }
                }

                for (int cont = 0; cont < segonapass.length(); cont++) {
                    char a = segonapass.charAt(cont);
                    if (Character.isDigit(a)) {
                        tedigit_u = true;
                    }
                    if (a == '@' || a == '#' || a == '%' || a == '&') {
                        tesimbol_u = true;
                    }
                }

                if (tedigit && tedigit_u && tesimbol && tesimbol_u && llargariapassu >= 4 && llargariapassdos >= 4) {
                    registre = true;
                    valid = true;
                    System.out.println("Vols introduir mes? (0, no, 1 si)");
                    mes = sc.nextInt();
                    if (mes == 1) {
                        do {
                            System.out.println("usuari?: ");
                            extra = sc.nextLine();
                            System.out.println("Contrassenya: ");
                            extrapass = sc.nextLine();
                        } while ((!extra.equals("stop")));
                    } else {
                        podemseguir = true;
                    }


                } else{
                    System.out.println("Falten simbols o digits");
                }

            }else{
            System.out.println("Un dels usuaris ha de ser admin");
        }


        }while(!valid) ;

        String nomlog;
        String passlog;
        if(podemseguir){
            int i=3;
            sc.nextLine();
            while(!logedin && i>0) {
                System.out.println("(LogIn) Tens " + i + " " + "intents");
                System.out.println("(LogIn) Introdueix el nom: ");
                nomlog = sc.nextLine();
                System.out.println("(LogIn) Introdueix la contrassenya: ");
                passlog = sc.nextLine();
                if (nomlog.equals(primernom) && passlog.equals(pass) || nomlog.equals(segonom) && passlog.equals(segonapass)) {
                    logedin = true;
                    break;
                }
                i--;
            }
            if(i==0){
                System.out.println("Has superat el número máxim d'intents");
            }
        }
        boolean hadesernum = false;
        if(logedin){
            //hacer menú en condiciones

            String nomp_1 = "", nomp_2 = "", nomp_3 = "", nomp_4 = "";
            double preu_1 = 0, preu_2 = 0, preu_3 = 0, preu_4 = 0;
            int stock_1 = 0, stock_2 = 0, stock_3 = 0, stock_4 = 0;
            String nom = "";
            double preu = 0;
            int stock = 0;
            String codipro_1 = "", codipro_2 = "", codipro_3 = "", codipro_4 = "";
            for(int i = 1; i <=4; i++){

            System.out.println("Producte " + i + " " + "(P" + i + ")");
            System.out.println("Nom?: ");
            nom = sc.nextLine();
            System.out.println("Preu?");
            preu = sc.nextDouble();
            System.out.println("Stock Inicial: ");
            stock = sc.nextInt();
            sc.nextLine();

                switch (i){
                    case 1:
                        nomp_1 = nom;
                        preu_1=preu;
                        stock_1=stock;
                        codipro_1 = "P1";
                    break;

                    case 2:
                        nomp_2 = nom;
                        preu_2=preu;
                        stock_2=stock;
                        codipro_2 = "P2";
                        break;

                    case 3:
                        nomp_3 = nom;
                        preu_3=preu;
                        stock_3=stock;
                        codipro_3 = "P3";
                        break;

                    case 4:
                        nomp_4 = nom;
                        preu_4=preu;
                        stock_4=stock;
                        codipro_4 = "P4";
                        break;
                }

            }

        double totalrecap = 0;
            do{
                System.out.println("(Menú Principal) Tria una de les següents opcions: ");
                System.out.println("1. Configurar Productes \n" +
                               "2. Comprar productes \n" +
                               "3. Reomplir stock \n" +
                               "4. Informe de vendes i recaptació \n" +
                               "5. Sortir del programa");
                if(sc.hasNextInt()){
                 opcio = sc.nextInt();
                 sc.nextLine();
                 hadesernum = true;
                 }else{
                    System.out.println("Has d'intorduir un nombre enter com a opció");
                    sc.nextLine();
                    hadesernum=false;
                }


             if(hadesernum){
                 String codipro = "";
                 boolean continuar = true;
                 int quant = 0;
                 double comprat = 0;
                 String volscont = "";

                switch (opcio){
                    case 1:
                        sc.nextLine();
                        for(int i = 1; i <=4; i++){

                            System.out.println("Producte " + i + " " + "(P" + i + ")");
                            System.out.println("Nom?: ");
                            nom = sc.nextLine();
                            System.out.println("Preu?");
                            preu = sc.nextDouble();
                            System.out.println("Stock Inicial: ");
                            stock = sc.nextInt();
                            sc.nextLine();
                            switch (i){
                                case 1:
                                    nomp_1 = nom;
                                    preu_1= preu;
                                    stock_1=stock;
                                    break;
                                case 2:
                                    nomp_2 = nom;
                                    preu_2= preu;
                                    stock_2=stock;
                                    break;
                                case 3:
                                    nomp_3 = nom;
                                    preu_3=preu;
                                    stock_3=stock;
                                    break;
                                case 4:
                                    nomp_4 = nom;
                                    preu_4=preu;
                                    stock_4=stock;
                                    break;
                            }
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        do {
                            System.out.println("Introdueix el codi de producte");
                            codipro = sc.nextLine();

                                if (codipro.equals("P1")) {
                                    do {
                                        System.out.println("Quants en vols comprar? ");
                                        quant = sc.nextInt();
                                        sc.nextLine();
                                        if (quant > stock_1) {
                                            System.out.println("No en queden tants, torna-ho a intentar");
                                        }
                                    } while (quant > stock_1);
                                    suma_1 = suma_1+quant;
                                    comprat = quant * preu_1;
                                    totalrecap = totalrecap + comprat;
                                    stock_1 = stock_1 - quant;

                                } else if (codipro.equals("P2")) {
                                    do {
                                        System.out.println("Quants en vols comprar? ");
                                        quant = sc.nextInt();
                                        sc.nextLine();
                                        if (quant > stock_2) {
                                            System.out.println("No en queden tants, torna-ho a intentar");
                                        }
                                    } while (quant > stock_2);
                                    suma_2 = suma_2+quant;
                                    comprat = quant * preu_2;
                                    totalrecap = totalrecap + comprat;
                                    stock_2 = stock_2 - quant;

                                } else if (codipro.equals("P3")) {
                                    do {
                                        System.out.println("Quants en vols comprar? ");
                                        quant = sc.nextInt();
                                        sc.nextLine();
                                        if (quant > stock_3) {
                                            System.out.println("No en queden tants, torna-ho a intentar");
                                        }
                                    } while (quant > stock_3);
                                    suma_3 = suma_3+quant;
                                    comprat = quant * preu_3;
                                    totalrecap = totalrecap + comprat;
                                    stock_3 = stock_3 - quant;

                                } else if (codipro.equals("P4")) {
                                    do {
                                        System.out.println("Quants en vols comprar? ");
                                        quant = sc.nextInt();
                                        sc.nextLine();
                                        if (quant > stock_4) {
                                            System.out.println("No en queden tants, torna-ho a intentar");
                                        }
                                    } while (quant > stock_4);
                                    suma_4 = suma_4+quant;
                                    comprat = quant * preu_4;
                                    totalrecap = totalrecap + comprat;
                                    stock_4 = stock_4 - quant;

                                } else {
                                    System.out.println("ERROR el producte no existeix");
                                    continue;
                                }
                                System.out.println("Vols continuar comprant? (SI, NO)");
                                volscont = sc.nextLine();
                                switch (volscont) {
                                    case "SI":
                                        continuar = true;
                                        break;
                                    case "NO":
                                        continuar = false;
                                        break;
                                    default:
                                        System.out.println("Resposta no vàlida. S'entén com a NO.");
                                        continuar = false;
                                        break;
                                }

                        }while(volscont.equals("SI"));
                        break;
                    case 3:
                        sc.nextLine();
                        do {
                            System.out.println("Introdueix el codi de producte");
                            sc.nextLine();
                            codipro = sc.nextLine();
                            if (codipro.equals("P1")) {
                                    System.out.println("Quants en vols afegir? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_1 = stock_1 + quant;
                            } else if (codipro.equals("P2")) {
                                    System.out.println("Quants en vols afegir? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_2 = stock_2 + quant;
                            } else if (codipro.equals("P3")) {
                                    System.out.println("Quants en vols afegir? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_3 = stock_3 + quant;
                            } else if (codipro.equals("P4")) {
                                    System.out.println("Quants en vols afegir? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_4 = stock_4 + quant;
                            }
                            System.out.println("Vols continuar reomplint?");
                            volscont = sc.nextLine();
                        }while(volscont.equals("SI"));
                        break;
                    case 4:
                        System.out.println("NOM DE PRODUCTE: " + nomp_1 + " " + nomp_2 +  " " + nomp_3 + " " + nomp_4 + "\n" +
                                           "STOCK RESTANT: " + stock_1 + " " + stock_2 + " " + stock_3 + " " + stock_4 + "\n" +
                                           "NUMERO TOTAL DE PRODUCTES VENUTS: " + " "+ (suma_1+suma_2+suma_3+suma_4) + "\n"+
                                           "TOTAL RECAPTAT" + totalrecap );
                        break;
                    case 5:
                        System.out.println("Sortint del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opció no válida");
                        break;
                }
             }
            }while(opcio != 5);

        }



    }
}

// 4 caracters, digit, simbol, un ha de ser admin i s'ha de deixar preparat per introduir-ne de mes