import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


		String str1 = null;
		int a = 0;
		int r;
		int c = 0;

		r= new java.util.Random().nextInt(100);
		do{
			//do{//
				System.out.println("1～100の数値を入力して下さい！");

				try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける

					if(c==0){
						c++;
					}

					System.out.print("入力値:");
					str1=br.readLine();

					if(!(isNumber(str1)) || a<0 || a>100){
						System.out.println("正しい数値を入れてください！\n");
						continue;
					}
					a = Integer.parseInt(str1);
				}

				catch(Exception e){
					e.printStackTrace();
				}


			//}while(isNumber(str1) && a<0 || a>=100);

			if(a>0 && a<=100){
				if(a==r){
					System.out.println("正解です！");
				}

				else if(a<r){
					System.out.println("正解の数より小さいです\n");
				}

				else if(a>r){
					System.out.println("正解の数より大きいです\n");
				}
			}

			else{
				System.out.println("入力が間違っています\n");
			}
		}while(!(a==r));
	}

	public static boolean isNumber(String val) {
        String regex = "\\A[-]?[0-9]+\\z";
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(val);
        return m1.find();
    }
}
