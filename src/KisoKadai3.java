import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String select=null;
		int sel=0;
		String select2=null;
		int sel2=0;
		String dir=null;
		String filename=null;

		System.out.println("作業を始めます");
			System.out.println("フォルダ内のディレクトリを表示します。");
			String path = new File(".").getAbsoluteFile().getParent();//現在の位置
	        System.out.println(path);//
			File file = new File("C:\\Users\\internous\\Desktop\\");
	        File files[] = file.listFiles();

	        //取得した一覧を表示する
	        for (int i=0; i<files.length; i++) {
	            System.out.println("ファイル" + (i+1) + "→" + files[i]);
	        }
	        System.out.println("\n\n");


		while(sel==0){
			System.out.println("1 現在のフォルダで作業");
			System.out.println("2 フォルダを再指定");
			System.out.println("3 終了");
			try{
				BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in));

				select=br.readLine();
				sel = Integer.parseInt(select);
			}
			catch(Exception e){
					e.printStackTrace();
			}

			while(sel<=2 || sel<0){

				if(sel==1){
					System.out.println("現在のフォルダで作業");
				}
				else if(sel==2){
					System.out.println("フォルダの再指定");
					System.out.println("フォルダを指定して下さい。");
					System.out.println("例 : C:\\Users\\internous\\Desktop\\");
					String	fol3=null;
					File	fol4=null;
					try{
						BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける
						fol3=br.readLine();
					}
					catch(Exception e){
							e.printStackTrace();
					}
					File fol4=new File(file.getParent());
					if(fol4.exists()){
						System.out.println("フォルダがありません。:"+file.getAbsolutePath());
						fol4.mkdirs();
						System.out.println("新規でフォルダを作成しました。");
					}
					else {
						System.out.println("フォルダは既に存在します。");
					}

				}
				else if(sel==0){
					System.out.println("終了1");
				}
				else{
					System.out.println("入力が間違っています。");
				}
			}



			while(sel==0){
				System.out.println("ファイルを指定します。");
				System.out.println("ファイル名を入力して下さい。");
				 File newfile = new File("C:\\Users\\internous\\Desktop\\KisoKadai"+filename+".txt");

				 try {
					 if(file.exists()){
							System.out.println("ファイルは既に存在します。\n" + file.getAbsolutePath());
					}
					 else if (newfile.createNewFile()){
						 System.out.println("ファイルの作成に成功しました。\n"+filename+".txtというファイル名で作成されました。");
					 }
			         else {
			                System.out.println("ファイルの作成に失敗しました。");
			         }
				 }
			     catch (IOException e) {
			    	 System.out.println("例外が発生しました。");
			     }
			}



			while(sel==0){
				 System.out.println("書き込み方法を選択してください。");
				 System.out.println("1 上書き");
				 System.out.println("2 追記");
				 System.out.println("0 終了");

				try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in));

					select2=br.readLine();
					sel2 = Integer.parseInt(select2);
				}
				catch(Exception e){
						e.printStackTrace();
				}

				if(sel2==1){
					System.out.println("上書き");

			}







		}
			System.out.println("作業がすべて終了しました。");

				/*
			        */



				/*File file = new File("test.txt");
			    String path = file.getAbsolutePath();
			    System.out.println("現在のファイルのパス\n" + path);

			    while(sel==0){
			    	System.out.println("作業方法を指定してください。");
			    	System.out.println("1 上書き");
			    	System.out.println("2 追記");
			    	System.out.println("終了");

			    	if(sel==1){

			    	}
			    }*/


			/*
			 try {
							boolean mode = false;
							System.out.println("記述方法を選択して下さい。");
							System.out.println("1 追記");
							System.out.println("2 上書き");
							System.out.println("3 終了");
							BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
							String str = br2.readLine();

							st=Integer.parseInt(str);
							// モードを決める

							if(st==1){
								mode = true;
							}
							else if(st==2){
								mode = false;
							}
							else if(st==0){
								System.out.println("");
							}
							else{
								System.out.println("入力が間違っています。");
							}

							//出力先を作成する
							FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
							PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

							//内容を指定する
							BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
							String str2 = br3.readLine();
							pw.println(str2);

							//ファイルに書き出す
							pw.close();

							//終了メッセージを画面に出力する
							System.out.println("出力が完了しました。");

						}
						catch (IOException ex) {
							//例外時処理
							ex.printStackTrace();
						}
			 * */
		}


		/*

		String filename=null;

		System.out.print("ファイル名を入力して下さい→");

		try{
			BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける

				filename=br.readLine();
		}
		catch(Exception e){
			e.printStackTrace();
		}


		//ファイルがあるか確認
		File file = new File("C:\\Users\\internous\\Desktop\\KisoKadai\\"+filename+".txt");
		if (file.exists()){
		    System.out.println("ファイルは存在します");
		}else{
		    System.out.println("ファイルは存在しません");
		}
		*/

		String folder=null;
		int fol;

		String directory=null;

		System.out.println("作業を開始します。");
		do{
			do{



				/*try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in)); //(System.in)コンソールから文字列を受け付ける

					System.out.println("1 ディレクトリを表示して指定しますか？");
					System.out.println("2 新規でフォルダを作成しますか？");
					System.out.println("3 作業を終了しますか？");
					System.out.print("入力値:");
					folder=br.readLine();


				}

				catch(Exception e){
					e.printStackTrace();
				}

				fol = Integer.parseInt(folder);
				*/

/*


				if(fol==1){
			        	//ファイルがあるか確認

			        	System.out.println("ディレクトリ名を入れて指定して下さい。");


			        	File file = new File(args[0]);
			    		// ディレクトリパスを取得する
			    		File dir=new File(file.getParent());

			    		if(!dir.exists()){
			    			System.out.println("ディレクトリが存在しません。:"+file.getAbsolutePath());
			    			dir.mkdirs();
			    			System.out.println("ディレクトリが作成できました。");
			    		} else {
			    			System.out.println("ディレクトリは存在します。");
			    		}




			        	/*File file = new File(args[0]);
		// ディレクトリパスを取得する
		File dir=new File(file.getParent());

		if(!dir.exists()){
			System.out.println("フォルダがありません。:"+file.getAbsolutePath());
			dir.mkdirs();
			System.out.println("作成成功");
		} else {
			System.out.println("フォルダは既に存在します。");
		}*/





			    	/*

				}
				else if(fol==2){
					System.out.println("\n\n新規でフォルダを作成します。");
				}
				else if(fol==3){
					System.out.println("\n\n");
				}
				else{
					System.out.println("\n\n入力が間違っています。\n\n");
				}

			}while(!(fol==3));

			System.out.println("作業を終了します。");

		}while(!(fol==3));


		*/

		/*System.out.println("\n\nディレクトリを表示して指定します。");
		//ファイル名の一覧を取得する
        File file = new File("C:\\Users\\internous\\Desktop\\KisoKadai");
        File files[] = file.listFiles();

        //取得した一覧を表示する
        for (int i=0; i<files.length; i++) {
            System.out.println("ファイル" + (i+1) + "→" + files[i]);
        }
        System.out.println("\n\n");

        */


		/*int b=0;

		do{

			try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in));

					if(b==0){
						b++;
					}

					else{
						System.out.println("もう一度入力して下さい！\n");
					}

					System.out.print("ファイル名を入力して下さい→");

					System.out.print("入力→");
					select=br.readLine();
					sel = Integer.parseInt(select);

					switch(sel){
					case 1:
						System.out.println("ファイルがあるか確認します。");
						//ファイルがあるか確認
						File file = new File("C:\\Users\\internous\\Desktop\\"+filename+".txt");
						if (file.exists()) {
							System.out.println("ファイルは存在します。");
						}

						else {
							System.out.println("ファイルは存在しません。");

						}

					break;


					case 2:
						System.out.println("ファイルを新規で作成します。");
						break;


					case 3:
						System.out.println("ファイルの内容を確認します。");
						break;

					case 10:
						System.out.println("終了します。");
						break;



					default:
						System.out.println("入力が間違っています。");
						break;
					}


			}
			catch(Exception e){
				e.printStackTrace();
			}


		}while(!(sel==10));






		/*

		 --------------------------------
		String select = null;
		String filename=null;

		int c = 0;
		int sel = 0;




		do{

			try{
					BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in));

					if(c==0){
						c++;
					}

					else{
						System.out.println("もう一度入力して下さい！\n");
					}

					System.out.println("選択して下さい。");
					System.out.println(" 1 ファイルがあるか確認しますか？");
					System.out.println(" 2 ファイルを新規で作成しますか？");
					System.out.println(" 3 ファイルの内容を確認しますか？");
					System.out.println("10 終了");

					System.out.print("入力→");
					select=br.readLine();
					sel = Integer.parseInt(select);

					switch(sel){
					case 1:
						System.out.println("ファイルがあるか確認します。");
						//ファイルがあるか確認
						File file = new File("C:\\Users\\internous\\Desktop\\"+filename+".txt");
						if (file.exists()) {
							System.out.println("ファイルは存在します。");
						}

						else {
							System.out.println("ファイルは存在しません。");

						}

					break;


					case 2:
						System.out.println("ファイルを新規で作成します。");
						break;


					case 3:
						System.out.println("ファイルの内容を確認します。");
						break;

					case 10:
						System.out.println("終了します。");
						break;



					default:
						System.out.println("入力が間違っています。");
						break;
					}


			}
			catch(Exception e){
				e.printStackTrace();
			}


		}while(!(sel==10));

		-------------------------------------------
		*/


		/*
		while(sel==10){

			System.out.println(" 1 ファイルがあるか確認しますか？");
			System.out.println(" 2 ファイルを新規で作成しますか？");
			System.out.println(" 3 ファイルの内容を確認しますか？");
			System.out.println("10 終了");

			String	select=null;
			try{
				BufferedReader	br=new	BufferedReader(new InputStreamReader(System.in));

				select=br.readLine();
			}
			catch(Exception e){
				e.printStackTrace();
			}

			sel = Integer.parseInt(select);



			switch (sel) {

				case 1:
					System.out.println("ファイルがあるか確認します。");

				break;


				case 2:
					System.out.println("ファイルを新規で作成します。");
					break;


				case 3:
					System.out.println("ファイルの内容を確認します。");
					break;



				default:
					System.out.println("終了します。");
					break;
			}


		}
		*/



         //ファイル作成

       /* File newfile = new File("C:\\Users\\internous\\Desktop\\KisoKadai"+filename+".txt");

        try {
            if (newfile.createNewFile()) {
                System.out.println("ファイルの作成に成功しました。\n"+filename+".txtというファイル名で作成されました。");
            }
            else {
                System.out.println("ファイルの作成に失敗しました。");
            }
        }
        catch (IOException e) {
            System.out.println("例外が発生しました。");
            System.out.println(e);
        }



*/




		//ファイル内容表示






		/*ファイル追記上書き→書き換えてない
		File file = new File("C:\\Users\\internous\\Desktop\\new.txt");

	      if (checkBeforeWritefile(file)){
	        FileWriter filewriter = new FileWriter(file, true);

	        filewriter.write("はい。元気です¥r¥n");
	        filewriter.write("ではまた¥r¥n");

	        filewriter.close();
	      }else{
	        System.out.println("ファイルに書き込めません");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }
	  }

	  private static boolean checkBeforeWritefile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canWrite()){
	        return true;
	      }
	    }

	    return false;
	    */
	}
	}
	}
}
