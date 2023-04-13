package week6;

public class StringArray {
	public static void main(String[] args) {
		String[] sArray = new String[3];
		sArray[0] = "Java";
		sArray[1] = "Java";
		sArray[2] = new String("java");
		
		boolean bVal = (sArray[0] == sArray[1]);
		System.out.println("sArray[0], [1] : " + bVal);
		
		bVal = (sArray[0] == sArray[2]);
		System.out.println("sArray[0], [2] : " + bVal);
		
		if(sArray[0].equals(sArray[2])) {
			System.out.println("sArray[0], [2]는 동일한 문자열");
		}
	}
}
