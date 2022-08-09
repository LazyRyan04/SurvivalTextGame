public class Main
{
    PlayerStatus player = new PlayerStatus();
    System.out.println("Welcome Player! You will now begin a journey of survival on a an island" +
            "that has been not yet been discovered (well, it's discovered by you at least :P " +
            "You shall now do all that you can to survive this island. To start off, here are your stats:" +
            "Lives: " + player.returnLives() + "\n Energy: " + player.returnEnergy()+ ". Your lives are " +
            "affected by dehydration (1.5 days) and malnutrition (2 days), and each strike will cost you " +
            "one life. Your lives can be increased by certain actions, but the maximum you can have is 5. " +
            "Your energy allows you to do work on the island and is decreased by every action you take. " +
            "Injuries will lower your maximum energy. You will start off with the amount of energy listed " +
            "above, but this will decrease after week 1, until the max energy is 20. " +
            "\n For additional help, please see the Help Section. Each action will provide a little snippet " +
            "of what the action does, and what is affected. GOOD LUCK!")

    //HELP SECTION, BUILD PLZ

}
