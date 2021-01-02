
package kalkulacka_blunar;

public class main {
    
    public static void main(String[] args) {
        kalkulacka calc = new kalkulacka();
        System.out.println("scitanie  " + calc.scitanie(5f, 10f));
        System.out.println("delenie  " + calc.delenie(6f, 0f));
        System.out.println("posledny vysleok  " + calc.get_posledny_vysledok());
    }
}
