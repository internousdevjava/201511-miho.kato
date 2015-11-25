import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String select1=null;
		String select2=null;
		String select3=null;
		int sel1=0;
		int sel2=0;
		int sel3=0;
		String dirname= "C:\\";
		String filename=null;
		String uwagaki=null;
		String tsuiki=null;

		do{
			System.out.println("現在のディレクトリ内表示");
			String path = dirname;
		    File dir = new File(path);
		    File[] files = dir.listFiles();
		    for (int i = 0; i < files.length; i++) {
		        File file = files[i];
		        System.out.println((i + 1) + "\t:\t" + file);
		    }
		    System.out.println("\n現在のディレクトリ");
		    System.out.println(dirname);

			System.out.println("--------作業開始--------");

			System.out.println("----作業選択----");
			System.out.println("1 読み込み・書き込み");
			System.out.println("2 ディレクトリ再指定");
			System.out.println("99 終了");
			select1=new java.util.Scanner(System.in).nextLine();
			if(!(isNumber(select1))){
				System.out.println("正しい数値を入れてください！");
				continue;
			}
			else{
				sel1 = Integer.parseInt(select1);
				if(sel1==1){
					System.out.println("----読み込み・書き込み----");
					do{
						System.out.println("ファイルを指定して下さい：例）text.txt");
						filename=new java.util.Scanner(System.in).nextLine();
						File file = new File(dirname+filename);

						if (file.exists()) {
							System.out.println("ファイルは存在します。");
						}
						else {
							File newfile = new File(dirname+filename);
							try{
								if(newfile.createNewFile()){
									System.out.println("ファイルの作成に成功しました。");
								}
								else{
									System.out.println("ファイルの作成に失敗しました。");
								}
							}
							catch(IOException e){
								System.out.println("例外が発生しました。");
								System.out.println(e);
							}
						}

						do{
							System.out.println("----ファイル編集----");
							System.out.println("現在のディレクトリファイル："+dirname+filename);
							System.out.println("1 読み込み");
							System.out.println("2 書き込み");
							System.out.println("3 ファイルの再指定");
							System.out.println("99 終了");
							select2=new java.util.Scanner(System.in).nextLine();

							if(!(isNumber(select2))){
								System.out.println("正しい数値を入れてください！");
								continue;
							}
							else{
								sel2 = Integer.parseInt(select2);

								if(sel2==1){
									System.out.println("--読み込み--");
									try{
										FileReader f = new FileReader(dirname+filename);
										BufferedReader b = new BufferedReader(f);
										String s;
										while((s = b.readLine())!=null){
											System.out.println(s);
										}
									}
									catch(Exception e){
										System.out.println("ファイル読み込み失敗");
									}
									continue;
								}
								else if(sel2==2){
									do{
										System.out.println("1 上書き");
										System.out.println("2 追記");
										System.out.println("99 編集終了");

										select3=new java.util.Scanner(System.in).nextLine();

										if(!(isNumber(select3))){
											System.out.println("正しい数値を入れてください！");
											continue;
										}
										else{
											sel3 = Integer.parseInt(select3);

											if(sel3==1){
												System.out.println("1 上書き");
												System.out.println("入力して下さい");
												try{
													File file2 = new File(dirname+filename);
													FileWriter filewriter = new FileWriter(file2);
													uwagaki=new java.util.Scanner(System.in).nextLine();

													filewriter.write(uwagaki);
													filewriter.close();
													System.out.println("ファイルに上書きしました");
												}
												catch(IOException e){
													System.out.println(e);
												}
											}
											else if(sel3==2){
												System.out.println("2 追記");
												try{
													File file3 = new File(dirname+filename);

													if (checkBeforeWritefile(file3)){
														FileWriter filewriter = new FileWriter(file3, true);
														tsuiki=new java.util.Scanner(System.in).nextLine();

														filewriter.write(tsuiki+"\n");
														filewriter.close();
														System.out.println("ファイルに追記しました");

													}
													else{
														System.out.println("ファイルに書き込めません");
													}
												}
												catch(IOException e){
													System.out.println(e);
												}
											}
											else if(sel3==99){
												System.out.println(filename+" 編集終了");
											}
											else{
												System.out.println("指定された数値を入れて下さい");
											}
										}
									}while(!(sel3==99));
								}
								else if(sel2==3){
									System.out.println("--ファイルの再指定--");
									select1="2";
									break;
								}
								else if(sel2==99){
									System.out.println("[記述方法]終了");
								}
								else{
									System.out.println("指定された数値を入れて下さい");
								}
							}
						}while(!(sel2==99));
					}while(!(sel2==99));
				}
				else if(sel1==2){
					System.out.println("2 ディレクトリ再指定");
					System.out.println("ディレクトリを指定して下さい：例）C:\\\\");
					dirname=new java.util.Scanner(System.in).nextLine();
					File file4 = new File(dirname);

					if (!file4.exists()) {
						file4.mkdirs();
						System.out.println("フォルダを作成しました。");
			        }
					else {
						System.out.println("フォルダは既に存在します。");
					}
				}
				else if(sel1==99){
					System.out.println("[作業選択]終了");
				}
				else{
					System.out.println("指定された数値を入れて下さい");
				}
				path = dirname;
			}
		}while(!(sel1==99));
		System.out.println("全作業を終了します");
	}
	public static boolean isNumber(String val) {
		String regex = "\\A[-]?[0-9]+\\z";
		Pattern p = Pattern.compile(regex);
		Matcher m1 = p.matcher(val);
		return m1.find();
	}
	private static boolean checkBeforeWritefile(File file3){
		if (file3.exists()){
			if (file3.isFile() && file3.canWrite()){
				return true;
			}
		}
		return false;
	}
}
