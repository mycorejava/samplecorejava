public class SingleTonClass {
    public int b =100;
    //Static Class Reference
    private static SingleTonClass obj= new SingleTonClass();


    private SingleTonClass(){
        /*Private Constructor will prevent
         * the instantiation of this class directly*/
    }
    public static SingleTonClass objectCreationMethod(){
        /*This logic will ensure that no more than
         * one object can be created at a time */
//        if(obj==null){
//            obj= new SingleTonClass();
//        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class Example");
        System.out.println("b="+b);
    }
    public static void main(String args[]){
        //Object cannot be created directly due to private constructor
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        SingleTonClass myobject= SingleTonClass.objectCreationMethod();
        SingleTonClass myobject1= SingleTonClass.objectCreationMethod();
        myobject.display();
        myobject.b = 600;
        myobject1.display();
        myobject1.b = 800;
        SingleTonClass myobject2 = new SingleTonClass();
        myobject2.display();
    }
}