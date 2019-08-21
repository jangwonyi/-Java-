package Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ����ó�� {
	
	static ArrayList<����> ������ = new ArrayList<>();

	public static void main(String[] args) {
		//���Ͽ���
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			
			//���ۿ���
			BufferedReader br = new BufferedReader(fr);
			
			//�ݺ�, ���� �б�
			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				
				//�� ��ü ���� �ֱ�
				���� new���� = new ����();
				new����.setName(st.nextToken());
				new����.setAdress(st.nextToken());
				new����.setMath(Double.parseDouble(st.nextToken()));
				new����.setEnglish(Double.parseDouble(st.nextToken()));
				
				//����Ʈ�� ������� �� ��ü �ֱ�
				������.add(new����);
			}
			//����Ʈ ���
			for(���� a : ������) {
				System.out.println(a);	
			}
//			for(int i = 0; i < ������.size(); i++) {
//				System.out.println("������ : " + );
//			}
			
			//���Ϸ� ����
			//���� ����
			FileWriter fw = new FileWriter("src/save.txt");
			
			//���� ����
			BufferedWriter bw = new BufferedWriter(fw);
			
			//����
			for(���� a : ������) {
				bw.write(a.getName() + "\t" + a.getAdress() + "\t");
				bw.write(a.getMath() + "\t" + a.getEnglish() + "\t");
				bw.write(a.getTotal() + "\t" + a.getAverage() + "\t");
				bw.newLine();
			}
			
			//�ݱ�
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

