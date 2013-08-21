function verificar( servi )
        {           
            if ( servi.id_cliente.value == "")
            {
                alert( "Falta Cedula/Nit" );
                servi.id_cliente.focus();
                return false;
            }
            if ( servi.nombre.value == "" )
            {
                alert( "Falta el Nombre" );
                servi.nombre.focus();
                return false;
            }
            if ( servi.direccion.value == "" )
            {
                alert( "Falta la Direccion" );
                servi.direccion.focus();
                return false;
            }
            if ( servi.telefono.value == "" )
            {
                alert( "Falta el Telefono" );
                servi.telefono.focus();
                return false;
            }
              if ( servi.celular.value == "" )
            {
                alert( "Falta el celular" );
                servi.celular.focus();
                return faflse;
            }
         return true;
    }