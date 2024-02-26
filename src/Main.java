public class Main{

    static{
        System.out.println("Class is loaded");
    }

    public static void main(String str []){

        try{
            Class c = Class.forName(str[0]);
            c.newInstance();

        }
        catch(Exception e){

            System.out.println("Enter the class name for which you want to create object at run time 'Dynamic object creation' ");
        }


    }

}



class A{
    public A(){
        System.out.println("Object is getting created of Class A");
    }

}
class B{
    public B(){
        System.out.println("Object is getting created of Class B");
    }

}