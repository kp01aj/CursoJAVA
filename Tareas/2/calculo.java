// Sacar la potencia de un numero.

public class calculo{
	public static void main(String[] args){

	// Utilizando libreria Math.pow
		System.out.println("La potencia "+args[1]+" del numero "+args[0]+" es "+Math.pow(
			Integer.parseInt(args[0]),
			Integer.parseInt(args[1])
		));
	}
}
