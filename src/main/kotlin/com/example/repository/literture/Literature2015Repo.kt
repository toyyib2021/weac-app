package com.example.repository.literture

import com.example.repository.Objective
import com.example.repository.Questions

class Literature2015Repo {

    private val instr2125 = """
       UNSEEN PROSE AND POERY
       Read the passage and answer the question
       A modest two-room hut built of mud and rooled with straw graciously sheltered the Mensahs. One of the rooms advertised itself as a living room. The kind earthenware pot willingly kept company with four ever smiling stools. The pot eternally contained cool water for guests. The second room was a warm-hearted bedroom without a bed. The poor pair had to sleep on bare straw mats on the polished dirt floor. Some overwashed rags deputized for blankets and sheets and pillows. Two strange dry logs, facing each other like bitter rivals burned themselves out at night, not merely to keep the couple warm but mainly to ward off hungry mosquitoes and other hostile pests.
       There was no door to ward off the cold night air Some rude devices, however, were contrived to keep the room quite safe from prying eyes and curious domestic animals. Would any thief be ever tempted to peep into such a rude room of such a poor pair?
       """.trimIndent()
    private val instr2630 = """
        Read the poem and answer question 26 to 30 
        Proud mothers of the coming age, 
        Tis good to find you now engage
        Your minds and time your lives to raise
        Above the level of bygone days
        
        Tis good to see you play part
        With spirit and undaunted heart,
        It gives young Afric's throbbing soul 
        A glimpse of a bright and glorious goal.
        
        God bless you, mother of our race,
        God cause to shine on you his face; 
        And give you strength and all you crave 
        To bring forth sons and daughters brave.

   """.trimIndent()
    private val instr3135 = """
    Answer all the questions in this section Read the extract and answer question 31 to 35
    WILLIAM SHAKESPEARE: The Tempest
    Silence! One word more Shall make me child thee, if not hate thee. What! An

    advocate for an imposter! Hush
    (Act I, scene two, lines 478-480)
   
    """.trimIndent()
    private val instr3640 = """
    Read the extract and answer question 36 to 40
    You cram these words into mine ears against the stomach of my sense. Would I had never married my daughter
    there! For, coming thence, my son is lost, and, in my rate. She too,
    (Act II, Scene One, fines 99-102)    
     """.trimIndent()
    private val instr4145 = """
    Read the extract and answer question 41 to 45
    Ariel: All hail, great master! Grave sir, hail! I come to answer thy best pleasure; be't to fly, to swim, to drive into the fire, to ride on the curled clouds, to thy strong bidding task Ariel and all his quality.
    (Act I, Scene Two, lines 189-193)
     """.trimIndent()
    private val instr4650 = """
        Read the extract and answer questions 46 to 50 
    X: We two, my lord,
    Will guard your person while you take your rest. And watch your safety.
    Y: Thank you. - Wondrous heavy. 
    (Act II, Scene One, lines 184-187)
   """.trimIndent()

