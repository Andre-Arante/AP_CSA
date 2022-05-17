
public record Student(String name, int grade, double gpa) {
    
    public boolean hasSameName(Student s2) {
        return this.name.equals(s2.name);
    }

    public static double higherGpa(Student s1, Student s2) {
        return Math.max(s1.gpa, s2.gpa);
    }
}

