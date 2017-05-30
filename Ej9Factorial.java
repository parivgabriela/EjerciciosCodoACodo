package EjerciciosEnJavaClase;
import java.util.*;
public class Ej9Factorial {
	public double factorial(double num)
	{
		double fact=1;
		double auxiliar=2;
		if(num<=1)
		{
			fact=1;
		}
		else
		{
			do
			{
				fact=fact*auxiliar;
				auxiliar++;
			}while(auxiliar<=num);
		}
		return fact;
	}
	public static void main(String[] args)
	{
		Ej9Factorial prueba=new Ej9Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero entero y positivo");
		double numero=sc.nextInt();
		if(numero>=0)
		{
			double fact=prueba.factorial(numero);
			System.out.println("El factorial de "+numero+" es: "+fact);
		}
		else
		{
			System.out.println("no existe factorial de un numero negativo ");
		}
	
	}
		

}
