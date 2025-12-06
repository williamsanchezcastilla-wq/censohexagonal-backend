package com.williams.censohexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Censo {

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
