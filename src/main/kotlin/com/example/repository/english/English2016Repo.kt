package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2016Repo {
    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    private val passageA2016 = "The young doctor looked sprightly in his white coat. Displaying his -71- very conspicuously on his neck, he walked through the -72- greeting each of the -73- who greeted him in return. Then suddenly, his eyes caught a woman on a nearby 74. He went closer, held her hand, feeling for her-75-, and then carried out some other minor -76-.  After he had elicited one or two answers from the woman, the young doctor ordered, \"Stretcher, quickly; take her to the -77 -! Even the --78-who had been supervising treatment were amazed. the woman was being wheeled to the operating room, one of the nurses asked. \"Are you sure doctor, that she is for surgery?\" The young doctor did not mince words; he said to her, \"This is an ectopic pregnancy, no mistake about it. The-79-must be taken out promptly.\" That was it. Within minutes, the operation began. While this was going on, blood was being prepared for-80-. Before long, the surgery was completed.\n"
    val english2016 = listOf<Questions>(
        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "The road which used to be ",
            "A. Widing",
            "B. Limited",
            "C. Narrow",
            "D. Reduced",
            "C. Narrow",
            "C",
            "wide ",
            "now appears ............. because of the new drainage.")),

        Questions( objective = Objective(
                "2",
                section1,
                "",
                "",
                "In the past, anybody who ",
                "A. Appease",
                "B. Reward",
                "C. Settle",
                "D. Beg",
                "A. Appease",
            "A",
                "angered ",
                "the gods was made to…………..them.")),



            Questions( objective = Objective(
                "3",
                section1,
                "",
                "",
                "Rather than being ",
                "A. Disdainful",
                "B. Curious",
                "C. Negligent",
                "D. Indifferent",
                "D. Indifferent",
                "D",
                "sensitive ",
                "to the plight of the workers, the manager remained ..............")),


            Questions( objective = Objective(
                "4",
                section1,
                "",
                "",
                "A ",
                "A. Inactive",
                "B. Lowly",
                "C. Nervous",
                "D. Reluctant",
                "A. Inactive",
                "A",
                "keen ",
                "student makes progress but the ............one hardly does well.")),


            Questions( objective = Objective(
                "5",
                section1,
                "",
                "",
                "Unlike you, i thought the message was quite ..............not ",
                "A. Reasonable",
                "B. Clear",
                "C. Apt",
                "D. Persuasive",
                "B. Clear",
                "B",
                "ambiguous.")),


            Questions( objective = Objective(
                "6",
                section1,
                "",
                "",
                "Good qualities ",
                "A. Prolong",
                "B. Activate",
                "C. aggravate",
                "D. Provoke",
                "C. aggravate",
                "C",
                "alleviate ",
                "poverty whereas bad ones ........... it.")),




            Questions( objective = Objective(
                "7",
                section1,
                "",
                "",
                "One expects books kept in the library to be well…………..not ",
                "A. Numbered",
                "B. Documented",
                "C. Arranged",
                "D. Listed",
                "C. Arranged",
                "C",
                "jumbled")),


            Questions( objective = Objective(
                "8",
                section1,
                "",
                "",
                "Despite everything, i chose to ",
                "A. Renounce",
                "B. Show",
                "C. Reveal",
                "D. Display",
                "C. Reveal",
                "C",
                "keep ",
                "rather than ............the secret.")),

            Questions( objective = Objective(
                "9",
                section1,
                "",
                "",
                "Though the teachers ..........the idea, the principal was  ",
                "A. welcomed",
                "B. recognised",
                "C. admitted",
                "D. greeted",
                "A. welcomed",
                "A",
                "averse ",
                "to it.")),


            Questions( objective = Objective(
                "10",
                section1,
                "",
                "",
                "It is only natural to feel ",
                "A. balanced",
                "B. peaceful",
                "C. normal",
                "D. composed",
                "D. composed",
                "D",
                "nervous ",
                "when you first take the stage but you soon become.......,..")),

            Questions( objective = Objective(
                "11",
                section2,
                "",
                "",
                "Don't tell me you are .......... enough to believe his lies.",
                "A. credible",
                "B. childish",
                "C. modest",
                "D. naive",
                "D. naive", "D"
            )),


            Questions( objective = Objective(
                "12",
                section2,
                "",
                "",
                "The members of parliaments tabled an .............to the constitution.",
                "A. adjustment",
                "B. amendment",
                "C. enactment",
                "D. annulment",
                "B. amendment", "B"
            )),

            Questions( objective = Objective(
                "13",
                section2,
                "",
                "",
                "His ........... to violent video games is something to worry about.",
                "A. devotion",
                "B. attatchment",
                "C. commitment",
                "D. addiction",
                "D. addiction", "D"
            )),



            Questions( objective = Objective(
                "14",
                section2,
                "",
                "",
                "Most people think that ......... punishment should be abolished, even in murder cases.",
                "A. fatal",
                "B. capital",
                "C. severe",
                "D. corporal",
                "D. corporal", "D"
            )),



            Questions( objective = Objective(
                "15",
                section2,
                "",
                "",
                "The president made a....appeal for calm in the face of the crisis.",
                "A. passionate",
                "B. zealous",
                "C. tactful",
                "D. sensitive",
                "A. passionate", "A"
            )),


            Questions( objective = Objective(
                "16",
                section2,
                "",
                "",
                "What i gave you was supposed to ............your monthly earnings",
                "A. expand",
                "B. enlarge",
                "C. complete",
                "D. augment",
                "D. augment", "D"
            )),


            Questions( objective = Objective(
                "17",
                section2,
                "",
                "",
                "The boy's parents ............a sigh of relief when he was found.",
                "A. raised",
                "B. uttered",
                "C. breathed",
                "D. heaved",
                "D. heaved", "D"
            )),


            Questions( objective = Objective(
                "18",
                section2,
                "",
                "",
                "We ............the meeting indefinitely because we could not form a quorum.",
                "A. postponed",
                "B. reconvened",
                "C. adjourned",
                "D. ended",
                "A. postponed", "A"
            )),


            Questions( objective = Objective(
                "19",
                section2,
                "",
                "",
                "The police man tried to .............money from the motorist.",
                "A. exert",
                "B. extort",
                "C. exact",
                "D. extract",
                "B. extort", "B"
            )),



            Questions( objective = Objective(
                "20",
                section2,
                "",
                "",
                "They were given an ..........either pay the rent or vacate the premises.",
                "A. ultimatum",
                "B. injunction",
                "C. admonition",
                "D. undertaking",
                "A. ultimatum", "A"
            )),


            Questions( objective = Objective(
                "21",
                section3,
                "",
                "",
                "My school carried the day in the debate. This means that my school",
                "A. missed the debate",
                "B. won the debate",
                "C. choose the date for debate",
                "D. had very good points",
                "B. won the debate", "B"
            )),



            Questions( objective = Objective(
                " 22",
                section3,
                "",
                "",
                "We covered much ground at the conference yesterday. This means that we",
                "A. discussed some issues",
                "B. treated many issues",
                "C. used a lot of space",
                "D. argued about many things",
                "D. argued about many things", "D"
            )),




            Questions( objective = Objective(
                "23",
                section3,
                "",
                "",
                "We saw Ada, of all people, dancing. This means",
                "A. we saw Ada for the first time",
                "B. we saw Ada dancing with everyone",
                "C. Ada didn't want us to see her dancing",
                "D. we were surprised to see Ada dancing",
                "D. we were surprised to see Ada dancing", "D"
            )),


            Questions( objective = Objective(
                "24",
                section3,
                "",
                "",
                "There were clear indications that Buba backed the wrong horse. This means that Buba",
                "A. supported the wrong person",
                "B. argued blindly",
                "C. abandoned this position",
                "D. bet on a loosing horse",
                "A. supported the wrong person", "A"
            )),



            Questions( objective = Objective(
                "25",
                section3,
                "",
                "",
                "I knew that they were economical with the the truth. This means that they",
                "A. were being honest",
                "B. did not know the truth",
                "C. did not know enough about the matter",
                "D. knew more than they were prepared to say",
                "C. did not know enough about the matter", "C"
            )),

            Questions( objective = Objective(
                "26",
                section3,
                "",
                "",
                "My mother wanted to know what was eating him. This means that she wanted to find out",
                "A. what has made him become lean",
                "B. what he was spending his money",
                "C. why he was upset",
                "D. why he ignored him",
                "C. why he was upset", "C"
            )),



            Questions( objective = Objective(
                "27",
                section3,
                "",
                "",
                "People who tells lies makes me see red. This means that such people make me",
                "A. dizzy",
                "B. angry",
                "C. sad",
                "D. anxious",
                "B. angry", "B"
            )),

            Questions( objective = Objective(
                "28",
                section3,
                "",
                "",
                "After several attempts to claim the child, he threw in the towel. This means that he",
                "A. succeeded finally",
                "B. accepted defeat",
                "C. gained confidence",
                "D. became indifferent",
                "B. accepted defeat", "B"
            )),


            Questions( objective = Objective(
                "29",
                section3,
                "",
                "",
                "This is their third defeat in a row. This means that they have",
                "A. been defeated three times",
                "B. defeated three teams consecutively",
                "C. been defeated by three teams",
                "D. suffered three consecutive defeats",
                "B. defeated three teams consecutively", "B"
            )),


            Questions( objective = Objective(
                "30",
                section3,
                "",
                "",
                "The company has been under siege from the public. This means that the company is being",
                "A. applauded",
                "B. picketed",
                "C. criticized",
                "D. shielded",
                "C. criticized", "C"
            )),


            Questions( objective = Objective(
                "31",
                section4,
                "",
                "",
                "Most people ",
                "A. scorn",
                "B. despise",
                "C. reject",
                "D. slight",
                "B. despise",
                "B",
                "abhor ",
                "nagging.")),




            Questions( objective = Objective(
                "32",
                section4,
                "",
                "",
                "I really hope beatrice would be ",
                "A. generous",
                "B. polite",
                "C. gracious",
                "D. gentle",
                "C. gracious",
                "C",
                "kind ",
                "enough to let us stay the night.")),






            Questions( objective = Objective(
                "33",
                section4,
                "",
                "",
                "I personally think that the costume ",
                "A. outdated",
                "B. strange",
                "C. unique",
                "D. foreign",
                "B. strange",
                "B",
                "outlandish")),



            Questions( objective = Objective(
                "34",
                section4,
                "",
                "",
                "He did all he could to  ",
                "A. defend",
                "B. secure",
                "C. shield",
                "D. support",
                "A. defend",
                "A",
                "fortify ",
                " the building against attack.")),




            Questions( objective = Objective(
                "35",
                section4,
                "",
                "",
                "This is one decision you cannot  ",
                "A. justify",
                "B. explain",
                "C. support",
                "D. express",
                "A. justify",
                "A",
                "defend")),




            Questions( objective = Objective(
                "36",
                section4,
                "",
                "",
                "He simply dislikes he's wife's ",
                "A. frequent",
                "B. excessive",
                "C. repeated",
                "D. indecent",
                "B. excessive",
                "B",
                "inordinate ",
                "demands for money.")),






            Questions( objective = Objective(
                "37",
                section4,
                "",
                "",
                "Bravery is Victor's most ",
                "A. admirable",
                "B. outstanding",
                "C. suitable",
                "D. influential",
                "B. outstanding",
                "B",
                "dominant ",
                "trait")),



            Questions( objective = Objective(
                "38",
                section4,
                "",
                "",
                "It's always better to buy ",
                "A. authentic",
                "B. expensive",
                "C. permanent",
                "D. lasting",
                "D. lasting",
                "D",
                "durable ",
                "products")),


            Questions( objective = Objective(
                "39",
                section4,
                "",
                "",
                "Where did this document ",
                "A. originate",
                "B. emerge",
                "C. appear",
                "D. arise",
                "A. originate",
                "A",
                "emanate ",
                "from.")),


            Questions( objective = Objective(
                "40",
                section4,
                "",
                "",
                "The management ",
                "A. adored",
                "B. commended",
                "C. encouraged",
                "D. recommended",
                "B. commended",
                "B",
                "applauded ",
                "the staff for their hard work")),


            Questions( objective = Objective(
                "41",
                section5,
                "",
                "",
                "You like ice cream, .......... ?",
                "A. didn't you",
                "B. did you",
                "C. isn't it",
                "D. don't you",
                "D. don't you", "D"
            )),


            Questions( objective = Objective(
                "42",
                section5,
                "",
                "",
                "I didn't tell my parents about the trip because they would be .......... themselves with worry.",
                "A. at",
                "B. upon",
                "C. within",
                "D. beside",
                "D. beside", "D"
            )),

            Questions( objective = Objective(
                "43",
                section5,
                "",
                "",
                "We arrive just .......... time for the formal opening.",
                "A. in",
                "B. after",
                "C. before",
                "D. at",
                "A. in", "A"
            )),


            Questions( objective = Objective(
                "44",
                section5,
                "",
                "",
                "She claims .......... someone jump over the fence",
                "A. seeing",
                "B. to have seen",
                "C. having seen",
                "D. to be seeing",
                "B. to have seen", "B"
            )),


            Questions( objective = Objective(
                "45",
                section5,
                "",
                "",
                "Kofi said he is better at physics ..........",
                "A. as i am",
                "B. than i am",
                "C. as i am",
                "D. than i do",
                "D. than i do", "D"
            )),


            Questions( objective = Objective(
                "46",
                section5,
                "",
                "",
                "Her shoes are made .............. genuine leather",
                "A. on",
                "B. of",
                "C. with",
                "D. by",
                "C. with", "C"
            )),


            Questions( objective = Objective(
                "47",
                section5,
                "",
                "",
                "Even after his explanations, i was none the .......... ",
                "A. wiser",
                "B. wise",
                "C. wisest",
                "D. worse",
                "A. wiser", "A"
            )),


            Questions( objective = Objective(
                "48",
                section5,
                "",
                "",
                "I spoke to Mary and Peter on the issue but..............of them took my advice.",
                "A. All",
                "B. neither",
                "C. either",
                "D. each",
                "B. neither", "B"
            )),



            Questions( objective = Objective(
                "49",
                section5,
                "",
                "",
                "We need to ..........for lost time.",
                "A. make in",
                "B. make by",
                "C. make up",
                "D. make through",
                "C. make up", "C"
            )),



            Questions( objective = Objective(
                "50",
                section5,
                "",
                "",
                "Everyone wants to be the .............. favourite",
                "A. school principal",
                "B. school's principal's",
                "C. school principal's",
                "D. school's principal",
                "C. school principal's", "C"
            )),



            Questions( objective = Objective(
                "51",
                section5,
                "",
                "",
                "That haircut makes him ............... in the crowd.",
                "A. stand out",
                "B. stand tall",
                "C. stand in",
                "D. stand on",
                "A. stand out", "A"
            )),



            Questions( objective = Objective(
                "52",
                section5,
                "",
                "",
                "The deal .......... because we could not get enough money to finance it.",
                "A. fell up",
                "B. fell out",
                "C. fell in",
                "D. fell through",
                "B. fell out", "B"
            )),


            Questions( objective = Objective(
                "53",
                section5,
                "",
                "",
                ".......... in this town form many years, i can tell you a lot about its people.",
                "A. from living",
                "B. to have lived",
                "C. having lived",
                "D. in living",
                "C. having lived", "C"
            )),

            Questions( objective = Objective(
                "54",
                section5,
                "",
                "",
                "I don't believe that any ............. person would do such a thing",
                "A. matured",
                "B. mature",
                "C. maturing",
                "D. matures",
                "B. mature", "B"
            )),



            Questions( objective = Objective(
                "55",
                section5,
                "",
                "",
                "The coach, as well as the players .......... given fantastic gifts last month.",
                "A. was",
                "B. were",
                "C. are",
                "D. is",
                "A. was", "A"
            )),



            Questions( objective = Objective(
                "56",
                section5,
                "",
                "",
                "If he .......... here, he would do it for free",
                "A. is",
                "B. was",
                "C. were",
                "D. will be",
                "B. was", "B"
            )),


            Questions( objective = Objective(
                "57",
                section5,
                "",
                "",
                "Had she told me, i .......... you",
                "A. will have stopped",
                "B. would have stopped",
                "C. would stop",
                "D. must have stopped",
                "B. would have stopped", "B"
            )),





            Questions( objective = Objective(
                "58",
                section5,
                "",
                "",
                "Since his transfer to Banjul, my brother ............ our hometown",
                "A. had not been visiting",
                "B. did not visit",
                "C. has not visited",
                "D. had not visited",
                "D. had not visited", "D"
            )),



            Questions( objective = Objective(
                "59",
                section5,
                "",
                "",
                "The Minister .......... Agriculture visited our school today",
                "A. to",
                "B. on",
                "C. of",
                "D. in",
                "C. of", "C"
            )),




            Questions( objective = Objective(
                "60",
                section5,
                "",
                "",
                "I was barely half way home when darkness ..........",
                "A. set out",
                "B. set in",
                "C. set up",
                "D. set off",
                "B. set in", "B"
            )),



            Questions( objective = Objective(
                "61",
                section5,
                "",
                "",
                "You must obtain a degree .......... medicine to become a doctor",
                "A. on",
                "B. for",
                "C. of",
                "D. in",
                "D. in", "D"
            )),

            Questions( objective = Objective(
                "62",
                section5,
                "",
                "",
                "We'll buy more but for now lets just .......... with what we have",
                "A. make up",
                "B. make do",
                "C. make away",
                "D. make out",
                "B. make do", "B"
            )),


            Questions( objective = Objective(
                "63",
                section5,
                "",
                "",
                "They told her that we would solve the problem ..........",
                "A. herself",
                "B. himself",
                "C. themselves",
                "D. ourselves",
                "D. ourselves", "D"
            )),


            Questions( objective = Objective(
                "64",
                section5,
                "",
                "",
                "The sport i like .......... is swimming",
                "A. better",
                "B. much",
                "C. most",
                "D. more",
                "C. most", "C"
            )),


            Questions( objective = Objective(
                "65",
                section5,
                "",
                "",
                "If you insist that you are not a tailor .......... are you?",
                "A. whom",
                "B. which",
                "C. what",
                "D. who",
                "D. who", "D"
            )),



            Questions( objective = Objective(
                "66",
                section5,
                "",
                "",
                "If your grades don't improve, i shall have no option .......... to move you to another school",
                "A. than",
                "B. except",
                "C. besides",
                "D. but",
                "A. than", "A"
            )),


            Questions( objective = Objective(
                "67",
                section5,
                "",
                "",
                "I .......... rather he did not stay",
                "A. could",
                "B. should",
                "C. will",
                "D. would",
                "D. would", "D"
            )),


            Questions( objective = Objective(
                "68",
                section5,
                "",
                "",
                "Your submission is .......... ",
                "A. neither here or there",
                "B. either here or there",
                "C. either here nor there",
                "D. neither there or here",
                "A. neither here or there", "A"
            )),



            Questions( objective = Objective(
                "69",
                section5,
                "",
                "",
                "Every one of the boys .......... excited about the picnic.",
                "A. was seeming",
                "B. is seeming",
                "C. seem",
                "D. seems",
                "C. seem", "C"
            )),




            Questions( objective = Objective(
                "70",
                section5,
                "",
                "",
                "You .......... be ashamed of yourself for saying such a thing before the principal.",
                "A. will",
                "B. should",
                "C. might",
                "D. shall",
                "B. should", "B"
            )),

        Questions( objective = Objective( "71", section6, "", "",
            passageA2016,
            "A. chain",
            "B. badge",
            "C. stethoscope",
            "D. watch",
            "C. stethoscope",
            "C"
        )),

        Questions( objective = Objective( "72", section6, "", "",
            passageA2016,
            "A. aisle",
            "B. office",
            "C. room",
            "D. ward",
            "A. aisle",
            "A"
        )),

        Questions( objective = Objective( "73", section6, "", "",
            passageA2016,
            "A. patients",
            "B. clients",
            "C. invalids",
            "D. customers",
            "A. patients",
            "A"
        )),


        Questions( objective = Objective( "74", section6, "", "",
            passageA2016,
            "A. stretcher",
            "B. bed",
            "C. wheelchair",
            "D. bench",
            "B. bed",
            "B"
        )),


        Questions( objective = Objective( "75", section6, "", "",
            passageA2016,
            "A. breathing",
            "B. pulse",
            "C. response",
            "D. pressure",
            "B. pulse",
            "B"
        )),


        Questions( objective = Objective( "76", section6, "", "",
            passageA2016,
            "A. experiments",
            "B. probes",
            "C. drills",
            "D. checks",
            "D. checks",
            "D"
        )),


        Questions( objective = Objective( "77", section6, "", "",
            passageA2016,
            "A. theatre",
            "B. laboratory",
            "C. clinic",
            "D. casualty",
            "A. theatre",
            "A"
        )),


        Questions( objective = Objective( "78", section6, "", "",
            passageA2016,
            "A. orderlies",
            "B. matrons",
            "C. midwives",
            "D. attendants",
            "B. matrons",
            "B"
        )),


        Questions( objective = Objective( "79", section6, "", "",
            passageA2016,
            "A. baby",
            "B. child",
            "C. infant",
            "D. foetus",
            "D. foetus",
            "D"
        )),


        Questions( objective = Objective( "80", section6, "", "",
            passageA2016,
            "A. dripping",
            "B. pumping",
            "C. transfer",
            "D. transfusion",
            "D. transfusion",
            "D"
        )),


        )

}