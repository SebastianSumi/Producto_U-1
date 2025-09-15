package pe.edu.upeu.demo.repository;

import pe.edu.upeu.demo.model.Area;

import java.util.ArrayList;
import java.util.List;

public class AreaRepository {

    protected List<Area> areas = new ArrayList<>();

    public List<Area> findAll() {
        return areas;
    }
}
