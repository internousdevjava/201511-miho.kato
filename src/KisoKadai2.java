import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		String kazu = null;

		int a = 0;
		int r;
		int c=0;



		r= new java.util.Random().nextInt(100);
		do{
			System.out.println("1～100の数値を入力して下さい！");

			do{
				do{//

				try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける

					if(c==0){
						c++;
					}

					else{
						if(a<0 || a>100){
							System.out.println("正しい数値を入れてください！");
						}
						System.out.println("もう一度入力して下さい！\n");

					}

					//System.out.println("1～100の数値を入力して下さい！");
					System.out.print("入力値:");
					kazu=br.readLine();


				}
				catch(Exception e){
					e.printStackTrace();
				}

				a = Integer.parseInt(kazu);
				}while(a<0 || a<=100);


				if(a<0 || a<=100){

					if(a<r){
						System.out.println("正解の数より小さいです");
					}

					else if(a>r){
						System.out.println("正解の数より大きいです");
					}

					else{
						System.out.println("正解です！");
					}
				}

			}while(!(a==r));



		}while(!(a==r));

	}
}
