package corejavabasics;
class Student {
   private static String school;
   public static boolean schoolIsOpen;
   String studName;  
   
   public static void setSchool(String schoolName) {
	   school = schoolName;
   }     
   public static String getSchool() {
	   return school;
  }
}

public class StaticClass {
   public static void main(String args[]) {
       Student.setSchool("JMV");
       Student.schoolIsOpen = false;
       Student s1 = new Student();
       Student s2 = new Student();
       s1.studName = "Meena";
       s2.studName = "Beena";
       System.out.println(s1.getSchool() + "\t" + s2.getSchool());
       System.out.println(s1.schoolIsOpen + "\t" + s2.schoolIsOpen);
       System.out.println();
       Student.setSchool("MVJ");
       Student.schoolIsOpen = true;
       System.out.println(s1.getSchool() + "\t" + s2.getSchool());
       System.out.println(s1.schoolIsOpen + "\t" + s2.schoolIsOpen);   
   }
}