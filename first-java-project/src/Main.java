//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       int [] nombres = {3,4,5,6,76};

       int cible = 10;

       int indice = -1;

       for (int i = 0; i < nombres.length; i++) {
           if (nombres[i] == cible) {
               indice = i;
               break;
           }
       }

       if(indice == -1){
           System.out.println("Le nombre n'existe pas");
       } else {
           System.out.println("on a trouve le nombre a l'indice" + indice);
       }
    }
}