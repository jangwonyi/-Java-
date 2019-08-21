package Program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//����� 	��õ�� 	100.0 	100.0	total average
//�ڼ��� 	��õ�� 	100.0 	100.0	total average
//��ä�� 	���ֺϱ� 	90.0 	70.0	total average
//��ä�� 	���Ǳ� 	90.0 	98.0	total average

public class SungDatasExam {

	public static void main(String[] args) {
		
		//���� ����(writed.txt)
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//���� ����(readLine())
			BufferedReader br = new BufferedReader(fr);	
			//���� �а�, \t�� ����
			String csvStr = ""; //��� ���� \t�� ���� String
			String tmpStr = ""; //���� �б�� �ӽ� String
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t";
			}
			//token���� ������ ������ ����	
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); //\t�̱� ������ tab�� ����� ��
			int length = parse.countTokens() / 4;
			String[] name = new String[length];
			String[] adress = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			for(int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				adress[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken()); //String -> double
				english[i] = Double.parseDouble(parse.nextToken()); //String -> double
				//total, average ���
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2;
			}
			//���
			//0 ~< length i 
			for(int i = 0; i < length; i++) {
			System.out.println("�̸� : " + name[i] + ", �ּ� : " + adress[i] + ", ���� : " + math[i] + ", ���� : " + english[i] + ", ���� : " + total[i] + ", ��� : " + avg[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
