
public class TiposVariaveis {
		public static void main (String[]args) {
			System.out.println("Olá, estou usando o eclipse");
			byte idade = 123;
			short ano = 2023;
			int cep = 7270000; //se atentar pois, se o cep começar com zero, seja melhor usar outro tipo
			long cpf = 2669600019L; //se atentar pois, pode ocorrer o mesmo caso de do cep
			float pi = 3.14F;
			
			
			/*constante
			final int VALOR_FIXO = 5;
			int VALOR_FIXO = 2;  causa o erro pois não pode ser alterado*/
			
			//sobre operadores
			int soma = 1+1;
			int subtracao = 1-1;
			int multiplicacao = 2*2;
			int divisao = 4 / 2;
			int modulo = 18%3;
			double resultado = (10+2)*(11-10);
			
			System.out.println(soma + " "+subtracao+" "+modulo+" ");
			
			
		}
		
			
		
}
