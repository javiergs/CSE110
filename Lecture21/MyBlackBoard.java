public class MyBlackBoard {

    public static void main(String []a) {
        Quiz q1 = new Quiz("CSE110 - Quiz 1");
        q1.add (new Question("2 + 2 = ?"));
        q1.add (new Question("5 * 2 + 10 = ?"));
        q1.add (new Question("0 / 5 = ?"));

        Quiz q2 = new Quiz("CSE110 - Quiz 2");
        q2.add (new Question("What is the capital of AZ?"));
        q2.add (new Question("What is the capital of TX?"));
        q2.add (new Question("is a + b equal to ab? (yes or no)"));        

        Student john = new Student ("John Doe", University.createNewID());
        Student jane = new Student ("Jane Doe", University.createNewID());
        
        john.solveQuiz(q1);
        john.getGrade();
        john.solveQuiz(q2);
        john.getGrade();

        jane.solveQuiz(q1);
        jane.getGrade();
        jane.solveQuiz(q2);
        jane.getGrade();         
    }
    
}
