package principal;


import javax.swing.JOptionPane;

public class Seguridad {
    Login login = new Login();
    String res;
   
    public boolean validarUsuario(String usuarios[],String userId,String nombre,String pwd,int intentos) {
        boolean encontrado = false;
        
        for(int i = 0; i < usuarios.length -1; i++) {
            if ((usuarios[i].equals(userId) && usuarios[i+1].equals(nombre) && usuarios[i+2].equals(pwd))) {
                
                encontrado = true;
                
                intentos = 0;
                Login.setIntentos(intentos);
                
                return true;                                          
            }
        }
        if(encontrado == false) {
            res = "Clave y/o ID erroneos. Van " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res,"Inicio de seccion",JOptionPane.ERROR_MESSAGE);
        }
        if(intentos > 2) {
            JOptionPane.showMessageDialog(null, "3 Intentos fallidos, se cerrara el programa"," Inicio de seccion",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        return false;
    }
    
    public boolean validarSiExiste(String ids[],String userId) {
        
        for (String validar : ids) {
            if (validar.equals(userId)) {
                JOptionPane.showMessageDialog(null, "Ese ID ya se encuentra registrado");
                return true;      
            }           
        }
        return false;
    }
}
