package Controller;

public class Binario {

    public Binario() {
        super();

    }


    public String funcBinario (int n ) {

        // Checando caso o valor "n" tenha chegado no último número possível de divisão
        if (n / 2 == 0) {

            return String.valueOf(n % 2);
        }


        // concatenando o resto da próxima iteração com a anterior, respectivamente.
        return   funcBinario(n / 2) + String.valueOf(n % 2);

    }

}
