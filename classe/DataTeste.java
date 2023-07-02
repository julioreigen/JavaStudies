package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data inicio = new Data((short) 7, (byte) 2, (short) 2023);
        
        Data finalizacao = new Data();
        finalizacao.ano = 2025;
        finalizacao.mes = 8;
        finalizacao.dia = 1;

        System.out.printf("Data de inicio da faculdade: %s\n", inicio.obterDataFormatada());
        System.out.printf("Data do fim do curso: %s", finalizacao.obterDataFormatada());
        
    }
}
