package pe.edu.upeu.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.demo.enums.EstadoFlujo;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Flujo {
    private int id;
    private String nombre;
    private ArrayList<Tarea> tareas;
    private EstadoFlujo estado;
    private String fecha_creacion;
    private String fecha_finalizacion;
    private ArrayList<Area> areas;
}
