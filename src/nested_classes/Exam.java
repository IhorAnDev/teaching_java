package nested_classes;

public class Exam {
    private int id;

    public Exam(int id) {
        this.id = id;
    }

    public void start() {
        Session session = new Session();
        session.startSession();

        int finalId = 1;
        class SomeClass {
            public void doSomething() {
                int result = finalId + id;
                System.out.println("SomeClass is doing something and produce result: " + result);
            }
        }
        SomeClass someObj = new SomeClass();
        test(someObj);

    }

    private void test(Object object) {
        System.out.println(object);
    }

    private class Session {
        public void startSession() {
            System.out.println("Session " + id + " is starting");
        }
    }

    public static class Teacher {
        public void teach() {
            System.out.println("Teacher is teaching");
        }
    }
}
