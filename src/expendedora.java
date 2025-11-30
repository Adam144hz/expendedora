import java.util.Scanner;
public class expendedora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Provisional !!
        System.out.println("⌜ \uD835\uDE4D\uD835\uDE5A\uD835\uDE5C\uD835\uDE5E\uD835\uDE68\uD835\uDE69\uD835\uDE67\uD835\uDE5A \uD835\uDE59'\uD835\uDE6A\uD835\uDE68\uD835\uDE6A\uD835\uDE56\uD835\uDE67\uD835\uDE5E\uD835\uDE68 \uD83D\uDCDD" + " ⌟");
        String primernom;
        String segonom;
        String pass = "";
        String segonapass;
        boolean logedin = false;
        boolean valid = false;
        boolean registre = false;
        boolean podemseguir = false;
        boolean tedigit = false;
        boolean tesimbol = false;
        boolean tedigit_u = false;
        boolean tesimbol_u = false;
        int opcio = 8;
        int suma_1 = 0;
        int suma_2 = 0;
        int suma_3 = 0;
        int suma_4 = 0;
        int mes = 9;
        int llargariapassu = 0;
        int llargariapassdos = 0;
        do {
            System.out.println("\uD835\uDC08\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1E\uD835\uDC22\uD835\uDC31 \uD835\uDC1E\uD835\uDC25 \uD835\uDC29\uD835\uDC2B\uD835\uDC22\uD835\uDC26\uD835\uDC1E\uD835\uDC2B \uD835\uDC2E\uD835\uDC2C\uD835\uDC2E\uD835\uDC1A\uD835\uDC2B\uD835\uDC22 \uD835\uDC2A\uD835\uDC2E\uD835\uDC1E \uD835\uDC2F\uD835\uDC28\uD835\uDC25\uD835\uDC2C \uD835\uDC2B\uD835\uDC1E\uD835\uDC20\uD835\uDC22\uD835\uDC2C\uD835\uDC2D\uD835\uDC2B\uD835\uDC1A\uD835\uDC2B \uD83D\uDD24 :");
            primernom = sc.nextLine();
            System.out.println("\uD835\uDC08\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1E\uD835\uDC22\uD835\uDC31 \uD835\uDC25\uD835\uDC1A \uD835\uDC1C\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC1A\uD835\uDC2C\uD835\uDC2C\uD835\uDC1E\uD835\uDC27\uD835\uDC32\uD835\uDC1A \uD83D\uDD11 (\uD835\uDE29\uD835\uDE22 \uD835\uDE25\uD835\uDE26 \uD835\uDE24\uD835\uDE30\uD835\uDE2F\uD835\uDE35\uD835\uDE26\uD835\uDE2F\uD835\uDE2A\uD835\uDE33 \uD835\uDE24\uD835\uDE30\uD835\uDE2E \uD835\uDE22 \uD835\uDE2E\uD835\uDE2A\uD835\uDE2F\uD835\uDE2A\uD835\uDE2E \uD835\uDFE6 \uD835\uDE24\uD835\uDE22\uD835\uDE33\uD835\uDE22\uD835\uDE24\uD835\uDE35\uD835\uDE26\uD835\uDE33\uD835\uDE34 \uD835\uDE26\uD835\uDE2F\uD835\uDE35\uD835\uDE33\uD835\uDE26 \uD835\uDE26\uD835\uDE2D\uD835\uDE34 \uD835\uDE32\uD835\uDE36\uD835\uDE22\uD835\uDE2D\uD835\uDE34 \uD835\uDE29\uD835\uDE2A \uD835\uDE29\uD835\uDE22 \uD835\uDE25'\uD835\uDE29\uD835\uDE22\uD835\uDE37\uD835\uDE26\uD835\uDE33 \uD835\uDE36\uD835\uDE2F \uD835\uDE25\uD835\uDE2A\uD835\uDE28\uD835\uDE2A\uD835\uDE35 \uD835\uDE2A \uD835\uDE36\uD835\uDE2F \uD835\uDE34\uD835\uDE2A\uD835\uDE2E\uD835\uDE23\uD835\uDE30\uD835\uDE2D) : ");
            pass = sc.nextLine();
            System.out.println("\uD835\uDC08\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1E\uD835\uDC22\uD835\uDC31 \uD835\uDC1E\uD835\uDC25 \uD835\uDC2C\uD835\uDC1E\uD835\uDC20\uD835\uDC28\uD835\uDC27 \uD835\uDC2E\uD835\uDC2C\uD835\uDC2E\uD835\uDC1A\uD835\uDC2B\uD835\uDC22 \uD835\uDC2A\uD835\uDC2E\uD835\uDC1E \uD835\uDC2F\uD835\uDC28\uD835\uDC25\uD835\uDC2C \uD835\uDC2B\uD835\uDC1E\uD835\uDC20\uD835\uDC22\uD835\uDC2C\uD835\uDC2D\uD835\uDC2B\uD835\uDC1A\uD835\uDC2B \uD83D\uDD24 : ");
            segonom = sc.nextLine();
            System.out.println("\uD835\uDC08\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1E\uD835\uDC22\uD835\uDC31 \uD835\uDC25\uD835\uDC1A \uD835\uDC1C\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC1A\uD835\uDC2C\uD835\uDC2C\uD835\uDC1E\uD835\uDC27\uD835\uDC32\uD835\uDC1A \uD83D\uDD11 (\uD835\uDE29\uD835\uDE22 \uD835\uDE25\uD835\uDE26 \uD835\uDE24\uD835\uDE30\uD835\uDE2F\uD835\uDE35\uD835\uDE26\uD835\uDE2F\uD835\uDE2A\uD835\uDE33 \uD835\uDE24\uD835\uDE30\uD835\uDE2E \uD835\uDE22 \uD835\uDE2E\uD835\uDE2A\uD835\uDE2F\uD835\uDE2A\uD835\uDE2E \uD835\uDFE6 \uD835\uDE24\uD835\uDE22\uD835\uDE33\uD835\uDE22\uD835\uDE24\uD835\uDE35\uD835\uDE26\uD835\uDE33\uD835\uDE34 \uD835\uDE26\uD835\uDE2F\uD835\uDE35\uD835\uDE33\uD835\uDE26 \uD835\uDE26\uD835\uDE2D\uD835\uDE34 \uD835\uDE32\uD835\uDE36\uD835\uDE22\uD835\uDE2D\uD835\uDE34 \uD835\uDE29\uD835\uDE2A \uD835\uDE29\uD835\uDE22 \uD835\uDE25'\uD835\uDE29\uD835\uDE22\uD835\uDE37\uD835\uDE26\uD835\uDE33 \uD835\uDE36\uD835\uDE2F \uD835\uDE25\uD835\uDE2A\uD835\uDE28\uD835\uDE2A\uD835\uDE35 \uD835\uDE2A \uD835\uDE36\uD835\uDE2F \uD835\uDE34\uD835\uDE2A\uD835\uDE2E\uD835\uDE23\uD835\uDE30\uD835\uDE2D) : ");
            segonapass = sc.nextLine();

            llargariapassu = pass.length();
            llargariapassdos = segonapass.length();
            if ((primernom.equalsIgnoreCase("admin") || segonom.equalsIgnoreCase("admin"))) {
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
                    podemseguir = true;
                } else{
                    System.out.println("ꜰᴀʟᴛᴇɴ sɪᴍʙᴏʟs ᴏ ᴅɪɢɪᴛs ❗");
                }

            }else{
            System.out.println("ᴜɴ ᴅᴇʟs ᴜsᴜᴀʀɪs ʜᴀ ᴅᴇ sᴇʀ ᴀᴅᴍɪɴ ❗");
        }


        }while(!valid) ;
        boolean userpremium = false;
        String nomlog;
        String passlog;
        String nomdefi = "a";
        if(podemseguir){
            int i=3;
            String nom3 = "";
            String extrapass = "";
            while(!logedin && i>0) {
                System.out.println("⌜ \uD835\uDE47\uD835\uDE64\uD835\uDE5C\uD835\uDE44\uD835\uDE63 \uD83D\uDE80 ⌟");
                System.out.println("\uD835\uDE35\uD835\uDE26\uD835\uDE2F\uD835\uDE34 " + i + " " + "\uD835\uDE2A\uD835\uDE2F\uD835\uDE35\uD835\uDE26\uD835\uDE2F\uD835\uDE35\uD835\uDE34");
                System.out.println("\uD835\uDC08\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1E\uD835\uDC22\uD835\uDC31 \uD835\uDC1E\uD835\uDC25 \uD835\uDC27\uD835\uDC28\uD835\uDC26: ");
                nomlog = sc.nextLine();
                System.out.println("\uD835\uDC08\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1E\uD835\uDC22\uD835\uDC31 \uD835\uDC25\uD835\uDC1A \uD835\uDC1C\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC2B\uD835\uDC1A\uD835\uDC2C\uD835\uDC2C\uD835\uDC1E\uD835\uDC27\uD835\uDC32\uD835\uDC1A: ");
                passlog = sc.nextLine();
                if ((nomlog.equalsIgnoreCase(primernom) && passlog.equals(pass)) || (nomlog.equalsIgnoreCase(segonom) && passlog.equals(segonapass)) || (nomlog.equalsIgnoreCase(nom3) && passlog.equals(extrapass))) {
                    logedin = true;
                    if(nomlog.equals("admin")){
                        userpremium = true;
                    }else{
                        nomdefi = nomlog;
                    }
                    break;
                }
                i--;
            }
            if(i==0){
                System.out.println("ʜᴀs sᴜᴘᴇʀᴀᴛ ᴇʟ ɴᴜᴍᴇʀᴏ ᴍᴀxɪᴍ ᴅ'ɪɴᴛᴇɴᴛs ❗ ");
            }
        }
        boolean hadesernum = false;
        if(logedin){
            System.out.println("⌜ \uD835\uDE3E\uD835\uDE64\uD835\uDE63\uD835\uDE5B\uD835\uDE5E\uD835\uDE5C. \uD835\uDE4B\uD835\uDE67\uD835\uDE64\uD835\uDE59\uD835\uDE6A\uD835\uDE58\uD835\uDE69\uD835\uDE5A\uD835\uDE68 \uD83C\uDFF7\uFE0F ⌟");
            if(userpremium){
                System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: Admin ♛" + "\n" +
                        "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
            }else{
                System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: " + nomdefi + "" + " \uD83D\uDC64" + "\n" +
                        "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
            }
            //hacer interfaz en condiciones
            String nomp_1 = "", nomp_2 = "", nomp_3 = "", nomp_4 = "";
            double preu_1 = 0, preu_2 = 0, preu_3 = 0, preu_4 = 0;
            int stock_1 = 0, stock_2 = 0, stock_3 = 0, stock_4 = 0;
            String nom = "";
            boolean almenys = false;
            double preu = 0;
            int stock = 0;
            String codipro_1 = "", codipro_2 = "", codipro_3 = "", codipro_4 = "";
            for(int i = 1; i <=4; i++){
            System.out.println("ᕈɾoᑯᥙᥴtᥱ " + i + " " + "(ᕈ" + i + ") \uD83D\uDCE6");
            System.out.println("ᙁoຕ: ");
            nom = sc.nextLine();
            System.out.println("ᕈɾᥱᥙ \uD83D\uDCB2:");
            preu = sc.nextDouble();
            sc.nextLine();
            System.out.println("ᔑtoᥴƙ ꙆᥒɩᥴɩᥲꙆ \uD83D\uDCCB: ");
            stock = sc.nextInt();

            sc.nextLine();
            if(i<4) {
                System.out.println("⌜ \uD835\uDE3E\uD835\uDE64\uD835\uDE63\uD835\uDE5B\uD835\uDE5E\uD835\uDE5C\uD835\uDE6A\uD835\uDE67\uD835\uDE56\uD835\uDE63\uD835\uDE69. \uD835\uDE4B\uD835\uDE67\uD835\uDE64\uD835\uDE59\uD835\uDE6A\uD835\uDE58\uD835\uDE69\uD835\uDE5A\uD835\uDE68... ⚙\uFE0F ⌟");
            }
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
            boolean confirmacio = true;
            do{
                System.out.println("⌜ \uD835\uDE48\uD835\uDE40\uD835\uDE49\uD835\uDE50 \uD835\uDE4B\uD835\uDE4D\uD835\uDE44\uD835\uDE49\uD835\uDE3E\uD835\uDE44\uD835\uDE4B\uD835\uDE3C\uD835\uDE47 \uD83D\uDCDC ⌟");
                if(userpremium){
                    System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: Admin ♛" + "\n" +
                            "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
                }else{
                    System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: " + nomdefi + "" + " \uD83D\uDC64" + "\n" +
                            "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
                }
                //hacer menú en condiciones
                System.out.println("\uD835\uDFCF. \uD835\uDC02\uD835\uDC28\uD835\uDC27\uD835\uDC1F\uD835\uDC22\uD835\uDC20\uD835\uDC2E\uD835\uDC2B\uD835\uDC1A\uD835\uDC2B \uD835\uDC0F\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1C\uD835\uDC2D\uD835\uDC1E\uD835\uDC2C \uD83C\uDFF7\uFE0F \n" +
                               "\uD835\uDFD0. \uD835\uDC02\uD835\uDC28\uD835\uDC26\uD835\uDC29\uD835\uDC2B\uD835\uDC1A\uD835\uDC2B \uD835\uDC29\uD835\uDC2B\uD835\uDC28\uD835\uDC1D\uD835\uDC2E\uD835\uDC1C\uD835\uDC2D\uD835\uDC1E\uD835\uDC2C \uD83D\uDED2 \n" +
                               "\uD835\uDFD1. \uD835\uDC11\uD835\uDC1E\uD835\uDC28\uD835\uDC26\uD835\uDC29\uD835\uDC25\uD835\uDC22\uD835\uDC2B \uD835\uDC12\uD835\uDC2D\uD835\uDC28\uD835\uDC1C\uD835\uDC24 \uD83D\uDCE5 \n" +
                               "\uD835\uDFD2. \uD835\uDC08\uD835\uDC27\uD835\uDC1F\uD835\uDC28\uD835\uDC2B\uD835\uDC26\uD835\uDC1E \uD835\uDC1D\uD835\uDC1E \uD835\uDC2F\uD835\uDC1E\uD835\uDC27\uD835\uDC1D\uD835\uDC1E\uD835\uDC2C \uD835\uDC22 \uD835\uDC2B\uD835\uDC1E\uD835\uDC1C\uD835\uDC1A\uD835\uDC29\uD835\uDC2D\uD835\uDC1A\uD835\uDC1C\uD835\uDC22\uD835\uDC28 \uD83D\uDCCA \n" +
                               "\uD835\uDFD3. \uD835\uDC12\uD835\uDC28\uD835\uDC2B\uD835\uDC2D\uD835\uDC22\uD835\uDC2B \uD835\uDC1D\uD835\uDC1E\uD835\uDC25 \uD835\uDC29\uD835\uDC2B\uD835\uDC28\uD835\uDC20\uD835\uDC2B\uD835\uDC1A\uD835\uDC26\uD835\uDC1A ➜]");
                if(sc.hasNextInt()){
                 opcio = sc.nextInt();
                 sc.nextLine();
                 hadesernum = true;
                 }else{
                    System.out.println("ʜᴀs ᴅ'ɪɴᴛᴏʀᴅᴜɪʀ ᴜɴ ɴᴏᴍʙʀᴇ ᴇɴᴛᴇʀ ᴄᴏᴍ ᴀ ᴏᴘᴄɪᴏ...❗");
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
                        almenys=true;
                        if(userpremium){
                            System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: Admin ♛" + "\n" +
                                    "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
                        }else{
                            System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: " + nomdefi + "" + " \uD83D\uDC64" + "\n" +
                                    "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
                        }
                        for(int i = 1; i <=4; i++){
                            System.out.println("ᕈɾoᑯᥙᥴtᥱ " + i + " " + "(ᕈ" + i + ") \uD83D\uDCE6");
                            System.out.println("ᙁoຕ: ");
                            nom = sc.nextLine();
                            System.out.println("ᕈɾᥱᥙ \uD83D\uDCB2:");
                            preu = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("ᔑtoᥴƙ ꙆᥒɩᥴɩᥲꙆ \uD83D\uDCCB: ");
                            stock = sc.nextInt();

                            sc.nextLine();
                            if(i<4) {
                                System.out.println("⌜ \uD835\uDE3E\uD835\uDE64\uD835\uDE63\uD835\uDE5B\uD835\uDE5E\uD835\uDE5C\uD835\uDE6A\uD835\uDE67\uD835\uDE56\uD835\uDE63\uD835\uDE69. \uD835\uDE4B\uD835\uDE67\uD835\uDE64\uD835\uDE59\uD835\uDE6A\uD835\uDE58\uD835\uDE69\uD835\uDE5A\uD835\uDE68... ⚙\uFE0F ⌟");
                            }
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
                        if(almenys) {
                            System.out.println("⌜ \uD835\uDE3E\uD835\uDE64\uD835\uDE62\uD835\uDE65\uD835\uDE67\uD835\uDE56\uD835\uDE67 \uD835\uDE65\uD835\uDE67\uD835\uDE64\uD835\uDE59\uD835\uDE6A\uD835\uDE58\uD835\uDE69\uD835\uDE5A\uD835\uDE68 \uD83D\uDED2 ⌟");
                            if (userpremium) {
                                System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: Admin ♛" + "\n" +
                                        "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
                            } else {
                                System.out.println("\uD835\uDE84\uD835\uDE9C\uD835\uDE8E\uD835\uDE9B: " + nomdefi + "" + " \uD83D\uDC64" + "\n" +
                                        "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
                            }
                            do {
                                System.out.println("Ꙇᥒtɾoᑯᥙᥱɩx ᥱꙆ ᥴoᑯɩ ᑯᥱ ρɾoᑯᥙᥴtᥱ \uD83E\uDDD1\u200D\uD83D\uDCBB: ");
                                codipro = sc.nextLine();
                                if (codipro.equals("P1")) {
                                    do {
                                        System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥴoຕρɾᥲɾ..\uD83D\uDCAD? ");
                                        quant = sc.nextInt();
                                        if (quant > stock_1) {
                                            System.out.println("ɴᴏ ᴇɴ ǫᴜᴇᴅᴇɴ ᴛᴀɴᴛs, ᴛᴏʀɴᴀ-ʜᴏ ᴀ ɪɴᴛᴇɴᴛᴀʀ ❗");
                                        }
                                    } while (quant > stock_1);
                                    suma_1 = suma_1 + quant;
                                    comprat = quant * preu_1;
                                    totalrecap = totalrecap + comprat;
                                    stock_1 = stock_1 - quant;

                                } else if (codipro.equals("P2")) {
                                    do {
                                        System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥴoຕρɾᥲɾ..\uD83D\uDCAD? ");
                                        quant = sc.nextInt();
                                        if (quant > stock_2) {
                                            System.out.println("ɴᴏ ᴇɴ ǫᴜᴇᴅᴇɴ ᴛᴀɴᴛs, ᴛᴏʀɴᴀ-ʜᴏ ᴀ ɪɴᴛᴇɴᴛᴀʀ ❗");
                                        }
                                    } while (quant > stock_2);
                                    suma_2 = suma_2 + quant;
                                    comprat = quant * preu_2;
                                    totalrecap = totalrecap + comprat;
                                    stock_2 = stock_2 - quant;

                                } else if (codipro.equals("P3")) {
                                    do {
                                        System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥴoຕρɾᥲɾ..\uD83D\uDCAD? ");
                                        quant = sc.nextInt();
                                        if (quant > stock_3) {
                                            System.out.println("ɴᴏ ᴇɴ ǫᴜᴇᴅᴇɴ ᴛᴀɴᴛs, ᴛᴏʀɴᴀ-ʜᴏ ᴀ ɪɴᴛᴇɴᴛᴀʀ ❗");
                                        }
                                    } while (quant > stock_3);
                                    suma_3 = suma_3 + quant;
                                    comprat = quant * preu_3;
                                    totalrecap = totalrecap + comprat;
                                    stock_3 = stock_3 - quant;

                                } else if (codipro.equals("P4")) {
                                    do {
                                        System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥴoຕρɾᥲɾ..\uD83D\uDCAD? ");
                                        quant = sc.nextInt();
                                        if (quant > stock_4) {
                                            System.out.println("ɴᴏ ᴇɴ ǫᴜᴇᴅᴇɴ ᴛᴀɴᴛs, ᴛᴏʀɴᴀ-ʜᴏ ᴀ ɪɴᴛᴇɴᴛᴀʀ ❗");
                                        }
                                    } while (quant > stock_4);
                                    suma_4 = suma_4 + quant;
                                    comprat = quant * preu_4;
                                    totalrecap = totalrecap + comprat;
                                    stock_4 = stock_4 - quant;

                                } else {
                                    System.out.println("ᴇʀʀᴏʀ ᴇʟ ᴘʀᴏᴅᴜᴄᴛᴇ ɴᴏ ᴇxɪsᴛᴇɪx ❗");
                                    continue;
                                }
                                System.out.println("\uD835\uDC15\uD835\uDC28\uD835\uDC25\uD835\uDC2C \uD835\uDC1C\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC22\uD835\uDC27\uD835\uDC2E\uD835\uDC1A\uD835\uDC2B \uD835\uDC1C\uD835\uDC28\uD835\uDC26\uD835\uDC29\uD835\uDC2B\uD835\uDC1A\uD835\uDC27\uD835\uDC2D? (\uD835\uDC12\uD835\uDC08, \uD835\uDC0D\uD835\uDC0E)");
                                volscont = sc.nextLine();
                                sc.nextLine();
                                switch (volscont) {
                                    case "SI":
                                        continuar = true;
                                        break;
                                    case "NO":
                                        continuar = false;
                                        break;
                                    default:
                                        System.out.println("ʀᴇsᴘᴏsᴛᴀ ɴᴏ ᴠᴀʟɪᴅᴀ. s'ᴇɴᴛᴇɴ ᴄᴏᴍ ᴀ ɴᴏ. ❗");
                                        continuar = false;
                                        break;
                                }
                                System.out.println("⌜ \uD835\uDE3E\uD835\uDE64\uD835\uDE62\uD835\uDE65\uD835\uDE67\uD835\uDE56\uD835\uDE63\uD835\uDE69 \uD835\uDE65\uD835\uDE67\uD835\uDE64\uD835\uDE59\uD835\uDE6A\uD835\uDE58\uD835\uDE69\uD835\uDE5A\uD835\uDE68... \uD83D\uDECD\uFE0F ⌟");
                            } while (volscont.equals("SI"));
                            break;
                        }else{
                            System.out.println("ʜᴀs ᴅᴇ ᴄᴏɴꜰɪɢᴜʀᴀʀ ᴇʟs ᴘʀᴏᴅᴜᴄᴛᴇs ᴀʟᴍᴇɴs ᴜɴ ᴘɪᴄ ❗");
                            break;
                        }
                    case 3:
                        if(almenys) {
                            System.out.println("⌜ \uD835\uDC11\uD835\uDC1E\uD835\uDC28\uD835\uDC26\uD835\uDC29\uD835\uDC25\uD835\uDC22\uD835\uDC2B \uD835\uDC12\uD835\uDC2D\uD835\uDC28\uD835\uDC1C\uD835\uDC24 \uD83D\uDCE5 ⌟");
                            do {
                                System.out.println("Ꙇᥒtɾoᑯᥙᥱɩx ᥱꙆ ᥴoᑯɩ ᑯᥱ ρɾoᑯᥙᥴtᥱ \uD83E\uDDD1\u200D\uD83D\uDCBB: ");
                                codipro = sc.nextLine();
                                if (codipro.equals("P1")) {
                                    System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥲƒᥱɠɩɾ..\uD83D\uDCAD? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_1 = stock_1 + quant;
                                } else if (codipro.equals("P2")) {
                                    System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥲƒᥱɠɩɾ..\uD83D\uDCAD? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_2 = stock_2 + quant;
                                } else if (codipro.equals("P3")) {
                                    System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥲƒᥱɠɩɾ..\uD83D\uDCAD? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_3 = stock_3 + quant;
                                } else if (codipro.equals("P4")) {
                                    System.out.println("ᕋᥙᥲᥒt⳽ ᥱᥒ ʋoꙆ⳽ ᥲƒᥱɠɩɾ..\uD83D\uDCAD? ");
                                    quant = sc.nextInt();
                                    sc.nextLine();
                                    stock_4 = stock_4 + quant;
                                }
                                System.out.println("\uD835\uDC15\uD835\uDC28\uD835\uDC25\uD835\uDC2C \uD835\uDC1C\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC22\uD835\uDC27\uD835\uDC2E\uD835\uDC1A\uD835\uDC2B \uD835\uDC2B\uD835\uDC1E\uD835\uDC28\uD835\uDC26\uD835\uDC29\uD835\uDC25\uD835\uDC22\uD835\uDC27\uD835\uDC2D? (\uD835\uDC12\uD835\uDC08, \uD835\uDC0D\uD835\uDC0E)");
                                volscont = sc.nextLine();
                                System.out.println("⌜ \uD835\uDE4D\uD835\uDE5A\uD835\uDE64\uD835\uDE62\uD835\uDE65\uD835\uDE61\uD835\uDE5E\uD835\uDE63\uD835\uDE69 \uD835\uDE4E\uD835\uDE69\uD835\uDE64\uD835\uDE58\uD835\uDE60... ⌟");
                            } while (volscont.equals("SI"));
                            break;
                        }else{
                            System.out.println("ʜᴀs ᴅᴇ ᴄᴏɴꜰɪɢᴜʀᴀʀ ᴇʟs ᴘʀᴏᴅᴜᴄᴛᴇs ᴀʟᴍᴇɴs ᴜɴ ᴘɪᴄ ❗");
                            break;
                        }
                    case 4:
                        if(almenys) {
                            System.out.println(
                                    "\n" +
                                            "██████████████████████████████████████████████████████████████\n" +
                                            "█░░░░░░░░░░░░░░░ **INFORMES DE VENDA I RECAPTACIÓ** ░░░░░░░░░█\n" +
                                            "█────────────────────────────────────────────────────────────█\n" +
                                            "█                    \uD83D\uDCE6 NOM DELS PRODUCTES:                  █\n" +
                                            "█      " + nomp_1 + "  ||  " + nomp_2 + "  ||  " + nomp_3 + "  ||  " + nomp_4 + " \n" +
                                            "█────────────────────────────────────────────────────────────█\n" +
                                            "█                    \uD83D\uDCCA STOCK RESTANT: ──────────────────────█\n" +
                                            "█     " + stock_1 + " unitats || " + stock_2 + " unitats || " + stock_3 + " unitats || " + stock_4 + " unitats\n" +
                                            "█────────────────────────────────────────────────────────────█\n" +
                                            "█                   \uD83D\uDED2✨ TOTAL VENDUT: " + (suma_1 + suma_2 + suma_3 + suma_4) + " ✨\uD83D\uDED2" + "\n" +
                                            "█────────────────────────────────────────────────────────────█\n" +
                                            "█              \uD83C\uDFC6\uD83D\uDCB5 RECAPTACIÓ GLOBAL: " + totalrecap + "\uD83D\uDCB2 \uD83D\uDCB5\uD83C\uDFC6 ─────█" + "\n" +
                                            "█────────────────────────────────────────────────────────────█\n" +
                                            "█🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀█\n" +
                                            "██████████████████████████████████████████████████████████████\n"
                            );

                            break;
                        }else{
                            System.out.println("ʜᴀs ᴅᴇ ᴄᴏɴꜰɪɢᴜʀᴀʀ ᴇʟs ᴘʀᴏᴅᴜᴄᴛᴇs ᴀʟᴍᴇɴs ᴜɴ ᴘɪᴄ ❗");
                            break;
                        }
                    case 5:
                        System.out.println("Vols sortir? (SI/NO)");
                        String confirmacion = sc.nextLine();
                        if (confirmacion.equalsIgnoreCase("SI")){
                            confirmacio=false;
                            break;
                        }else if(confirmacion.equalsIgnoreCase("NO")){
                            break;
                        }
                        else{
                            System.out.println("ᴏᴘᴄɪᴏ ɴᴏ ᴠᴀʟɪᴅᴀ, ᴇs ᴄᴏᴍᴘᴛᴀ ᴄᴏᴍ ᴀ ɴᴏ ❗");
                        }
                        break;

                    default:
                        System.out.println("ᴏᴘᴄɪᴏ ɴᴏ ᴠᴀʟɪᴅᴀ, ᴇs ᴄᴏᴍᴘᴛᴀ ᴄᴏᴍ ᴀ ɴᴏ ❗");
                        break;
                }

             }


            }while(confirmacio);
            System.out.println("\uD835\uDC12\uD835\uDC28\uD835\uDC2B\uD835\uDC2D\uD835\uDC22\uD835\uDC27\uD835\uDC2D \uD835\uDC1D\uD835\uDC1E\uD835\uDC25 \uD835\uDC29\uD835\uDC2B\uD835\uDC28\uD835\uDC20\uD835\uDC2B\uD835\uDC1A\uD835\uDC26\uD835\uDC1A...\uD83D\uDC4B");
        }

//4 5

    }
}

// 4 caracters, digit, simbol, un ha de ser admin i s'ha de deixar preparat per introduir-ne de mes
