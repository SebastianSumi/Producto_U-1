package pe.edu.upeu.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.demo.enums.EstadoJustificacion;

@AllArgsConstructor
@Getter
@Setter
public class Justificacion {
    private int id;
    private Empleado empleado;
    private Area area;
    private String asunto;
    private String descripcion;
    private String fecha;
    private EstadoJustificacion estado;
}
