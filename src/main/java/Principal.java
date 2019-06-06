
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int op; 
        Cine cine = new Cine(); //objeto de la clase cine
        
            do{
                //menu principal con 4 opciones: Reservar, Cancelar, Consultar sala y Salir
            String[] options = {"Reservar", "Cancelar", "Consultar sala","Salir"};
                op = JOptionPane.showOptionDialog(null, "---Bienvenido al menú principal---", 
                    "Cinemex - Sucursal Homero", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch(op){
                case 0:
                    cine.reservarAsiento(); //Si elige Reservar, realiza este metodo de la clase cine
                    break;
                case 1:
                    cine.cacelarReservacon(); //Si elige Cancelar, realiza este metodo de la clase cine
                    break;
                case 2:
                    cine.consultarSala(); //Si elige Consultar sala, realiza este metodo de la clase cine
                    break;
                case 3: //Si elige Salir, lanza un mensaje y termina el programa
                    JOptionPane.showMessageDialog(null, "Hasta la próxima!");
                    break;
            }    
        }while(op != 3); //Ofrecer el menu principal, mientras no se seleccione Salir
    }
}