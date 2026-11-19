interface Game {
void play(); // abstract method
}

class Cricket implements Game {
@Override
public void play() {
System.out.println("Playing Cricket... Batting and Bowling!");
}
}

class Football implements Game {
@Override
public void play() {
System.out.println("Playing Football... Kicking and Goalkeeping!");
}
}

public class SportsInterfaceDemo {
public static void main(String[] args) {
// Create objects using interface reference
Game g1 = new Cricket();
Game g2 = new Football();

g1.play();
g2.play();
}
}