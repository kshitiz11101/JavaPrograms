class Student{
    String name;
    int rollno;
    int marks;
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.rollno = 1;
        s1.marks = 89;
        Student s2 = new Student();
        s2.name = "Jane";
        s2.rollno = 2;
        s2.marks = 85;
        Student s3 = new Student();
        s3.name = "Amit";
        s3.rollno = 3;
        s3.marks = 90;
        Student stud[]=new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        System.out.println(s1);  // Student@3feba861
        System.out.println(s1.name+":"+s1.rollno+ ":"+ s1.marks);
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].name+" "+ stud[i].rollno+" "+stud[i].marks+" ");
        }
        int nums[]=new int[4];
        nums[0]=2;
        nums[1]=3;
        nums[2]=4;
        nums[3]=5;
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        for(int n:nums){
            System.out.println(n);
        }
        for(Student s:stud){
            System.out.println(s.name+":"+s.rollno+":"+s.marks);
        }
    }
}
