import java.util.Scanner;
public class expendedora{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Provisional !!
        System.out.println("Registre d'usuaris ");

        int i = 0;
        int mes = 9;
        do{


            System.out.println("Introdueix el primer usuari que vols registrar");
            String primernom = sc.nextLine();
            System.out.println("Introdueix la contrassenya (ha de contenir com a mínim 4 carácters entre els quals hi ha d'haver un digit i un simbol" );
            String pass = sc.nextLine();
            System.out.println("Introdueix el segon usuari que vols registrar");
            String segonom = sc.nextLine();
            System.out.println("Introdueix la contrassenya (ha de contenir com a mínim 4 carácters entre els quals hi ha d'haver un digit i un simbol ");
            String segonapass = sc.nextLine();
            i++;

            if(i >= 2){
                System.out.println("Vols introduir mes? (0, no, 1 si)")
                mes = sc.nextInt();
                if(mes == 1){

                }
            }

        }while(primernom || segonom != "admin")








    }
}

// 4 caracters, digit, simbol, un ha de ser admin i s'ha de deixar preparat per introduir-ne de mes