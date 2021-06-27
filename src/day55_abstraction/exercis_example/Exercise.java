package day55_abstraction.exercis_example;

public abstract class Exercise {
    public void start(){
        System.out.println("warming up and starting the exercise");
    }
    /** abstract method- method without body just signature
     * purpose: letting sub classes implement/ override their own way  */
public abstract void perform();

/**another abstract method that concrete sub classes will override/ implement
 * @param minutes how long is exercise is performed
 * @return average number of calories while running is 13 */
  public abstract int getCaloriesCount (int minutes);


}
