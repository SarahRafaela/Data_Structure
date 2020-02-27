package vetorez_matrizes;

public class Exercicio_1 {

    public static void main(String[] args) {

          double[] array = new double[2];



          array = carregaVetor(array);

          mediaPositivos(array);

          mediaGeral(array);

          somaNegativos(array);



    }



    public static double[] carregaVetor(double array[]) {

          for (int i = 0; i < array.length; i++) {

                 array[i] = Math.round((double) (Math.random() * (2500 - (-2500))) + (-2500));

                 System.out.println(array[i]);

          }

          return array;

    }



    private static void mediaPositivos(double[] array) {

          double media = 0;

          int cont = 0;

          for (int i = 0; i < array.length; i++) {

                 if (array[i] >= 100 && array[i] <= 1000) {

                        media += array[i];

                        cont++;

                 }

          }

          if (media == 0) {

                 System.out.println("Não existem números positivos maiores que 100 e menores que 1000");

          } else {



                 media = media / cont;

                 System.out.println("A média dos saldos positivos maiores que 100 e menores que 1000 é:" + media);

          }

    }



    private static void mediaGeral(double[] array) {

          double media = 0;

          int cont = 0;

          for (int i = 0; i < array.length; i++) {

                 media += array[i];

                 cont++;

          }



          media = media / cont;

          System.out.println("A média dos saldos é:" + media);

    }



    private static void somaNegativos(double[] array) {

          double sum = 0;

          for (int i = 0; i < array.length; i++) {

                 if (array[i] < 0) {

                        sum += array[i];

                 }

          }

          System.out.println("Soma dos números negativos" + sum);



    }


}
