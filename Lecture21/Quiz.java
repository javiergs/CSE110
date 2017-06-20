public class Quiz {
    private String title;
    private Question q1;
    private Question q2;
    private Question q3;

    public Quiz(){
      q1 = null; q2 = null; q3 = null;       
    }

    Quiz(String titulo) {
      q1 = null; q2 = null; q3 = null;
      title = titulo;        
    }
    
    public void add(Question question) {
      if (q1 == null) q1 = question;
      else if (q2 == null) q2 = question; 
      else if (q3 == null) q3 = question; 
      else System.out.println("This quiz is complete. No more questions allowed!");
    }   

    public Question getQuestion(int number) {
        if (number==1) return q1;
        else if (number==2) return q2;
        else if (number==3) return q3;
        else return null;
    }

    String getTitle() {
        return title;
    }    
}
