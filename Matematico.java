
public class Matematico
{
    Calculadora calculadora;
    public String usarCalculadora (Calculadora calcu){
        String reporte;
        calculadora = calcu;
        reporte = "Usando Calculadora";
        return reporte;
    }
    public String valoresDeX (double a,double b,double c){
      String valores;
      if (calculadora !=null ){
        valores= calculadora.Ecuacion (a,b,c);
        }
      else {
        valores = "añade calculadora";
        } 
        return valores;
    }
     public String ecuacionRecta (double x1,double y1,double x2, double y2){
      String ecuacion;
      if (calculadora !=null ){
        ecuacion = calculadora.Recta (x1,y1,x2,y2);
        }
      else {
        ecuacion = "añade calculadora";
        } 
        return ecuacion;
    }
     public String catetoFaltante (double cateto,double hipotenusa){
      String resultado;
      if (calculadora !=null ){
        resultado = calculadora.Cateto (cateto,hipotenusa);
        }
      else {
        resultado = "añade calculadora";
        } 
        return resultado;
    }
}