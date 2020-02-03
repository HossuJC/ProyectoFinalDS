/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author cajas
 */
public class conexion {
    private  static Connection conn;
    private static final String driver="com.mysql.cj.jdbc.Driver"; 
    private static final String user="root";
    private static final String password="root";
    private static final String url="jdbc:mysql://localhost:3306/proyecto?serverTimezone=EST5EDT";

    public  static Connection getConexion() {
        conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            if(conn!=null){
                System.out.println("Coneccion establecida");
            }
            
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("error "+e);
            System.out.println("SQLException: " + e.getMessage());
            
        }
        return conn;
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void Desconectar(){
        conn= null;
        if(conn==null){
            System.out.println("conecxion termindad");
        }
    }
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try {
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);
            
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return datos;
    }
    public static ArrayList<String> llenarCBProducto(){
        Connection cn=getConexion();
        Statement st=null;
        ResultSet datos=null;
        ArrayList<String> lista=new ArrayList<String>();
        String q= "Select* From Producto";
        try {
            st=cn.createStatement();
            datos=st.executeQuery(q);
            
            
        } catch (Exception e) {
        }
        try {
            while(datos.next()){
                lista.add(datos.getString( "codigo"));
            }
        } catch (Exception e) {
        }
        
        
        return lista;
        
        
    }
    public static ArrayList<String> llenarCBProveedor(){
        Connection cn=getConexion();
        Statement st=null;
        ResultSet datos=null;
        ArrayList<String> lista=new ArrayList<String>();
        String q= "Select* From Proveedor";
        try {
            st=cn.createStatement();
            datos=st.executeQuery(q);
            
            
        } catch (Exception e) {
        }
        try {
            while(datos.next()){
                lista.add(datos.getString( "cedulaRUC"));
            }
        } catch (Exception e) {
        }
        
        
        return lista;
        
        
    }
    public static ArrayList<String> llenarCBcliente(){
        Connection cn=getConexion();
        Statement st=null;
        ResultSet datos=null;
        ArrayList<String> lista=new ArrayList<String>();
        String q= "Select* From Cliente";
        try {
            st=cn.createStatement();
            datos=st.executeQuery(q);
            
            
        } catch (Exception e) {
        }
        try {
            while(datos.next()){
                lista.add(datos.getString( "cedulaRUC"));
            }
        } catch (Exception e) {
        }
        
        
        return lista;
        
        
    }
    public static ArrayList<String> llenarCBEmpleado(){
        Connection cn=getConexion();
        Statement st=null;
        ResultSet datos=null;
        ArrayList<String> lista=new ArrayList<String>();
        String q= "Select* From Empleado";
        try {
            st=cn.createStatement();
            datos=st.executeQuery(q);
            
            
        } catch (Exception e) {
        }
        try {
            while(datos.next()){
                lista.add(datos.getString( "idEmpleado"));
            }
        } catch (Exception e) {
        }
        
        
        return lista;
        
        
    }
    /**
    *
    * @author cajas
    * Metodo que busca la utima compra registrada y obtiene el id
    */
    public static String ObtenerUltimaCompra(){
        Connection cn=getConexion();
        Statement st=null;
        ResultSet datos=null;
        String dato="";
        String q= "SELECT idCompra \n" +
                    "FROM compra \n" +
                    "order by idCompra desc \n" +
                    "limit 1 ";
        try {
            st=cn.createStatement();
            datos=st.executeQuery(q);
             
            
        } catch (Exception e) {
            
        }
        try {
            while(datos.next()){
                
               dato=datos.getString("idCompra");
               
            }
            
            
            
        } catch (Exception e) {
            System.err.println("No se cargo el dato");
        }
        
        
        return dato;
    }
}