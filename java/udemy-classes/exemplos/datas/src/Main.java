import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate data = java.time.LocalDate.now();

        LocalDateTime dataHora = LocalDateTime.now();
        LocalDateTime dataHoraSemFormat = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String horaEntrada = dataHoraSemFormat.format((formatter));
        System.out.println(horaEntrada);

//        System.out.println(data);
//        System.out.println(dataHoraSemFormat);
//        System.out.println(dataHora.format(formatter));
    }

}
