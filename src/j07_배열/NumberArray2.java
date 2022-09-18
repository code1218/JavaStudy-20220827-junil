package j07_배열;

public class NumberArray2 {

	public static void main(String[] args) {
		
//		int[] numArray = new int[10];
//		
//		for(int i = 0; i < numArray.length; i++) {
//			numArray[i] = i * 10;
//		}
//		
//		for(int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}
		int studentSize = 10;
		
		int[] codeArray = new int[studentSize];
		String[] nameArray = new String[studentSize];
		
		for(int i = 0; i < codeArray.length; i++) {
			codeArray[i] = 20220001 + i;  
		}
		
		nameArray[0] = "임자빈"; 
		nameArray[1] = "정윤교"; 
		nameArray[2] = "정지음"; 
		nameArray[3] = "차하늘"; 
		nameArray[4] = "김기덕"; 
		nameArray[5] = "장은화"; 
		nameArray[6] = "김규민"; 
		nameArray[7] = "임지현"; 
		nameArray[8] = "노희수"; 
		nameArray[9] = "정빈"; 
		
		System.out.println("[학생정보]");
		for(int i = 0; i < studentSize; i++) {
			System.out.println("학번: " + codeArray[i]);
			System.out.println("이름: " + nameArray[i]);
		}

	}

}
