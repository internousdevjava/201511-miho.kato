import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */

/**
 * @author 美穂
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
		//boolean st1=false;
		//boolean st2=false;

			try{
				BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける


					if(c==0){
						c++;
					}


					System.out.print("X:");
					str1=br.readLine();
					if(!(isNumber(str1))){
						System.out.println("正しい数値を入れてください！");
						continue;
					}
					a = Integer.parseInt(str1);

					System.out.print("Y:");
					str2=br.readLine();
					if(!(isNumber(str2))){
						System.out.println("正しい数値を入れてください！");
						continue;
					}


					b = Integer.parseInt(str2);
			}
			catch(Exception e){
				e.printStackTrace();
			}


	}while(a<=0 || a>100 || b<=0 || b>100);


	for(int i=1; i<=a; i++){
		System.out.println();
		for(int j=1; j<=b; j++){

			if(i*j<1000){
				System.out.print(" ");
			}
			if(i*j<100){
				System.out.print(" ");
			}
			if(i*j<10){
				System.out.print(" ");
			}
			System.out.print(" ");

			System.out.print(i*j);
		}
	}

	}
	public static boolean isNumber(String val) {
        String regex = "\\A[-]?[0-9]+\\z";
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(val);
        return m1.find();
    }

}
