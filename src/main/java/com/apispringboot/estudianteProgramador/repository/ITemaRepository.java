
package com.apispringboot.estudianteProgramador.repository;

import com.apispringboot.estudianteProgramador.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long>{
    
}
