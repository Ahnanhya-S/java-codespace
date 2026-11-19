class student{
  String name;
  void ShowName(){
   System.out.println("student name:" + name);
  }
 }
 public class main{
   public static void main (String[] args){
     student s = new student();
     s.name="ahnan";
     s.ShowName();
   }
}