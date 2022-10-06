package br.com.cro;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class SignoLunar {

    public static String signoLunar( LocalTime time, String localNascimento) {

        Set<String> zones = ZoneId.getAvailableZoneIds();

        for (String s : zones) {
            if (s.contains(localNascimento)) {
                ZoneId zoneId = ZoneId.of(s);
                // System.out.println(zoneId);

                if (zoneId.toString().equals("America/Recife") && time.isAfter(LocalTime.NOON)) {
                    return "Casimiro";
                }

                if (zoneId.toString().equals("America/Cuiaba") && time.isBefore(LocalTime.NOON)) {
                    return "Odin";
                }

                if (zoneId.toString().equals("America/Sao_Paulo")) {
                    return "Gandalf";
                }
            }
        }
        return  "Dinossauro";
    }
}
