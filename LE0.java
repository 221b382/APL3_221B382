public class Juet {
    
    private String name;
    private int age;
    
   
     void setName(String name) {
        this.name = name;
    }
    
    
      void setAge(int age) {
        this.age = age;
    }

    
      String getName() {
        return name;
    }

   
   
    int getAge() {
        return age;
    }



    public static void main(String[] args) {
       
        Juet person = new Juet();

        
        person.setName("Hardik Kashyap");
        person.setAge(21);

       
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}