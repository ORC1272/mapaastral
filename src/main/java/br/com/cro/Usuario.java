package br.com.cro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data


public class Usuario {

    public static List<Usuario> getTodosUsuarios () {
        var usuarios = new ArrayList();
        LocalDateTime dataHoraNascimento = LocalDateTime.of(1993, 5, 11, 12, 30);
        LocalDateTime dataHoraNascimento1 = LocalDateTime.of(1994, 10, 1, 1, 30);
        LocalDateTime dataHoraNascimento2 = LocalDateTime.of(1972, 12, 20, 1, 24);
        LocalDateTime dataHoraNascimento3 = LocalDateTime.of(1992, 10, 29, 8, 12);
        LocalDateTime dataHoraNascimento4 = LocalDateTime.of(1989, 7, 2, 6, 0);
        LocalDateTime dataHoraNascimento5 = LocalDateTime.of(1995, 3, 17, 3, 30);
        LocalDateTime dataHoraNascimento6 = LocalDateTime.of(1996, 5, 3, 19, 30);
        return usuarios;
    }

}
