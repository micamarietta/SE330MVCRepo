/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.BandModel_1;
import javafxmvc.Models.SongModel;
import javafxmvc.Models.SetListModel;

/**
 *
 * @author rmari
 */
public class BandController {
    List<BandModel_1> bandList = new ArrayList();
    
    
    //set default entries in band/artist list
    public void setEntries(){
        //creates default entries with name and information
        //set names
        BandModel_1 band1 = new BandModel_1();
        band1.setName("Arctic Monkeys");
        BandModel_1 band2 = new BandModel_1();
        band2.setName("The Beatles");
        BandModel_1 band3 = new BandModel_1();
        band3.setName("Clairo");
        BandModel_1 band4 = new BandModel_1();
        band4.setName("The Strokes");
        BandModel_1 band5 = new BandModel_1();
        band5.setName("Bruno Mars");
        BandModel_1 band6 = new BandModel_1();
        band6.setName("Cage the Elephant");
        BandModel_1 band7 = new BandModel_1();
        band7.setName("Paramore");
        
        
        //set info
        band1.setInfo("Arctic Monkeys are an English rock band formed in Sheffield in 2002. The group consists of Alex Turner, Jamie Cook, Nick O'Malley, and Matt Helders. Former band member Andy Nicholson left the band in 2006 shortly after their debut album was released.");
        band2.setInfo("The Beatles were an English rock band formed in Liverpool in 1960. The group, whose best-known line-up comprised John Lennon, Paul McCartney, George Harrison and Ringo Starr, are regarded as the most influential band of all time.");
        band3.setInfo("Claire Elizabeth Cottrill, known professionally as Clairo, is an American singer-songwriter. Born in Atlanta, Georgia, and raised in Carlisle, Massachusetts, she began posting music on the internet at age 13.");
        band4.setInfo("The Strokes are an American rock band from New York City. Formed in 1998, the band is composed of singer Julian Casablancas, guitarists Nick Valensi and Albert Hammond Jr., bassist Nikolai Fraiture, and drummer Fabrizio Moretti. They were a leading group of the early-2000s indie rock revival.");
        band5.setInfo("Peter Gene Hernandez, known professionally as Bruno Mars, is an American singer, songwriter, record producer, musician, and dancer. He is known for his stage performances, retro showmanship, and for performing in a wide range of musical styles, including pop, R&B, funk, soul, reggae, disco, and rock.");
        band6.setInfo("Cage the Elephant is an American rock band formed in 2006 in Bowling Green, Kentucky. They relocated to England and settled in London in 2008, shortly before their self-titled first album was released.");
        band7.setInfo("Paramore is an American rock band from Franklin, Tennessee, formed in 2004. The band currently consists of lead vocalist Hayley Williams, guitarist Taylor York and drummer Zac Farro. Williams and Farro are founding members of the group, while York, a high school friend of the original lineup, joined in 2007.");
        
        //set values in arrayList
        bandList.add(band1);
        bandList.add(band2);
        bandList.add(band3);
        bandList.add(band4);
        bandList.add(band5);
        bandList.add(band6);
        bandList.add(band7);
        
        //create songs
        SongModel band1Song1 = new SongModel("A Certain Romance",
            "Well, oh, they might wear classic Reeboks\n" +
            "Or knackered Converse\n" +
            "Or tracky bottoms tucked in socks\n" +
            "But all of that's what the point is not\n" +
            "The point's that there ain't no romance around there\n" +
            "And there's the truth that they can't see\n" +
            "They'd probably like to throw a punch at me\n" +
            "And if you could only see 'em, then you would agree\n" +
            "Agree that there ain't no romance around there\n" +
            "You know, oh, it's a funny thing you know\n" +
            "We'll tell 'em if you like\n" +
            "We'll tell 'em all tonight\n" +
            "They'll never listen\n" +
            "Because their minds are made up\n" +
            "And course it's all okay to carry on that way\n" +
            "'Cause over there, there's broken bones\n" +
            "There's only music, so that there's new ringtones\n" +
            "And it don't take no Sherlock Holmes\n" +
            "To see it's a little different around here\n" +
            "Don't get me wrong, though, there's boys in bands\n" +
            "And kids who like to scrap with pool cues in their hands\n" +
            "And just 'cause he's had a couple o' cans\n" +
            "He thinks it's all right to act like a dickhead\n" +
            "Don't you know, oh' it's a funny thing you know\n" +
            "We'll tell 'em if you like\n" +
            "We'll tell 'em all tonight\n" +
            "They'll never listen\n" +
            "Because their minds are made up\n" +
            "And course it's all okay to carry on that way\n" +
            "But I said no\n" +
            "Oh no\n" +
            "Well, you won't get me to go\n" +
            "Not anywhere, not anywhere\n" +
            "No, I won't go\n" +
            "Oh no no\n" +
            "Well, over there, there's friends of mine\n" +
            "What can I say? I've known 'em for a long long time\n" +
            "And, yeah, they might overstep the line\n" +
            "But you just cannot get angry in the same way\n" +
            "No, not in the same way\n" +
            "Said, not in the same way\n" +
            "Oh no, oh no no");
        
        SongModel band1Song2 = new SongModel("Snap Out of It", 
            "What's been happenin' in your world?\n" +
            "What have you been up to?\n" +
            "I heard that you fell in love or near enough\n" +
            "I gotta tell you the truth, yeah\n" +
            "I wanna grab both your shoulders and shake, baby\n" +
            "Snap out of it (snap out of it)\n" +
            "I get the feelin' I left it too late, but baby\n" +
            "Snap out of it (snap out of it)\n" +
            "If that watch don't continue to swing\n" +
            "Or the fat lady fancies havin' a sing\n" +
            "I'll be here waitin' ever so patiently\n" +
            "For you to snap out of it\n" +
            "Forever isn't for everyone\n" +
            "Is forever for you?\n" +
            "It sounds like settlin' down or givin' up\n" +
            "But it don't sound much like you, girl\n" +
            "I wanna grab both your shoulders and shake, baby\n" +
            "Snap out of it (snap out of it)\n" +
            "I get the feelin' I left it too late, but baby\n" +
            "Snap out of it (snap out of it)\n" +
            "If that watch don't continue to swing\n" +
            "Or the fat lady fancies havin' a sing\n" +
            "I'll be here waitin' ever so patiently\n" +
            "For you to snap out of it\n" +
            "Under a spell you're hypnotized (ooh)\n" +
            "Darlin', how could you be so blind?\n" +
            "I wanna grab both your shoulders and shake, baby\n" +
            "Snap out of it (snap out of it)\n" +
            "I get the feelin' I left it too late, but baby\n" +
            "Snap out of it (snap out of it)\n" +
            "If that watch don't continue to swing\n" +
            "Or the fat lady fancies havin' a sing\n" +
            "I'll be here waitin' ever so patiently\n" +
            "For you to snap out of it"
                );
        
        SongModel band1Song3 = new SongModel("Cornerstone",
            "I thought I saw you in the Battleship\n" +
            "But it was only a look alike\n" +
            "She was nothing but a vision trick\n" +
            "Under the warning light\n" +
            "She was close\n" +
            "Close enough to be your ghost\n" +
            "But my chances turned to toast\n" +
            "When I asked her if I could call her your name\n" +
            "I thought I saw you in the Rusty Hook\n" +
            "Huddled up in wicker chair\n" +
            "I wandered up for a closer look\n" +
            "And kissed whoever was sitting there\n" +
            "She was close\n" +
            "And she held me very tightly\n" +
            "'Til I asked awfully politely\n" +
            "\"Please, can I call you her name?\"\n" +
            "And I elongated my lift home\n" +
            "Yeah, I let him go the long way 'round\n" +
            "I smelt your scent on the seatbelt\n" +
            "And kept my shortcuts to myself\n" +
            "I thought I saw you in the Parrot's Beak\n" +
            "Messin' with the smoke alarm\n" +
            "It was too loud for me to hear her speak\n" +
            "And she had a broken arm\n" +
            "It was close\n" +
            "So close that the walls were wet\n" +
            "And she wrote it out in Letraset\n" +
            "\"No, you can't call me her name\"\n" +
            "Tell me, where's your hiding place?\n" +
            "I'm worried I'll forget your face\n" +
            "And I've asked everyone\n" +
            "I'm beginning to think I imagined you all along\n" +
            "I elongated my lift home\n" +
            "Yeah, I let him go the long way 'round\n" +
            "I smelt your scent on the seatbelt\n" +
            "And kept my shortcuts to myself\n" +
            "I saw your sister in the Cornerstone\n" +
            "On the phone to the middle man\n" +
            "When I saw that she was on her own\n" +
            "I thought she might understand\n" +
            "That she was close\n" +
            "Well, you couldn't get much closer\n" +
            "She said, \"I'm really not supposed to, but yes\n" +
            "You can call me anything you want\""
        );
        
        SongModel band2Song1 = new SongModel("Help", 
            "I need somebody\n" +
            "(Help) not just anybody\n" +
            "(Help) you know I need someone, help\n" +
            "So much younger than today\n" +
            "(I never need) I never needed anybody's help in any way\n" +
            "(Now) but now these days are gone (these days are gone)\n" +
            "I'm not so self assured\n" +
            "(And now I find) now I find I've changed my mind\n" +
            "And opened up the doors\n" +
            "Help me if you can, I'm feeling down\n" +
            "And I do appreciate you being 'round\n" +
            "Help me get my feet back on the ground\n" +
            "Won't you please, please help me\n" +
            "In oh so many ways\n" +
            "(My independ-) my independence seems to vanish in the haze\n" +
            "(But) but every now and then (now and then)\n" +
            "I feel so insecure\n" +
            "(I know that I) I know that I just need you like\n" +
            "I've never done before\n" +
            "Help me if you can, I'm feeling down\n" +
            "And I do appreciate you being 'round\n" +
            "Help me get my feet back on the ground\n" +
            "Won't you please, please help me\n" +
            "When I was younger, so much younger than today\n" +
            "I never needed anybody's help in any way\n" +
            "(Now) but now these days are gone (these days are gone)\n" +
            "I'm not so self assured\n" +
            "(And now I find) now I find I've changed my mind\n" +
            "And opened up the doors\n" +
            "Help me if you can, I'm feeling down\n" +
            "And I do appreciate you being 'round\n" +
            "Help me get my feet back on the ground\n" +
            "Won't you please, please help me, help me, help me, ooh");
        
        SongModel band2Song2 = new SongModel("While my Guitar Gently Weeps",
            "I look at you all\n" +
            "See the lover that's sleeping\n" +
            "While my guitar gently weeps\n" +
            "Still my guitar gently weeps\n" +
            "I don't know why nobody told you\n" +
            "How to unfold your love\n" +
            "I don't know how someone controlled you\n" +
            "They bought and sold you\n" +
            "I look at the world\n" +
            "And I notice it's turning\n" +
            "While my guitar gently weeps\n" +
            "With every mistake\n" +
            "We must surely be learning\n" +
            "Still my guitar gently weeps\n" +
            "I don't know how you were diverted\n" +
            "You were perverted too\n" +
            "I don't know how you were inverted\n" +
            "No one alerted you\n" +
            "I look from the wings\n" +
            "At the play you are staging\n" +
            "While my guitar gently weeps\n" +
            "'Cause I'm sitting here\n" +
            "Doing nothing but aging\n" +
            "Still my guitar gently weeps");
        
        SongModel band3Song1 = new SongModel("Sofia","I think we could do it if we tried\n" +
            "If only to say you're mine\n" +
            "Sofia, know that you and I\n" +
            "Shouldn't feel like a crime\n" +
            "I think we could do it if we tried\n" +
            "If only to say you're mine\n" +
            "Sofia, know that you and I\n" +
            "Shouldn't feel like a crime\n" +
            "You know I'll do anything you ask me to\n" +
            "But oh my God, I think I'm in love with you\n" +
            "Standin' here alone now, think that we can drive around\n" +
            "I just wanna say how I love you with your hair down\n" +
            "Baby, you don't gotta fight, I'll be here 'til the end of time\n" +
            "Wishin' that you were mine, pull you in, it's alright\n" +
            "I think we could do it if we tried\n" +
            "If only to say you're mine\n" +
            "Sofia, know that you and I\n" +
            "Shouldn't feel like a crime\n" +
            "Honey, I don't want it to fade\n" +
            "There's things that I know could get in the way\n" +
            "I don't want to say goodbye\n" +
            "And I think that we could do it if we tried\n" +
            "I think we could do it if we tried\n" +
            "If only to say you're mine\n" +
            "Sofia, know that you and I\n" +
            "Shouldn't feel like a crime\n" +
            "I think we could do it (I think we could, I think we could do it, if, if, if)\n" +
            "If we tried (we could, we could, you're mine)\n" +
            "I think we could do it (Sofia, know that you, you, you and I)\n" +
            "If we tried (shouldn't feel like a crime)\n" +
            "Sofia, know that you and I (I think we could, I think we could do it, we could, we could)\n" +
            "Shouldn't feel like a crime (do it, do it, you're mine) (get in the way)\n" +
            "Sofia, know that you and I (Sofia, know that you, you, you and I shouldn't feel)\n" +
            "Oh, oh (like a crime) (do it if we tried)");
        
        SongModel band4Song1 = new SongModel("Red Light","Two could be complete with out the rest of the world\n" +
            "Two could be complete with out the rest of the world\n" +
            "Do it for the people that have died for your sake\n" +
            "An entire generation that has nothing to say\n" +
            "How to make your way to me\n" +
            "Oh, let's say you made a deal with me\n" +
            "And I got your name and your home address\n" +
            "Oh, you're all trashed up with your big red belt\n" +
            "And I'd almost say that you might need help\n" +
            "I could drop you off at the next red light\n" +
            "If it don't make sense or it don't feel right\n" +
            "All the girls could never make me love 'em the way I love you\n" +
            "Can't you see the skies is not the limit no more?\n" +
            "I can see the elevator crash through the floor\n" +
            "I can still see yesterday sailing away\n" +
            "And seven billion people who got nothing to say\n" +
            "Are you coming home to to me?\n" +
            "Oh, I saw your face then I heard that song\n" +
            "It was so inviting, it hurt my bones\n" +
            "Well it looks like you but your eyes are gray\n" +
            "And your hair is gone but your mind's okay\n" +
            "Yes I like your smile but your forehead's cold\n" +
            "I don't want you to be afraid and go\n" +
            "I would cheat and lie and steal, now I'll stay at home and kneel for you\n" +
            "I was waiting\n" +
            "For my baby to arrive\n" +
            "Right by my side\n" +
            "Oh, please leave me alone tonight\n" +
            "Forget the past\n" +
            "Two could be complete with out the rest of the world\n" +
            "Oh you know I said it just to get you to laugh\n" +
            "Do it for the people that have died for your sake\n" +
            "An entire generation of entertainers to blame\n" +
            "The light is red, the cameras on\n" +
            "Get yourself a lawyer and a gun\n" +
            "Hate your friends whose friends like everyone\n" +
            "Childhood's end can be so competitive\n" +
            "Oh, the sky's not the limit and you're never gonna guess what is, oh");
        
        SongModel band5Song1 = new SongModel("Smokin out the Window", "Wait a minute, this love started off so tender, so sweet\n" +
            "But now she got me smokin' out the window\n" +
            "Mh, mh, mh\n" +
            "Must've spent thirty five\n" +
            "Forty five thousand up in Tiffany's (oh, no)\n" +
            "Got her badass kids runnin' 'round my whole crib\n" +
            "Like it's Chuck E. Cheese (whoa, whoa)\n" +
            "Put me in a jam with her ex-man in the UFC\n" +
            "Can't believe it (can't believe it)\n" +
            "I'm in disbelief\n" +
            "This bitch got me payin' her rent, payin' for trips\n" +
            "Diamonds on her neck, diamonds on her wrist\n" +
            "And here I am all alone (all alone), uh\n" +
            "I'm so cold, I'm so cold\n" +
            "You got me out here\n" +
            "Smokin' out the window (smokin' out the window)\n" +
            "Singin', \"How could she do this to me?\"\n" +
            "(How could she do this to me?)\n" +
            "Oh, I thought that girl belonged to only me (mmh)\n" +
            "But I was wrong\n" +
            "'Cause she belong to everybody, everybody, ooh\n" +
            "Just the other night she was grippin' on me tight\n" +
            "Screamin', \"Hercules\" (Hercules, Hercules)\n" +
            "Got me in the club lookin' for a new love\n" +
            "Someone help me please (help me please, help me please)\n" +
            "Baby, why you doin' this? Why you doin' this to me, girl?\n" +
            "Not to sound dramatic, but I wanna die\n" +
            "This bitch got me payin' her rent, payin' for trips\n" +
            "Diamonds on her neck, diamonds on her wrist\n" +
            "And here I am all alone (all alone)\n" +
            "I'm so cold, I'm so cold\n" +
            "You got me out here\n" +
            "Smokin' out the window\n" +
            "(Smokin' out the window of the Benzo, the Benzo)\n" +
            "Singin', \"How could she do this to me?\" (How? How could she do this?)\n" +
            "Oh, I thought that girl belonged to only me (one thing's fasho)\n" +
            "(One thing's fasho)\n" +
            "But I was wrong (I was wrong)\n" +
            "'Cause she belong (she belong)\n" +
            "To everybody, everybody (yeah, she belong to everybody)\n" +
            "That girl there, she belong to everybody, ooh\n" +
            "Look here, baby, I hope you found whatever it is that you need\n" +
            "But I also hope\n" +
            "That your triflin' ass is walkin' 'round barefoot in these streets\n" +
            "Look out\n" +
            "Girl, it breaks my heart that you ain't right here with me\n" +
            "Now I gotta give you back (gotta give you back)\n" +
            "To the city, oh, you got me\n" +
            "Smokin' out the window (hoo-ooh)\n" +
            "Singin', \"How could she do this to me?\" (How could you?)\n" +
            "(How could you do this, baby?)\n" +
            "Oh, I thought that girl belonged to only me (woo-hoo, ooh)\n" +
            "But I was wrong (I was wrong)\n" +
            "'Cause she belong (she belong)\n" +
            "To everybody, everybody (yeah, she belonged to everybody)\n" +
            "(Yeah, yeah, she belonged to everybody) ooh");
        
        SongModel band6Song1 = new SongModel("Telescope","In a far and distant galaxy\n" +
            "Inside my telescope I see\n" +
            "A pair of eyes look back at me\n" +
            "He walks and talks and looks like me\n" +
            "Sits around inside his house\n" +
            "From room to room he moves about\n" +
            "Fills his life with pointless things\n" +
            "And wonders how it all turns out\n" +
            "Do do do do do\n" +
            "Do do do do do\n" +
            "Safe to say that\n" +
            "I don't think you understand\n" +
            "There's nowhere left to turn\n" +
            "Walls keep breaking\n" +
            "Time is like a leaf in the wind\n" +
            "Either it's time well spent\n" +
            "Or time I've wasted\n" +
            "Don't waste it\n" +
            "Afraid of what the truth might bring\n" +
            "He locks his doors and never leaves\n" +
            "Desperately searching for signs\n" +
            "To terrify, to find a thing\n" +
            "He battens all the hatches down\n" +
            "And wonders why he hears no sound\n" +
            "Frantically searching his dreams\n" +
            "He wonders what it's all about\n" +
            "Do do do do do\n" +
            "Do do do do do\n" +
            "Safe to say that\n" +
            "I don't think you understand\n" +
            "There's nowhere left to turn\n" +
            "Walls keep breaking\n" +
            "Time is like a leaf in the wind\n" +
            "Either it's time well spent\n" +
            "Or time I've wasted\n" +
            "Clearing my mind\n" +
            "Losing my friends\n" +
            "Follow my fears\n" +
            "Do it again\n" +
            "You say how, do, you do\n" +
            "Man, how 'bout you?\n" +
            "Man, how 'bout you?\n" +
            "To be free\n" +
            "To be sold\n" +
            "To be killed\n" +
            "To be saved\n" +
            "In my head, I'm alone\n" +
            "I'm un-dead, I'm ashamed\n" +
            "Just like you, I've been tryin'\n" +
            "To be scared\n" +
            "In my bones, I feel cold\n" +
            "I give this to the Lord in the sea\n" +
            "In this street\n" +
            "Let me go\n" +
            "Let me be, I don't need\n" +
            "To be here, I'm alone\n" +
            "Can't you see? Can't you see?\n" +
            "I don't think you understand\n" +
            "There's nowhere left to turn\n" +
            "Walls keep breaking\n" +
            "Time is like a leaf in the wind\n" +
            "Either it's time well spent\n" +
            "Or time I've wasted\n" +
            "Don't waste it");
        
        SongModel band7Song1 = new SongModel("Crushcrushcrush", "I got a lot to say to you\n" +
            "Yeah, I got a lot to say\n" +
            "I noticed your eyes are always glued to me\n" +
            "Keeping them here\n" +
            "And it makes no sense at all\n" +
            "They taped over your mouth\n" +
            "Scribbled out the truth with their lies\n" +
            "Your little spies\n" +
            "They taped over your mouth\n" +
            "Scribbled out the truth with their lies\n" +
            "Your little spies\n" +
            "Crush\n" +
            "Crush\n" +
            "Crush\n" +
            "Crush, crush\n" +
            "(Two, three, four!)\n" +
            "Nothing compares to a quiet evening alone\n" +
            "Just the one, two of us who's counting on\n" +
            "That never happens\n" +
            "I guess I'm dreaming again\n" +
            "Let's be more than this\n" +
            "If you want to play it like a game\n" +
            "Well, come on, come on, let's play\n" +
            "'Cause I'd rather waste my life pretending\n" +
            "Than have to forget you for one whole minute\n" +
            "They taped over your mouth\n" +
            "Scribbled out the truth with their lies\n" +
            "Your little spies\n" +
            "They taped over your mouth\n" +
            "Scribbled out the truth with their lies\n" +
            "Your little spies\n" +
            "Crush\n" +
            "Crush\n" +
            "Crush\n" +
            "Crush, crush\n" +
            "(Two, three, four!)\n" +
            "Nothing compares to a quiet evening alone\n" +
            "Just the one, two of us who's counting on\n" +
            "That never happens\n" +
            "I guess I'm dreaming again\n" +
            "Let's be more than this now\n" +
            "Rock and roll, baby\n" +
            "Don't you know that we're all alone now?\n" +
            "I need something to sing about\n" +
            "Rock and roll, hey\n" +
            "Don't you know, baby, we're all alone now?\n" +
            "I need something to sing about\n" +
            "Rock and roll, hey\n" +
            "Don't you know, baby, we're all alone now?\n" +
            "Give me something to sing about\n" +
            "Nothing compares to a quiet evening alone\n" +
            "Just the one, two of us who's counting on\n" +
            "That never happens\n" +
            "I guess I'm dreaming again\n" +
            "Let's be more than\n" +
            "No, oh\n" +
            "Nothing compares to a quiet evening alone\n" +
            "Just the one, two of us who's counting on\n" +
            "That never happens\n" +
            "I guess I'm dreaming again\n" +
            "Let's be more than\n" +
            "More than this, oh");
        
        //set URLS
        band1Song1.setTrackLink("https://www.youtube.com/watch?v=CUGzWETn1HQ");
        band1Song2.setTrackLink("https://www.youtube.com/watch?v=H8tLS_NOWLs");
        band1Song3.setTrackLink("https://www.youtube.com/watch?v=LIQz6zZi7R0");
        band2Song1.setTrackLink("https://www.youtube.com/watch?v=2Q_ZzBGPdqE");
        band2Song2.setTrackLink("https://www.youtube.com/watch?v=YEMEAxlYL04");
        band3Song1.setTrackLink("https://www.youtube.com/watch?v=L9l8zCOwEII");
        band4Song1.setTrackLink("https://www.youtube.com/watch?v=AqJO7JMkTVk");
        band5Song1.setTrackLink("https://www.youtube.com/watch?v=GG7fLOmlhYg");
        band6Song1.setTrackLink("https://www.youtube.com/watch?v=GouP9Kzy3mo");
        band7Song1.setTrackLink("https://www.youtube.com/watch?v=ei8hPkyJ0bU");
        
        //set songs in songList
        band1.songList.addSongs(band1Song1);
        band1.songList.addSongs(band1Song2);
        band1.songList.addSongs(band1Song3);
        band2.songList.addSongs(band2Song1);
        band2.songList.addSongs(band2Song2);
        band3.songList.addSongs(band3Song1);
        band4.songList.addSongs(band4Song1);
        band5.songList.addSongs(band5Song1);
        band6.songList.addSongs(band6Song1);
        band7.songList.addSongs(band7Song1);
    }
    
