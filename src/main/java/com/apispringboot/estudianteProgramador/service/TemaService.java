
package com.apispringboot.estudianteProgramador.service;

import com.apispringboot.estudianteProgramador.model.Tema;
import com.apispringboot.estudianteProgramador.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
    
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public void saveTema(Tema tema) {
       this.temaRepo.save(tema);
    }

    @Override
    public List<Tema> getTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void editTemas(Tema tema) {
        this.temaRepo.save(tema);
    }


}
