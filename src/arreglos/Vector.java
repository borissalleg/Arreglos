/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;



/**
 *
 * @author Forsaken
 */
public class Vector extends Persona
{
    private Persona [] v;
    private int i;

    public Vector(int t)
    {
      this.i=-1;
      v = new Persona[t];
    }

   

    public boolean vectorlleno()
    {
      if (this.getI() > t )
         return true;
         else
         return false;

    }
    
    public boolean vectorvacio()
    {
      if (this.getI() == -1)
         return true;
         else
         return false;

    }
 /**
  * @return metodo para insertar solo un registro de persona dentro del vector 
 */
    public void insertar(Persona p)
    {
      if (!(vectorlleno()))
      {
            setI(getI() + 1);
            v[i]=p;
         // v[i].edad = e;
            
      }

    } 
    /**
     * @return metodo para retornar en pantalla los elementos del vector
     */
    public void imprimirvector()
    {
       int t= this.getI();
        int f=0;
        while (f <= t)
        {
            System.out.println(this.v[f].getNombre());
            System.out.println(this.v[f].getEdad());
            f++;
        }     
    }        
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the v
     */
    public Persona[] getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Persona[] v) {
        this.v = v;
    }
    
    public void SetPersona(Persona p)
    {
        this.v[i]=p;
    }       

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

}