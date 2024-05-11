package co.edu.uco.pch.entity;

import co.edu.uco.pch.crosscutting.helpers.TextHelper;
import co.edu.uco.pch.dto.PaisDTO;

import java.util.UUID;

//DTO = Data Transfer Object
public final class DepartamentoEntity {
    private UUID id;
    private String nombre;
    private PaisDTO pais;

    public DepartamentoEntity() {
        super();
    }

    public DepartamentoEntity(final UUID id, final String nombre, final PaisEntity pais) {
        setId(id);
        setNombre(nombre);
        setPais(pais);
    }

    //Build significa crear en español
    public static final DepartamentoEntity build (){
        return new DepartamentoEntity();
    }

    public final UUID getId() {
        return id;
    }

    public final DepartamentoEntity setId(final UUID id) {
        this.id = id;
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final DepartamentoEntity setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
        return this;
    }

    public final PaisDTO getPais() {
        return pais;
    }

    public DepartamentoEntity setPais (final PaisEntity pais) {
        this.pais = pais;
        return this;
    }
}