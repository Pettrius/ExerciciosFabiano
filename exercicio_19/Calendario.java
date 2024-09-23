package exercicio_19;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Calendario {

    public Map<String, String> feriados;

    public Calendario() {
        feriados = new HashMap<>();
        inicializarFeriados();
    }

    public void inicializarFeriados() {
        feriados.put("01-01", "Ano Novo");
        feriados.put("25-12", "Natal");
        // Adicione outros feriados conforme necessário
    }

    public void exibirCalendario(int ano, int mes) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, mes - 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        int primeiroDiaSemana = cal.get(Calendar.DAY_OF_WEEK);
        int diasNoMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Dom Seg Ter Qua Qui Sex Sab");
        for (int i = 1; i < primeiroDiaSemana; i++) {
            System.out.print("    ");
        }

        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%3d ", dia);
            if ((dia + primeiroDiaSemana - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean verificarFeriado(int dia, int mes) {
        String chave = String.format("%02d-%02d", dia, mes);
        return feriados.containsKey(chave);
    }

    public long calcularDiferencaDias(Calendar data1, Calendar data2) {
        long milissegundosPorDia = 24 * 60 * 60 * 1000;
        long diferencaMilissegundos = Math.abs(data1.getTimeInMillis() - data2.getTimeInMillis());
        return diferencaMilissegundos / milissegundosPorDia;
    }
}

