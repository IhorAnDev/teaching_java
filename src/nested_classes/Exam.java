package nested_classes;

public class Exam {
    private int id;

    public Exam(int id) {
        this.id = id;
    }

    public static void examStatic() {

    }

    public void start() {
        Session session = new Session();
        session.startSession();

        final int finalId = 2;

        class SomeClass {
            public void doSomething() {
                int result = finalId + id;
                System.out.println(" SomeClass is doing smthng an produce resuld: " + result);
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
            System.out.println("Session with exam id:" + id + " is starting");
        }
    }


    public static class Teacher {
        public void teach() {
            System.out.println(" Teacher is teaching");
        }
    }
}

