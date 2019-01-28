public class Main {

    public static void main(String[] args) {

        // Somar +
        // Subtrair -
        // Multiplicar *
        // Dividir /
        // Módulo -> resto da divisão %

        int n1 = 7;
        int n2 = 5;
        //int result = n1 % n2;
        boolean result;

        result = n1 > n2;

        // = 2
        //System.out.println(result);

        //arrays
        String[] nomes = {"Anderson", "Pedro"};

        //System.out.println( nomes[0] );

        //Swith

        switch (6){
            case 1 :
                System.out.println("teste");
                break;
            case 2 :
                System.out.println("teste 2");
                break;
            default:
                System.out.println("padrão");

        }


        System.out.println( nomes[0] + "\n" + nomes[1] );


        //loops

        int numero = 1;
        while(numero <= 3){
            System.out.println("Executou!!! " + numero);
            numero = numero + 1;
        }

        do{
            System.out.println(numero);
            numero = numero + 1;
        }while (numero < 1);

        for(int n=1;n<5;n++){
            System.out.println(n);
        }


    }
}
