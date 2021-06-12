
package Lab_4.Encaptulation;
public class Test
{
    public static void main(String[] args)
    {
        StudentClass  student1 = new StudentClass ();
        student1.setName("Milon Mondal");
        student1.setID(18);
        student1.setDept("CSE");
        student1.setCGPA(3.77);
        
        System.out.println(student1.getName());
        System.out.println(student1.getID());
        System.out.println(student1.getDept());
        System.out.println(student1.getCGPA());
    }
}
