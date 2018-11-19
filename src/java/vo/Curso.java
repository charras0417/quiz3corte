/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author LabingI5
 */
public class Curso {
    
private int codigo;
private String nombre;
private int codigoProfesor;

    public Curso(int codigo, String nombre, int codigoProfesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoProfesor = codigoProfesor;
    }

    public Curso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }


}
