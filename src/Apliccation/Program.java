package Apliccation;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sistem taf = new Sistem();
		
		taf.AdicionarTarefa(12, "varrer", "varrer casa", LocalDate.now(), 5);
		taf.AdicionarTarefa(10, "limpar", "limpar casa", LocalDate.now(), 4);
		taf.AdicionarTarefa(10, "correr", "correr casa", LocalDate.now(), 2);
		
		
		taf.ordenarCrescente();
		
	}

}
