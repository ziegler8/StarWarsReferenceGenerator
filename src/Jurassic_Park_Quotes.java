import java.util.Random;

public class Jurassic_Park_Quotes {
    public static void main(String[] args) {
        String[] jurassicParkScenes = {
            "The first time the T-Rex appears, stomping and roaring.\nDr. Grant (in awe): 'Boy, do I hate being right all the time.'",

            "Ian Malcolm delivers his chaotic wisdom while waving his hands dramatically.\nIan Malcolm: 'Life, uh... finds a way.'",

            "The group sees their first Brachiosaurus towering above the trees.\nDr. Grant (whispering): 'Welcome... to Jurassic Park.'",

            "During the Jeep chase, a T-Rex roars behind them.\nRear-view mirror warning reads: 'Objects in mirror are closer than they appear.'",

            "Muldoon realizes he’s been outsmarted by raptors.\nMuldoon: 'Clever girl.' *Raptor pounces*",

            "Dennis Nedry, trying to smuggle embryos, taunts a tiny dinosaur.\nNedry: 'Ah-ah-ah! You didn’t say the magic word!'",

            "John Hammond dreams big, despite chaos.\nHammond: 'We spared no expense!'",

            "Ian Malcolm, shirt half-open, chaos-theory-ing his way through life.\nIan Malcolm: 'Your scientists were so preoccupied with whether they could, they didn’t stop to think if they should.'",

            "Tim gets zapped after climbing an electrified fence.\nLex: 'He’s gonna get electrocuted!'\nTim (after falling off): 'Well... that was... uh... something.'",

            "While watching the dinosaurs feed, Hammond reassures the guests.\nHammond: 'When they opened Disneyland in 1956, nothing worked!'\nMalcolm: 'Yeah, but when the Pirates of the Caribbean breaks down, the pirates don’t eat the tourists.'",

            "The T-Rex breaks out of its paddock for the first time.\nLex (terrified): 'He left us!'\nDr. Grant (grabbing her): 'But that’s not what I’m gonna do!'",

            "Samuel L. Jackson delivers his most iconic Jurassic Park line.\nRay Arnold: 'Hold onto your butts.'",

            "Nedry tries to bargain with a Dilophosaurus right before dying.\nNedry: 'Hey, hey! No wonder you’re extinct! I’m gonna run you over when I come back down!'",

            "The power goes out and the fences deactivate.\nDr. Sattler: 'The fences are down?' \nMuldoon: 'Yes. The fences are down.' *raptors scream in distance*",

            "Malcolm, sweaty and sarcastic after chaos erupts.\nIan Malcolm: 'Yeah, but when the T-Rex comes through the fence, don’t come crying to me!'"
        };

        Random rand = new Random();
        int randomNumber = rand.nextInt(jurassicParkScenes.length);

        System.out.println(jurassicParkScenes[randomNumber]);
    }
}
