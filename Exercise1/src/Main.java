
public class Main {
    public static void main(String[] args) {
        Session s=new Session();
        s.CreateStudents();
        //s.PrintStudentDetails();
        s.CalculateAverage();
        s.PrintQuizScores();
        s.PrintPartTimeStudentNames();
        s.ExamScoreOfFullTimeStudents();
    }
}