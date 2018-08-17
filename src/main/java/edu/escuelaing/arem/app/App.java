package edu.escuelaing.arem.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * Jonathan Prieto.
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String archivo = "C:\\Users\\jonnh\\Documents\\NetBeansProjects\\introductionMvnAndGit\\numbers.txt"; //Ruta del archivo a leer.
        LinkedList numberList = new LinkedList();
        Estadistico statistical;
        String line;
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while((line=br.readLine())!=null){
            numberList.addNode(Integer.parseInt(line)); //Agregar nodos a la LinkedList.
        }
        br.close();
        statistical = new Estadistico(numberList);
        System.out.println("Mean = "+statistical.mean()+"\nStandard deviation = "+statistical.standardDeviation());
    }
}
