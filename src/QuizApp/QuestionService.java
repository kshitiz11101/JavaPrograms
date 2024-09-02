import javax.swing.text.Style;
import java.util.Scanner;

public class QuestionService {
    Questions[] questions =new Questions[5];
    String selection[]=new String[5];
    public QuestionService() {
        questions[0]=new Questions(1,"1st Lang","Java","Cpp","Python","Dart","Cpp");
        questions[1]=new Questions(2,"2nd Lang","Java","Cpp","Python","Dart","Cpp");
        questions[2]=new Questions(3,"3rd Lang","Java","Cpp","Python","Dart","Cpp");
        questions[3]=new Questions(4,"4th Lang","Java","Cpp","Python","Dart","Cpp");
        questions[4]=new Questions(5,"5th Lang","Java","Cpp","Python","Dart","Cpp");
    }
    public void displayQuestions(){
       for (Questions q : questions) {
           System.out.println(q.getQuestion());
       }
    }
    public void playQuiz(){
        int i=0;
        for (Questions q : questions) {
            System.out.println("Question No.:"+ q.getId());
            System.out.println("Question :"+ q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc=new Scanner(System.in);

            selection[i]= sc.nextLine();
            i++;
        }
        for(String s:selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score=0;
        for (int i=0;i<questions.length;i++) {
            Questions q=questions[i];
            String ans=q.getAnswer();
            String userAns=selection[i];
            if(ans.equals(userAns)){
                score++;
            }
        }
        System.out.println("Your Score is: "+score);
    }

}
