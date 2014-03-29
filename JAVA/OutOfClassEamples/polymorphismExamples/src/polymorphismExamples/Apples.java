package polymorphismExamples;

public class Apples {
	public static void main(String[] args){
		
		Food derfOh[] = new Food[2];//new food array
		derfOh[0] = new PotPie();//assign reference variable of the super class to a subclass
		derfOh[1] = new Tuna();
		
		for (int x=0; x<2; ++x){
			derfOh[x].eat();//loops through each object and calls their respective eat method
		}
		
		//
	}
}
