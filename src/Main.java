// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Aritmetica calculo = new Aritmetica(); //esse objeto instancia aritmética
         Geometrica calculo = new Geometrica(); // esse objeto instancia geometria
        Disciplina d = new Disciplina(calculo);//esse objeto instancia disciplina e chamja o calculo escolhido

        d.setNome("Padroes de Desenvolvimento"); // atribuimos esse dado a variavel nome na classe disciplina
        d.setP1(10); //atribuimos esse dado a variavel P1 na classe disciplina
        d.setP2(5); //atribuimos esse dado a variavel P2 na classe disciplina
        d.CalcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));


    }

}