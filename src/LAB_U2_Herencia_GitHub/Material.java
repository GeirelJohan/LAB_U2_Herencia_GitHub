/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author fiore
 */

public abstract class  Material {
    
   private final int id;
    private String titulo;
    private boolean disponible;

    private static int contadorMateriales = 0;

    public Material(int id, String titulo) {

        this.id = id;
        this.titulo = titulo;
        this.disponible = true;

        contadorMateriales++;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null && ! titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
        else {
            System.out.println("El titulo es invalido ");
        }

    }

    public boolean isDisponible() {
        return disponible;
    }

    public static int getContadorMateriales() {
        return contadorMateriales;
    }

    public void prestar() {
        if (disponible) {
            System.out.println("El material ha sido prestado ");
        } else {
            disponible = false;
            System.out.println(" El material no esta disponible ");
        }
    }

    public void devolver() {

        if (disponible) {

            System.out.println(" El material ya se encuentra disponible ");

        } else {

            disponible = true;

            System.out.println(" Material devuelto exitosamente ");
        }
    }

    public abstract void mostrarInfo();

}
