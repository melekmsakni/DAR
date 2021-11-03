import java.util.ArrayList;
import java.util.List;

public class TestThread {

    static class Student {
        private String firstName;
        private String lastName;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    static class MyThread extends Thread {

        private List<Student> students;

        public MyThread(List<Student> students) {
            this.students = students;
        }

        @Override
        public void run() {
               Student student = new Student("flen", "wled falten");
               students.add(student);
            System.out.println(student.firstName+" "+student.lastName);
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Student> students = new ArrayList<>();
        MyThread myThread = new MyThread(students);
        for (int i = 0; i < 10; i++) {
            new MyThread(students).start();
        }
        Thread.sleep(2000);
        System.out.println("size : "+students.size());

    }
}
