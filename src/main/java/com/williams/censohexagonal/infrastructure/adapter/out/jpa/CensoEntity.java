package com.williams.censohexagonal.infrastructure.adapter.out.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "censos")
@Data
public class CensoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private Integer edad;
    private String sexo;
    private String direccion;
    private String municipio;
    private Integer estrato;
    private String nivelEducativo;
    private LocalDate fechaRegistro;
}
