
package com.apispringboot.estudianteProgramador.service;

import com.apispringboot.estudianteProgramador.model.Tema;
import java.util.List;


public interface ITemaService {
     public void saveTema(Tema tema);
     public List<Tema> getTemas();
    public void editTemas(Tema tema);
}
