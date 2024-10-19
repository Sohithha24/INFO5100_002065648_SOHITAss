import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Session {
    Parttime p[] = new Parttime[10];
    Fulltime f[] = new Fulltime[10];

    public void CreateStudents() {
        // Initialize objects
        for (int i = 0; i < 10; i++) {
            this.p[i] = new Parttime();  // Create a new Parttime object
            this.f[i] = new Fulltime();  // Create a new Fulltime object
            
            this.p[i].name = "";
            this.f[i].name = "";
            
            this.f[i].examscore1 = 0;
            this.f[i].examscore2 = 0;
            
            for (int j = 0; j < 15; j++) {
                this.p[i].quizscore[j] = 0;
                this.f[i].quizscore[j] = 0;
            }
        }

        // Set name and quiz score for students (10 part-time + 10 full-time)
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            this.p[i].name = "parttime" + (i + 1);
            this.f[i].name = "fulltime" + (i + 1);

            this.f[i].examscore1 = rand.nextInt(100);
            this.f[i].examscore2 = rand.nextInt(100);

            for (int j = 0; j < 15; j++) {
                this.p[i].quizscore[j] = rand.nextInt(10);
                this.f[i].quizscore[j] = rand.nextInt(10);
            }
        }
    }

    public void PrintStudentDetails() {
        // PartTimeStudentDetails
        System.out.println("PartTimeStudentDetails");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + this.p[i].name);
            for (int j = 0; j < 15; j++) {
                System.out.println("Quiz Marks: " + this.p[i].quizscore[j]);
            }
        }

        // FullTimeStudentDetails
        System.out.println("FullTimeStudentDetails");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + this.f[i].name);
            System.out.println("Exam Score 1: " + this.f[i].examscore1);
            System.out.println("Exam Score 2: " + this.f[i].examscore2);
            for (int j = 0; j < 15; j++) {
                System.out.println("Quiz Marks: " + this.f[i].quizscore[j]);
            }
        }
    }

    public ArrayList<Double> average = new ArrayList<>(); //store avg marks of 20 students 
    public void CalculateAverage() {
        System.out.println("--CalculateAverage--");
        
        double avg_score=0;
        int total=0;

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<15;j++)
            {
                total+=p[i].quizscore[j];
            }
            avg_score=total/15;
            System.out.println("Studentname: "+p[i].name+" -- Avg Score: "+ avg_score);
            average.add(avg_score);
        }

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<15;j++)
            {
                total+=f[i].quizscore[j];
            }
            avg_score=total/15;
            System.out.println("Studentname: "+f[i].name+" -- Avg Score: "+ avg_score);
            average.add(avg_score);
        }
    }

    public void PrintQuizScores() {
        System.out.println("--PrintQuizScores In Ascending Order--");
        Collections.sort(average);

        // Print the sorted average quiz scores
        for (double score : average) {
            System.out.println("Average Quiz Score: " + score);
        }
    }

    public void PrintPartTimeStudentNames() {
        System.out.println("--PrintPartTimeStudentNames--");
        for(int i=0;i<10;i++)
        {
            System.out.println(p[i].name);
        }
    }
    public void ExamScoreOfFullTimeStudents() {
        System.out.println("--ExamScoreOfFullTimeStudents--");
        for(int i=0;i<10;i++)
        {
            System.out.println("Student Name::"+f[i].name+"-> Exam Score1: "+f[i].examscore1);
            System.out.println("Student Name::"+f[i].name+"-> Exam Score:"  +f[i].examscore2);
        }
    }
}