    //search for stringEntry in list of bandObjects, return the bandObject
    public BandModel_1 searchBandList(String bandName){
        Boolean objectFound = false;
        BandModel_1 returnObject = new BandModel_1();
        
        //loop through elements in list, if name matches, return BandModel object
        for(int i = 0; i < bandList.size(); i++){
            //System.out.println(bandList.get(i).getName());
            if(bandList.get(i).getName().equals(bandName)){
                //System.out.println("Band found!");
                objectFound = true;
                returnObject = bandList.get(i);
                //System.out.println(returnObject.getName());
            }
        }
        //if object is not found in list, return object with temp info
        //else, object will be returned
        if(!objectFound){
            System.out.println("Band not found in list");
            return null;
        }else{
            return returnObject;
        }
    }
    
    //search for string Name of the song in the setList, return the Song lyrics
    public SongModel searchSetList(BandModel_1 band, String songName){
        Boolean objectFound = false;
        SongModel returnSong = new SongModel();
        
        System.out.println("Searching for " + songName);
                //loop through elements in list, if name matches, return BandModel object

        for(int i = 0; i < band.songList.setList.size(); i++){
            if(band.songList.setList.get(i).getName().equals(songName)){
                System.out.println("On this band in the list: " + band.songList.setList.get(i).getName());
                objectFound = true;
                returnSong = band.songList.setList.get(i);
            }
        }
        
        if(!objectFound){
            System.out.println("Song was not found in list");
            return null;
        }else{
            return returnSong;
        }
    }
    
    
    
    
}
