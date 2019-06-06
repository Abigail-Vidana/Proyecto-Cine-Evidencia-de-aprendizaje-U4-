
import javax.swing.JOptionPane;

public class Sala {
    int SILLAS_POR_FILA = 10; 
    int FILAS = 10; 
    int [][] asientos = new int[FILAS][SILLAS_POR_FILA]; //Array para el numero de asientos en cada sala de 10 por 10
    
    public String getEstadoAsientos(){ // metodo para consultar el estado de los asientos (disponible u ocupado)
        String result = "";
        int count = 1;
        for(int i=0; i<10;i++){
            for(int j=0; j<10; j++){ // recorre el arreglo bidimensional asientos
               result += String.format("%03d[%1d]%4s",count,asientos[i][j],""); //imprime el numero de asiento y su estado (0 o 1)
               count++;
            }
            result += "\n";
        }
        result += String.format("%n%n%n[0] = disponible %n [1] = ocupado%n%n");
        return result;
    }

    public void reservar(String pelicula,int asiento, int sala) { //metodo para reservar un asiento en cualquier sala
                                                                  //recibe el nombre de la pelicula, el asiento que se desea reservar
                                                                  //y el numero de sala 
       
        int fila =  asiento/SILLAS_POR_FILA; //calcular el numero de fila (fila en en arreglo)
        
        if(asiento%SILLAS_POR_FILA==0){ //los asientos 10, 20, 30, 40... pertenecen al numero de fila menos 1
            --fila;
        } 
        
        int silla = asiento - fila*SILLAS_POR_FILA - 1; //calcular el numero de silla (columna en el arreglo)
        
        if (asientos[fila][silla] == 0){ //verificar que el asiento esta disponible
            asientos[fila][silla] = 1;
            int op = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar esta reservación?", "RESERVACIÓN", JOptionPane.YES_NO_OPTION);
            if(op==0)
            JOptionPane.showMessageDialog(null, String.format("Asiento reservado con éxito!%n%n Película: %s%n Sala : %d%n Asiento :%d%n",
                    pelicula,sala,asiento), "RESERVACIÓN EXITOSA!", 0); //mensaje de reservacion exitosa
        }else{
            JOptionPane.showMessageDialog(null, "El asiento esta ocupado"); //si el asiento esta ocupado, lanza este mensaje
        }
    }

    public void cancelar(int asiento, int sala) { //metodo para cancelar una reservacion de asiento
                                                  // recibe el numero de asiento y el numero de sala
                                                  
       int fila =  asiento/SILLAS_POR_FILA; //calcula el numero de fila (fila en el arreglo)
        
        if(asiento%SILLAS_POR_FILA==0){ //los asientos 10, 20, 30, 40... pertenecen al numero de fila menos 1
            --fila;
        } 
       int silla = asiento - fila*SILLAS_POR_FILA - 1; //calcular el numero de silla (columna en el arreglo)
       
       if (asientos[fila][silla] == 1){ //verificar que el asiento esta reservado
            asientos[fila][silla] = 0;
            int op = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar esta cancelación?", "CANCELACIÓN", JOptionPane.YES_NO_OPTION);
            if(op==0)
            JOptionPane.showMessageDialog(null, String.format("Asiento cancelado con éxito! %n Sala : %d%n Asiento :%d%n",
                    sala,asiento), "CANCELACIÓN EXITOSA!", 0); // mensaje de cancelacion exitosa
        }else{
            JOptionPane.showMessageDialog(null, "No se encuentra reservado"); //si el asiento no estaba reservado no se puede cancelar
        }
    }
}