package br.com.cro;

import java.time.LocalDateTime;
import java.time.LocalTime;

public enum Ascendente {
    ARIES,
    TOURO,
    GEMEOS,
    CANCER,
    LIBRA,
    ESCORPIAO,
    VIRGEM,
    LEAO,
    CAPRICORNIO,
    SAGITARIO,
    AQUARIO,
    PEIXES;

    public static Ascendente ascendente(LocalDateTime dataNascimento ){

        LocalTime ariesStartDate= LocalTime.of(4,31);
        LocalTime ariesEndDate = LocalTime.of(6,30);


        LocalTime touroStartDate = LocalTime.of(6,31);
        LocalTime touroEndDate = LocalTime.of(8,30);


        LocalTime gemeosStartDate = LocalTime.of(8,31);
        LocalTime gemeosEndDate = LocalTime.of(10,30);


        LocalTime cancerStartDate = LocalTime.of(10,31);
        LocalTime cancerEndDate = LocalTime.of(12,30);


        LocalTime leaoStartDate = LocalTime.of(12,31);
        LocalTime leaoEndDate = LocalTime.of(14,30);


        LocalTime virgemStartDate = LocalTime.of(14,31);
        LocalTime virgemEndDate = LocalTime.of(16,30);


        LocalTime libraStartDate = LocalTime.of(16,31);
        LocalTime libraEndDate = LocalTime.of(18,30);


        LocalTime escorpiaoStartDate = LocalTime.of(18,31);
        LocalTime escorpiaoEndDate = LocalTime.of(20,31);


        LocalTime sagitarioStartDate = LocalTime.of(20,31);
        LocalTime sagitarioEndDate = LocalTime.of(22,30);


        LocalTime capricornioStartDate = LocalTime.of(22,31);
        LocalTime capricornioEndDate = LocalTime.of(0,30);


        LocalTime aquarioStartDate = LocalTime.of(0,31);
        LocalTime aquarioEndDate = LocalTime.of(2,30);


        LocalTime peixesStartDate = LocalTime.of(2,31);
        LocalTime peixesEndDate = LocalTime.of(4,30);


        LocalTime horaMinutoNascimento = LocalTime.of(dataNascimento.getHour(),dataNascimento.getMinute());


        if(isWithinRange(horaMinutoNascimento,ariesStartDate,ariesEndDate)){
            return ARIES;
        }
        else if(isWithinRange(horaMinutoNascimento,touroStartDate,touroEndDate)){
            return TOURO;
        }
        else if(isWithinRange(horaMinutoNascimento,gemeosStartDate,gemeosEndDate)){
            return GEMEOS;
        }
        else if(isWithinRange(horaMinutoNascimento,cancerStartDate,cancerEndDate)){
            return CANCER;
        }
        else if(isWithinRange(horaMinutoNascimento,leaoStartDate,leaoEndDate)){
            return LEAO;
        }
        else if(isWithinRange(horaMinutoNascimento,virgemStartDate,virgemEndDate)){
            return VIRGEM;
        }
        else if(isWithinRange(horaMinutoNascimento,libraStartDate,libraEndDate)){
            return LIBRA;
        }
        else if(isWithinRange(horaMinutoNascimento,escorpiaoStartDate,escorpiaoEndDate)){
            return ESCORPIAO;
        }
        else if(isWithinRange(horaMinutoNascimento,sagitarioStartDate,sagitarioEndDate)){
            return SAGITARIO;
        }
        else if(isWithinRange(horaMinutoNascimento,aquarioStartDate,aquarioEndDate)){
            return CAPRICORNIO;
        }
        else if(isWithinRange(horaMinutoNascimento,peixesStartDate,peixesEndDate)){
            return PEIXES;
        }
        else{
            return CAPRICORNIO;
        }
    }


    static boolean isWithinRange(LocalTime horaMinutoNascimento, LocalTime StartDate, LocalTime EndDate){
        return !((horaMinutoNascimento.isBefore(StartDate) || (horaMinutoNascimento.isAfter(EndDate))));
    }

}

