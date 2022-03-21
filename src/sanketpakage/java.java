package sanketpakage;

public class java {

	public static void main(String[] args) {
		String a= "R A H U L";
		char d=' ';
		int count =0;
		
		for(int i=0;i<=a.length()-1;i++) {
			char c =a.charAt(i);
			if(d==c) {
				count++;
			}
		}
		System.out.println(count);
		}

	}


