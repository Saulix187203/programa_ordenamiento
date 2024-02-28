import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LeerDoc {
    private BufferedReader lector;
    // linea representa una fila del archivo csv
    private String linea;
    // dato es un arreglo que contentrá los datos de cada fila del CSV
    // cada ciclo while, dato se ira actualizando
    private String dato[];
    ArrayList<String> Nombres = new ArrayList<String>();
    ArrayList<Integer> Agrados = new ArrayList<Integer>();
    ArrayList<Integer> Aedad = new ArrayList<Integer>();
    ArrayList<Integer> Dnotas = new ArrayList<Integer>();
    ArrayList<Float> Apeso = new ArrayList<Float>();
    ArrayList<Float> Aestatura = new ArrayList<Float>();
    public void LeerCsv(String CSV) { //"estudiantes.csv"
        // aqui la funcion se encargara leer cada fila
        try{
            lector = new BufferedReader (new FileReader(CSV));
            // lee la primera linea
            lector.readLine();
            // el ciclo se repetira cuando as lineas no esten vacias
            while ((linea = lector.readLine()) != null) {
                // la matriz dato separa sus elementos en base a la coma
                dato = linea.split(",");
                //MostrarLineasCsv();
                //System.out.println("");
                SetNombres();
                SetGrados();
                SetEdad();
                SetNotas();
                SetPesos();
                SetEstatura();
                }
                lector.close();
                linea = null;
                dato = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void MostrarLineasCsv(){
        //dato es una matriz de tamaño 6
        for (int i = 0; i< dato.length; i++){
            //se recorre el ciclo para mostrar cada 
            System.out.println(dato[i]);
        }
    }
    
    private void SetGrados(){
        int dato5 = Integer.parseInt(dato[5]);
        if (dato5>=1 && dato5<=10){
            Agrados.add(dato5);
        }
        else{
            Agrados.add(0);
        }
    }
    public ArrayList GetGrados(){
        return Agrados;
    }
    
    private void SetEdad(){
        int dato1 = Integer.parseInt(dato[1]);
        if (dato1>=1 && dato1<=30){
            Aedad.add(dato1);
        }
        else{
            Aedad.add(-1);
        }
    }
    public ArrayList GetEdad(){
        return Aedad;
    }
    
    private void SetNotas(){
        int dato4 = Integer.parseInt(dato[4]);
        if (dato4>=0 && dato4<=100){
            Dnotas.add(dato4);
        }
        else{
            Dnotas.add(-1);
        }
        
    }
    public ArrayList GetNotas(){
        return Dnotas;
    }
    
    private void SetPesos(){ 
        try {
            DecimalFormat deci = new DecimalFormat("#.##");
            float dato2 = Float.parseFloat(dato[2]);
            deci.format(dato2);
            Apeso.add(dato2);
        } catch (Exception e) {
            Apeso.add(-0.0f);
        }
        
    }
    public ArrayList GetPesos(){
        return Apeso;
    }
    
    private void SetEstatura(){
        try {
            DecimalFormat deci = new DecimalFormat("#.##");
            float dato3 = Float.parseFloat(dato[3]);
            deci.format(dato3);
            Aestatura.add(dato3);
        } catch (Exception e) {
            Aestatura.add(-0.0f);
        }
    }
    public ArrayList GetEstatura(){
        return Aestatura;
    }

    private void SetNombres(){
        Nombres.add(dato[0]);
    }
    public ArrayList GetNombres(){
        return Nombres;
    }
}

