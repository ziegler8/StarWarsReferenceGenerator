import java.util.Random;

public class Star_Wars_Quotes {
  public static void main(String[] args) {
    String[] memeStarWarsQuotes = {
        "Obi-Wan Kenobi drops from the ceiling in front of General Grievous.\nObi-Wan: 'Hello there.'\nGeneral Grievous: 'General Kenobi!'",

        "Darth Vader force-chokes an officer during a meeting.\nOfficer: 'Your sad devotion to that ancient religion—'\nDarth Vader: 'I find your lack of faith disturbing.'",

        "Anakin and Obi-Wan clash sabers on Mustafar.\nObi-Wan: 'It’s over, Anakin! I have the high ground!'\nAnakin: 'You underestimate my power!'",

        "Padmé confronts Anakin as the Republic falls.\nPadmé: 'So this is how liberty dies... with thunderous applause.'",

        "Palpatine, about to execute Mace Windu, crackles with lightning.\nPalpatine: 'Power! Unlimited power!'",

        "Palpatine glares at the Jedi Council.\nPalpatine: 'I am the Senate.'\nMace Windu: 'Not yet.'\nPalpatine: 'It’s treason, then.'",

        "Obi-Wan tries to reason with Anakin.\nObi-Wan: 'You were the Chosen One! It was said you would destroy the Sith, not join them! Bring balance to the Force, not leave it in darkness!'",

        "Luke confronts Vader.\nVader: 'Obi-Wan never told you what happened to your father.'\nLuke: 'He told me enough! He told me you killed him!'\nVader: 'No... I am your father.'",

        "Yoda trains Luke on Dagobah.\nLuke: 'I’ll try.'\nYoda: 'No. Try not. Do... or do not. There is no try.'",

        "Rebel pilot hears orders during trench run.\nController: 'Stay on target... stay on target!'",

        "Han responds to Leia’s heartfelt confession.\nLeia: 'I love you.'\nHan: 'I know.'",

        "Anakin flirts awkwardly on Naboo.\nAnakin: 'I don’t like sand. It’s coarse, and rough, and irritating... and it gets everywhere.'",

        "Qui-Gon stops Obi-Wan during an underwater escape.\nQui-Gon: 'There’s always a bigger fish.'",

        "Stormtroopers search Tatooine.\nObi-Wan waves his hand.\nObi-Wan: 'These aren’t the droids you’re looking for.'",

        "Han Solo confidently reassures Threepio.\nC-3PO: 'Sir, the possibility of successfully navigating an asteroid field is approximately 3,720 to 1.'\nHan: 'Never tell me the odds!'",

        "Vader looks upon Luke after being defeated.\nLuke: 'I am a Jedi, like my father before me.'",

        "Mandalorian helps a villager, turns to go.\nDin Djarin: 'This is the way.'"
    };

    Random rand = new Random();
    int randomNumber = rand.nextInt(memeStarWarsQuotes.length -1);

    System.out.println(memeStarWarsQuotes[randomNumber]);
  }
}