/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package db_supermercado1;

import db_supermercado1.dao.EmpleadoDAO;
import db_supermercado1.dao.InventarioDAO;


/**
 *
 * @author luisd
 */
public class app_Supermercado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //GestionInventario gestion = new GestionInventario();
        //gestion.iniciar();
        
        //EmpleadoDAO menu = new EmpleadoDAO();
        //menu.iniciar();
        
        InventarioDAO menu = new InventarioDAO();
        menu.iniciar();
    }

}
