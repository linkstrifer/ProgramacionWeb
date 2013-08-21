function validate( form )
        {           
            if ( form.id.value == "")
            {
                alert( "Falta Cedula/Nit" );
                form.id.focus();
                return false;
            }
            if ( form.names.value == "" )
            {
                alert( "Falta el Nombre" );
                form.names.focus();
                return false;
            }
            if ( form.address.value == "" )
            {
                alert( "Falta la Direccion" );
                form.address.focus();
                return false;
            }
            if ( form.phone.value == "" )
            {
                alert( "Falta el Telefono" );
                form.phone.focus();
                return false;
            }
              if ( form.cellphone.value == "" )
            {
                alert( "Falta el celular" );
                form.cellphone.focus();
                return faflse;
            }
         return true;
    }