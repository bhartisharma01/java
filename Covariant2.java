package javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Complete the classes below
class Flower {
    String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
   String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower {
    String whatsYourName(){
        return "Lily";
    }
}

class Region{
    Flower yourNationalFlower(){
        // System.out.println("An instance of flower");
        return new Flower();
      
    }
   
}

class WestBengal extends Region{
    Jasmine yourNationalFlower(){
        // System.out.println("An instance of Jasmine");
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    Lily yourNationalFlower(){
        // System.out.println("An instance of Jasmine");
        return new Lily();
    }
}


public class Covariant2 {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Region r = new Region();
      System.out.println("region testing" +r.yourNationalFlower());
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}