package Program;

	public class ����{
		//�̸�
		String name;
		//�ּ�
		String adress;
		//����
		double math;
		//����
		double english;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public double getMath() {
			return math;
		}
		public void setMath(double math) {
			this.math = math;
		}
		public double getEnglish() {
			return english;
		}
		public void setEnglish(double english) {
			this.english = english;
		}
		
		//getTotal()
		public double getTotal() {
			return math + english;
		}
		//getAverage()
		public double getAverage() {
			return getTotal()/2.0;
		}
		
		@Override
		public String toString() {
			return "���� [name = " + name + ", adress = " + adress + ", math = " + math + ", english = " + english + ", total = " + getTotal() + ", average = "+ getAverage() +"]";
		}
	}
