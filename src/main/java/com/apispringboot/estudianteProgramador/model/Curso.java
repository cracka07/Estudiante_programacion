
package com.apispringboot.estudianteProgramador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private LocalDate fecha_fin;
    @OneToMany(mappedBy="curso")
    private List<Tema> listaTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, LocalDate fecha_fin, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_fin = fecha_fin;
        this.listaTemas = listaTemas;
    }
    
    
}
