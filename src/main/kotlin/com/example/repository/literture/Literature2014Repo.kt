package com.example.repository.literture

import com.example.repository.Objective
import com.example.repository.Questions

class Literature2014Repo {

    private val instr2125 = """
        Read the poem and answer the question
        The goldsmith at work is a priest at the altar . As though he was were performing the Eucharist, he is engaged in deliberate motions of reverence. The small vials of various liquids such as mercury are little vessels of communion wine. The minuscule rings of intricately crafted gold are like miniature wafers.
        He dips one tiny ring into a liquid, lifts it up to the sky and presses it onto a space in the growing length of necklace. It fits- it is like dipping bread into wine and slipping it between the parted lips of a communicant.
        Our lent vigils are not as solemn as the goldsmith's silent solemnity that directs his work. We look on as the wizardry of the master matter craftsman displays itself. We are held in thrall....
        """.trimIndent()
    private val instr2630 = """
    Read the poem and answer the question
    At dawn must I rise to till the rock
    That our land has turned into
    The land where on we'd gleefully harvested paddy
    Planted and nurtured and tended on plots marshy
    Our woes are bloody woes of accursed revenges
    Of the land spirits aggrieved and by his fellow
    Kindred blood has counted for less than no value
    Brother's wife has been wife to other brother's brother
    Communal loot has emptied our country silos
    The earth has stooped breathing and sighed
    Soldered tears has the moon shed
    The earth was scorched at noon-day night
    And our land has turned to hoeing rock.
 """.trimIndent()
    private val instr3135 = """
    Read the extract and answer the question
   WILLIAM SHAKESPEARE: The Tempest

   Caliban: Ay, that I will; and I'II be wise hereafter,
   And seek for grace. What a thrice-double ass
   Was I, to take this drunkard for a god,
   And worship this dull foot!

   Prospero : Go to; away!
   Alonso : Hence, and bestow your luggage where you found it.
   Sebastian : Or stole, rather.
   (Act V, scene one lines 293 - 299)
   """.trimIndent()
    private val instr3640 = """
    Read the extract and answer the question
    Prospero: Of my instruction hast thou nothing bated
    In what thou hadst to say. So, with good life
    And observation strange, my meaner ministers
    Their several kinds have done. My high charms work,
    And these, mine enemies are all knit up
    In their distractions. They now are in my power;
    And in these fits I leave them,....
    (Act 111, scene three lines 85-91)
    """.trimIndent()
    private val instr4145 = """
    Read the extract and answer the question
    X : So they are.
    My spirits, as in a dream, are all bound up.
    My father's loss, the weakness which I feel, The wrack of all my friends, nor this man's threats
    To whom I am subdued, are but light to me,
    Might I but through my prison once a day
    Behold this maid. All corners else o'th' earth
    Let liberty make use of,...
    (Act 1, scene two lines 487-496)
    """.trimIndent()
    private val instr4650 = """
    Read the extract and answer the question
    If I speak true! if hollowly, invert
    What best is boded me to mischief! I,
    Beyond all limit of what else i' the world,
    Do love, prize, honour you.
    (Act 111, scene one line 70-73)
    """.trimIndent()

