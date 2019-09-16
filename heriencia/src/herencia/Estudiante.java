package herencia;

import javax.swing.JOptionPane;
public class Estudiante extends Persona {
    private int carnet;
    private float promedioNotas;
    private int numeroMaterias;
    
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
    }


    public int getCarnet() {
        return carnet;
    }


    public int getNumeroMaterias() {
        return numeroMaterias;
    }


    public float getPromedioNotas() {
        return promedioNotas;
    }


    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }


    public void setPromedioNotas(float promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    
    public float calcularPromedio(float x, int y){
       
        JOptionPane.showMessageDialog(null, "Procesando estudiante");
        promedioNotas=x/y;
        return promedioNotas;
    }
    public float leerNotasEstudiante(int x){
        float acumulador=0;
        
        for (int i = 0; i < x; i++) {
           acumulador= acumulador+Float.parseFloat(JOptionPane.showInputDialog("Digite la nota de la materia "+(i+1)+": "));
        }
        
        return acumulador;
    }
    public Estudiante ingresarDatosEstudiante(){
        
        Estudiante est = new Estudiante();
        String nombre= (JOptionPane.showInputDialog("Digite el nombre "));
        String apellido= (JOptionPane.showInputDialog("Digite el apellido "));
        int edad=(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad ")));
        double peso=(Double.parseDouble(JOptionPane.showInputDialog("Digite el peso")));
        carnet=Integer.parseInt(JOptionPane.showInputDialog("Digita el carnet del estudiante "));
        int cantMaterias=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de materias: "));
        est.setNumeroMaterias(cantMaterias);
        float acumulador=leerNotasEstudiante(cantMaterias);
        float promedio = calcularPromedio(acumulador, cantMaterias);
        
        est.setNombre(nombre);
        est.setApellido(apellido);
        est.setCarnet(carnet);
        est.setEdad(edad);
        est.setPeso(peso);
        est.setPromedioNotas(promedio);
        
        
       
        
        return(est);
    }
    public void imprimirReporteNotasEstudiante(){
        Estudiante objeto = new Estudiante();
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "Carnet: "+carnet+"\n"+"Numero de materias: "+numeroMaterias+"\n"+"Promedio: "+promedioNotas+"\n");
    }
}
