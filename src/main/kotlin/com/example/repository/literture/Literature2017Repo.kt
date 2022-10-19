package com.example.repository.literture

import com.example.repository.Objective
import com.example.repository.Questions

class Literature2017Repo {

    private val instr2125 = """
        UNSEEN PROSE AND POETRY Read the Passage and answer Questions 21 to 25 
        We did not go to school on that Friday morning. The night before had been rough. It was turbulent and scary. The strange cry "non-indigenes must go" rent the air.
        Little did known what it meant. That cry all the same haunted me in my sleep. My dreams were horrible. Why was Mum so troubled? Why was Dad suddenly so pale and sickly? That night Mum and Dad had a forboding silence. They looked at each other, they did not smile. They were utterly silent. Their silence spoke millions. Fear ruled the night. When the family bell summoned us to the family altar, it seemed that it tolled its last for the humans. Death smelled in the air, death was in the eyes... But why? We were not told. Yes, during the prayer at the family altar, Dad had told us there was trouble in town. No one who was a non indigene was safe.
       """.trimIndent()
    private val instr2630 = """
   Read the Poem and answer Questions 26 to 30
       I know not, Amina
       When again on your brightness of smile
       My eyes will rest awhile
       Nor when again of your softness of voice My ears will drink by eager choice
       When again into the silver moonshine
       You early at night or late venture
       As is your wont in weather fine Astute, awake in bed as doters may, I'll lie
       Dreaming of grasping your velvety texture.

   """.trimIndent()
    private val instr3135 = """
   Read the extract and answer Question 31 to 35
    Speaker: I think this tale would win my daughter too.

    Good Brabantio, take up this mangled
    matter at the best Men do their broken weapons rather use

    Than their bare hands
    (Act 1, Scene Three, Lines 171-174)
    """.trimIndent()
    private val instr3640 = """
    Read the extract and answer Questions 36 to 40
    Othello: So please your grace, my ancient; A man he is of honesty and trust
    To his conveyance I assign my wife, With what else needful your good
    grace shall think To be sent after me.
    (Act1, Scene Three, lines 279-283)
    
     """.trimIndent()
    private val instr4145 = """
    Read the extract and answer Questions 41 to 45.
    lago: Mere prattle without practice
    Is all his soldiership, But he, sir had th' election;
    And i, of whom his eyes had seen the proof
    At Rhodes, at Cyprus, and on other grounds .... must be belee'd and calmed By debitor and creditor
    (Act I, Scene One, Lines 23-28)
     """.trimIndent()
    private val instr4650 = """
    Read the extract and answer Questions 46 to 50
    Speaker: My wife! My wife! What wife?
    I have no wife,
    O, insupportable! O heavy hour!
    Methinks it should be now a huge
    eclipse Of sun and moon, and that th'affrighted globe
    Should yawn at alteration
    (ActV, Scene Two lines 97-101)
   """.trimIndent()

