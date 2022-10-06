package br.com.cro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.MonthDay;

@Getter
@AllArgsConstructor
public enum Signo {

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


        public static String buscarSigno( LocalDate dataNascimento) {
            MonthDay monthDayNascimento = MonthDay.of(dataNascimento.getMonth(), dataNascimento.getDayOfMonth());

        MonthDay ariesStartDate = MonthDay.of(3, 21);
        MonthDay ariesEndDate = MonthDay.of(4, 20);

        MonthDay touroStartDate = MonthDay.of(4, 21);
        MonthDay touroEndDate = MonthDay.of(5, 20);

        MonthDay gemeosStartDate = MonthDay.of(5, 21);
        MonthDay gemeosEndDate = MonthDay.of(6, 20);

        MonthDay cancerStartDate = MonthDay.of(6, 21);
        MonthDay cancereEndDate = MonthDay.of(7, 22);

        MonthDay leaoStartDate = MonthDay.of(7, 23);
        MonthDay leaoEndDate = MonthDay.of(8, 22);

        MonthDay virgemStartDate = MonthDay.of(8, 23);
        MonthDay virgemEndDate = MonthDay.of(9, 22);

        MonthDay libraStartDate = MonthDay.of(9, 23);
        MonthDay libraEndDate = MonthDay.of(10, 22);

        MonthDay escorpiaoStartDate = MonthDay.of(10, 23);
        MonthDay escorpiaoEndDate = MonthDay.of(11, 21);

        MonthDay sagitarioStartDate = MonthDay.of(11, 22);
        MonthDay sagitarioEndDate = MonthDay.of(12, 21);


        MonthDay aquarioStartDate = MonthDay.of(1, 21);
        MonthDay aquarioEndDate = MonthDay.of(2, 19);

        MonthDay peixesStartDate = MonthDay.of(2, 19);
        MonthDay peixesEndDate = MonthDay.of(3, 20);



        if (isWithinRange(monthDayNascimento, ariesStartDate, ariesEndDate)) {
            return "Aries";
        } else if (isWithinRange(monthDayNascimento, touroStartDate, touroEndDate)) {
            return "Touro";
        } else if (isWithinRange(monthDayNascimento, gemeosStartDate, gemeosEndDate)) {
            return "Gêmeos";
        } else if (isWithinRange(monthDayNascimento, cancerStartDate, cancereEndDate)) {
            return "Câncer";
        } else if (isWithinRange(monthDayNascimento, leaoStartDate, leaoEndDate)) {
            return "Leão";
        } else if (isWithinRange(monthDayNascimento, virgemStartDate, virgemEndDate)) {
            return "Virgem";
        } else if (isWithinRange(monthDayNascimento, libraStartDate, libraEndDate)) {
            return "Libra";
        } else if (isWithinRange(monthDayNascimento, escorpiaoStartDate, escorpiaoEndDate)) {
            return "Escorpião";
        } else if (isWithinRange(monthDayNascimento, sagitarioStartDate, sagitarioEndDate)) {
            return "Sargitário";
        } else if (isWithinRange(monthDayNascimento, aquarioStartDate, aquarioEndDate)) {
            return "Aquário";
        } else if (isWithinRange(monthDayNascimento, peixesStartDate, peixesEndDate)) {
            return "Peixes";
        } else {
            return "Capricórnio";
        }

    }

        public static boolean isWithinRange(MonthDay dataNascimento, MonthDay startDate, MonthDay endDate) {

        return !(dataNascimento.isBefore(startDate) || dataNascimento.isAfter(endDate));

    }


}
