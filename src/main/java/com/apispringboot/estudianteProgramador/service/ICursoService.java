
package com.apispringboot.estudianteProgramador.service;

import com.apispringboot.estudianteProgramador.dto.CursoDTO;
import com.apispringboot.estudianteProgramador.model.Curso;
import java.util.List;

public interface ICursoService {
    
    public void saveCurso(Curso curso);
    public List<Curso> getCursos();
    public CursoDTO temaPorCurso(Long id);
    public List<Curso> cursoPorNombre();
    public void editCurso(Curso curso);
    public Curso findCurso(Long id);
}
