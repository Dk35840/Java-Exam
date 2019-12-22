import java.util.function.BiConsumer;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] sm= {4,3,3};
		int k=0;
		
		fun(sm, k, (v,ks) -> {
			try {
				System.out.println(v/ks);
			}
			catch(Exception e){
				System.out.println("can not divide by 0");
			}
			
		});
		
		
	}
	

	private static void fun(int[] sm, int k, BiConsumer<Integer,Integer> cosumer) {
		// TODO Auto-generated method stub
		for(int i:sm) {
			cosumer.accept(i, k);
		}
	}

}

