abstract class Games {
  public abstract void start();

  public void stop() {
    System.out.println("Stopping game in abstract class");
  }
}

class GameA extends Games {@Override
  public void start() {
    System.out.println("Starting Game A");
  }
}

class GameB extends Games {@Override
  public void start() {
    System.out.println("Starting Game B");
  }
}

class AbstractExample {
  public static void main(String[] args) {
    Games A = new GameA();
    Games B = new GameB();

    A.start();
    A.stop();

    B.start();
    B.stop();
  }
}