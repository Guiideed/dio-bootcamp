package estudos.gui.dio;
import estudos.gui.util.SmartTv;
import java.util.Scanner;

public class Programa {	
	public static void main(String[]args) {
	SmartTv smartTv = new SmartTv();
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("A TV esta ligada?"+ smartTv.ligada);
	System.out.println("Qual o canal atual?"+ smartTv.canal);
	System.out.println("Volume atual:"+ smartTv.volume);
	
	smartTv.ligar();
	System.out.println("Novo estado ->"+smartTv.ligada);
	smartTv.desligar();
	System.out.println("Novo estado->" + smartTv.ligada);
	
	
	smartTv.aumentarVolume();
	System.out.println("Nova adicao ->"+ smartTv.volume);
	smartTv.abaixarVolume();
	System.out.println("Nova subtracao ->" + smartTv.volume);
	
	System.out.println("Qual canal voce deseja?");
	smartTv.canal = leitor.nextInt();
	System.out.println("O canal foi trocado para o canal "+ smartTv.canal);
	leitor.close();
	
	
	
}
}