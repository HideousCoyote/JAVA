import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String q1 = "1. This part of the computer fetches instructions,\n"+ 
					"carries out the operations commanded by the instructions\n"+
					"and produces some outcome ore resultant information.\n" +
					" (a) memory\n (b) CPU \n (c) secondary storage\n (d) input device\n";
		String q2 = "2. A byte is made up of eight _______.\n" +
					" (a) CPU's\n (b) addresses\n (c) variables\n (d) bits\n";
		
		Question [] question = {
				new Question(q1, "b"),	new Question(q2, "d")
		};
		takeTest(question);
	}
	public static void takeTest(Question[] question) {
		int score = 0;
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < question.length; i++) {
			System.out.println(question[i].prompt);
			String answer = keyboard.nextLine();
			if(answer.equals(question[i].answer)) {
				score++;
			}
		}
		System.out.println("You got " + score + "/" + question.length);
		keyboard.close();
	}

}
