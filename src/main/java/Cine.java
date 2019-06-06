
import javax.swing.JOptionPane;

public class Cine {
                             //OBJETOS para utilizar los metodos DE LA CLASE SALA para:
    Sala sala1 = new Sala(); // sala 1
    Sala sala2 = new Sala(); // sala 2
    Sala sala3 = new Sala(); // sala 3
    
    public void reservarAsiento(){ // En el menu principal, cuando se elige RESERVAR
        int op;
        String pelicula;
        int sala;
        int asiento;
        
        do{
            // ofrece las peliculas disponibles para reservar
           String[] options = {"Toy Story 4", "Anabelle 3", "X- MEN","Salir"};
                op = JOptionPane.showOptionDialog(null, "---Película---", 
                    "Reservar asientos", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                  
            switch(op){
                case 0: // en caso de elegir la pelicula TOY STORY 4
                    sala =1;
                    pelicula= "Toy Story 4";
                    asiento =Integer.parseInt(JOptionPane.showInputDialog(null, "Número de asiento: ",
                            "Sala 1", JOptionPane.QUESTION_MESSAGE)); // preguntar el numero de asiento
                    sala1.reservar(pelicula,asiento, sala); // llamar al metodo reservar de la clase sala y enviar 
                                                            // el nombre de la pelicula, numero de asiento y numero de sala
                     break;
                case 1: // en caso de elegir la pelicula ANABELLE 3
                    sala =2; 
                    pelicula= "Anabelle 3";
                     asiento =Integer.parseInt(JOptionPane.showInputDialog(null, "Número de asiento: ",
                            "Sala 2", JOptionPane.QUESTION_MESSAGE)); // preguntar el numero de asiento
                    sala2.reservar(pelicula,asiento,sala); // llamar al metodo reservar de la clase sala y enviar 
                                                           // el nombre de la pelicula, numero de asiento y numero de sala
                    break;
                case 2: // en caso de elegir la pelicula X- MEN
                    sala =3;
                    pelicula = "X- MEN"; 
                    asiento =Integer.parseInt(JOptionPane.showInputDialog(null, "Número de asiento: ",
                            "Sala 3", JOptionPane.QUESTION_MESSAGE)); // preguntar el numero de asiento
                    sala3.reservar(pelicula,asiento,sala); // llamar al metodo reservar de la clase sala y enviar 
                                                           // el nombre de la pelicula, numero de asiento y numero de sala
                    break;
                case 3: // en caso de elegir SALIR, vuelve al menu principal
                    break;
            }     
        }while(op != 3); // ofrecer reservar asientos, hasta que se elija salir
    }
    
      void cacelarReservacon() { // en el menu principal, cuando se elige CANCELAR
         int op;
         int sala;
         int asiento;
        
        do{
            //ofrece las peliculas disponibles, para cancelar reservacion
           String[] options = {"Toy Story 4", "Anabelle 3", "X- MEN","Salir"};
                op = JOptionPane.showOptionDialog(null, "---Película---", 
                    "Cancelar reservación", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch(op){
                case 0: // en caso de elegir la pelicula TOY STORY 4 
                    sala = 1; 
                    asiento =Integer.parseInt(JOptionPane.showInputDialog(null, "Número de asiento: ",
                            "Sala 1", JOptionPane.QUESTION_MESSAGE)); // preguntar el numero de asiento que se habia reservado
                    sala1.cancelar(asiento, sala); //llamar el metodo cancelar de la clase sala y enviar
                                                   // el numero de asiento y el numero de sala
                    break;
                case 1: // en caso de elegir la pelicula ANABELLE 3
                    sala = 2; 
                    asiento =Integer.parseInt(JOptionPane.showInputDialog(null, "Número de asiento: ",
                            "Sala 2", JOptionPane.QUESTION_MESSAGE)); // preguntar el numero de asiento que se habia reservado
                    sala2.cancelar(asiento, sala); //llamar el metodo cancelar de la clase sala y enviar
                                                   // el numero de asiento y el numero de sala
                    break;
                case 2: // en caso de elegir la pelicula X- MEN
                    sala =3;
                    asiento =Integer.parseInt(JOptionPane.showInputDialog(null, "Número de asiento: ",
                            "Sala 3", JOptionPane.QUESTION_MESSAGE)); // preguntar el numero de asiento que se habia reservado
                     sala3.cancelar(asiento, sala); //llamar el metodo cancelar de la clase sala y enviar
                                                   // el numero de asiento y el numero de sala
                    break;
                case 3: // en caso de elegir SALIR, vuelve al menu principal
                    break;
            }     
        }while(op != 3); // ofrecer cancelar reservacion, hasta que se elija salir
    }
    
    public void consultarSala(){ //en el menu principal, cuando se elige CONSULTAR SALA
        int op;
        
        do{
            // ofrece las peliculas disponibles, para consultar
           String[] options = {"Toy Story 4", "Anabelle 3", "X- MEN","Salir"};
                op = JOptionPane.showOptionDialog(null, "---Película---", 
                    "Consultar sala", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch(op){
                case 0: // en caso de elegir la pelicula TOY STORY 4
                    JOptionPane.showMessageDialog(null, sala1.getEstadoAsientos(), "Sala 1", 0); //llamar al metodo getEstadoAsiento de la clase Sala
                    break;
                case 1: // en caso de elegir la pelicula ANABELLE 3
                    JOptionPane.showMessageDialog(null, sala2.getEstadoAsientos(), "Sala 2", 0); //llamar al metodo getEstadoAsiento de la clase Sala
                    break;
                case 2: // en caso de elegir la pelicula X- MEN
                    JOptionPane.showMessageDialog(null, sala3.getEstadoAsientos(), "Sala 3", 0); //llamar al metodo getEstadoAsiento de la clase Sala
                    break;
                case 3: // en caso de elegir SALIR, vuelve al menu principal
                    break;
            }     
        }while(op != 3); // ofrecer consultar sala, hasta que se elija salir
    }
}