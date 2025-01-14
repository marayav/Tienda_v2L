/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public interface ItemService {
    
    List<Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    //Recuperar el registro que tiene el IdItem pasado por parametros
    //Vamos a obtenerlo por medio del item - IdItem
    public Item get(Item item);
    
    //Aqui eliminamos los items por medio del id
    public void delete (Item item);
    
    public void save (Item item);
    
    public void actualiza(Item item);
    
    public void facturar();
}
