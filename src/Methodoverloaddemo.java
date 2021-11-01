class Worker
{
    public void nameIdentity(String name,int id, String place)
    {
        System.out.println("Worker Name: "+ name+"--"+"Worker Id: "+ id+"--"+ "Worker Place: "+ place);
        System.out.println( );
    }
    public void nameIdentity(String name,int id, String place,String Department)
    {
        System.out.println("Worker Name: "+ name+"--"+"Worker Id: "+ id+ "--"+ "Worker Place: "+ place);
        System.out.println("Department: "+ Department);
        System.out.println( );
    }
    public void nameIdentity(String name, int id, String place,Long salary)
    {
        System.out.println("Worker Name: "+ name +"--"+"Worker Id: "+id+ "--"+ "Worker Place: "+ place+"--"+"Salary: "+salary);
    }
}
public class Methodoverloaddemo
{
    public static void main(String[] args)
    {
        Worker details = new Worker();
        details.nameIdentity("Hari", 123,"Chennai" );
        details.nameIdentity("Haran", 456,"Kochi","Developer");
        details.nameIdentity("Abhishek",800,"Chennai",50000L);
    }



}