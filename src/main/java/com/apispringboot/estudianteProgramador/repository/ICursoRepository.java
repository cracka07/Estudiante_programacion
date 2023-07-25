
package com.apispringboot.estudianteProgramador.repository;

import com.apispringboot.estudianteProgramador.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long>{
    
}
