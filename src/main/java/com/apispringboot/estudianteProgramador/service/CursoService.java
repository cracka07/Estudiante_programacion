
package com.apispringboot.estudianteProgramador.service;

import com.apispringboot.estudianteProgramador.dto.CursoDTO;
import com.apispringboot.estudianteProgramador.model.Curso;
import com.apispringboot.estudianteProgramador.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    
    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public void saveCurso(Curso curso) {
        this.cursoRepo.save(curso);
    }

   @Override
    public List<Curso> getCursos() {
        return cursoRepo.findAll();
    }


    @Override
    public List<Curso> cursoPorNombre() {
        String nombre="Java";
        String contenido;
        
        List<Curso> listaCurso=this.getCursos();
        List<Curso> listaContain=new ArrayList<>();
        for(Curso curso:listaCurso){
            contenido=curso.getNombre();
            
            boolean bandera=contenido.contains(nombre);
            if(bandera){
                listaContain.add(curso);
            }
        }
        return listaContain;
    }

    @Override
    public void editCurso(Curso curso) {
        this.cursoRepo.save(curso);
    }

    @Override
    public Curso findCurso(Long id) {
        return this.cursoRepo.findById(id).orElse(null);
    }

    @Override
    public CursoDTO temaPorCurso(Long id) {
        
        CursoDTO cursoDTO=new CursoDTO();
        Curso curso=this.findCurso(id);
       cursoDTO.setNombre(curso.getNombre());
       cursoDTO.setListaTemas(curso.getListaTemas());
       
       return cursoDTO;
    }

  
    
   
}
