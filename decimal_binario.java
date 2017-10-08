package decumal_a_binario;

public class decimal_binario {
	
	public static void main(String[] args) {
		decimal_binario a= new decimal_binario();
		
		System.out.println(a.bin(1024));
	
	}
	
	
	private String bin(int num){
		if(num/2==0) {
			return " "+num;
		}else {
			int aux=num%2;
			return bin(num/2)+aux;
		}
		
	}
	
	

}
