package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".toUpperCase());

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1234.567;

        System.out.printf("O senhor %s %s tem %d anos de idade e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos de idade e ganha R$%.2f",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("frase qualquer".contains("qual"));
        System.out.println("frase qualquer".indexOf("qual"));
        System.out.println("frase qualquer".substring(6, 10));
    }
}
