
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        if (this.edad < otraPersona.getEdad()) {
            return -1;
        } else if (this.edad > otraPersona.getEdad()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre);
    }

    @Override
    public String toString() {
        return "{nombre='" + nombre + "', edad=" + edad + '}';
    }
}
