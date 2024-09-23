package exercicio_19;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        // Exibir calendário de setembro de 2024
        calendario.exibirCalendario(2024, 9);

        // Verificar se 25 de dezembro é feriado
        boolean ehFeriado = calendario.verificarFeriado(25, 12);
        System.out.println("25 de dezembro é feriado? " + ehFeriado);

        // Calcular diferença de dias entre duas datas
        Calendar data1 = Calendar.getInstance();
        data1.set(2024, Calendar.SEPTEMBER, 22);
        Calendar data2 = Calendar.getInstance();
        data2.set(2024, Calendar.DECEMBER, 25);
        long diferencaDias = calendario.calcularDiferencaDias(data1, data2);
        System.out.println("Diferença de dias: " + diferencaDias);
    }
}
