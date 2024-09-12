/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author isaac
 */
public class Asignatura {

    //Atributos
    private String nombre;
    private String estado; //Solo tiene 3 tipos->  A:Aprobada, D:Disponible, B:Bloqueda
    private List<Asignatura> requisitos = new ArrayList<>();
    private javax.swing.JPanel panel;
    
    //Constructor
    public Asignatura(){}
    public Asignatura(String name, String est, javax.swing.JPanel pan){
        this.nombre = name;
        this.estado = est;
        this.panel = pan;
    }
    
    //Metodos
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public List<Asignatura> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Asignatura> requisitos) {
        this.requisitos = requisitos;
    }
    
    public void aprobarAsignatura(){
        if(this.estado.equals("D")){
            this.estado = "A";
        }
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", estado=" + estado + ", panel=" + panel + '}';
    }
    
}
