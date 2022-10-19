package com.example.repository.literture

import com.example.repository.Objective
import com.example.repository.Questions

class Literature2016Repo {

    private val instr1315 = """
       Read the poem and answer questions 13 to 15.
        Here she lies, a pretty bud,
        Lately made of flesh and blood;
        Who as soon fell fast asleep
        As her little eyes did peep.
        Give her strewings, but not stir
        The earth that lightly covers her.
       """.trimIndent()
    private val instr2125 = """
   UNSEEN PROSE AND POETRY Read the passage and answer questions 21 to 25. 
   Mark lies sleepless, his supine eyes rolling as he counts the rafters-vertically, horizontally, diagonally-over and over. There is continual rumbling in his belly. Lying so still, whom can he blame now? Isn't it his own fault to be like this? 

   Three months ago, Atongo and Agbenya said they were leaving town because "things have become too hard," as they put it. They asked Mark to come along. He declined saying that he would have to prepare. Of course, he simply could not go - dare not. He had a pact with Akwele who sells kenkey downtown: neither could leave town without the other. At the time Mark's friends were ready, Akwele had traveled to Accra and would, unknown to anyone, not return in a hurry.

   This is why Mark is lying dejected on his bed, a hungry man. Anyhow, he is not an angry man. 

   """.trimIndent()
    private val instr2630 = """
    Read the Poem and answer questions 26 to 30.
    Walker, stop and let me move and check you
    My sneaky, fleeting moon of reckless birth
    The light of hope you flashed at dawn has dimmed
    And flickers weakly, so you squint at Earth.

    Walker, stand and let me sit and quiz you Will foes and friends be irked if Mum you tell The bitter tale of woe behind your flu? The trickling tears unseen announce your age.

    Walker, stay and let me come and tell you My fleeting moon, I own you dim my light Your sparkling blouse has turned a darker hue You must, I guess, have done a steeplechase.

    """.trimIndent()
    private val instr3135 = """
    WILLIAM SHAKESPEARE: Othello Read the extract and answer Questions 31 to 35. 
    When remedies are past, are ended By seeing the worst, which late on hopes depended.
    To mourn a mischief that is past and gone
    Is the next way to draw new mischief on What cannot be preserved when fortune takes Patience her injury a mockery makes

    The robbed that smiles, steals something from the thief He robs himself that spends a bootless grief (Act 1, Scene Three, lines 200-207)

     """.trimIndent()
    private val instr3640 = """
    Read the extract and answer questions 36 to 40. 
    Thou art sure of me. Go, make money. I have told thee Often, and retell thee again and again, I hate the Moor. My cause is hearted; thine has no less reason. Let us be conjuctive in our revenge against him. If thou canst Cuckold him, thou dost thyself a pleasure, me a sport. There are many events in the womb of time, which will be delivered. Traverse, go, provide thy money! We will have more of this tomorrow. Adieu.
    (Act I, Scene Three, lines 355-362) 

     """.trimIndent()
    private val instr4145 = """
        Read the extract and answer questions 41 to 45.
        I have done the state some service, and they know't No more of that. I pray you, in your letter.

        When you shall these unlucky deeds relate, Speak of me as I am. Nothing extenuate, Nor set down aught in malice. Then must you speak Of one that loved not wisely, but too well,

        (Act V, Scene Two, lines 336-341)
   """.trimIndent()
    private val instr4650 =
        """
    Read the extract and answer questions 46 to 50.

    If after every tempest come such calms, May the winds blow till they have wakened death, And let the labouring bark climb hills of seas Olympus-high, and duck again as low As hell's from heaven. If it were now to die, 'T were now to be most happy; for I fear
    My soul hath her content so absolute That not another comfort like to this Succeeds in unknown fate.
    (Act II, Scene One, lines 179-187)
        """.trimIndent()

