/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Scanner;             //Agregamos la libreria sccaner para poder utilizarla
public class Aplicacion {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    double Total,Precio = 0,P1=0,P2,P3=0,P4=0,P5=0,P6=0,P7=0;
    String Gama = null ,Op3,A1 = null,A2 = null,A3 = null,A4 = null,A5 = null,A6 = null,A7 = null,Op12 = null,Op13=null;
    Total=0;
    int Opcion2 = 0, Opcion = 0, A=0,Op4=0,Op5=0,Op6=0,Op7=0,Op8=0,Op9=0,Op10=0,Op11=0; 
    P2=0.00;             
   //En esta parte se declaran todas las Variables Para Luego utilizarlas
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
    Scanner leer11= new Scanner (System.in);
    Scanner leer12= new Scanner (System.in);
    Scanner leer13= new Scanner (System.in);
    
   do {                                                          //La funcion do while se utiliza para crear un ciclo donde se evalue la condicion de ultimo
    do {                                                          //La funcion do while se utiliza para crear un ciclo donde se evalue la condicion de ultimo
    System.out.print(("\n" + "\n" + "--------------------------") + "\n" + "  CONSESIONARIO DE AUTOS" + "\n" +"     -MENU PRINCIPAL-     " + "\n" + "--------------------------" + "\n\n" +
            "01.- Seleccionar Automovil" + "\n" +"02.- Salir" + "\n" );
           if (Opcion >= 3)                                        //Esta condicion se utiliza cuando se introduce un digito que no esta incluido en el menu
    System.out.println("\n"+ "PORFAVOR, INGRESE UN VALOR CORRECTO");               
    
           System.out.print( "Opcion que desea ejecutar:"  );             //Mostramos el menu Con las opcionse Disponibles 
    
    Opcion=leer1.nextInt();   //La funcion nos sirve para leer lo que el usuario digita y guardarlo en la variable opcion
    if (2 == Opcion) {
     System.out.println();    
     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +"----------------------------"); 
    System.out.println("    FUE UN GUSTO ATENDERLE");             //Condicion se ejecuta cuando el usuario digita el numero 2 para salilr de programa
    System.out.println("----------------------------" +"\n"); 
    System.exit(0);
                }

  
 
                                                             //La funcion do while se utiliza para crear un ciclo donde se evalue la condicion de ultimo
    if (Opcion == 1)  {                                 // Condicion para cuando el usuario digite el numero 1
                do {           //Esta funcion sirve para realizar ciclos con lo cual podremos volver a este menu
   
        System.out.print( "\n" + "\n" +("-------------------------------------------------") + "\n" +
                        "              CONSESIONARIO DE AUTOS" + "\n" +
                        "           -SELECCION GAMA DEL VEHICULO-     " + "\n" +
                        "--------------------------------------------------" + "\n\n" + 
                        "01.- Sedan Economico" + "\n" +"02.- Sedan" + "\n" +
                        "03.- Deportivo"   + "\n" + "04.- Hibrido" + "\n" +"05.- Coupe" + "\n" +
                        "06.- Coupe Deportivo" + "\n" +"07.- Compacto"   + "\n" +
                        "08.- Hatchback"   + "\n" + "09.- Economico version Rally" + "\n" +"10.- Regresar a menu principal");      //Se muestra el menu de gamas
                if (Opcion2 >= 11)
                        System.out.println("\n" + "\n" +"PORFAVOR, INGRESE UN VALOR CORRECTO"+"\n");        
                       
                System.out.print("" + "\n" + "Ingrese gama de vehiculo:" ) ;   
                       
                        Opcion2=leer2.nextInt();
                        

                        switch (Opcion2) {
                           case 1:
                               Gama= "Sedan Economico";
                               Precio= 18940.00;
                               break;
                           case 2:
                               Gama= "Sedan";
                               Precio= 23570.00;
                               break;
                           case 3:
                               Gama = "Deportivo";
                               Precio= 24100.00;
                               break;
                           case 4:
                               Gama = "Hibrido";            
                               Precio= 25100.00;
                               break;
                           case 5:
                               Gama = "Coupe";                                          // Esta funcion nos permite guardar varias condiciones para la misma variable y solo si se cumple la funcion 
                               Precio= 19350.00;                                         //se modificara la variable segun sea el caso.
                               break;
                           case 6:
                               Gama = "Compacto";
                               Precio= 24100.00;
                               break;
                          case 7:
                               Gama  = "Compacto";
                               Precio= 16190.00;
                               break;
                          case 8:
                               Gama = "Hatchback";
                               Precio= 20150.00;
                               break;
                           case 9:
                               Gama = "Economico version Rally";
                               Precio= 24100.00;
                            
                           
                                  }
                  
                     }while (Opcion2 >= 11 || Op4 == 8 );
  
                  }                                                                         // La funcion While es el final del ciclo do por si comple alguna de las funciones regresa a donde empieza el ciclo
     
      
     }while (Opcion2 == 10 || Opcion >= 3 || Opcion <= 0 );
   
    
    if (Opcion2 <=9 )  {
        System.out.println("\n" + "\n" +"-------------------------------------------------");
    System.out.println("            CONCESIONARIO DE AUTOS" );
    System.out.println("             -VENTA DE VEHICULO-");
    System.out.println("--------------------------------------------------");
    System.out.println("\n" + "Gama Seleccinada:" + (Gama));
    System.out.print("\n" + "¿Desea agregar amenidades?"+ ("(s/n):"));
    Op3=leer3.nextLine();
        if ("n".equals(Op3)){
        System.out.println("\n" + "\n" + "-------------------------------------------------");
        System.out.println("            CONCESIONARIO DE AUTOS" );
        System.out.println("             -VENTA DE VEHICULO-");
        System.out.println("--------------------------------------------------");
        System.out.println("\n" + "Gama Seleccinada:" + ( Gama)+ "                  "+"Q"+(Precio));
        System.out.println("\n" + "Amenidades:"+ "Niguna");
        Total=0+(Precio);
        System.out.print(         "                                         ________");
        System.out.println("\n" + "Total"+ "                                    " + (Total));
        System.out.print("\n"+ "Presione Enter para Regresar la menu principal");
         Op13=leer13.nextLine();
        }
       else if ("s".equals(Op3)){
            
                
                 do  {
                 
                     
                      do  {
                          if (Op5 == 5  )          {

                             Op5=0;
                                              
                                  } if (Op7 == 5 )          {

                             Op7=0;
                                              
                                  } if (Op8 == 6  )          {

                             Op8=0;
                                              
                                  } if (Op9 == 16)          {                     //Reiniciamos las variables ya que si estas no se reinician se puede crear un ciclo infinito

                             Op9=0;
                                              
                                  } if ( Op6 == 13 )          {

                             Op6=0;                                              
                                  } if (  Op10 == 12  )          {

                             Op10=0;
                                 } if (  Op11 == 5  )          {

                             Op11=0;
                                 } 
                      do  {
            System.out.print("\n" +"\n" +("-------------------------------------------------") + "\n" +
                        "              CONSESIONARIO DE AUTOS" + "\n" +
                        "             -SELECCION DE AMENIDAES-     " + "\n" +
                        "--------------------------------------------------" + "\n\n" + 
                        "01.- Tipo de transmision" + "\n" +"02.- Color de pintura exterior" + "\n" +
                        "03.- Color de Tapiceria"     +"\n"                  +   "04.- Aros"   + "\n" + "05.- Accesorios exteriores" + "\n" +"06.- Accesorios interiores" + "\n" +
                        "07.- Accesorios electronicos"  +"\n\n"  );
                        if (Op4 >= 9)
                        System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");  // Esta condicion nos permite digitarle al usuario que ingrese un dato correcto al momento de escribir un numero que no sea del rango.
            System.out.print("Ingrese el tipo Amenidad:");
                         Op4=leer4.nextInt();
            System.out.print("Ingrese el tipo Amenidad:");
                          }while(Op4 >= 8 );  
                             switch (Op4) {
                                                        case 1:
                                                       
                                                          do  {
                                                         System.out.print("\n" +("-------------------------------------------------") + "\n" +
                                                                 "              CONSESIONARIO DE AUTOS" + "\n" +
                                                                 "             -SELECCION DE AMENIDADES-     " + "\n" +
                                                                 "               TIPOS DE TRANSMISION              " + "\n" +
                                                                 "--------------------------------------------------" + "\n\n" +
                                                                 "01.- Manual                               Q   0.00" + "\n" +
                                                                 "02.- CVT                                  Q 800.00" + "\n" +
                                                                 "03.- Manual con Turbo                     Q   0.00"   + "\n" +
                                                                 "04.- CVT con turbo                        Q 800.00" +"\n" +
                                                                 "05.- Regresar al menu de amenidades"  + "\n\n" );
                                                          if (Op5 >= 6)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese el tipo de transmision:");
                                                         Op5=leer5.nextInt();
                                                         switch (Op5) {
                                                             case 1:
                                                                 A1= "Manual";
                                                                 P1=0.00;
                                                                 break;
                                                             
                                                             case 2:
                                                                 A1= "CVT";
                                                                 P1= 800.00;
                                                                 break;
                                                             
                                                             case 3:
                                                                 A1 = "Manual Con Turbo";
                                                                 P1= 0.00;
                                                                 break;
                                                             
                                                             case 4:
                                                                 A1 = "CVT con turbo";
                                                                 P1= 800.00;
                                                                 break;
                                                             
                                                         
                                                   

                                                          }  
                                                      }while(Op5 >= 6 );
                                                                      }

                                               switch(Op4) {
                                                   case 2:{
                                                      
                                                        do  { 
                                                       System.out.print(("\n" + "-------------------------------------------------") + "\n" +
                                                               "              CONSESIONARIO DE AUTOS" + "\n" +
                                                               "             -SELECCION DE AMENIDADES-     " + "\n" +
                                                               "             COLOR DE PINTURA EXTERIOR         " + "\n" +
                                                               "--------------------------------------------------" + "\n\n" +
                                                               "01.- Cosmic  Blue                         Q   0.00" + "\n" +
                                                               "02.- Burgundy Night                       Q   0.00" + "\n" +
                                                               "03.- Rallye Red                           Q   0.00"   + "\n" +
                                                               "04.- Crystal Black                        Q   0.00" +"\n" +
                                                               "05.- Modern Stell                         Q   0.00" + "\n" +
                                                               "06.- Taffeta White                        Q   0.00" + "\n" +
                                                               "07.- Energy Green                         Q   0.00"   + "\n" +
                                                               "08.- Kona Coffe                           Q   0.00" + "\n" +
                                                               "09.- Orange Fury                          Q   0.00" + "\n" +
                                                               "10.- Helios Yellow                        Q   0.00" + "\n" +
                                                               "11.- Sonic Gray                           Q   0.00"   + "\n" +
                                                               "12.- Polished Metal                       Q   0.00"+ "\n" +
                                                               "13.- Regresar al menu de amenidades"  + "\n\n" );
                                                         if (Op6 >= 14)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese el color de pintura");
                                                       Op6=leer6.nextInt();
                                                       switch (Op6) {
                                                           case 1: A2= "Cosmic Blue";
                                                              break;
                                                           case 2 : A2= "Burgundy Night";
                                                              break;
                                                           case 3: A2 = "Rallye Red";
                                                              break;
                                                           case 4: A2 = "Crystal Black";
                                                             break;
                                                           case 5: A2= "Modern Stell";
                                                             break;
                                                           case 6: A2= "Taffeta White";
                                                              break;
                                                           case 7: A2 = "Energy Green";
                                                              break;
                                                           case 8: A2 = "Kona Coffee";
                                                             break;
                                                           case 9:  A2= "Orange Fury";
                                                              break;
                                                           case 10: A2= "Helios Yellow";
                                                              break;
                                                           case 11: A2 = "Sonic Gray";
                                                              break;
                                                           case 12: A2 = "Polished Metal";
                                                              break;
                                                       }

                                                       
                                                         }while(Op6 >= 14 );
                                                      }
                                                        

                                                                                }
                                                switch(Op4) {
                                                    case 3: {
                                                       
                                                       do  {
                                                          
                                                       System.out.print(("\n" + "-------------------------------------------------") + "\n" +
                                                               "              CONSESIONARIO DE AUTOS" + "\n" +
                                                               "             -SELECCION DE AMENIDADES-     " + "\n" +
                                                               "                  COLOR TAPICERIA   " + "\n" +
                                                               "--------------------------------------------------" + "\n\n" +
                                                               "01.- Gray Cloth                           Q   0.00" + "\n" +
                                                               "02.- Black Cloth                          Q   0.00" + "\n" +
                                                               "03.- Black/Gray Cloth                     Q   0.00"   + "\n" +
                                                               "04.- Red/Black Suede Effect-Fabric        Q   0.00" +"\n" +
                                                               "05.- Regresar al menu de amenidades"  + "\n\n" );
                                                         if (Op7 >= 6)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese el color de Tapiceria:");

                                                       Op7=leer7.nextInt();
                                                       switch (Op7) {
                                                           
                                                           case 1: A3= "Gray Cloth";
                                                              break;
                                                           case 2: A3= "Black Cloth";
                                                              break;
                                                           case 3: A3= "Black/Gray Cloth";
                                                              break;
                                                           case 4: A3 = "Red/Black Suede Effects-Fabric";
                                                              break;
                                        
                                                              

                                                       }
                                                        }while(Op7 >= 6 );
                                                      }
                                                                           }
                                                switch(Op4) {
                                                    case 4:{
                                                       
                                                         do  {
                                                              
                                                       System.out.print("\n" +"\n" +("-------------------------------------------------") + "\n" +
                                                               "              CONSESIONARIO DE AUTOS" + "\n" +
                                                               "             -SELECCION DE AMENIDADES-     " + "\n" +
                                                               "                        AROS   " + "\n" +
                                                               "--------------------------------------------------" + "\n\n" +
                                                               "01.- 15\"                          Q       0.00" + "\n" +
                                                               "02.- 16\"                          Q       0.00" + "\n" +
                                                               "03.- 17\"                          Q   1,688.00"   + "\n" +
                                                               "04.- 18\"                          Q   1,700.00" +"\n" +
                                                               "05.- 19\"                          Q   3,011.00" +"\n" +
                                                               "06.- Regresar al menu de amenidades"  + "\n\n" );
                                                       if (Op8 >= 7)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese Tipo de Aro:");
                                                       Op8=leer8.nextInt();
                                                       switch (Op8) {
                                                           case 1: {
                                                               A4= "15\"";
                                                               P4=0.00;
                                                                  break;
                    }
                                                           case 2: {
                                                               A4= "16\"";
                                                               P4=0.00;
                                                                  break;
                    }
                                                           case 3:{
                                                               A4= "17\"";
                                                               P4=1688.00;
                                                                  break;
                                                               
                    }
                                                           case 4: {
                                                               A4 = "18\"";
                                                               P4=1700.00;
                                                                  break;
                    }
                                                           case 5:{
                                                               A4 = "19\"";
                                                               P4=3011.00;
                                                                  break;
                    }

                                                       }
                                                       }while(Op8 >= 7 );
                                                      }
                                                                           }
                                                 switch(Op4) {
                                                   case 5: {
                                                        
                                                         do  {
                                                             
                                                             
                                                       System.out.print(("\n" +   "----------------------------------------------------") + "\n" +
                                                               "                 CONSESIONARIO DE AUTOS" + "\n" +
                                                               "                -SELECCION DE AMENIDADES-     " + "\n" +
                                                               "                  ACCESORIOS EXTERIORES   " + "\n" +
                                                               "-----------------------------------------------------" + "\n\n" +
                                                               "01.- Body Side Molding                Q     217.00" + "\n" +
                                                               "02.- Car Cober                        Q     230.00" + "\n" +
                                                               "03.- Decklid Spoiler                  Q     299.99"   + "\n" +
                                                               "04.- Door Edge Film                   Q      42.00" +"\n" +
                                                               "05.- Door Edge Guards                 Q      84.00" +"\n" +
                                                               "06.- Door Trim Chrome                 Q     285.00" + "\n" +
                                                               "07.- Door Visor                       Q     185.00" + "\n" +
                                                               "08.- Front Fender Emblems             Q      50.00" + "\n" +
                                                               "09.- Rear Bumber Applique             Q      70.00"   + "\n" +
                                                               "10.- Fog Lights                       Q     325.00" +"\n" +
                                                               "11.- Nose Mascs                       Q     158.00" +"\n" +
                                                               "12.- Moonrof Visor                    Q     138.00" + "\n" +
                                                               "13.- Splash Guard Set                 Q     104.00"   + "\n" +
                                                               "14.- Dust Cover                       Q     350.00" +"\n" +
                                                               "15.- Door Mirror Cover-Carbon Fiber   Q   3,011.00" +"\n" +
                                                               "16.- Regresar al menu de amenidades"  + "\n\n" );
                                                                if (Op9 >= 17)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese el accesorio Exterior:");
                                                       Op9=leer9.nextInt();
                                                       switch (Op9) {
                                                           case 1: {
                                                               A5= "Body Side Molding";
                                                               P5=217.00;
                                                                  break;
                                                           }
                                                           case 2: {
                                                               A5= "Car Cover";
                                                               P5=230.00;
                                                                  break;
                                                           }
                                                           case 3: {
                                                               A5= "Decklid Spoiler";
                                                               P5=299.99;
                                                                  break;
                                                           }
                                                           case 4: {
                                                               A5 = "Door Edge Film";
                                                               P5=42.00;
                                                                  break;
                                                           }
                                                           case 5: {
                                                               A5 = "Door Edge Guards";
                                                               P5=84.00;
                                                                  break;
                                                           }
                                                           case 6: {
                                                               A5= "Door Trim Chrome";
                                                               P5=285.00;
                                                                  break;
                                                           }
                                                           case 7: {
                                                               A5= "Door Visor";
                                                               P5=185.00;
                                                                  break;
                                                           }
                                                           case 8:   {
                                                               A5= "Front Fender Emblems";
                                                               P5=50.00;
                                                                  break;
                                                           }
                                                           case 9:  {
                                                               A5 = "Rear Bumber Applique";
                                                               P5=70.00;
                                                                  break;
                                                           }
                                                           case 10:   {
                                                               A5 = "Fog Lights";
                                                               P5=325.00;
                                                                  break;
                                                           }
                                                           case 11:   {
                                                               A5= "Nose Mascs";
                                                               P5=158.00;
                                                                  break;
                                                           }
                                                           case 12:   {
                                                               A5= "Moonrof Visor";
                                                               P5=138.00;
                                                                  break;
                                                           }
                                                           case 13:   {
                                                               A5= "Splash Guard Set";
                                                               P5= 104.00;
                                                                  break;
                                                           }
                                                           case 14: {
                                                               A5 = "Dust Cover";
                                                               P5=350.00;
                                                                  break;
                                                           }
                                                           case 15: {
                                                               A5 = "Door Mirror Cover-Carbon Fiber";
                                                               P5=520.00;
                                                                  break;
                                                           }


                                                       }
                                                     }while(Op9 >= 17 );
                                                      }

                                                                           }
                                                    switch(Op4) {
                                                        case 6: {
                                                       
                                                          do  {
                                                               
                                                             
                                                       System.out.print(( "\n" +  "----------------------------------------------------") + "\n" +
                                                               "                 CONSESIONARIO DE AUTOS" + "\n" +
                                                               "                -SELECCION DE AMENIDADES-     " + "\n" +
                                                               "                  ACCESORIOS INTERIORES  " + "\n" +
                                                               "-----------------------------------------------------" + "\n\n" +
                                                               "01.- All-Seansos Floor Mats           Q     142.00" + "\n" +
                                                               "02.- Automatic-Dimming Mirror         Q     219.00" + "\n" +
                                                               "03.- Cargo Hook                       Q      12.00"   + "\n" +
                                                               "04.- Cargo Net                        Q      49.00" +"\n" +
                                                               "05.- Console Illumination             Q     250.00" +"\n" +
                                                               "06.- Cargo Organizer                  Q      87.00" + "\n" +
                                                               "07.- Door Panel Protector             Q     149.00" + "\n" +
                                                               "08.- Armrest Compartiment             Q     337.00" + "\n" +
                                                               "09.- Door Sill Trim-Illuminated       Q     290.00" + "\n" +
                                                               "10.- Cargo Cover                      Q     166.00" + "\n" +
                                                               "11.- Cargo Liner                      Q     187.00" + "\n" +
                                                               "12.- Regresar al menu de amenidades"  + "\n\n" );
                                                              if (Op10 >= 13)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese el accesorio Interior:");
                                                         
                                                       Op10=leer10.nextInt();
                                                       switch (Op10) {
                                                           case 1:{
                                                               A6= "All-Seasons Floor Mats";
                                                               P6=142.00;
                                                                  break;
                                                           }
                                                           case 2:   {
                                                               A6= "Automatic-Dimming Mirror";
                                                               P6=219.00;
                                                                  break;
                                                           }
                                                           case 3:   {
                                                               A6= "Cargo Hook";
                                                               P6= 12.00;
                                                                  break;
                                                           }
                                                           case 4:   {
                                                               A6 = "Cargo Net";
                                                               P6=49.00;
                                                                  break;
                                                           }
                                                           case 5:   {
                                                               A6 = "Console Illumination";
                                                               P6=250.00;
                                                                  break;
                                                           }
                                                           case 6:   {
                                                               A6= "Cargo Organizeer";
                                                               P6=87.00;
                                                                  break;
                                                           }
                                                           case 7:   {
                                                               A6= "Door Panel Protector";
                                                               P6=149.00;
                                                                  break;
                                                           }
                                                           case 8:   {
                                                               A6= "Armrest Compartimet";
                                                               P6=337.00;
                                                                  break;
                                                           }
                                                           case 9:   {
                                                               A6 = "Door Sill Ttrim-Illuminated";
                                                               P6=290.00;
                                                                  break;
                                                           }
                                                           case 10:  {
                                                               A6= "Cargo Cober";
                                                               P6=166.00;
                                                                  break;
                                                           }
                                                           case 11:   {
                                                               A6 = "Cargo Liner";
                                                               P6=187.00;
                                                                  break;
                                                           }
                                                       }
                                                         }while(Op10 >= 13 );
                                                      }

                                                                           }
                                                   switch(Op4) {
                                                   case 7:   {
                                                       Op11=0; 
                                                        do  {
                                                            
                                                       System.out.print(("\n" +   "----------------------------------------------------") + "\n" +
                                                               "                 CONSESIONARIO DE AUTOS" + "\n" +
                                                               "                -SELECCION DE AMENIDADES-     " + "\n" +
                                                               "                 ACCESORIOS ELECTRONICOS  " + "\n" +
                                                               "-----------------------------------------------------" + "\n\n" +
                                                               "01.- Wireless phone Charger           Q     305.00" + "\n" +
                                                               "02.- USB Charger-2.1 Amp              Q     120.00" + "\n" +
                                                               "03.- Puddle Light                     Q     185.00"   + "\n" +
                                                               "04.- Parking Sensors                  Q     514.00" +"\n" +
                                                               "05.- Regresar al menu de amenidades"  + "\n\n" );
                                                        if (Op11 >= 6)
                                                                System.out.println("PORFAVOR,INGRESE UN VALOR CORRECTO" +"\n");
                                                    System.out.print("Ingrese el accesorio Electronicos:");
                                       Op11=leer11.nextInt();
                                       switch (Op11) {
                                           case 1: {
                                               A7= "Wireless phone Charger";
                                               P7=305.00;
                                                  break;
                                           }
                                           case 2: {
                                               A7= "USB Charger 2.1 Amp";
                                               P7=120.00;
                                                  break;
                                           }
                                           case 3: {
                                               A7= "Puddle Light";
                                               P7= 185.00;
                                                  break;
                                           }
                                           case 4:   {
                                               A7 = "Parking Sensors";
                                               P7=514.00;
                                                  break;
                                           }
                                       }
                                       }while(Op11 >= 6 );
                                      }

                                                           } 
                                                         }while(Op5 == 5 || Op7 == 5 || Op8 == 6 || Op9 == 16 || Op10 == 12 || Op6 == 13 || Op11 == 5 ); 
                                                                             
                                     Total=Precio+P1+P2+P3+P4+P5+P6+P7;
                                       System.out.print(( "\n" +  "---------------------------------------------------------------------------") + "\n" +
                                                            "                           CONSESIONARIO DE AUTOS" + "\n" +
                                                            "                            -VENTA DE VEHICULOS-  " + "\n"+
                                                            "----------------------------------------------------------------------------" + "\n\n" +
                                                      "Ha seleccionado la gama: "+(Gama)+ "                 Q"+(Precio)     +"\n"+
                                                            "Amenidades:"                               + "\n" );
                                                            if (Op5 >= 1)
                                   System.out.println("   Transmision: "+ (A1) + "                  Q"+ (P1));
                                                            if (Op6 >= 1)
                                   System.out.println("   Color de pintura Exterior: "+ (A2) + "           Q"+ (P2));
                                                            if (Op7 >= 1)
                                   System.out.println("   Color de Tapicerira: "+ (A3) + "                 Q"+ (P3));
                                                            if (Op8 >= 1)
                                   System.out.println("   Aros: "+ (A4) + "                                Q"+ (P4));
                                                            if (Op9 >= 1)
                                   System.out.println("   Accesorios Exteriores: "+ (A5) + "               Q"+ (P5));
                                                            if (Op10 >= 1)
                                   System.out.println("   Accesoreios Interiores: "+ (A6) + "              Q"+(P6));
                                                            if (Op11 >= 1)
                                   System.out.println("   Accesorios Electronicos: "+ (A7) + "             Q"+(P7));

                                                            System.out.println("                                            _____________");
                                   System.out.println("Total"+ "                                          Q"+(Total));  
                                   System.out.print("\n" + "Desea agregar otra amenidad (s/n)");
                                  
                                   Op12=leer12.nextLine();
                                                }while("s".equals(Op12));      
                                                  
     
                                    if ("n".equals(Op12))
                                       System.out.print(( "\n" +  "---------------------------------------------------------------------------") + "\n" +
                                                            "                           CONSESIONARIO DE AUTOS" + "\n" +
                                                            "                            -VENTA DE VEHICULOS-  " + "\n"+
                                                            "----------------------------------------------------------------------------" + "\n\n" +
                                                      "Ha seleccionado la gama: "+(Gama)+ "                 Q"+(Precio)     +"\n"+
                                                            "Amenidades:"                               + "\n" );
                                                            if (Op5 >= 1)
                                   System.out.println("   Transmision: "+ (A1) + "                  Q"+ (P1));
                                                            if (Op6 >= 1)
                                   System.out.println("   Color de pintura Exterior: "+ (A2) + "           Q"+ (P2));
                                                            if (Op7 >= 1)
                                   System.out.println("   Color de Tapicerira: "+ (A3) + "                 Q"+ (P3));
                                                            if (Op8 >= 1)
                                   System.out.println("   Aros: "+ (A4) + "                                Q"+ (P4));
                                                            if (Op9 >= 1)
                                   System.out.println("   Accesorios Exteriores: "+ (A5) + "               Q"+ (P5));
                                                            if (Op10 >= 1)
                                   System.out.println("   Accesoreios Interiores: "+ (A6) + "              Q"+(P6));
                                                            if (Op11 >= 1)
                                   System.out.println("   Accesorios Electronicos: "+ (A7) + "             Q"+(P7));
                                  
                                                            System.out.println("                                            _____________");
                                   System.out.println("Total"+ "                                          Q"+(Total));  
                                   System.out.print("\n" + "Presione Enter para volver al Menu Principal");
                                    Op13=leer13.nextLine();
  
                                                      
                                                     
                 
                 }
         

             }
                   }while("".equals(Op13))   ;   
       
             }

       }   