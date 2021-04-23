
public class Calculadora
{
    /*Dados los valores de a, b y c de una ecuación de segundo grado. 
     Devolver los dos valores que podría tener X. */
      public String Ecuacion (double a,double b,double c){
       double x1,x2,x;
       x = Math.pow(b,2) - 4*a*c;;
       if (x>0){
        x1 = (-b-Math.sqrt(x))/(2*a);
        x2 = (-b+Math.sqrt(x))/(2*a);
        return "x1: " + x1 + " ;  x2: " + x2 ;
        }else{
         String mensaje = "Error";
         return mensaje;
        }
    }

    
     /* Dados las coordenadas de dos puntos. 
     Es capaz de encontrar la ecuación de la recta de dichos puntos. */  
      public String Recta (double x1,double y1,double x2, double y2){
       // (x - x1)/(x2 - x1)
       // (y - y1)/(y2 - y1)
       double a,b,c;
       a = y2-y1;
       if (a<0){
        double ai = a*-1;
        b = x2-x1;
        c= a*x1 - b*y1;
        String mensaje;
        mensaje="La ecuacion de la recta es: ";
        return mensaje + ai+"x "+b +"y "+ c +" =0";
        }else{
         b = x2-x1;
         double bi = (x2-x1)*-1;
         c= -a*x1+ b*y1;
         String mensaje;
         mensaje="La ecuacion de la recta es: ";
         return mensaje + a+"x "+bi +"y "+ c +" =0";
        }
    }
    /* Dados la hipotenusa y el cateto de un triangulo rectángulo. 
      Indicar cual es el valor del cateto faltante. */
     public String Cateto (double cateto,double hipotenusa){
      //c*c = (a*a)-(b*b)
      double a = cateto ;
      double c = hipotenusa ;
      double b = Math.sqrt ((c*c)-(a*a));
       String mensaje;
       mensaje = "El valor del cateto faltante es: ";
       return mensaje + b;
      }
}

