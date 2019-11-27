package es.studium.Descuentos;

import java.util.Scanner;


public class Descuentos {

	public static void main(String[] args) 
	{
		float precio, subtotal, total=0, descuento;
		int codigo, unidades;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Indicar el código del artículo:");
		codigo=teclado.nextInt();

		System.out.println("Indicar el precio del artículo:");
		precio= teclado.nextInt();

		System.out.println("Indicar el precio de unidades:");
		unidades= teclado.nextInt();

		subtotal= unidades*precio;

		if(unidades>100) 
		{
			descuento=40;
			total=(float) (unidades*0.60*precio);
			
		}
		if(unidades>=25 && unidades<=100)
		{
			descuento=20;
			total=(float) (unidades*0.20*precio);
		
		}
		if(unidades<10)
		{
			descuento=0;
			total=unidades*precio;
		}
		System.out.println("********************RESUMEN COMPRA ********************");
		System.out.println("CODIGO \t\tSUBTOTAL\t\tDESCUENTO\t\tTOTAL");

		System.out.println(codigo+"\t\t"+subtotal+"\t\t"+(subtotal-total)+"\t\t\t"+total);
		teclado.close();
	

	}
}