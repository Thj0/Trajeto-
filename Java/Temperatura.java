package Java;

import java.util.ArrayList;

import java.util.List;
  
  
//Exercício com foco em treinar a lógica de programação e a utilização de um "ArrayList".

//:).


public class Temperatura { //Inicio da classe principal do exercício.
 public static void main(String[] args)

    {

        List<Mes> primeiroSemestre = new ArrayList<>() // Onde começo a lista principal,  que guarda as informaçoes dos meses e suas temperaturas.

        {{

  

            add(new Mes(1, "Janeiro", 28));

            add(new Mes(2, "Fevereiro", 27));

            add(new Mes(3, "Março", 26));

            add(new Mes(4, "Abril", 25));

            add(new Mes(5, "Maio", 24));

            add(new Mes(6, "Junho", 23));

  

        }};

        System.out.print(primeiroSemestre);

  

        double soma = 0; // Variável que serve como controle, é um contador, porém, com a utilizade de guardar os valores das temperaturas e somá-los.

  
  

        for(int i = 0; i < primeiroSemestre.size(); i++) //Função de controle, onde o i é utilizado para que percorra dentro da minha list e retorne as temperaturas.

        {

            soma += primeiroSemestre.get(i).getTemperatura(); // 'soma' recebe as temperaturas da list e armazena dentro da variável.

        }

  
  

        double media = soma / primeiroSemestre.size();  // media recebe os valores de soma e divide pelo tamanho de list.

  
  
  

        for(int i = 0; i < primeiroSemestre.size(); i++) //Enquanto o índice de i for menor que o tamanho de list, percorra.

        {

            if (primeiroSemestre.get(i).getTemperatura() > media) // se um mes de list tive uma temperatura maior que a média, imprima...

            {

  

                System.out.println(

                    primeiroSemestre.get(i).getNome() +

                    " - " +

                    primeiroSemestre.get(i).getTemperatura()

                );

  

            }

        }

    }

}

  
  

class Mes { // classe criada para integrar os atributos de list (classe abstrata).

  

    private Integer ordem;

    private String nome;

    private Integer temperatura;

  

    public Mes(Integer ordem, String nome, Integer temperatura){ // método de construção.

  

        this.ordem = ordem;

        this.nome = nome;

        this.temperatura = temperatura;

  

    }

  

    public Integer getOrdem() // Integer devolve um inteiro para getOrdem

    {

  

        return ordem; //Retorne 'ordem' (um inteiro) para getOrdem.

  

    }

  

    public String getNome() //String devolve um texto para getNome

    {

  

        return nome; // Retorne 'nome'(um string) para getNome.

  

    }

  

    public Integer getTemperatura() // Integer devolve um inteiro para getTemperatura

    {

  

        return temperatura; //Retorne 'temperatura'(um inteiro) para getTemperatura.

  

    }

  

    @Override

    public String toString() //Método de sobrescrição.

    {

  

        return "{" +

                " Ordem = " + ordem +

                '\'' +

                ", Nome = " + nome +

                ", Temperatura = " + temperatura + '\'' +

                '}';

  

    }
}