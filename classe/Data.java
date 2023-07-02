package classe;

public class Data {
    short dia;
    byte mes;
    short ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(short day, byte month, short year) {
        dia = day;
        mes = month;
        ano = year;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
        // pode ser feito assim:
        // return dia + "/" + mes + "/" + ano
    }
}
