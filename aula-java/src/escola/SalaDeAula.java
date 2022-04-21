package escola;

public class SalaDeAula {
	public static void main(String[] args) {
		
		//Objeto aluno
		Aluno aluno1 = new Aluno("João", 15, "M", "21 91234-5678");
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Léia";
		
		int res;
		
		
		
		System.out.println("Este aluno é: " + aluno1);
	}
	public int soma(int a,int b){
		   a = 10;
		   b = 20;
		   int resultado;

		   resultado = a + b ;
		   System.out.println (resultado);
		   
		   return resultado;
		}
	
		public int soma(int a, int b, int c) {
			a = 10;
			b = 20;
			c = 70;
			int resultado;

			resultado = a + b + c;
			System.out.println(resultado);

			return resultado;
		}
	
}
