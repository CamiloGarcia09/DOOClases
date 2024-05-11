package co.edu.uco.pch.entity;

import co.edu.uco.pch.crosscutting.helpers.ObjectHelper;
import co.edu.uco.pch.crosscutting.helpers.TextHelper;
import co.edu.uco.pch.dto.DepartamentoDTO;
import co.edu.uco.pch.dto.PaisDTO;

import java.util.UUID;

//DTO = Data Transfer Object
public final class CiudadEntity {
    private UUID id;
    private String nombre;
    private DepartamentoDTO departamento;

    public CiudadEntity() {
        super();
    }

    public CiudadEntity(final UUID id, final String nombre, final DepartamentoDTO departamento) {
        setId(id);
        setNombre(nombre);
        setDepartamento(departamento);
    }

    //Build significa crear en español
    public static final CiudadEntity build(){
        return new CiudadEntity();
    }

    public final UUID getId() {
        return id;
    }

    public final CiudadEntity setId(final UUID id) {
        this.id = id;
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final CiudadEntity setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
        return this;
    }

    public final DepartamentoDTO getDepartamento() {
        return departamento;
    }

    public final CiudadEntity setDepartamento(final DepartamentoDTO departamento) {
        this.departamento = ObjectHelper.getObjectHelper().getDefaultValue(departamento, new DepartamentoDTO());
        return this;
    }
}