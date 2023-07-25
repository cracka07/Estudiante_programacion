
package com.apispringboot.estudianteProgramador.dto;

import com.apispringboot.estudianteProgramador.model.Tema;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CursoDTO {
      private String nombre;
      private List<Tema> listaTemas;

    public CursoDTO() {
    }

    public CursoDTO(String nombre, List<Tema> listaTemas) {
        this.nombre = nombre;
        this.listaTemas = listaTemas;
    }

        
}
