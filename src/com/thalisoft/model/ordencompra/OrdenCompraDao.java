package com.thalisoft.model.ordencompra;

import com.thalisoft.main.util.database;

public class OrdenCompraDao extends database {
    
    public boolean CRUD_ORDENCOMPRA(Object[] key){
        return EJECUTAR_SP("CRUD_ORDEN_COMPRA", key);
    }
    
    
}
