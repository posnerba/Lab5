import java.util.ArrayList;

class Main 
{  
  public static void main(String[] args) 
  { 
    Student student1 = new Student();
    Student student2 = new Student();

    ArrayList<Double> gpas = new ArrayList<Double>(); 


    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    gpas.add(0, 4.0);
    
    student2.setName("Brittany Posner");
    student2.setGPA(4.3);
    student2.setMajor("Operations Management and Information Systems");
    gpas.add(1, 4.3);

    
   System.out.println("\nThe student's name is " + student1.getName() + "\nThe student's GPA is " + student1.getGPA() + "\nThe student's major is " + student1.getMajor());

   System.out.println("The student's name is " + student2.getName() + "\nThe student's GPA is " + student2.getGPA() +  "\nThe student's major is " + student2.getMajor()); 

   
    double sum;
    sum = gpas.get(0) + gpas.get(1); 
    int size = gpas.size();
    double average = sum/size;
    System.out.println("The average GPA is " + average);

   

  }
}



