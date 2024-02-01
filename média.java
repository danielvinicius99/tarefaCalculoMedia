public class média {
    public static void main(String[] args) {
        calcularMedia();
    }

    public static void calcularMedia(){
        int nota1= 10;
        int nota2= 20;
        int nota3= 30;
        int nota4= 40;

        int soma = nota1 + nota2 + nota3+ nota4;
        int divisao = soma/4;
        System.out.println(divisao);
    }
}
