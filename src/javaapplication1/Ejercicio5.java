/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String[] nombre={"BIANCA", "DANIEL", "ANDREA", "ALEJANDRA", "DUNIA"};
        String[] apellido={"BONILLA", "MEZA", "DISCUA", "DELATTIBODIER", "CABRERA"};
        String[] carrera={"INDUSTRIAL", "COMPUTACION", "ELECTRONICA", "INDUSTRIAL", "COMPUTACION"};
        String[] lugarTrabajo={"DIUNSA", "ENEE", "TECHNOS", "EMSULA", "TIGO"};
        
        System.out.println("NOMBRE      APELLIDO        CARRERA          LUGAR DE TRABAJO");
        for(int i=0;i<5;i++){
            System.out.println(nombre[i] + "         " + apellido[i] + "        " + carrera[i] + "        " + lugarTrabajo[i]);
        }
    }
}