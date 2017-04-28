import java.util.ArrayList;
public class GradeAnalyzer{
  //This program is a grade analyzer which can calculate the grade of an arraylist
  public GradeAnalyzer(){
    
  }
  public int getAverage(ArrayList<Integer> grades){

    if(grades.size()<1){ 
      System.out.println("Error: ArrayList empty!");
      return 0;
    }
    else{
      int sum=0;
      for(int grade : grades)
        sum+=grade;
      
      int average=sum/grades.size();
      System.out.println(average);
      return average;
     }
    }
  public static void main(String[] args){
    ArrayList<Integer> myClassroom=new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    GradeAnalyzer myAnalyzer= new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
  }
  
}