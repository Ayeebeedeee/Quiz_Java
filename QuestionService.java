import java.util.Scanner;

public class QuestionService {

    Question[] question=new Question[5];
    String s[]=new String[5];
    public void displayQuestions(){
        question[0]=new Question(1, "Size of int?", "2", "4", "6", "8", "4");
        question[1]=new Question(1, "Size of char?", "2", "4", "6", "8", "2");
        question[2]=new Question(1, "Size of double?", "2", "4", "6", "8", "8");
        question[3]=new Question(1, "Size of float?", "2", "4", "6", "8", "4");
        question[4]=new Question(1, "Size of long?", "2", "4", "6", "8", "8");
        int j=0;
        for(int i=0; i<5;i++){
        System.out.println("Question no:"+question[j].getId());
        System.out.println(question[j].getQuestion());
        System.out.println(question[j].getOpt1());
        System.out.println(question[j].getOpt2());
        System.out.println(question[j].getOpt3());
        System.out.println(question[j].getOpt4());
        Scanner sc=new Scanner(System.in);
        System.out.print("Your answer:");
        s[j++]=sc.nextLine();
        System.out.println();
        }
        int score=0;
        for(j=0;j<5;j++){
            String ans=question[j].getAnswer();
            String userans=s[j];
            if(ans.equals(userans))
            score++;
        }
        System.out.println("Your final score:"+score);
    }
}