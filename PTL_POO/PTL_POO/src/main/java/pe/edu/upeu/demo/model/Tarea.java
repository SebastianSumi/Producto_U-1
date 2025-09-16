package pe.edu.upeu.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.demo.enums.EstadoTarea;
import pe.edu.upeu.demo.enums.Observacion;
import pe.edu.upeu.demo.enums.SatisfacionPuntaje;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Tarea {
    private int id;
    private String nombre;
    private String descripcion;
    private int num_participantes;
    private Area area;
    private Flujo flujo;
    private String fecha_inicio;
    private String fecha_fin;
    private String duracion;
    private ArrayList<Empleado> participantes;
    private ArrayList<Observacion> observaciones;
    private SatisfacionPuntaje puntaje;
    private EstadoTarea estado;
}
