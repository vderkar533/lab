class Sports {
    public void play() {
        System.out.println("Playing generic sports.");
    }
}

class Football extends Sports {
   
    public void play() {
        System.out.println("Playing Football.");
    }
}

class Basketball extends Sports {
   
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

class Rugby extends Sports {
    
    public void play() {
        System.out.println("Playing Rugby.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sports sports = new Sports();
        sports.play();

        Football football = new Football();
        football.play();

        Basketball basketball = new Basketball();
        basketball.play();

        Rugby rugby = new Rugby();
        rugby.play();
    }
}
