package multithreading;

public class Test2 {
    public static void main(String[] args) {
        Student engineeringStudent = new Student(){
            public String getBio(String name){
                return name +" is Engineering student";
            }
        };

        Student lawstudent = name ->{      //If you have single variable then remove curly and parantheses
            return name +" is Law student";
        };
        String bio = engineeringStudent.getBio("Ram");
        System.out.println(bio);
    }
}
