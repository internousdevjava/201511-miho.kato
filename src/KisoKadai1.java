import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			String str1 = null;
			String str2 = null;

			int a = 0;
			int b = 0;
			int c = 0;

		do{

				System.out.println("1～100の数値を入力して下さい！");

				try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける


						if(c==0){
							c++;
						}
						else{
							System.out.println("もう一度入力して下さい！\n");
						}

						//System.out.println("1～100の数値を入力して下さい！");
						System.out.print("X:");
						str1=br.readLine();

						//System.out.println("1～100の数値を入力して下さい！");
						System.out.print("Y:");
						str2=br.readLine();
				}
				catch(Exception e){
					e.printStackTrace();
				}

				a = Integer.parseInt(str1);
				b = Integer.parseInt(str2);


		}while(a<=0 || a>100 || b<=0 || b>100);


		for(int i=1; i<=a; i++){
			System.out.println();
			for(int j=1; j<=b; j++){

				System.out.print(i*j+"\t");
			}
		}
	}

}
