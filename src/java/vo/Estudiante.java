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
public class Estudiante {

private int codigo;
private String nombre;
private int codigoEscuela;
private String beca;

    public Estudiante(int codigo, String nombre, int codigoEscuela, String beca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoEscuela = codigoEscuela;
        this.beca = beca;
    }

    public Estudiante() {
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

    public int getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(int codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }



}
