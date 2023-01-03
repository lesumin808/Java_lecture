package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String txt = br.readLine();
		
		char[] N1 = txt.split(" ")[0].toCharArray();
		char[] N2 = txt.split(" ")[1].toCharArray();
		
		String CTot = "";
		String MTot = "";
		
		// Ω√¿€..
		
		for(int i = 0; i < N1.length; i++) {
				if(N1[i] == '6') {
					N1[i] = '5';
					CTot += N1[i];
				}else {
					CTot += N1[i];
				}
		}
		
		for(int i = 0; i < N1.length; i++) {
			if(N1[i] == '5') {
				N1[i] = '6';
				MTot += N1[i];
			}else {
				MTot += N1[i];
			}
		}
		
		CTot += " ";
		MTot += " ";
 
		for(int i = 0; i < N2.length; i++) {
			if(N2[i] == '6') {
				N2[i] = '5';
				CTot += N2[i];
			}else {
				CTot += N2[i];
			}
		}
		
		for(int i = 0; i < N2.length; i++) {
			if(N2[i] == '5') {
				N2[i] = '6';
				MTot += N2[i];
			}else {
				MTot += N2[i];
			}
		}
		
		System.out.print(Integer.parseInt(CTot.split(" ")[0]) + Integer.parseInt(CTot.split(" ")[1]) + " ");
		System.out.print(Integer.parseInt(MTot.split(" ")[0]) + Integer.parseInt(MTot.split(" ")[1]));
		
	}

}