    val literature2016 = listOf<Questions>(
        Questions( objective = Objective( "1", "", "", "",
            "A literary work which is intended to teach a moral lesson is",
            "A. romantic ",
            "B. didactic ",
            "C. mimetic",
            "D. moralistic.",
            "B. didactic",
            "B"
        )),

        Questions( objective = Objective( "2", "", "", "",
            "A short account of an interesting event is",
            "A. a tale",
            "B. an anecdote",
            "C. an episode.",
            "D. a story.",
            "B. an anecdote",
            "B"
        )),

        Questions( objective = Objective( "3", "", "", "",
            "He is a citizen of no mean city illustrates",
            "A. bathos",
            "B. euphemism",
            "C. an episode",
            "D. litotes.",
            "D. litotes",
            "D"
        )),

        Questions( objective = Objective( "4", "", "", "",
            "The introductory part of a play, a novel or a poem is the",
            "A. epilogue.",
            "B. plot",
            "C. setting",
            "D. prologue.",
            "D. prologue",
            "D"
        )),

        Questions( objective = Objective( "5", "", "", "",
            "An elegy is a poem of",
            "A. mourning",
            "B. complaint",
            "C. hope",
            "D. joy.",
            "A. mourning",
            "A"
        )),

        Questions( objective = Objective( "6", "", "", "",
            "The trees bowed their heads in shame illustrates",
            "A. personification",
            "B. alliteration",
            "C. assonance.",
            "D. paradox.",
            "A. personification",
            "A"
        )),

        Questions( objective = Objective( "7", "", "", "",
            "A character whose actions are predictable in a literary work is",
            "A. a round character",
            "B. a flat character",
            "C. the hero",
            "D. the villain.",
            "B. a flat character",
            "B"
        )),

        Questions( objective = Objective( "8", "", "", "",
            "A scene in fiction enacting past events is",
            "A. allusion",
            "B. foreshadow",
            "C. flashback",
            "D. interlude.",
            "C. flashback",
            "C"
        )),

        Questions( objective = Objective( "9", "", "", "",
            "Poetic license is a term applied to a poet's",
            "A. choice of words",
            "B. choice of characters",
            "C. restrictions in the use of language",
            "D. freedom in the use of language.",
            "D. freedom in the use of language",
            "D"
        )),




                Questions( objective = Objective( "10",
            "Milton! thou should'st be living at this hour. ", "", "",
            "The literary device used in the line above is",
            "A. aside",
            "B. apostrophe.",
            "C. soliloquy",
            "D. suspense.",
            "B. apostrophe.",
            "B"
        )),



                Questions( objective = Objective( "11",
                    "Here lie I, Martin Elginbrodde\n" +
                   "Have mercy on my soul, Lord God.", "", "",
            "The extract above illustrates",
            "A. epitaph",
            "B. elegy",
            "C. ballad",
            "D. dirge.",
            "A. epitaph",
            "A"
        )),


        Questions( objective = Objective( "12", "", "", "",
            "We live to die, we die to live is an example of",
            "A. paradox ",
            "B. hyperbole",
            "C. inversion ",
            "D. oxymoron.",
            "A. paradox",
            "A"
        )),



    Questions( objective = Objective( "13", instr1315, "", "",
    "The poem is about a/an",
    "A. flower",
    "B. old woman",
    "C. little child",
    "D. traveller.",
    "A. flower",
    "A"
    )),

    Questions( objective = Objective( "14", instr1315, "", "",
    "The persona's mood is one of ",
    "A. anger",
    "B. admiration",
    "C. indifiere",
    "D. joy.",
    "B. admiration",
    "B"
    )),

    Questions( objective = Objective( "15", instr1315, "", "",
    "The rhym potom is",
    "A. abc abc.",
    "B. aa bb cc",
    "C. ab ab cc.",
    "D. ad be 16.",
    "B. aa bb cc",
    "B"
    )),


    Questions( objective = Objective( "16", "", "", "",
    "A play in which characters act through gestures and facial expressions is a",
    "A. pantomime",
    "B. burlesque",
    "C. farce",
    "D. melodrama.",
    "A. pantomime",
    "A"
    )),


    Questions( objective = Objective( "17", "", "", "",
    "Characterisation refers to",
    "A. how characters are grouped",
    "B. the readers' opinions of the characters.",
    "C. how characters are depicted",
    "D. the roles played by the character.",
    "C. how characters are depicted",
    "C"
    )),

    Questions( objective = Objective( "18", "", "", "",
    "In a literary work, the foil is one who",
    "A. complements another character",
    "B. contrasts with another character",
    "C. introduces the conflict",
    "D. resolves the conflict.",
    "B. contrasts with another character",
    "B"
    )),

    Questions( objective = Objective( "19", "", "", "",
    "Dramatis personae refers to",
    "A. audience",
    "B. characters.",
    "C. chorus",
    "D. cast.",
    "D. cast",
    "D"
    )),

    Questions( objective = Objective( "20", "", "", "",
    "A literary device use to enhance sound effect in poetry is",
    "A. imagery",
    "B. alliteration",
    "C. refrain",
    "D. symbol.",
    "B. alliteration",
    "B"
    )),

        Questions( objective = Objective( "21", instr2125, "", "",
            "...supine eyes... illustrates",
            "A. oxymoron.",
            "B. paradox",
            "C. verbal irony",
            "D. synecdoche.",
            "A. oxymoron",
            "A"
        )),

        Questions( objective = Objective( "22", instr2125, "", "",
            "Rumbling as used in the 1st paragraph is",
            "A. onomatopoeic",
            "B. metaphoric",
            "C. ironic",
            "D. alliterative.",
            "A. onomatopoeic",
            "A"
        )),

        Questions( objective = Objective( "23", instr2125, "", "",
            "The dominant theme is",
            "A. unrequited love",
            "B. loss of opportunity",
            "C. lack of trust ",
            "D insatiable hunger. ",
            "B. loss of opportunity",
            "B"
        )),


    Questions( objective = Objective( "24", instr2125, "", "",
    "The narrative technique is",
    "A. third person",
    "B. first person",
    "C. interior-monologue",
    "D. multiple narration.",
    "A. third person",
    "A"
    )),

    Questions( objective = Objective( "25", instr2125, "", "",
    "The writer's attitude is one of",
    "A. anger",
    "B. indifference",
    "C. sympathy",
    "D. mockery.",
    "D. mockery",
    "D"
    )),


        Questions( objective = Objective( "26", instr2630, "", "",
            "The stanzas are written in",
            "A. quintets",
            "B. quatrains",
            "C. sestets",
            "D. tercets.",
            "B. quatrains",
            "B"
        )),

        Questions( objective = Objective( "27", instr2630, "", "",
            "The recurrent device used is",
            "A. synecdoche",
            "B. apostrophe",
            "C. metonymy",
            "D. paradox.",
            "B. apostrophe",
            "B"
        )),

        Questions( objective = Objective( "28", instr2630, "", "",
            "The mood of the poet is",
            "A. derisive",
            "B. ecstatic",
            "C.regretful",
            "D. melancholic.",
            "D. melancholic",
            "D"
        )),

        Questions( objective = Objective( "29", instr2630, "", "",
            "The opening lines of the stanzas are",
            "A. trochaic",
            "B. iambic",
            "C. anapaestic",
            "D. dactylic.",
            "A. trochaic",
            "A"
        )),


        Questions( objective = Objective( "30", instr2630, "", "",
            "The first stanza rhymes",
            "A. ab ac.",
            "B. ab ab.",
            "C. abcb.",
            "D. abba",
            "C. abcb",
            "C"
        )),

        Questions( objective = Objective( "31", instr3135, "", "",
            "The speaker is",
            "A. Gratiano",
            "B. Duke",
            "C. Lodovico ",
            "D. Montano ",
            "B. Duke",
            "B"
        )),

        Questions( objective = Objective( "32", instr3135, "", "",
            "The speech is directly addressed to",
            "A Cassio",
            "B. Brabantio",
            "C. Othello",
            "D. 2nd Senator.",
            "B. Brabantio",
            "B"
        )),

        Questions( objective = Objective( "33", instr3135, "", "",
            "The speech is about",
            "A Brabantio's complaint about Othello.",
            "B. Othello's loss of his handkerchief.",
            "C. Brabantio's loss of his daughter.",
            "D. the fight between Cassio and Roderigo",
            "C. Brabantio's loss of his daughter",
            "C"
        )),

        Questions( objective = Objective( "34", instr3135, "", "",
            "By the speech, the speaker attempts to",
            "A. instigate the addressee.",
            "B. console the addressee.",
            "C. prevent a war",
            "D. settle a fight.",
            "B. console the addressee",
            "B"
        )),

        Questions( objective = Objective( "35", instr3135, "", "",
            "The underlined expression means",
            "A. one is bound to lose something in life",
            "B. keep smiling even while being robbed ",
            "C. it is useful not to bemoan one's loss.",
            "D. the thief loses either way.",
            "C. it is useful not to bemoan one's loss",
            "C"
        )),


        Questions( objective = Objective( "36", instr3640, "", "",
            "The speaker and the addressee are",
            "A. Lodovico and Roderigo",
            "B. Clown and Lodovico",
            "C. logo and Roderigo",
            "D. lago and Clown",
            "C. logo and Roderigo",
            "C"
        )),

    Questions( objective = Objective( "37", instr3640, "", "",
    "What binds the speaker and addressee together is their",
    "A. hatred for Othello",
    "B. fear of Cassio",
    "C. fear of Duke",
    "D. hatred for Brabantia.",
    "A. hatred for Othello",
    "A"
    )),

    Questions( objective = Objective( "38", instr3640, "", "",
    "The addressee is enjoined to Go, make money for",
    "A. wooing Desdemona",
    "B. enriching lago",
    "C. placating Brabantio",
    "D. rewarding Bianca.",
    "A. wooing Desdemona",
    "A"
    )),

    Questions( objective = Objective( "39", instr3640, "", "",
    "The underlined expression means",
    "A you have your way by making him angry",
    "B. you gain by making his wife cheat on him",
    "C. you will not be delighted at the result",
    "D. you will have succeeded in seducing her.",
    "B. you gain by making his wife cheat on him",
    "B"
    )),

    Questions( objective = Objective( "40", instr3640, "", "",
    "The speaker's attitude to the addressee is one of",
    "A. spite",
    "B. envy",
    "C. friendliness",
    "D. Intolerance.",
    "D. Intolerance",
    "D"
    )),


    Questions( objective = Objective( "41", instr4145, "", "",
    "The speaker is ",
    "A. Othello",
    "B. Gratiano",
    "C. lago",
    "D. Cassio",
    "A. Othello",
    "A"
    )),

    Questions( objective = Objective( "42", instr4145, "", "",
    "The setting is",
    "A. a street in front of the citadel",
    "B. a street",
    "C. the citadel",
    "D. Desdemona's chamber.",
    "D. Desdemona's chamber",
    "D"
    )),

    Questions( objective = Objective( "43", instr4145, "", "",
    "The speaker is addressing",
    "A. Duke and others.",
    "B. Emilia",
    "C. the Senate.",
    "D. Lodovico and others.",
    "D. Lodovico and others",
    "D"
    )),

    Questions( objective = Objective( "44", instr4145, "", "",
    "The speech is intended to",
    "A. preserve the speaker's reputation",
    "B. express the speaker's remorse",
    "C. express the speaker's acceptance of guilt",
    "D. denounce the speaker's enemies.",
    "A. preserve the speaker's reputation",
    "A",
    )),

    Questions( objective = Objective( "45", instr4145, "", "",
    "Among these unlucky deeds, the immediate one is",
    "A. the killing of Desdemona",
    "B. declaring as unfaithful",
    "C. refusing to listen to Emilia",
    "D. the sacking of Cassio.",
    "A. the killing of Desdemona",
    "A"
    )),


    Questions( objective = Objective( "46", instr4650, "", "",
    "The speaker is",
    "A. Brabantio",
    "B. Othello",
    "C. Duke",
    "D. Montano.",
    "B. Othello",
    "B"
    )),

    Questions( objective = Objective( "47", instr4650, "", "",
    "The occasion is ",
    "A. Othello's return from war ",
    "B. Othello's departure for Cyprus ",
    "C. Montano expressing his delight after the tempest.",
    "D. the defeat of the Turks.",
    "D. the defeat of the Turks",
    "D"
    )),

    Questions( objective = Objective( "48", instr4650, "", "",
    "The dominant images are associated with",
    "A. Love",
    "B. nature",
    "C. sailing",
    "D. war.",
    "A. Love",
    "A"
    )),

    Questions( objective = Objective( "49", instr4650, "", "",
    "The scene reveals the speaker's",
    "A. fear of adventure",
    "B. affection for his wife",
    "C. suspicion of his wife",
    "D. fulfilment as a warrior.",
    "B. affection for his wife",
    "B"
    )),

    Questions( objective = Objective( "50", instr4650, "", "",
    "The language of the extract is best described as",
    "A. ironical",
    "B. humorous",
    "C. hyperbolical",
    "D. sarcastic.",
    "B. humorous",
    "B"
    )),



    )
}