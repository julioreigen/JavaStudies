package fundamentos_01;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // TIpos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; // L identifica como long

        // Tipos numéricos reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo boolean
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo


        // Dias de empresa
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

        // Número de viagens
        System.out.println("Número de viagens: " + numeroDeVoos * 2);

        // Pontos por real
        System.out.println("Pontos por viagem: " + pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
