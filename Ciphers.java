
public class Ciphers {
	private String sent;
	private int shift;
	
	public Ciphers(String s, int sh){
		sent = s;
		shift = sh;
	}
	
	public void CaesarCipher(){		
		char charSen[] = sent.toCharArray();
		
		while(shift > 26){
			shift -= 26;
			
			if(shift < 26){
				break;
			}
		}
		
		for(int k = 0; k < charSen.length; k++){			
			if(charSen[k] == 32){										//Spaces
				System.out.print((char)(charSen[k]));
			}
			else if(charSen[k] > 47 && charSen[k] < 58){				//Numbers
				System.out.print((char)(charSen[k]));
			}
			else if(!(charSen[k] >= 97) && !(charSen[k] + shift > 90)){	//Upper case letters
				System.out.print((char)(charSen[k] + shift));
				}
			else if(charSen[k] >= 97 && !(charSen[k] + shift > 122)){	//Lower case letters
				System.out.print((char)(charSen[k] + shift));
			}
			else if(charSen[k] + shift > 90 && !(charSen[k] >= 97)){	//Shifting upper case last letters to top
				System.out.print((char)((charSen[k] - 26) + shift));
			}
			else if(charSen[k] + shift > 122){							//Shifting lower case last letters to top
				System.out.print((char)((charSen[k] - 26) + shift));
			}
			else{
				continue;
			}
		}
	}
	
	public void LeftShift(){
		char charSent[] = sent.toCharArray();
		
		while(shift > 26){
			shift -= 26;
			
			if(shift < 26){
				break;
			}
		}
		
		for(int k = 0; k < charSent.length; k++){			
			if(charSent[k] == 32){										//Spaces
				System.out.print((char)(charSent[k]));
			}
			else if(charSent[k] > 47 && charSent[k] < 58){				//Numbers
				System.out.print((char)(charSent[k]));
			}
			else if(charSent[k] < 91 && !(charSent[k] - shift < 65)){	//Upper case letters
				System.out.print((char)(charSent[k] - shift));
				}
			else if(charSent[k] <= 122 && !(charSent[k] - shift < 97)){	//Lower case letters
				System.out.print((char)(charSent[k] - shift));
			}
			else if(charSent[k] - shift < 65 && !(charSent[k] < 65)){	//Shifting upper case last letters to top
				System.out.print((char)((charSent[k] + 26) - shift));
			}
			else if(charSent[k] - shift < 97 && !(charSent[k] < 97)){	//Shifting lower case last letters to top
				System.out.print((char)((charSent[k] + 26) - shift));
			}
			else{
				continue;
			}
		}
	}
	
	public void TwoLetters(){
		char senChar[] = sent.toLowerCase().toCharArray();
		
		int count = 1;
		
		int block = 0;
		
		for(int l = 0; l < 3; l++){
			if(senChar.length %2 != 0 && count%2 != 0){
				count++;
			}
			else if(count %2 == 0){
				break;
			}
		}
		
		int numLett[] = new int[senChar.length];
		
		for(int i = 0; i < senChar.length; i++){
			if(senChar[i] == 32){
				numLett[i] = 99;
			}
			else if(senChar[i] >= 97 && senChar[i] <= 122){	//Letters
				numLett[i] = senChar[i] - 96;
			}
			else if(senChar[i] >=  48 && senChar[i] <= 57){	//Numbers
				numLett[i] = senChar[i] - 21;
			}
			else if(senChar[i] == 46){	//Period
				numLett[i] = 37;
			}
			else if(senChar[i] == 33){	//!
				numLett[i] = 38;
			}
			else if(senChar[i] == 63){	//Question Mark
				numLett[i] = 39;
			}
			else if(senChar[i] == 44){	//Comma
				numLett[i] = 40;
			}
			else if(senChar[i] == 59){	//Semicolon
				numLett[i] = 41;
			}
			else{						//No number assigned
				System.out.println(numLett[i]);
				numLett[i] = 99;
			}
		}
		for(int k = 0; k < numLett.length; k++){
			if(numLett[k] != 99 && numLett[k] + shift >= 42){
				if((numLett[k] - 41) + shift < 10){
					System.out.print("0" + ((numLett[k] - 41) + shift));
				}
				else{
					System.out.print((numLett[k] - 41) + shift);
				}
			}
			else if(numLett[k] != 99 && numLett[k] + shift < 42 && !(numLett[k] + shift < 10)){
				System.out.print(numLett[k] + shift);
			}
			else if(numLett[k] + shift < 10){
				System.out.print("0" + (numLett[k] + shift));
			}
			else if(numLett[k] == 99){
				continue;
			}
			
			if(block == 1){		//Block Spaces
				System.out.print(" ");
				block = 0;
			}
			else{
				block = 1;
				continue;
			}
		}
		for(int m = 0; m < count - 1; m++){
			System.out.print(26 + shift);
		}
	}
}
