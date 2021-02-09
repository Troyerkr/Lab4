import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The random number is: " + randomNum);
    int lastCheck = randomNum;

    //I just reused my code from lab 3
    System.out.println(randomNum);
    
      while (randomNum != 0) {
        randomNum = randomNum - 1;
        System.out.println(randomNum);
      }

    if(lastCheck <= 15 ){
      System.out.println("Ahoy mateys!");
    } else if(lastCheck > 20 & lastCheck <42){
      System.out.println("Cannonball!");
    }else{
      System.out.println("Look, a sea shanty!");
    }

  }
}