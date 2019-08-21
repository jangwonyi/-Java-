package Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 己利贸府 {
	
	static ArrayList<己利> 己利甸 = new ArrayList<>();

	public static void main(String[] args) {
		//颇老楷搬
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			
			//滚欺楷搬
			BufferedReader br = new BufferedReader(fr);
			
			//馆汗, 茄临 佬扁
			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				
				//货 按眉 父甸绢辑 持扁
				己利 new己利 = new 己利();
				new己利.setName(st.nextToken());
				new己利.setAdress(st.nextToken());
				new己利.setMath(Double.parseDouble(st.nextToken()));
				new己利.setEnglish(Double.parseDouble(st.nextToken()));
				
				//府胶飘俊 父甸绢柳 货 按眉 持扁
				己利甸.add(new己利);
			}
			//府胶飘 免仿
			for(己利 a : 己利甸) {
				System.out.println(a);	
			}
//			for(int i = 0; i < 己利甸.size(); i++) {
//				System.out.println("己利甸 : " + );
//			}
			
			//颇老肺 历厘
			//颇老 楷搬
			FileWriter fw = new FileWriter("src/save.txt");
			
			//滚欺 楷搬
			BufferedWriter bw = new BufferedWriter(fw);
			
			//静扁
			for(己利 a : 己利甸) {
				bw.write(a.getName() + "\t" + a.getAdress() + "\t");
				bw.write(a.getMath() + "\t" + a.getEnglish() + "\t");
				bw.write(a.getTotal() + "\t" + a.getAverage() + "\t");
				bw.newLine();
			}
			
			//摧扁
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

