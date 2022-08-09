public class PlayerStatus
{
    private int lives;
    private double energy;


    public PlayerStatus()
    {
        lives = 5;
        energy = 30;
    }

    public int returnLives()
    {
        return lives;
    }

    public double returnEnergy()
    {
        return energy;
    }

    public int increaseLives(int livesAdded)
    {
        lives += livesAdded;
        return lives;
    }

    public int decreaseLives(int livesSubtracted)
    {
        lives -= livesSubtracted;
        return lives;
    }

    public double increaseEnergy(double energyIncreased)
    {
        energy += energyIncreased;
        return energy;
    }

    public double decreaseEnergy(double energyDecreased)
    {
        energy -= energyDecreased;
        return energy;
    }
}
