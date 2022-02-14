package javaapplication1;

import java.util.Random;
import java.util.Scanner;
 
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int desicion=2,valor=0,num, filas,columnas,comida,paredes,trampas, paredess,trampass,comidaa, tablero,pu = 1,name,aux;
        
        
        
        
        int arr[] = new int[10];
        String arrn[]=new String[10];
         int i,j,n,m,columnasT,filasT,ma = 0,na = 0,p = 0,personaje, pausa,contador1=0,contador2=0,contadorp=0;
         //int calificacion = 5;
           char mover,avatar=0;
        double cantidadC,cantidadT;
        long rd,rt;
        String nombre;
      do{ 
          
          do{
          
          System.out.println("  PACMAN-IPC1-2022");
        System.out.println("1.    INICIAR EL JUEGO");
        System.out.println("2. TABLA DE POSICIONES");
       
        System.out.println("3.               SALIR");
        

          System.out.print("\nINGRESE UNA OPCION: ");
       valor= entrada.nextInt();
        if (valor==1){
        desicion=2;
        }
        
        }while(valor<1 || valor>3);
             
     do{   switch(valor){case 1:
           nombre="";
           System.out.print("\nINGRESES SU NOMBRE: ");
            entrada.nextLine();
            nombre=entrada.nextLine();
            
            do{System.out.print("\nINGRESE EL NUMERO DE FILAS: ");
               filas=entrada.nextInt();
               if(filas<10){System.out.println("EL RANGO MINIMO A INGRESAR ES 10");}else{System.out.print("");}
            }while(filas<10);
              do{ System.out.print("\nINGRESE EL NUMERO DE COLUMNAS: ");
               columnas=entrada.nextInt();
                if(columnas<10){System.out.println("EL RANGO MINIMO A INGRESAR ES 10");}else{System.out.print("");}
            }while(columnas<10);
               tablero=filas*columnas;
               cantidadC=tablero*0.4;
               cantidadT=tablero*0.2;
        rd = Math.round(cantidadC);
        rt = Math.round(cantidadT);
              do {System.out.print("\nINGRESE LA CANTIDAD DE COMIDA (5-"+rd+")");
        comida=entrada.nextInt();
        if(comida<5 || comida>rd){System.out.print("NO PERTENECE AL RANGO");}else{comidaa=comida;}
        }while(comida<5 || comida>rd);
        do {System.out.print("\n INGRESE LA CANTIDAD DE PAREDES(5-"+rt+")");
        paredes=entrada.nextInt();
        if(paredes<5 || paredes>rt){System.out.print("NO PERTENECE AL RANGO");}else{paredess=paredes;}
        }while(paredes<5 || paredes>rt);
        do {System.out.print("\n INGRESE LA CANTIDAD DE TRAMPAS (5-"+rt+")");
        trampas=entrada.nextInt();
        if(trampas<5 || trampas>rt){System.out.print("NO PERTENECE AL RANGO");}else{trampass=trampas;}
        }while(trampas<5 || trampas>rt);
            
          
                 char matriz[][]=new char[filas][columnas];
       System.out.println("ESCOGA SU PERSONAJE ");
       do{
        System.out.print(" LISTA DE PERSONAJES 0 A 9 [c,e,u,l,v,b,g,q,z,ñ ]:"); 
     personaje =entrada.nextInt();
       switch(personaje){
           case 0:  avatar='c'; break; 
           case 1: avatar ='e'; break;
       case 2: avatar ='u'; break;
       case 3:  avatar ='l'; break;
        case 4:  avatar ='v'; break;
        case 5:  avatar ='b';break;
        case 6: avatar ='g';  break;
        case 7: avatar ='q'; break;
        case 8:  avatar ='z'; break;
        case 9:  avatar ='ñ'; break; default:
           System.out.println("ESE PERSONAJE NO ES PARTE DEL MENU MENU ._.");
           break;
       }}while(personaje != 0 && personaje != 1 && personaje != 2 && personaje != 3 && personaje != 4 && personaje != 5 && personaje != 6 && personaje != 7 && personaje != 8 && personaje != 9);
       //  System.out.println("el nuevo valor de la matriz sera"+calificacion);
          int calificacion = 0;
       
       
       
       int vidas=3;
     int puntos=0;   
       Random r = new Random();
         Random alimento = new Random();
        for(i=0;i<filas;i++){
          
       for(j=0;j<columnas;j++){
           
           if(i==0 ){
               
           matriz[i][j]= '-';
           } 
            else if(i==filas-1){
           matriz[i][j]='_';
           }
           else if(j==0){
           matriz[i][j]='|';
           }
           else if(j==columnas-1){
           matriz[i][j]='˥';
           }
           
           else {
            matriz[i][j]=' ';
           } }  }
       while(trampas>0){
           int x = r.nextInt(filas);
           int y = r.nextInt(columnas);
           if(matriz[x][y] != '|' && matriz[x][y]!= '-' && matriz[x][y]!= '˥' && matriz[x][y]!= '_'&& matriz[x][y]!=avatar){
           matriz[x][y] = 'x';
           trampas--;}
       }
       while(paredes>0){
           
           int x = r.nextInt(filas);
           int y = r.nextInt(columnas);
           if(matriz[x][y] != '|' && matriz[x][y]!= '-' && matriz[x][y]!= '˥' && matriz[x][y]!= '_'&& matriz[x][y]!=avatar && matriz[x][y] != 'x') {
           matriz[x][y] = '#' ;
           paredes--;}
       }
       while(comida>0){
           
           int x = r.nextInt(filas);
           int y = r.nextInt(columnas);
          
           if(matriz[x][y] == ' '){
           
           switch(alimento.nextInt(2)){
               case 0:
                   matriz[x][y] = '@' ;
                   break;
           case 1:
                   matriz[x][y] = '?' ;
                   break;
           }
           comida--;
           }
           
           
          // System.out.println(p+","+o);
          
       }
         for(i=0;i<filas;i++){
       for(j=0;j<columnas;j++){
            if(matriz[i][j] == '?'){
            contador1++;
            }
             
       
       }
       
        
       } for(i=0;i<filas;i++){
       for(j=0;j<columnas;j++){
            if(matriz[i][j] == '@'){
            contador2++;
            }}}
             int total2=(contador1*10);
         int total3=contador2*5;
         int total= total2+total3;
       for(i=0;i<filas;i++){
       for(j=0;j<columnas;j++){
           System.out.print(matriz[i][j]+""); }
           System.out.println("");
       } 
        
       do{
              System.out.print("INGRESE SU POCICION [FILA][COLUMNA]:");
              
  do{
            System.out.println("\n INGRESE SU FILA INICIAL");
        n=entrada.nextInt();
        if(n>filas){System.out.println("");}
       else if(n<=0){n=n+1;}
        else{n=n;}
                
            System.out.println(" INGRESE SU COLUMNA INICIAL");
        m=entrada.nextInt();
             if(m>=columnas){System.out.println(" ");}
        else if(m<=0){m=m+1;}
            else{m=m;}
             
             if(n>filas ||m>columnas ){
                 System.out.println("LA HUBICACION ESTA FUERA DEL RANGO");
             }
             
              }while(m<=0 || m>=columnas || n<=0 || n>=filas);
  
   matriz[n][m]=avatar;
   
   
          }while(matriz[n][m] != '|' && matriz[n][m]!= '-' && matriz[n][m]!= '˥' && matriz[n][m]!= '_'&& matriz[n][m]!=avatar && matriz[n][m] != 'x' && matriz[n][m] != '#'); 
        
        
        matriz[n][m]=avatar;
        
        
        
   
       for(i=0;i<filas;i++){
       for(j=0;j<columnas;j++){
           System.out.print(matriz[i][j]+""); }
           System.out.println("");
        
           
       }
       
     
       while(vidas !=0 && total!=0 && pu!=0){
          
          
           
           System.out.print("JUGADOR: "+nombre);
           System.out.print(", PUNTOS: "+puntos);
           System.out.print(", VIDAS: "+vidas);
           
           System.out.println("\n INGRESE SU MOVIMIENTO");
           mover =entrada.next().charAt(0);
          
                   if(mover=='s' || mover=='5'|| mover=='S'){
                       n++;
                       if(n>0){
                           na=n-1;
                           ma=m;
                       matriz[n-1][m]=' ';
                       
                       
                       }
                   }
                    
                   if(mover=='w'|| mover=='8' || mover=='W'){
                       n--;
                       if(n>=0 ){
                           na=n+1;
                           ma=m;
                       matriz[n+1][m]=' ';
                       
                       }
                   }
                   if(mover=='a' || mover=='4'||mover=='A'){
                       m--;
                       if(n>0){
                           na=n;
                           ma=m+1;
                       matriz[n][m+1]=' ';
                       }
                   }
                   
                   if(mover=='d' || mover=='6'|| mover=='D'){
                       m++;
                       if(n>0){
                           na=n;
                           ma=m-1;
                       matriz[n][m-1]=' ';
                       } 
                   }
                   if(matriz[n][m]=='#'){
                      m=ma;
                      n=na;
                       matriz[n][m]=avatar;
                     }
                      if(matriz[n][m]=='@'){
               puntos=puntos+5;
               total=total-5;
           }
                      if(matriz[n][m]=='?'){
               puntos=puntos+10;
               total=total-10;
           }
                      if(matriz[n][m]=='x'){
               vidas-- ;
           }
                       if(mover == 'm' || mover == '1'){
                       System.out.println("MENU DE PAUSA");
                       System.out.println("1. CONTINUAR PARTIDA");
                       System.out.println("2. TABLA DE POSICIONES");
                       System.out.println("3. SALIR");
                       pausa=entrada.nextInt();
                      
                       if(pausa == 1) {
                           System.out.println("");
               } else if
                       (pausa==2){ for(int q=0; q<arr.length-1;q++){
                  for(int a=0;a<arr.length-q-1;a++){
                  if(arr[a+1]>arr[a]){
                      aux=arr[a+1];
                  arr[a+1]=arr[a];
                  arr[a]=aux;}
                  
                  
                  }
              
               
              }
                for(int q=0; q<arr.length;q++){
                    System.out.println("puntuacion No."+(q+1)+"="+arr[q]+"");
                    
              }
                System.out.println("PERDON, NO ME DIO TIEMPO DE PODER IMPRIMIR LOS NOMBRES");
               }else if
                       (pausa==3){desicion--;contadorp++;
                     calificacion=puntos;
                     arr[contadorp]=puntos;
                       break;}
               else
               {System.out.println("");}
           
                   }
                  
                   if(matriz[n][m]=='˥'){
                       
                       m=columnas-(columnas-1);
                       matriz[n][m]=avatar;
                     }
                    if(matriz[n][m]=='|'){
                       
                      m=columnas-2;
                       matriz[n][m]=avatar;
                     }
                      if(matriz[n][m]=='_'){
                       
                      n=filas-(filas-1);
                       matriz[n][m]=avatar;
                     }
                   
                      if(matriz[n][m]=='-' ){
                       
                      n=filas-2;
                      
                       matriz[n][m]=avatar;
                     }   
                      
                      
                      
                      
                   matriz[n][m]=avatar;
       for(i=0;i<filas;i++){
       for(j=0;j<columnas;j++){
           System.out.print(matriz[i][j]+""); }
           System.out.println("");
       } 
       if(vidas !=3 &&vidas !=2 &&vidas !=1){
              System.out.println("PERDISTE :( \n");
              desicion--;
              contadorp++;
              
                System.out.println(puntos);
                calificacion=puntos;
                arr[contadorp]=puntos;
              break;
          }
        if(total<=0){
            
              System.out.println("GANASTE :) \n");
              contadorp++;
              desicion--;
                      
                System.out.println(puntos);
              calificacion=puntos;
              arr[contadorp]=puntos;
              break;
          } 
         
       } 
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                break ;
           case 2:
           
             
               
              for(int q=0; q<arr.length-1;q++){
                  for(int a=0;a<arr.length-q-1;a++){
                  if(arr[a+1]>arr[a]){
                      aux=arr[a+1];
                  arr[a+1]=arr[a];
                  arr[a]=aux;}
                  
                  
                  }
              
               
              }
                for(int q=0; q<arr.length;q++){
                    System.out.println("puntuacion No."+(q+1)+"="+arr[q]+"");
                    
              }
                
                 
              
              
            break;
            
          case 3:
           valor=3;
            break;
           default: System.out.println("ESA OPCION NO SE ENCUENTRA EN EL MENU");break;
            
           }}while(desicion!=1 && valor != 3);
            }while(valor != 3);
         
        
    }
}

    

