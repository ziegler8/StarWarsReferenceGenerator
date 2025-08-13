import java.util.Random;

public class Holy_Grail_Quotes {
  public static void main(String[] args) {
    String[] montyPythonScenes = {
        "Black Knight stands in the middle of the bridge, bleeding profusely.\nBlack Knight: 'It’s just a flesh wound!'",

        "French soldier taunts King Arthur from atop the castle wall.\nFrench Taunter: 'I fart in your general direction! Your mother was a hamster and your father smelt of elderberries!'",

        "The knights approach a mysterious old man in the forest.\nKnights: 'Who are you?'\nOld Man: 'We are the Knights who say... Ni!'",

        "Bridgekeeper blocks the way across a deadly gorge.\nBridgekeeper: 'What... is the air-speed velocity of an unladen swallow?'\nArthur: 'What do you mean? An African or European swallow?'\nBridgekeeper: 'Huh? I don’t know that!' *gets flung into the gorge*",

        "Peasant woman accuses a girl of being a witch.\nVillager: 'She turned me into a newt!'\nSir Bedevere: 'A newt?'\nVillager (sheepishly): '...Well, I got better.'",

        "A plague cart rolls through the muddy village.\nDead Collector: 'Bring out yer dead!'\nMan dumps body.\nBody: 'I’m not dead!'\nDead Collector: 'Yes you are!'",

        "Arthur tries to assert his kingship to a group of peasants.\nArthur: 'I am your king!'\nDennis: 'Well I didn’t vote for you!'\nArthur: 'You don’t vote for kings!'\nDennis: 'Strange women lying in ponds distributing swords is no basis for a system of government.'",

        "The Knights who say Ni change their demands.\nKnight of Ni: 'We are now no longer the Knights who say Ni! We are the Knights who say... Ekki-ekki-ekki-pitang-zoom-boing!'",

        "As the killer bunny attacks the knights...\nKing Arthur: 'Run away! Run away!'",

        "Arthur has hacked off both of the Black Knight’s arms.\nBlack Knight: 'I’m invincible!'\nArthur: 'You’re a loony.'",

        "French soldiers respond to Arthur’s quest for the Grail.\nKing Arthur: 'We seek the Holy Grail!'\nFrench Taunter: 'We’ve already got one!'",

        "Inside the castle during a hostage situation.\nKing of Swamp Castle: 'This is supposed to be a happy occasion! Let’s not bicker and argue about who killed who.'",

        "After endless insults from the castle wall...\nFrench Taunter: 'Now go away or I shall taunt you a second time!'"
    };

    Random rand = new Random();
    int randomNumber = rand.nextInt(montyPythonScenes.length - 1);

    System.out.println(montyPythonScenes[randomNumber]);
  }
}