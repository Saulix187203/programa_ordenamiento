import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        System.out.println("Universidad da Vinci de Guatemala\r\n" + //
                        "Estructuras de datos\r\n");
        LeerDoc doc = new LeerDoc();
        doc.LeerCsv("C:\\Users\\HP\\Documents\\Programa_ordenar\\src\\estudiantes.csv");
        
        ArrayList notas = doc.GetNotas();
        System.out.println("Notas"+notas);

        Bubblesort ordenar_notas = new Bubblesort();
        ordenar_notas.NotaDescendente(notas);
        //los nombres serviran como referencia
        ArrayList nombres = doc.GetNombres();
        System.out.println("Estudiantes"+nombres);
        
        ArrayList grados = doc.GetGrados();
        System.out.println("Grados"+grados);

        ArrayList edad = doc.GetEdad();
        System.out.println("Edad"+edad);

        

        ArrayList pesos = doc.GetPesos();
        System.out.println("Pesos"+pesos);

        ArrayList statura = doc.GetEstatura();
        System.out.println("Estatura"+statura);
    }
    
}
