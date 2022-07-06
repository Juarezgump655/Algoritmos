/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.Scanner; 
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 *
 * @author Angel
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
          String OP2, OP3 =null, OP5 = null, OP6 = null, OP7 = null, OP8 = null, OP9 = null, OP10 = null, OP11 = null;
           int eda = 0, OP1= 0, OP4=0 ;
        ObjectOutputStream datosAlumnos = null;
        ObjectInputStream LecturaDatos = null;
        Scanner leer1= new Scanner (System.in);
        Scanner leer2= new Scanner (System.in);
        Scanner leer3= new Scanner (System.in);
        Scanner leer4= new Scanner (System.in);
        Scanner leer5= new Scanner (System.in);
        Scanner leer6= new Scanner (System.in);
        Scanner leer7= new Scanner (System.in);                      //Se le indica el objeto que va a leer
        Scanner leer8= new Scanner (System.in);
        Scanner leer9= new Scanner (System.in);
        Scanner leer10= new Scanner (System.in);
       
       
     try {
         if (Files.exists(Paths.get("datos_estudiantes.prj"))){
             datosAlumnos = new AppendingObjectOutputStream (Files.newOutputStream(Paths.get("datos_estudiantes.prj"),StandardOpenOption.APPEND));
         }
         else {
             datosAlumnos = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos_estudiantes.prj")));
             
         }
         
  
        
            OP3 = null;
        do {
            OP1 = 0;
       System.out.println(("\n" + "\n" + "--------------------------------------"));
       System.out.println((              "     Analisis de Datos de Estudiantes"));
       System.out.println((              "--------------------------------------")); 
       System.out.println(("\n" + "\n" + "1. Ingreso de Datos")); 
       System.out.println(("2. Analisis de datos")); 
       System.out.println(("3. Salir" + "\n" ));
       System.out.print(("Ingrese una opcion:" ));
       OP1=leer1.nextInt();
      
       
       
       if (3 == OP1) {
      System.out.println();    
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +"----------------------------"); 
      System.out.println("    FUE UN GUSTO ATENDERLE");             //Condicion se ejecuta cuando el usuario digita el numero 2 para salilr de programa
      System.out.println("----------------------------" +"\n"); 
      System.exit(0);     
        }
      do{
       Alumno Alumno = new Alumno();  
      if (1 == OP1){
       System.out.println(("\n" + "\n" + "\n" + "\n" + "--------------------------------------"));
       System.out.println((              "    Analisis de Datos de Estudiantes"));
       System.out.println((              "            Ingreso de datos"       ));
       System.out.println((              "--------------------------------------")); 
       System.out.println(("\n" + "\n" + "1. Ingrese los datos del estudiante: Los datos deben ser ingresados separados por coma" + "\n")); 
       OP2=leer2.nextLine();
       
       String [] listaPalabras = OP2.split("\\,");
       
       Alumno.setNombres(listaPalabras[1]);
       Alumno.setApellidos(listaPalabras[3]);
       Alumno.setCarne(listaPalabras[5]);
       Alumno.setEdad(listaPalabras[7]);
       Alumno.setSexo(listaPalabras[9]);
       Alumno.setCarrera(listaPalabras[11]);
       Alumno.setTotalC(listaPalabras[13]);
       Alumno.setCCA(listaPalabras[15]);
       
       datosAlumnos.writeObject(Alumno);
       
       System.out.println(("\n" + "\n" + "\n" + "\n" + "--------------------------------------"));
       System.out.println((              "    Analisis de Datos de Estudiantes"));
       System.out.println((              "            Ingreso de datos"       ));
       System.out.println((              "--------------------------------------")); 
       System.out.println((OP2)); 
       System.out.println(("\n" + "\n"+ "\"¿Desea ingresar más datos? (s/n):" )); 
       OP3=leer3.nextLine();
      
  }
    
    } while ("s".equals(OP3));
          
      datosAlumnos.close();
      
      
       if (2 == OP1) {
         do{
              if ("".equals(OP5)  )          {

                             OP5= null;
                                              
                                  } if (" ".equals(OP6) )          {

                             OP6=null;
                                              
                                  } if (" ".equals(OP9) )          {

                             OP8= null;
                                              
                                  } if (" ".equals(OP9))          {                     //Reiniciamos las variables ya que si estas no se reinician se puede crear un ciclo infinito

                             OP9=null;
                                              
                                  } if ( " ".equals(OP11) )          {

                            } OP11=null;              
         try {
     LecturaDatos = new ObjectInputStream(Files.newInputStream(Paths.get("datos_estudiantes.prj")));     
         System.out.println(("\n" + "\n" + "\n" + "\n" + "--------------------------------------"));
       System.out.println((              "    Analisis de Datos de Estudiantes"));
       System.out.println((              "            Analisis de datos"       ));
       System.out.println((              "--------------------------------------")); 
       System.out.println(("\n" + "\n" + "1. Datos personales de estudiantes ")); 
       System.out.println(("2. Cantidad de estudiantes masculinos y femeninos")); 
       System.out.println(("3. Mejor promedio de cada carrera" ));
       System.out.println(("4. Datos academicos de estudiantes" ));
       System.out.println(("5. Constancia de cursos aprobados" ));
       System.out.println(("6. Salir" ));
       System.out.print(("Ingrese una opcion:" ));
       OP4=leer4.nextInt();
        
       switch (OP4) {
                                           case 1: {
                                                try {
                                                     System.out.println(("\n" + "\n" + "\n" + "\n" + 
                                                                                       "-----------------------------------------------"));
                                                     System.out.println((              "          Analisis de Datos de Estudiantes"));
                                                     System.out.println((              "                  Analisis de datos"       ));
                                                     System.out.println((              "          Datos personales de estudiante"       ));
                                                     System.out.println((              "------------------------------------------------")); 
                                                     System.out.printf(( "   Nombres   " + "      Apellidos   " + "     Edad   " + "     Sexo   ")); 
                                                     while(true){
                                                     Alumno Alumno = (Alumno) LecturaDatos.readObject();
                                                     System.out.printf("%s %20s %20s\n" , Alumno.getNombres(), Alumno.getApellidos(), Alumno.getEdad(),Alumno.getSexo ());

                                                           }          
                                                                 } 
                                                    catch(EOFException endOfFileException){
                                                     System.out.printf("%s%n", "No hay más registros" );
                                                          } 
                                                      catch(ClassNotFoundException classNOtFoundException){
                                                          System.err.println("Tipo de objeto inválido.");
                                                            }
                                                        catch (IOException ioException){
                                                           System.err.println("Error al leer archivo. Terminando. Error: " + ioException.getMessage());     
                                                                }finally {

                                                              LecturaDatos.close();
                                                              }   
                                                                                                        
                                                     System.out.print(("\n"+"Presione Enter para regresar al menu de Analisis de Datos.")); 
                                                      OP5=leer5.nextLine();                                                          
                                                     
                                                           
                                                                     break;
                                                          }
                                                           case 2: {
                                                              System.out.println(("\n" + "\n" + "\n" + "\n" + 
                                                                                       "-----------------------------------------------"));
                                                     System.out.println((              "          Analisis de Datos de Estudiantes"));
                                                     System.out.println((              "                  Analisis de datos"       ));
                                                     System.out.println((              "  Cantidad de estudiantes masculinos y femeninos"       ));
                                                     System.out.println((              "------------------------------------------------")); 
                                                     System.out.println(("\n" + "\n" + "1. Datos personales de estudiantes ")); 
                                                     System.out.println(("Presione Enter para regresar al menu de Analisis de Datos.")); 
                                                     OP6=leer6.nextLine();System.out.println(("Presione Enter para regresar al menu de Analisis de Datos.")); 
                                                                  break;
                                                           }
                                                           case 3: {
                                                               System.out.println(("\n" + "\n" + "\n" + "\n" + 
                                                                                       "-----------------------------------------------"));
                                                     System.out.println((              "          Analisis de Datos de Estudiantes"));
                                                     System.out.println((              "                  Analisis de datos"       ));
                                                     System.out.println((              "            Mejor promedio de la carrera"       ));
                                                     System.out.println((              "------------------------------------------------")); 
                                                     System.out.println(("Presione Enter para regresar al menu de Analisis de Datos.")); 
                                                     System.out.println(("")); 
                                                     OP7=leer7.nextLine();
                                                                  break;
                                                           }
                                                           case 4: {
                                                                System.out.println(("\n" + "\n" + "\n" + "\n" + 
                                                                                       "-----------------------------------------------"));
                                                     System.out.println((              "          Analisis de Datos de Estudiantes"));
                                                     System.out.println((              "                  Analisis de datos"       ));
                                                     System.out.println((              "            Datos Academicos Estudiantes"       ));
                                                     System.out.println((              "------------------------------------------------")); 
                                                     System.out.println(("Presione Enter para regresar al menu de Analisis de Datos.")); 
                                                     OP8=leer8.nextLine();
                                                                  break;
                                                           }
                                                           case 5: {
                                                                 System.out.println(("\n" + "\n" + "\n" + "\n" + 
                                                                                       "-----------------------------------------------"));
                                                     System.out.println((              "          Analisis de Datos de Estudiantes"));
                                                     System.out.println((              "                  Analisis de datos"       ));
                                                     System.out.println((              "           Contancia de cursos aprobados "       ));
                                                     System.out.println((              "------------------------------------------------")); 
                                                     System.out.print(("\n" + "\n" + "Ingrese numero de carne de estudiante:")); 
                                                     OP9=leer9.nextLine();
                                                                  break;
                                                           }
                                                           
                                                           
                                                           
                      }
       
      
    while(true){
        Alumno Alumno = (Alumno) LecturaDatos.readObject();
                                                    
                                                           }          
                                                                 } 
                                                    catch(EOFException endOfFileException){
                                                     System.out.printf("%s%n", "No hay más registros" );
                                                          } 
                                                      catch(ClassNotFoundException classNOtFoundException){
                                                          System.err.println("Tipo de objeto inválido.");
                                                            }
                                                        catch (IOException ioException){
                                                           System.err.println("Error al leer archivo. Terminando. Error: " + ioException.getMessage());     
                                                                }finally {

                                                              LecturaDatos.close();
                                                              }   
                                                                                                        
                                                     System.out.print(("\n"+"Presione Enter para regresar al menu de Analisis de Datos.")); 
                                                      OP5=leer5.nextLine();                                                          
                                                     
        }while (" ".equals(OP5) || "".equals(OP5) || "".equals(OP6) || "".equals(OP7) || "".equals(OP8) || "".equals(OP9) || "".equals(OP10)); 
         
       }
    }while ("n".equals(OP3) );      
    
        
         
                } catch (IOException ioException){
                   System.err.println("Error al esccribir en el archivo" + ioException.toString()); 
             }
       
         
    
      }
     }

        
    
    

