package pe.edu.upeu.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pe.edu.upeu.demo.enums.AccesoEmpleado;
import pe.edu.upeu.demo.enums.AreaEmpleado;
import pe.edu.upeu.demo.enums.EstadoEmpleado;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Empleado {
    private int id;
    private AccesoEmpleado acceso;
    private String password;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private String email;
    private double salario;
    private EstadoEmpleado estado;
    private AreaEmpleado estado_area;
    private Area area;
    private ArrayList<String> Observaciones;
    private double puntaje_promedio;
}
