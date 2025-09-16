package pe.edu.upeu.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.demo.enums.EstadoArea;
import pe.edu.upeu.demo.enums.Observacion;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Area {
    private int id;
    private String nombre;
    private ArrayList<String> tags_especialidades;
    private ArrayList<Tarea> tareas;
    private EstadoArea estado;
    private Empleado admin;
    private ArrayList<Empleado> empleados;
    private double puntaje_promedio;
    private ArrayList<Observacion> observaciones;
}
