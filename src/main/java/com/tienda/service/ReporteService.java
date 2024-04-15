/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author maria
 */
public interface ReporteService {
    public ResponseEntity<Resource>
            generarReporte(
            String reporte, //nombre del archivo llamado .jasper
                    Map <String, Object> parametros, //llamar  a los parametros que tenemos en el reporte
                    String tipo) throws IOException; //cuales van a ser las opciones de reportes apara mis reportes (pdf, excel, etc)
}