    val literature2015 = listOf<Questions>(

        Questions( objective = Objective( "1", "", "", "",
            "A speech in play in which a character speaks his or her thoughts alone is ",
            "A. a monologue ",
            "B. an aside ",
            "C. a soliloquy",
            "D. an epilogue.",
            "C. a soliloquy",
            "C"
        )),

        Questions( objective = Objective( "2", "", "", "",
            "in literature, repetition in use essentially for ",
                    "A. rhyme ",
            "B. suspense ",
            "C. allusion ",
            "D. emphasis",
            "D. emphasis",
            "D"
        )),


        Questions( objective = Objective( "3", "", "", "",
            "The pattern of poem without reference to its content is referred to as the",
            "A. limerick",
            "B. metre",
            "C. free verse ",
            "D. form",
            "D. form",
            "D"
        )),


        Questions( objective = Objective( "4", "", "", "",
            "The performance in a play constitutes the",
            "A. chorus",
            "B. characters ",
            "C audience",
            "D. cast.",
            "D. cast",
            "D",
        )),



        Questions( objective = Objective( "5",
            """
            Read the stanza and answer question 5 to 7.
            Pan, O great Pan, to thee

            Thus do we sing! Thou who keep'st chaste and free
            As the young spring:
            Ever be thy honor spake From the place the mom is broke
            To the place day doth unyoke.
            """.trimIndent(), "", "",
            "The stanza is an example of ",
            "A. appellation",
            "B. apostrophe",
            "C. euphemism",
            "D. elegy.",
            "D. elegy",
            "D"
        )),

        Questions( objective = Objective( "6",
            """
            Read the stanza and answer question 5 to 7.
            Pan, O great Pan, to thee

            Thus do we sing! Thou who keep'st chaste and free
            As the young spring:
            Ever be thy honor spake From the place the mom is broke
            To the place day doth unyoke.
            """.trimIndent(), "", "",
            "Pen is used here as",
            "A. an allusion ",
            "B. symbol",
            "C. irony",
            "D. metonymy.",
            "A. an allusion",
            "A"
        )),



        Questions( objective = Objective( "7",
            """
            Read the stanza and answer question 5 to 7.
            Pan, O great Pan, to thee

            Thus do we sing! Thou who keep'st chaste and free
            As the young spring:
            Ever be thy honor spake From the place the mom is broke
            To the place day doth unyoke.
            """.trimIndent(), "", "",
            "The rhyme scheme of the stanza is ",
            "A. abcabcc",
            "B. ababcdd ",
            "C.babccc ",
            "D. bcbccaa ",
            "B. ababcdd",
            "B"
        )),


        Questions( objective = Objective( "8", "", "", "",
            "A metrical foot in which a stressed syllable is followed by an unstressed syllable is",
            "A. iambic",
            "B. spondaic",
            "C. trochaic ",
            "D. dactylic.",
            "D. dactylic",
            "D"
        )),


        Questions( objective = Objective( "9", "", "", "",
            "………….. is the location of the action of the plot ",
            "A setting ",
            "B. narrative technique",
            "C. point of view",
            "D. characterization",
            "A setting",
            "A"
        )),



        Questions( objective = Objective( "10", "", "", "",
            "A ballad is essentially a poem",
            "A descriptive ",
            "B. dramatic ",
            "C. pastoral",
            "D. narrative",
            "D. narrative",
            "D"
        )),

        Questions( objective = Objective( "11", "", "", "",
            "The four lines of the Shakespearean sonnet rhyme",
            "A abcd",
            "B. abba",
            "C. abab ",
            "D. cdcd ",
            "B. abba",
            "B"
        )),


        Questions( objective = Objective( "13", "", "", "",
            "A story in which characters or actions represent abstract ideas or moral qualities is",
            "A. an epic",
            "B. a legend",
            "C. an allegory",
            "D. a satire",
            "A. an epic",
            "A"
        )),


        Questions( objective = Objective( "13", "", "", "",
            "The use of imagery in prose or verse ",
            "A. appeals to the senses",
            "B. develops the plot",
            "C. creates confusion",
            "D. obscures meaning",
            "A. appeals to the senses",
            "A"
        )),


        Questions( objective = Objective( "14",
            """
                Use the lines to answer question 14 and 15
                Our leaders will not compromise freedom
                Nor will our heads give up liberty.
            """.trimIndent(), "", "",
            "The line illustrate",
            "A. soliloquy",
            "B. parallelism",
            "C. dialogue",
            "D. contrast",
            "B. parallelism",
            "B"
        )),

        Questions( objective = Objective( "15",
            """
                Use the lines to answer question 14 and 15
                Our leaders will not compromise freedom
                Nor will our heads give up liberty.
            """.trimIndent(), "", "",
            "'heads' in the second line is an example of",
            "A synecdoche",
            "B. inversion",
            "C epithet",
            "D. conceit",
            "A synecdoche",
            "A"
        )),


        Questions( objective = Objective( "16", "", "", "",
            "A character that develops in the course of a novel play is described as",
            "A. flat",
            "B antagonist",
            "C. round",
            "D. protagonist",
            "A. flat",
            "A"
        )),


        Questions( objective = Objective( "17", "", "", "",
            "A dirge is a poem sung",
            "A. to send a child to sleep",
            "B. to make workers happy",
            "C. at a birthday party",
            "D.  at a funeral",
            "D.  at a funeral",
            "D"
        )),

        Questions( objective = Objective( "18", "", "", "",
            "In drama, the ........ creates humour",
            "A hero ",
            "B. con",
            "C villain",
            "D. chorus",
            "B. con",
            "B"
        )),


        Questions( objective = Objective( "19", "", "", "",
            "Let me not love thee if I love thee not illustrates",
            "A metaphor",
            "B. proverb",
            "C. paradox",
            "D. melosis",
            "C. paradox",
            "C"
        )),

        Questions( objective = Objective( "20", "", "", "",
            ".......... is a literary device used to express something unpleasant in a more acceptable manner ",
            "A epilogue",
            "B. epigram ",
            "C. euphemism",
            "D. eulogy",
            "C. euphemism",
            "C"
        )),


        Questions( objective = Objective( "21", instr2125, "", "",
            "The writer's attitude to the couple is one of ",
            "A resignation",
            "B. indifference ",
            "C. patronage ",
            "D. praise ",
            "D. praise",
            "D"
        )),


        Questions( objective = Objective( "22", instr2125, "", "",
            "The dominant literary device used in the passage",
            "A. litotes ",
            "B. personification ",
            "C. simile ",
            "D. paradox ",
            "C. simile",
            "C",
        )),


        Questions( objective = Objective( "23", instr2125, "", "",
            "The rhetorical question that ends the passage stresses the",
            "A. wickedness of the thieves",
            "B. poverty of the couple",
            "C. security of the hut",
            "D. filthiness of the surroundings",
            "B. poverty of the couple",
            "B"
        )),

        Questions( objective = Objective( "24", instr2125, "", "",
            "The expression such a rude room of such a poor pair illustrate",
            "A. onomatopoeia",
            "B. pun",
            "C. rhyme",
            "D alliteration",
            "D alliteration",
            "D"
        )),

        Questions( objective = Objective( "25", instr2125, "", "",
            "The setting is",
            "A. dawn",
            "B. sunset ",
            "C. midday ",
            "D. nigh",
            "D. nigh",
            "D"
        )),



    Questions( objective = Objective( "26", instr2630, "", "",
    "The rhyme scheme is",
    "A. aabb ccdd eeff ",
    "B. abad abab aabb ",
    "C. abca abbc abab",
    "D. abba abca abab ",
    "A. aabb ccdd eeff",
    "A"
    )),

    Questions( objective = Objective( "27", instr2630, "", "",
    "The theme of the poem is ",
    "A. the love of mother",
    "B. invoking the spirit of womanhood",
    "C. admiration for hard work ",
    "D. the suffering of women",
    "C. admiration for hard work",
    "C"
    )),

    Questions( objective = Objective( "28", instr2630, "", "",
    "The literary device used in line 7 is",
    "A. conceit",
    "B. personification",
    "C. hyperbole",
    "D. pathos",
    "D. pathos",
    "D"
    )),

    Questions( objective = Objective( "29", instr2630, "", "",
    "The poet's lone is one of",
    "A. sadness",
    "B. joy",
    "C. condemnation",
    "D. sarcasm",
    "B. joy",
    "B"
    )),

    Questions( objective = Objective( "30", instr2630, "", "",
    "'To bring forth sons and daughters brave, illustrates",
    "A. paradox",
    "B. zeugma",
    "C. inversion",
    "D. epigram",
    "A. paradox",
    "A"
    )),





    Questions( objective = Objective( "31", instr3135, "", "",
    "The speaker is ",
    "A. Gonzalo ",
    "B. Antonio",
    "C. Prospero",
    "D. Alonso",
    "C. Prospero",
    "C"
    )),

    Questions( objective = Objective( "32", instr3135, "", "",
    "The addressee is",
    "A. Ariel",
    "B. Ferdinand",
    "C. Caliban",
    "D. Miranda",
    "D. Miranda",
    "D"
    )),


    Questions( objective = Objective( "33", instr3135, "", "",
    "The 'impostor' is ",
    "A. Sebastian",
    "B. Antonio",
    "C. Ferdinand ",
    "D. Alonso",
    "B. Antonio",
    "B"
    )),

    Questions( objective = Objective( "34", instr3135, "", "",
    "The 'advocate' and the 'impostor' are ",
    "A. conspirators ",
    "B. enemies ",
    "C. suspicious of each other ",
    "D. attracted to each other",
    "A. conspirators",
    "A"
    )),


    Questions( objective = Objective( "35", instr3135, "", "",
    "The speaker's utterance betrays his ",
    "A. anger ",
    "B. pretence ",
    "C. hatred ",
    "D. sorrow",
    "A. anger",
    "A"
    )),



    Questions( objective = Objective( "36", instr3640, "", "",
    "The speaker is ",
    "A. Gonzalo ",
    "B. Antonio ",
    "C. Sebastian ",
    "D. Alonso",
    "D. Alonso",
    "D"
    )),

    Questions( objective = Objective( "37", instr3640, "", "",
    "'these words' refer to ",
    "A. the shipwreck ",
    "B. the son's disappearance ",
    "C. the daughter's wedding ",
    "D. Prospero's magic",
    "C. the daughter's wedding",
    "C"
    )),


    Questions( objective = Objective( "38", instr3640, "", "",
    "Where did the wedding take place?",
    "A. Algiers",
    "B. Milan ",
    "C. Tunis ",
    "D. Naples ",
    "D. Naples",
    "D"
    )),


    Questions( objective = Objective( "39", instr3640, "", "",
    "The setting is ",
    "A. outside Prospero's cell ",
    "B. on a ship ",
    "C. in front of Prospero's cell ",
    "D. another part of the island",
    "D. another part of the island",
    "D",
    )),



    Questions( objective = Objective( "40", instr3640, "", "",
    "'.......in my rate' means",
    "A. I'm very certain ",
    "B. so far as I can see ",
    "C. there's no doubt ",
    "D. as it appears ",
    "B. so far as I can see",
    "B"
    )),



    Questions( objective = Objective( "41", instr4145, "", "",
    "Ariel has 'come' because",
    "A. he has been invited by prospero",
    "B. he wants to make a request ",
    "C. he desires a meeting ",
    "D. flying is no problem to him",
    "A. he has been invited by prospero",
    "A"
    )),

    Questions( objective = Objective( "42", instr4145, "", "",
    "Prospero has actually ",
    "A. raised a storm at sea",
    "B. punished Miranda ",
    "C. dismissed Ferdinand",
    "D. commanded Ariel to disappear.",
    "A. raised a storm at sea",
    "A"
    )),


    Questions( objective = Objective( "43", instr4145, "", "",
    "Before Ariel's entry",
    "A. Ferdinand has brought in some wood ",
    "B. Prospero had put Miranda to sleep ",
    "C. Caliban had been swearing to Prospero ",
    "D. Trinculo had discovered Caliban's cloak.",
    "B. Prospero had put Miranda to sleep",
    "B"
    )),

    Questions( objective = Objective( "44", instr4145, "", "",
    " 'Ariel and all his quality' means Ariel and",
    "A. all at his command ",
    "B. the quality of a spirit ",
    "C. his band of spirits ",
    "D. an ability to cause mischief. ",
    "B. the quality of a spirit",
    "B"
    )),

    Questions( objective = Objective( "45", instr4145, "", "",
    "Soon after, Ariel ",
    "A. flies off to do his duty",
    "B. recounts the confusion on board the ship",
    "C. kneels down to worship Prospero",
    "D. calss Ceres and another spirit.",
    "B. recounts the confusion on board the ship",
    "B"
    )),




    Questions( objective = Objective( "46", instr4650, "", "",
    "X and Y are ",
    "A. Antonio and Alonso ",
    "B. Sebastian and Alonso",
    "C. Antonio and Gonzalo ",
    "D. Sebastian and Gonzalo.",
    "B. Sebastian and Alonso",
    "B"
    )),

    Questions( objective = Objective( "47", instr4650, "", "",
    "'we two' are",
    "A. Antonio and Adrian",
    "B. Sebastian and Adrian",
    "C. Sebastian and Franciso",
    "D. Antonio and Sebastian",
    "D. Antonio and Sebastian", "D"
    )),


    Questions( objective = Objective( "48", instr4650, "", "",
    "The situation in the extract is highly",
    "A. satirical",
    "B. prophetic",
    "C. ironical",
    "D. comical",
    "C. ironical", "C"
    )),

    Questions( objective = Objective( "49", instr4650, "", "",
        "",
    "A. They have been made deaf and dumb",
    "B. Ariel has put them all to sleep",
    "C. They have been sent away",
    "D. Prospero has put them to sleep.",
    "B. Ariel has put them all to sleep", "B"
    )),

    Questions( objective = Objective( "50", instr4650, "", "",
    "The 'two' later plot to _______",
    "A. kill all the other characters",
    "B. escape from the island",
    "C. Kill prospero and Miranda",
    "D. kill Alonso and Gonzalo",
    "D. kill Alonso and Gonzalo", "D"
    )),

    )
}