    val literature2014 = listOf<Questions>(
        Questions( objective = Objective( "1", "", "", "",
            "In drama, comic relief often occurs in",
            "A. comedies",
            "B. tragedies",
            "C. historical plays",
            "D. romantic plays",
            " B. tragedies", "B"
        )),

        Questions( objective = Objective( "2", "", "", "",
            "A struggle between opposing forces in a story or play is",
            "A. denouement",
            "B. conflict",
            "C. comedy",
            "D. tragedy",
            "B. conflict",  "B"
        )),


        Questions( objective = Objective( "3", "", "", "",
            "An expression from which one derives a mental picture is",
            "A. paradox",
            "B. exaggeration",
            "C. imagery",
            "D. photography",
            "C. imagery",  "C"
        )),


        Questions( objective = Objective( "4", "", "", "",
            "The repetition of the same vowel sounds in a line is",
            "A. alliteration",
            "B. assonance",
            "C. onomatopoeia",
            "D. parallelism",
            "A. alliteration",  "A"
        )),

        Questions( objective = Objective( "5", "", "", "",
            "A character in the story who narrates what happens to him or her is",
            "A. a second person narrator",
            "B. a first person narrator",
            "C. an omniscient narrator",
            "D. a third person narrator",
            "B. a first person narrator",  "B"
        )),


        Questions( objective = Objective( "6", "", "", "",
            "An understatement is otherwise called",
            "A. litotes",
            "B. conceit",
            "C. pun",
            "D. contrast",
            "A. litotes",  "A"
        )),

        Questions( objective = Objective( "7", "", "", "",
            "The loneliest people live in the most crowded places illustrates",
            "A. paradox",
            "B. anecdote",
            "C. allegory",
            "D. parody",
            "A. paradox ",  "A"

        )),


        Questions( objective = Objective( "8", "", "", "",
            "A person's life story written by another person is",
            "A. a commentary",
            "B. a biography",
            "C. an autobiography",
            "D. an epistolary",
            "B. a biography",  "B"
        )),

        Questions( objective = Objective( "9", "", "", "",
            "The term used to depict the freedom of a poet with language is",
            "A. poetic diction",
            "B. bathos",
            "C. graphology",
            "D. poetic licence",
            " D. poetic licence",  "D"
        )),


        Questions( objective = Objective( "10", "", "", "",
            "A poem in which a lone speaker seems to be addressing someone else is a",
            "A. pathetic fallacy",
            "B. verbal irony",
            "C. dramatic irony",
            "D. dramatic monologue",
            "D. dramatic monologue",  "D"
        )),


        Questions( objective = Objective( "11", "", "", "",
            "A story which explains a natural phenomenon is",
            "A. legend",
            "B. parable",
            "C. myth",
            "D. fiction",
            " C. myth",  "C"
        )),

        Questions( objective = Objective( "12", "", "", "",
            "A short which expresses an idea in a clever way is",
            "A. an epigram",
            "B. a limerick",
            "C. an ode",
            "D. a lyric",
            "B. a limerick",  "B"
        )),

        Questions( objective = Objective( "13", "", "", "",
            "A literary work that vividly portrays life can be described as",
            "A. realistic",
            "B. romantic",
            "C. idealistic",
            "D. sarcastic",
            "A. realistic ",  "A"
        )),

        Questions( objective = Objective( "14", "", "", "",
            "A character whose actions or qualities serve to heighten those of the hero through contrast is",
            "A. an adversary",
            "B. a protagonist",
            "C. an antagonist",
            "D. a foil",
            "C. an antagonist",  "C"
        )),


        Questions( objective = Objective( "15", "", "", "",
            "One of the following is used to develop character",
            "A. Climax",
            "B. Atmosphere",
            "C. Setting",
            "D. Dialogue",
            "D. Dialogue",  "D"
        )),


        Questions( objective = Objective( "16", "", "", "",
            "A curtain raiser is an introductory performance that is",
            "A. not part of the main play",
            "B. the first part of the main play",
            "C. not separate from the play",
            "D. the first party of the final scene",
            "B. the first part of the main play",  "B"
        )),


        Questions( objective = Objective( "17", "", "", "",
            "A stanza of four lines is a",
            "A. couplet",
            "B. quintet",
            "C. septet",
            "D. quatrain",
            "D. quatrain",  "D"
        )),


        Questions( objective = Objective( "18", "", "", "",
            "_ in drama operates against a character who is unawares of a situation which the audience know about",
            "A. Verbal irony",
            "B. Dramatic irony",
            "C. Satire",
            "D. Parody",
            " B. Dramatic irony",  "B"
        )),


        Questions( objective = Objective( "19",
            """
         "Read the extract and answer question
         Said the Lion: ''On music I dote
         But something is wrong with my throat
         When I practice a scale
         The listeners quail
         And flee at the first note''.  
            """.trimIndent(), "", "", "What type of poem is this?",
            "A. Epic",
            "B. Limerick",
            "C. Ode",
            "D. Sonnet",
            "B. Limerick",  "B"
        )),


    Questions( objective = Objective( "20",
        """
         "Read the extract and answer question
         Said the Lion: ''On music I dote
         But something is wrong with my throat
         When I practice a scale
         The listeners quail
         And flee at the first note''.  
            """.trimIndent(), "", "", "The rhyme scheme of the poem is",
    "A. aabba",
    "B. ababa",
    "C. ababb",
    "D. abbaa",
    "A. aabba",  "A"
    )
    ),



    Questions( objective = Objective( "21", instr2125, "", "",
    "The subject matter of the passage is",
    "A. a goldsmith at work",
    "B. celebrating the Eucharist",
    "C. a priest at the altar",
    "D. communion wine and wafers",
    "A. a goldsmith at work",  "A"

    )),


    Questions( objective = Objective( "22", instr2125, "", "",
    "The dominant devices used are",
    "A. personification and irony",
    "B. parallelism and repetition",
    "C. metaphor and simile",
    "D. metonymy and synecdoche",
    "C. metaphor and simile",  "C"
    )),


    Questions( objective = Objective( "23", instr2125, "", "",
    "The use of the above devices creates an atmosphere of",
    "A. fear",
    "B. doom",
    "C. hope",
    "D. awe",
    "D. awe",  "D"
    )),



    Questions( objective = Objective( "24", instr2125, "", "",
    "The writer's attitude is one of",
    "A. bewilderment",
    "B. reverence",
    "C. indifference",
    "D. arrogance",
    "A. bewilderment",  "A"
    )),


    Questions( objective = Objective( "25", instr2125, "", "",
    "The narrative technique captures the _ of the scene.",
    "A. seriousness",
    "B. vividness",
    "C. ordinariness",
    "D. loneliness",
    "A. seriousness",  "A"
    )),

    Questions( objective = Objective( "26", instr2630, "", "",
    "The theme of the poem is",
    "A. famine and disease",
    "B. drought and heat",
    "C. abomination and retribution",
    "D. sickness and death",
    "D. sickness and death",  "D"
    )),


    Questions( objective = Objective( "27", instr2125, "", "",
    "The mood of the poet is one of",
    "A. recklessness",
    "B. hopelessness",
    "C. happiness",
    "D. loneliness",
    "B. hopelessness",  "B"
    )),


    Questions( objective = Objective( "28", instr2125, "", "",
    "'The earth has stopped breathing and sighed' illustrates",
    "A. bathos",
    "B. climax",
    "C. personification",
    "D. paradox",
    "C. personification",  "C"
    )),


    Questions( objective = Objective( "29", instr2125, "", "",
    "The run-on lines convey the speaker's",
    "A. indignation",
    "B. lamentation",
    "C. disappointment",
    "D. defiance",
    "B. lamentation",  "B"
    )),


    Questions( objective = Objective( "30", instr2125, "", "",
    "There is a predominance of words associated with",
    "A. celebration",
    "B. nature",
    "C. governance",
    "D. nurture",
    "B. nature",  "B"
    )),


    Questions( objective = Objective( "31", instr3135, "", "",
    "What is Caliban promising to do?",
    "A. Carry more wood",
    "B. Behave appropriately for forgiveness",
    "C. Denounce Stephano and Trinculo",
    "D. Confess his part in the conspiracy",
    "C. Denounce Stephano and Trinculo",
    "C"
    )),


    Questions( objective = Objective( "32", instr3135, "", "",
    "PROSPERO HAS ASKED CALIBAN TO",
    "A. go and bring Miranda",
    "B. go to Prospero's cell",
    "C. fetch more wood",
    "D. learn his language lessons",
    "C. fetch more wood",  "C"
    )),


    Questions( objective = Objective( "33", instr3135, "", "",
    "The contents of ''your luggage'' are",
    "A. Alonso's satchel and swords",
    "B. food and water from the ship",
    "C. paddles fur and a harpoon",
    "D. the clothing put up by Ariel",
    "C. paddles fur and a harpoon",  "C"

    )),


    Questions( objective = Objective( "34", instr3135, "", "",
    "'this drunkard' is",
    "A. Trinculo",
    "B. Stephano",
    "C. Gonzalo",
    "D. Alonso",
    "B. Stephano",  "B"
    )),


    Questions( objective = Objective( "35", instr3135, "", "",
    "Sebastian says ''Or stole it, rather'' because the luggage",
    "A. does not belong to Caliban",
    "B. belongs to Caliban",
    "C. is not from the ship",
    "D. is from the ship",
    "D. is from the ship",  "D"
    )),


    Questions( objective = Objective( "36", instr3640, "", "",
    "Prospero is speaking to",
    "A. Caliban",
    "B. Miranda",
    "C. Ferdinand",
    "D. Ariel",
    "D. Ariel",  "D"
    )),


    Questions( objective = Objective( "37", instr3640, "", "",
    "The first line means that the addressee",
    "A. obeyed Prospero's instructions exactly",
    "B. did not carry out Prospero's instructions",
    "C. modified the instruction of Prospero",
    "D. failed to understand the instructions of Prospero",
    " A. obeyed Prospero's instructions exactly",  "A"

    )),


    Questions( objective = Objective( "38", instr3640, "", "",
    "Prospero's enemies include the voyagers but not",
    "A. Alonso",
    "B. Antonio",
    "C. Ferdinand",
    "D. Stephano",
    "D. Stephano",  "D"
    )),


    Questions( objective = Objective( "39", instr3640, "", "",
    "What has just taken place is that",
    "A. the enemies have been tantalized with a banquet",
    "B. Caliban brought home some wood",
    "C. Ferdinand is splitting wood",
    "D. Miranda has offered to help Ferinard",
    "A. the enemies have been tantalized with a banquet",  "A"
    )),


    Questions( objective = Objective( "40", instr3640, "", "",
    "Prosero decides to",
    "A. sit back and watch",
    "B. kick Caliban in the mouth",
    "C. go to Ferdinard",
    " D. discharge Ariel",
    "A. sit back and watch",  "A"
    )),

    Questions( objective = Objective( "41", instr4145, "", "",
    "The speaker is",
    "A. Alonso",
    "B. Ferdinand",
    "C. Gonzalo",
    "D. Boatswain",
    "B. Ferdinand",  "B"
    )),


    Questions( objective = Objective( "42", instr4145, "", "",
    "'this man' is",
    "A. Alonso",
    "B. Trinculo",
    "C. Stephano",
    "D. Prospero",
    "D. Prospero",  "D"
    )),


    Questions( objective = Objective( "43", instr4145, "", "",
    "'this maid' is",
    "A. Caribel",
    "B. Miranda",
    "C. Sycorax",
    "D. Dido",
    "B. Miranda",  "B"
    )),


    Questions( objective = Objective( "44", instr4145, "", "",
    "Those present in this scene are",
    "A. Stephano and Trinculo",
    "B. Prospero and Miranda",
    "C. Prospero and Gonzalo",
    "D. Miranda and Alonso",
    "B. Prospero and Miranda",  "B"
    )),


    Questions( objective = Objective( "45", instr4145, "", "",
    "'So they are' refers to the",
    "A. speaker's friends",
    "B. speaker's nerves",
    "C. monster's threats",
    "D. listener's spirits",
    "A. speaker's friends",  "B"
    )),


    Questions( objective = Objective( "46", instr4650, "", "",
    "The speaker is",
    "A. Prospero",
    "B. Ferdinand",
    "C. Miranda",
    "D. Gonzalo",
    "B. Ferdinand",  "B"
    )),


    Questions( objective = Objective( "47", instr4650, "", "",
    "Who is with the speaker?",
    "A. Miranda",
    "B. Gonzalo",
    "C. Prospero",
    "D. Ferdinand",
    "A. Miranda",  "A"
    )),


    Questions( objective = Objective( "48", instr4650, "", "",
    "The speaker wants to",
    "A. prove his love",
    "B. deny his love",
    "C. prove his innocence",
    "D. affirm his loyalty",
    "A. prove his love",  "A"
    )),


    Questions( objective = Objective( "49", instr4650, "", "",
    "The speaker is lured to that place by",
    "A. Ariel",
    "B. Caliban",
    "C. Miranda",
    "D. Gonzalo",
    "A. Ariel",  "A"
    )),

    Questions( objective = Objective( "50", instr4650, "", "",
    "The setting is",
    "A. another part of the island",
    "B. in the palace",
    "C. on a ship",
    "D. before Prospero's cell",
    "D. before Prospero's cell",  "D"

    )),

    )
}