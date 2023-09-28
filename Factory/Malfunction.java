package PractikaTryCatchFinally.Factory;

class Malfunction extends RuntimeException {

    public Malfunction(String message) {
        super(message);
    }

    public static void stend(String message) throws Malfunction {
        throw new Malfunction(message);
    }
}

