public class Main {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Ayush",
                22,
                101,
                9.1,
                "Artificial Intelligence in Education"
        );

        System.out.println(gs);
        Person p = gs;     
        Student s = gs;    

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("GradStudent IS-A Student : " + (gs instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (gs instanceof Person));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));

        System.out.println("\nAccess through Person reference:");
        System.out.println(p);
    }
}