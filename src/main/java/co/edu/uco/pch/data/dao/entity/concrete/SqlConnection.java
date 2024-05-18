package co.edu.uco.pch.data.dao.entity.concrete;

import co.edu.uco.pch.crosscutting.exceptions.custom.DataPCHException;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.MessageCatalogStrategy;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.data.CodigoMensaje;
import co.edu.uco.pch.crosscutting.helpers.SQLHelper;

import java.sql.Connection;

public class SqlConnection {

    private Connection conexion;

    protected SqlConnection(final Connection conexion) {
        setConexion(conexion);
    }

    protected SqlConnection(){
        super();
    }

    protected final Connection getConexion() {
        return conexion;
    }

    protected final void setConexion(final Connection conexion) {

        if (SQLHelper.isOpen(conexion)){
            var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
            var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00023);

            throw new DataPCHException(mensajeTecnico, mensajeUsuario);
        }
        this.conexion = conexion;
    }
}