    val literature2017 = listOf<Questions>(
        Questions( objective = Objective( "1", "", "", "",
            "A praise poem is ",
            "(a) a ballad",
            "(b) a panegyric",
            "(c) an allegory",
            "(d) an epigram",
            "(b) a panegyric",
            "B"
        )
        ),


        Questions( objective = Objective( "2", "", "", "",
            "A literary work in which the characters are animals is a",
            "(a) lampoon",
            "(b) fable",
            "(c) parody",
            "(d) pantomime",
            "(b) fable",
            "B"
        )),

        Questions( objective = Objective( "3", "", "", "",
            "A short single act drama is called",
            "(a) opera ",
            "(b) allusion ",
            "(c) farce",
            "(d) playlet ",
            "(d) playlet",
            "D"
        )),

        Questions( objective = Objective( "4",
            "Use the following line to answer question 4 " +
                    "Through the trees I'll hear a single ringing sound, a cowbell ", "", "",
            "The line is an example of.....rhyme",
            " (a) end ",
            "(b) feminine ",
            "(c) internal",
            "(d) masculine",
            "(a) end",
            "A"

        )),



                Questions( objective = Objective( "5",
                    "Read the following lines and answer questions 5 to 7." +
                            "Yet, let me flap this bug with gilded wings," +
                            "This painted child of dirt, that stinks and stings", "", "",
                    "The alliteration in stinks and stings effectively conveys ",
                    "(a) distaste ",
                    "(b) admiration",
                    "(c) indifference",
                    "(d) approval",
                    "(a) distaste",
                    "A"
                )),

        Questions( objective = Objective( "6",
            "Read the following lines and answer questions 5 to 7." +
                    "Yet, let me flap this bug with gilded wings," +
                    "This painted child of dirt, that stinks and stings", "", "",
            "The poet's intention is to",
            "(a) create humour",
            "(b) arouse ",
            "(c) create fun ",
            "(d) show contempt ",
            "(d) show contempt",
            "D"
        )),

        Questions( objective = Objective( "7",
            "Read the following lines and answer questions 5 to 7." +
                    "Yet, let me flap this bug with gilded wings," +
                    "This painted child of dirt, that stinks and stings", "", "",
            "The lines illustrate ",
            "(a) blank verse",
            "(b) end rhyme",
            "(c) internal rhyme",
            "(d) free verse",
            "(d) free verse",
            "D"
        )),


        Questions( objective = Objective( "8", "", "", "",
            "A play on words for literary effect is",
            "(a) a paradox",
            "(b) a pun",
            "(c) a satire",
            "(d) an elegy",
            "(b) a pun",
            "B"
        )),

        Questions( objective = Objective( "9", "", "", "",
            " It is a matter of sad joy' illustrates ",
            "(a) metonymy",
            "(b) oxymoron",
            "(c) euphemism",
            "(d) irony ",
            "(b) oxymoron",
            "B"
        )),

        Questions( objective = Objective( "10", "", "", "",
            "The leading character in a literary work is the",
            "(a) foil",
            "(b) villain",
            "(c) antagonist",
            "(d) protagonist",
            "(d) protagonist",
            "D"
        )),



        Questions( objective = Objective( "11", "", "", "",
            "A long narrative poem that relates heroic exploits is an",
            "(a) epilogue",
            "(b) epitaph",
            "(c) epic ",
            "(d) epigram",
            "(c) epic",
            "C"
        )),

        Questions( objective = Objective( "12", "", "", "",
            "Over the cobbles it clattered and crashed is an example of",
            "(a) oxymoron",
            "(b) pun",
            "(c) onomato poeia",
            "(d) paradox",
            "(c) onomato poeia",
            "C"
        )),

        Questions( objective = Objective( "13", "", "", "",
            "An essential features of drama is",
            "(a) soliloguy",
            "(b) conflict",
            "(c) irony",
            "(d) aside",
            "(b) conflict",
            "B"
        )),

        Questions( objective = Objective( "14", "", "", "",
            "A humorous poem with five lines, the first two rhyming with the last is",
            "(a) an ode",
            "(b) sestet ",
            "(c) octave ",
            "(d) a limerick",
            "(d) a limerick",
            "D"
        )),

        Questions( objective = Objective( "15", "", "", "",
            "Death be not proud, though some have called thee might and dreadful is an example of",
            "(a) euphemism",
            "(b) metaphor",
            "(c) apostrophe",
            "(d) al literation",
            "(c) apostrophe",
            "C"
        )),

        Questions( objective = Objective( "16", "", "", "",
            "An essential part of the plot is",
            "(a) characterization",
            "(b) exposition",
            "(c) atmosphere",
            "(d) foreshadow",
            "(a) characterization",
            "A"
        )),

        Questions( objective = Objective( "17", "", "", "",
            "The climax in a literary work is the",
            "(a) middle",
            "(b) beginning",
            "(c) central part of the dialogue ",
            "(d) peak of the conflict",
            "(d) peak of the conflict",
            "D"
        )),



        Questions( objective = Objective( "18", "", "", "",
            "Dramatis personae is the same as",
            "(a) chorus",
            "(b) prompter",
            "(c) foil",
            "(d) cast",
            "(d) cast",
            "D"
        )),



        Questions( objective = Objective( "19", "", "", "",
            "Ten thousand saw I at a glance …..... illustrates ",
            "(a) caesura",
            "(b) climax",
            "(c) bathos",
            "(d) hyperbole",
            "(d) hyperbole",
            "D"
        )),

        Questions( objective = Objective( "20", "", "", "",
            "Catharsis is normally associated with",
            "(a) pantomime",
            "(b) tragedy",
            "(c) comedy",
            "(d) farce",
            "(b) tragedy",
            "B"
        )),




    Questions( objective = Objective( "21", instr2125, "", "",
    "The dominant feeling in the passage is that of ",
    "(a) hostility",
    "(b) anger ",
    "(c) anxiety",
    "(d) bitterness",
    "(d) bitterness",
    "D"
    )),

    Questions( objective = Objective( "22", instr2125, "", "",
    "This feeling is conveyed by the use of",
    "(a) long sentences ",
    "(b) visual images ",
    "(c) tactile images",
    "(d) short sentences ",
    "(c) tactile images",
    "C"
    )),


    Questions( objective = Objective( "24", instr2125, "", "",
    "Their silence spoke millions illustrates ",
    "(a) oxymoron",
    "(b) litotes",
    "(c) tactile images",
    "(d) short sentences",
    "(c) tactile images",
    "C"
    )),


    Questions( objective = Objective( "24", instr2125, "", "",
    "The family bell summond us is an example of",
    "(a) apostrophe",
    "(b) personification",
    "(c) allusion",
    "(d) euphemism",
    "(b) personification",
    "B"
    )),

    Questions( objective = Objective( "25", instr2125, "", "",
    "The passage is",
    "(a) in first person",
    "(b) inthird person",
    "(c) a dialogue",
    "(d) monologue",
    "(a) in first person",
    "A"
    )),



    Questions( objective = Objective( "26", instr2630, "", "",
    "The first stanza is a ",
    "(a) tercet ",
    "(b) couplet",
    "(c) quatrain ",
    "(d) sestet ",
    "(a) tercet",
    "A"
    )),

    Questions( objective = Objective( "27", instr2630, "", "",
    "The poem evokes the senses of ",
    "(a) smell and sight",
    "(b) smell and hearing",
    "(c) sight and hearing",
    "(d) touch and smell",
    "(c) sight and hearing",
    "C"
    )),

    Questions( objective = Objective( "28", instr2630, "", "",
    "The dominant literary device used in the poem is",
    "(a) allusion",
    "(b) repetition",
    "(c) allegory",
    "(d) metonymy",
    "(b) repetition",
    "B"
    )),

    Questions( objective = Objective( "29", instr2630, "", "",
    "The poet's tone is one of",
    "(a) anxiety",
    "(b) defiance",
    "(c) nostalgia",
    "(d) regret",
    "(c) nostalgia",
    "C"
    )),

    Questions( objective = Objective( "30", instr2630, "", "",
    "My ears will drink by eager choice illustrates",
    "(a) oxymoron",
    "(b) onomatopoeia",
    "(c) synecdoche",
    "(d) meiosis",
    "(c) synecdoche",
    "C"
    )),




    Questions( objective = Objective( "31", instr3135, "", "",
    "The speaker is",
    "(a) Duke",
    "(b) Othello",
    "(c) Brabantio",
    "(d) Cassio",
    "(a) Duke",
    "A"
    )),

    Questions( objective = Objective( "32", instr3135, "", "",
    "The tale being referred to is ",
    "(a) Duke's war exploits ",
    "(b) Brabantio's rejection of the Othello and Desdemona relationship ",
    "(c) Othello's war exploits ",
    "(d) Cassio's promotion as Othello's lieutenant.",
    "(c) Othello's war exploits",
    "C"
    )),


    Questions( objective = Objective( "33", instr3135, "", "",
    "…...... this tale justifies ",
    "(a) Roderigo's unrequited love for Desdemona ",
    "(b) Cassio's promotion above lago",
    "(c) Desdemona's attraction to Othello",
    "(d) Brabantio's rejection of Othello's love for his daughter",
    "(c) Desdemona's attraction to Othello",
    "C"
    )),

    Questions( objective = Objective( "34", instr3135, "", "",
    "The underlined expression means",
    "(a) seek counsel elsewhere ",
    "(b) wait till the war is ended ",
    "(c) take your revenge ",
    "(d) make the best out of this. ",
    "(d) make the best out of this",
    "D"
    )),

    Questions( objective = Objective( "35", instr3135, "", "",
    "According to the speaker ",
    "(a) the tale was good enough to win a woman's heart",
    "(b) the fight was unnecessary",
    "(c) the charges were a waste of time",
    "(d) there were other matters demanding the attention of the Senate.",
    "(a) the tale was good enough to win a woman's heart",
    "A"
    )),




    Questions( objective = Objective( "36", instr3640, "", "",
    "Othello is speaking to ",
    "(a) Brabantio ",
    "(b) Duke",
    "(c) Montano",
    "(d) Roderigo",
    "(b) Duke",
    "B",
    )),



    Questions( objective = Objective( "37", instr3640, "", "",
    "The speech illustrates the use of ",
    "(a) irony ",
    "(b) litotes ",
    "(c) paradox",
    "(d) comic relief ",
    "(a) irony",
    "A"
    )),


    Questions( objective = Objective( "38", instr3640, "", "",
    "A man he is of honesty and trust refers to ",
    "(a) Cassio",
    "(b) Lodovico",
    "(c) Gratiano",
    "(d) lago ",
    "(d) lago",
    "D"
    )),

    Questions( objective = Objective( "39", instr3640, "", "",
    "Othello is leaving to",
    "(a) fight in Rhodes",
    "(b) make peace with the Turks ",
    "(c) meet the Government of Cyprus ",
    "(d) take over the government of Cyprus",
    "(b) make peace with the Turks",
    "B"
    )),

    Questions( objective = Objective( "40", instr3640, "", "",
    "Othello then",
    "(a) leaves with Desdemona",
    "(b) entrusts Desdemona to lago's care",
    "(c) calls his lieutenant",
    "(d) confers with the Duke",
    "(b) entrusts Desdemona to lago's care",
    "B"
    )),


    Questions( objective = Objective( "41", instr4145, "", "",
    "His soldiership refers to",
    "(a) Roderigo",
    "(b) Montano",
    "(c) Cassio",
    "(d) Brabantio",
    "(c) Cassio",
    "C"
    )),


    Questions( objective = Objective( "42", instr4145, "", "",
    "Sir refers to",
    "(a) Cassio ",
    "(b) Roderigo",
    "(c) Othello ",
    "(d) Duke",
    "(b) Roderigo",
    "B",
    )),

    Questions( objective = Objective( "43", instr4145, "", "",
    "lago ",
    "(a) wants to go Cyprus with Othello ",
    "(b) does not regard Roderigo as a good soldier",
    "(c) is bitter about Cassio's appointment as lieutenant ",
    "",
    "(c) is bitter about Cassio's appointment as lieutenant ",
    "C"
    )),

    Questions( objective = Objective( "44", instr4145, "", "",
    "His eyes refers to",
    "(a) Lodovico",
    "(b) Cassio",
    "(C) Othello",
    "(d) Duke",
    "(b) Cassio",
    "B"
    )),


    Questions( objective = Objective( "45", instr4145, "", "",
    "The setting is",
    "(a) the Castle",
    "(b) Cyprus",
    "(c) a sea-port",
    "(d) Venice",
    "(d) Venice",
    "D"
    )),





    Questions( objective = Objective( "46", instr4650, "", "",
    "The speaker is ",
    "(a) lago",
    "(b) Othello",
    "(c) Brabantio",
    "(d) Duke",
    "(b) Othello",
    "B"
    )),

    Questions( objective = Objective( "47", instr4650, "", "",
    "The first two lines express the speaker's ",
    "(a) loneliness",
    "(b) fear",
    "(c) confusion",
    "(d) regret",
    "(d) regret",
    "D"
    )),


    Questions( objective = Objective( "48", instr4650, "", "",
    "The speaker has just ",
    "(a) divorced his wife ",
    "(b) arrived home from war ",
    "(c) had a nightmare ",
    "(d) smothered his wife",
    "(d) smothered his wife",
    "D"
    )),

    Questions( objective = Objective( "49", instr4650, "", "",
    "The speech is provoked by ",
    "(a) Emilia's call",
    "(b) lago's treachery",
    "(c) cassio's confession",
    "(d) Desdemona's plea.",
    "(a) Emilia's call ",
    "A"
    )),



    Questions( objective = Objective( "50", instr4650, "", "",
    "The underlined expression suggests that ",
    "(a) there is an imminent eclipse",
    "(b) life will never be the same again for the speaker",
    "(c) nothing will change",
    "(d) there is an impending danger for the speaker",
    "(b) life will never be the same again for the speaker ",
    "B"
    )),










    )

}