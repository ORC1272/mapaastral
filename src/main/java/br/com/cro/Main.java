package br.com.cro;

import java.time.*;
import java.time.format.DateTimeFormatter;
import static br.com.cro.Ascendente.ascendente;
import static br.com.cro.SignoLunar.signoLunar;

public class Main {

    public static void main ( String[] args ) {

        LocalDateTime dataHoraNascimento2 = LocalDateTime.of(2004, 5, 11, 12, 30);
        LocalDateTime dataHoraNascimento3 = LocalDateTime.of(1994, 10, 1, 1, 30);
        LocalDateTime dataHoraNascimento1 = LocalDateTime.of(1972, 12, 20, 1, 24);
        LocalDateTime dataHoraNascimento4 = LocalDateTime.of(1992, 10, 29, 8, 12);
        LocalDateTime dataHoraNascimento5 = LocalDateTime.of(1989, 7, 2, 6, 0);
        LocalDateTime dataHoraNascimento6 = LocalDateTime.of(1995, 3, 17, 3, 30);
        LocalDateTime dataHoraNascimento7 = LocalDateTime.of(1996, 5, 3, 19, 30);

        ZoneId zoneId2 = ZoneId.of("America/Recife");
        ZoneId zoneId3 = ZoneId.of("America/Boa_Vista");
        ZoneId zoneId1 = ZoneId.of("America/Boise");

        // Idade
        Period period = Period.between(dataHoraNascimento1.toLocalDate(), LocalDate.now());
        System.out.println("Idade do primeiro usuario: " + period.getYears() + " ANOS");
        System.out.println();

        // Data de nascimento

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        String dataFormatada = formatter.format(dataHoraNascimento1);
        System.out.println("Data de nascimento formatada: " + dataFormatada);
        System.out.println();


       // ZoneId zoneId1 = ZoneId.of("America/Recife");
        ZoneOffset current = zoneId1.getRules().getOffset(dataHoraNascimento1);
        System.out.println("ZoneOffset do local de nascimento: " + current.toString());
        System.out.println();

        System.out.println("Ano bissexto: " + dataHoraNascimento1.toLocalDate().isLeapYear());

        System.out.println("Signo :" + buscarSigno(dataHoraNascimento1.toLocalDate()));

        System.out.println("Ascendente: " + ascendente(dataHoraNascimento1));

        System.out.println("Signo Lunar: " + signoLunar(dataHoraNascimento1.toLocalTime(), String.valueOf(zoneId1)));

    }
    private static String buscarSigno ( LocalDate of ) {
        return Signo.buscarSigno(of);
    }
}