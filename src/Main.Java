import java.util.Random;

public class Main {
  public static void main(String[] args) {
    String[] memeStarWarsQuotes = {
    "\"Hello there.\" - Obi-Wan Kenobi",
    "\"General Kenobi!\" - General Grievous",
    "\"I hate sand.\" - Anakin Skywalker",
    "\"You underestimate my power!\" - Anakin Skywalker",
    "\"It’s over, Anakin! I have the high ground!\" - Obi-Wan Kenobi",
    "\"This is outrageous, it's unfair!\" - Anakin Skywalker",
    "\"Do it.\" - Emperor Palpatine",
    "\"Unlimited power!\" - Emperor Palpatine",
    "\"I am the Senate.\" - Emperor Palpatine",
    "\"Not from a Jedi.\" - Emperor Palpatine",
    "\"So uncivilized.\" - Obi-Wan Kenobi",
    "\"There’s always a bigger fish.\" - Qui-Gon Jinn",
    "\"Mesa called Jar Jar Binks.\" - Jar Jar Binks",
    "\"Now this is podracing!\" - Anakin Skywalker",
    "\"I don’t like sand. It’s coarse and rough and irritating, and it gets everywhere.\" - Anakin Skywalker",
    "\"My powers have doubled since the last time we met, Count.\" - Anakin Skywalker",
    "\"Only a Sith deals in absolutes.\" - Obi-Wan Kenobi",
    "\"I am one with the Force and the Force is with me.\" - Chirrut Îmwe",
    "\"Somehow Palpatine returned.\" - Poe Dameron",
    "\"More! More!\" - Kylo Ren",
    "\"From my point of view, the Jedi are evil!\" - Anakin Skywalker",
    "\"Another happy landing.\" - Obi-Wan Kenobi",
    "\"This is where the fun begins.\" - Anakin Skywalker",
    "\"I’ve got the high ground!\" - Obi-Wan Kenobi (parody/meme phrasing)",
    "\"I’m a person and my name is Anakin!\" - Anakin Skywalker",
    "\"I am a Jedi, like my father before me.\" - Luke Skywalker (used in memes ironically)",
    "\"I’m Rey... Rey Skywalker.\" - Rey (meme format: “Nobody asked”)",
    "\"They fly now?!\" - Finn, Poe, and C-3PO",
    "\"He’s too dangerous to be left alive.\" - Mace Windu",
    "\"It’s treason, then.\" - Chancellor Palpatine",
    "\"This is getting out of hand. Now there are two of them!\" - Nute Gunray"
};


    Random rand = new Random();
    int randomNumber = rand.nextInt(memeStarWarsQuotes.length + 1);

    System.out.println(memeStarWarsQuotes[randomNumber]);
  }
}