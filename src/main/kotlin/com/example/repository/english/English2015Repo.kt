package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2015Repo {

    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    val passageA2015 = "The life of a professional sportsman is hectic. Consider his typical day. As soon as he wakes up in the money, he jumps out of bed hurriedly and wears his..71..promptly, he goes out to ..72..for an hour or so, covering a few miles. However, on some other days, he might choose to practice with skipping...73..at home. Having completed whichever one it is, he goes in for a shower and dresses for the day's training..74..this phase varies according to his specialty. If he is a boxer, he goes into the...75..to deal with the punching bag and later with a sparring partner, usually under the watchful...76..of his coach. If he is a sprinter, he engages in continuous practice..77.. his performance with a stopwatch. If he is in football, netball, volley ball, or lawn tennis, he can best practice with others while the coach watches, calling attention to specific skills and...78..not mastered. In most cases, training lasts virtually the better part of a day, and often in discussion where certain technicalities are ironed out. " +
    "Now, when medals are ..79.., most people who just watch actions on television hardly realize what it takes to become a star. When all the..80..are considered and the high risk taken into account, one would realize that a star is worth the millions he earns. "

    val english2015 = listOf<Questions>(

        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "The officer was expected to be………....by his boss, but he was  ",
            "A. questioned",
            "B. praised",
            "C. decorated",
            "D. guided",
            "B. praised",
            "B",
            "censured.",
            "", )
        ),


        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "The honour that was ",
            "A. withdrawn",
            "B. confirmed",
            "C. rejected",
            "D. destroyed",
            "A. withdrawn",
            "A",
            "conferred ",
            "on the general has been………...")),


        Questions( objective = Objective(
                "3",
                section1,
                "",
                "",
                "The ",
                "A. intelligent",
            "B. handsome",
                "C. conceited",
                "D. wicked",
                "C. conceited",
            "C",
                "modest",
                "young man was rewarded while, his ........brother was punished")),



            Questions( objective = Objective(
                "4",
                section1,
                "",
                "",
                "Young people are known for their……….which contrast with the",
                "A. ability",
                "B. instability",
                "C. activity",
                "D. credibility",
                "B. instability",
                "B",
                "composure ",
                "of adults")),


            Questions( objective = Objective(
                "5",
                section1,
                "",
                "",
                "It is a fact that ",
                "A. humility",
                "B. honesty",
                "C. affection",
                "D. tenderness",
                "A. humility",
                "A",
                "pride",
                "is a less admirable quality than………...")),



            Questions( objective = Objective(
                "6",
                section1,
                "",
                "",
                "It is obvious that many people many people prefer ",
                "A. scarcity",
                "B. thrift",
                "C. waste",
                "D. poverty",
                "D. poverty",
                "D",
                "affluence ",
                "to....")),


            Questions( objective = Objective(
                "7",
                section1,
                "",
                "",
                "While some workers felt that the term were ",
                "A. strange",
                "B. disagreeable",
                "C. bad",
                "D. hostile",
                "B. disagreeable",
                "B",
                "amicable; ",
                "others thought that they were……....")),


            Questions( objective = Objective(
                "8",
                section1,
                "",
                "",
                "Now that the people of this community are living in",
                "A. disappointment",
                "B. hardship",
                "C. strife",
                "D. starvation",
                "B. hardship",
                "B",
                "comfort,",
                "i don't think they will want to go back to their days of……....")),



            Questions( objective = Objective(
                "9",
                section1,
                "",
                "",
                "False witness ",
                "A. expose",
                "B. appease",
                "C. punish",
                "D. exonerate",
                "D. exonerate",
                "D",
                "castigate ",
                "rather than ........the accused")),


            Questions( objective = Objective(
                "10",
                section1,
                "",
                "",
                "Some teachers ",
                "A. motivate",
                "B. lure",
                "C. instruct",
                "D. reward",
                "A. motivate",
                "A",
                "dissuade ",
                "students from studying Mathematics, but others ..........them")),


            Questions( objective = Objective(
                "11",
                section2,
                "",
                "",
                "After assuring the authorities that he would not escape, the prisoner was released on……..",
                "A. suspension",
                "B. record",
                "C. parole",
                "D. probation",
                "D. probation", "D"
            )),




            Questions( objective = Objective(
                "12",
                section2,
                "",
                "",
                "A judge is required to………….justice fairly.",
                "A. defer",
                "B. dispense",
                "C. define",
                "D. dispel",
                "B. dispense", "B"
            )),

            Questions( objective = Objective(
                "13",
                section2,
                "",
                "",
                "The disease was……....by the doctors as pneumonia.",
                "A. diagnosed",
                "B. prescribed",
                "C. constructed",
                "D. decided",
                "A. diagnosed", "A"
            )),



            Questions( objective = Objective(
                "14",
                section2,
                "",
                "",
                "The court granted an…….....against the eviction of the tenants.",
                "A. adjournment",
                "B. injunction",
                "C. indictment",
                "D. adjudication",
                "B. injunction", "B"
            )),




            Questions( objective = Objective(
                "15",
                section2,
                "",
                "",
                "He was given a certificate of………....in English",
                "A. efficacy",
                "B. efficiency",
                "C. proficiency",
                "D. sufficiency",
                "C. proficiency", "C"
            )),




            Questions( objective = Objective(
                "16",
                section2,
                "",
                "",
                "The………...years of a child's life mould his character",
                "A. restrained",
                "B. constructive",
                "C. conflicting",
                "D. formative",
                "D. formative", "D"
            )),


            Questions( objective = Objective(
                "17",
                section2,
                "",
                "",
                "He bore his troubles with .…………",
                "A. leniency",
                "B. preference",
                "C. discretion",
                "D. patience",
                "C. discretion", "C"
            )),



            Questions( objective = Objective(
                "18",
                section2,
                "",
                "",
                "Public money used be used only for……. purposes",
                "A. legitimate",
                "B. discreet",
                "C. legal",
                "D. executive",
                "A. legitimate", "A"
            )),



            Questions( objective = Objective(
                "19",
                section2,
                "",
                "",
                "The truth of the evidence is….....",
                "A. irreversible",
                "B. irrefutable",
                "C. irreparable",
                "D. irretrievable",
                "B. irrefutable", "B"
            )),


            Questions( objective = Objective(
                "20",
                section2,
                "",
                "",
                "As a millionaire he lives in ……..",
                "A. prudence",
                "B. affluence",
                "C. frugality",
                "D. abundance",
                "B. affluence", "B"
            )),


            Questions( objective = Objective(
                "21",
                section3,
                "",
                "",
                "On hearing the news, he flew off the handle. This means that he",
                "A. changed his decision",
                "B. ran away",
                "C. felt very disappointed",
                "D. became very angry",
                "D. became very angry", "D"
            )),


            Questions( objective = Objective(
                "22",
                section3,
                "",
                "",
                "John's money was barely enough to keep the wolf away from the door. This means that",
                "A. John had killed the wolf",
                "B. the money was just sufficient",
                "C. the situation was just desperate",
                "D. john spent money lavishly",
                "C. the situation was just desperate", "C"
            )),


            Questions( objective = Objective(
                "23",
                section3,
                "",
                "",
                "He was given the boot by the chairman. This mean that he was",
                "A. offered a pair of boots",
                "B. promoted",
                "C. sacked",
                "D. sent to buy boots",
                "C. sacked",  "C"
            )),


            Questions( objective = Objective(
                "24",
                section3,
                "",
                "",
                "Since he left home, he has been trying to find his feet. This means that he",
                "A. has been suffering a lot",
                "B. lost his pair of shoes",
                "C. has forgotten about his relatives",
                "D. has been trying to get used to his new situation",
                "D. has been trying to get used to his new situation", "D"
            )),


            Questions( objective = Objective(
                "25",
                section3,
                "",
                "",
                "He finds it difficult to put out with her attitude. This means that he finds it difficult to",
                "A. tolerate her behaviour",
                "B. understand her behaviour",
                "C. determine her behaviour",
                "D. consider her behaviour",
                "A. tolerate her behaviour", "A"
            )),



            Questions( objective = Objective(
                "26",
                section3,
                "",
                "",
                "The government troop extended the olive branch to the rebels. This means that the government troops",
                "A. has reached a critical stage",
                "B. killed a lot of rebels",
                "C. were ready for peace",
                "D. defended their territory bravely",
                "C. were ready for peace", "C"
            )),


            Questions( objective = Objective(
                "27",
                section3,
                "",
                "",
                "At the last minute, he had cold feet. This means that he",
                "A. suddenly fell ill",
                "B. became nervous",
                "C. lost his imagination",
                "D. reject the offer",
                "B. became nervous", "B"
            )),


            Questions( objective = Objective(
                "28",
                section3,
                "",
                "",
                "He was advised to pull himself together. This means that he was advised to",
                "A. keep his plans secret",
                "B. change his mind",
                "C. control himself",
                "D. keep the matter to himself",
                "C. control himself", "C"
            )),



            Questions( objective = Objective(
                "29",
                section3,
                "",
                "",
                "He was sad to learn that his friend had gone around the bend. This means that his friend has",
                "A. gone oversees",
                "B. gone mad",
                "C. lost his job",
                "D. been very ill",
                "B. gone mad", "B"
            )),


            Questions( objective = Objective(
                "30",
                section3,
                "",
                "",
                "The young man quickly paid his debt to save his face. This means that the young man",
                "A. wanted to avoid disgrace",
                "B. did not want to be slapped",
                "C. wanted to preserve his looks",
                "D. did not want to be a debtor",
                "A. wanted to avoid disgrace", "A"
            )),


            Questions( objective = Objective(
                "31",
                section4,
                "",
                "",
                "Modou is ",
                "A. enlightened",
                "B. provided",
                "C. gifted",
                "D. inspired",
                "C. gifted",
                "C",
                "endowed ",
                "with a great potential")),


            Questions( objective = Objective(
                "32",
                section4,
                "",
                "",
                "Collaboration is ",
                "A. desired",
                "B. indispensable",
                "C. effective",
                "D. appropriate",
                "B. indispensable",
                "B",
                "essential ",
                "to success of the team")),




            Questions( objective = Objective(
                "33",
                section4,
                "",
                "",
                "I really wish to assure you that we now have a ",
                "A. Dependable",
                "B. realistic",
                "C. sensible",
                "D. resolute",
                "A. Dependable",
                "A",
                "reliable ",
                "leader.")),


            Questions( objective = Objective(
                "34",
                section4,
                "",
                "",
                "This is a ",
                "A. an advantage",
                "B. a privilege",
                "C. an opportuinity",
                "D. a possibility",
                "C. an opportuinity",
                "C",
                "chance ",
                "of a life time")),




            Questions( objective = Objective(
                "35",
                section4,
                "",
                "",
                "Children often behave badly out of ",
                "A. illiteracy",
                "B. inexperienced",
                "C. unfamiliarity",
                "D. simplicity",
                "B. inexperienced",
                "B",
                "ignorance",
                "")),


            Questions( objective = Objective(
                "36",
                section4,
                "",
                "",
                "She lived a ",
                "A. modest",
                "B. brave",
                "C. normal",
                "D. righteous",
                "D. righteous",
                "D",
                "virtuous ",
                "life")),



            Questions( objective = Objective(
                "37",
                section4,
                "",
                "",
                "Olu insisted on his ",
                "A. wish",
                "B. independence",
                "C. ability",
                "D. right",
                "B. independence",
                "B",
                "freedom ",
                "to choose his career.")),


            Questions( objective = Objective(
                "38",
                section4,
                "",
                "",
                "",
                "A. impeding",
                "B. retarding",
                "C. stopping",
                "D. Delaying",
                "A. impeding",
                "A",
                "Hindering ",
                "justice may earn you a fine")),



            Questions( objective = Objective(
                "39",
                section4,
                "",
                "",
                "The professor's explanation of the point was very",
                "A. long",
                "B. clear",
                "C. prompt",
                "D. complicated",
                "B. clear",
                "B",
                "lucid",
                "")),

        Questions( objective = Objective(
                    "40",
                    section4,
                    "",
                    "",
                    "The ",
                    "A. bright",
                    "B. colourful",
                    "C. glaring",
                    "D. beautiful",
                    "A. bright",
            "A",
                    "luminous ",
                    "hands of the clock attracted the baby")),



                Questions( objective = Objective(
                    "41",
                    section5,
                    "",
                    "",
                    "That utterance is quit unlike you, please,come……....it",
                    "A. through",
                    "B. of",
                    "C. off",
                    "D. against",
                    "C. off", "C"
                )),


                Questions( objective = Objective(
                    "42",
                    section5,
                    "",
                    "",
                    "If i……….enough money, i would buy a car.",
                    "A. had",
                    "B. have had",
                    "C. had had",
                    "D. have",
                    "B. have had", "B"
                )),


                Questions( objective = Objective(
                    "43",
                    section5,
                    "",
                    "",
                    "He should take………....the appointment next week.",
                    "A. in",
                    "B. up",
                    "C. on",
                    "D. to",
                    "B. up", "B"
                )),



                Questions( objective = Objective(
                    "44",
                    section5,
                    "",
                    "",
                    "In trying to escape, the thief ran………...the police.",
                    "A. upon",
                    "B. by",
                    "C. into",
                    "D. through",
                    "C. into", "C"
                )),


                Questions( objective = Objective(
                    "45",
                    section5,
                    "",
                    "",
                    "I have always counted………....his friendship.",
                    "A. in",
                    "B. to",
                    "C. with",
                    "D. on",
                    "D. on", "D"
                )),


                Questions( objective = Objective(
                    "46",
                    section5,
                    "",
                    "",
                    "The caller was told to…………...the line",
                    "A. hold off",
                    "B. hold up",
                    "C. hold on",
                    "D. hold",
                    "D. hold", "D"
                )),



                Questions( objective = Objective(
                    "47",
                    section5,
                    "",
                    "",
                    "The coach………....him to have scored a goal",
                    "A. was expecting",
                    "B. expected",
                    "C. had expected",
                    "D. has expected",
                    "B. expected", "B"
                )),



                Questions( objective = Objective(
                    "48",
                    section5,
                    "",
                    "",
                    "After eating all the mangoes, he shouldn't complain of stomach, ............",
                    "A. isn't it",
                    "B. would he",
                    "C. should he",
                    "D. should it",
                    "C. should he", "C"
                )),


                Questions( objective = Objective(
                    "49",
                    section5,
                    "",
                    "",
                    "Mary did her best ............ failed to reach the pass mark",
                    "A. but",
                    "B. however",
                    "C. so",
                    "D. and",
                    "A. but", "A"
                )),



                Questions( objective = Objective(
                    "50",
                    section5,
                    "",
                    "",
                    "The authorities have shown no sign of giving .............. to their demands.",
                    "A. off",
                    "B. away",
                    "C. over",
                    "D. in",
                    "D. in", "D"
                )),

                Questions( objective = Objective(
                    "51",
                    section5,
                    "",
                    "",
                    "We must hurry now for there is not ........... time left",
                    "A. some",
                    "B. much",
                    "C. plenty",
                    "D. any",
                    "B. much", "B"
                )),


                Questions( objective = Objective(
                    "52",
                    section5,
                    "",
                    "",
                    "Those properties are ........... sale",
                    "A. up for",
                    "B. up on",
                    "C. out for",
                    "D. down for",
                    "A. up for", "A"
                )),

                Questions( objective = Objective(
                    "53",
                    section5,
                    "",
                    "",
                    "I have always preferred unripe plantain ......... yam",
                    "A. to",
                    "B. than",
                    "C. from",
                    "D. for",
                    "A. to", "A"
                )),



                Questions( objective = Objective(
                    "54",
                    section5,
                    "",
                    "",
                    "Give it to Aminata, it is...............",
                    "A. her",
                    "B. their",
                    "C. yours",
                    "D. hers",
                    "D. hers", "D"
                )),

                Questions( objective = Objective(
                    "55",
                    section5,
                    "",
                    "",
                    "Please, don't speak evil ........... the dead",
                    "A. to",
                    "B. of",
                    "C. on",
                    "D. for",
                    "B. of", "B"
                )),


                Questions( objective = Objective(
                    "56",
                    section5,
                    "",
                    "",
                    "My brother was about……...his house when i arrived",
                "A. to leaving",
                "B. to have left",
                "C. to leave",
                "D. to be leaving",
                "C. to leave", "C"
            )),


            Questions( objective = Objective(
                "57",
                section5,
                "",
                "",
                "Neither Jack nor Jill ............. there yesterday",
                "A. are",
                "B. were",
                "C. is",
                "D. was",
                "D. was", "D"
            )),


            Questions( objective = Objective(
                "58",
                section5,
                "",
                "",
                "I have ........... completed the task.",
                "A. more and less",
                "B. more or less",
                "C. more than less",
                "D. more but less",
                "B. more or less", "B"
            )),


            Questions( objective = Objective(
                "59",
                section5,
                "",
                "",
                "After two hours of continuous work, the group broke ...........lunch.",
                "A. with",
                "B. from",
                "C. for",
                "D. to",
                "C. for", "C"
            )),


            Questions( objective = Objective(
                "60",
                section5,
                "",
                "",
                "He finally hit .............. the idea of travelling abroad",
                "A. out",
                "B. at",
                "C. on",
                "D. up",
                "C. on", "C"
            )),



            Questions( objective = Objective(
                "61",
                section5,
                "",
                "",
                "The standard of education has gone .............",
                "A. out",
                "B. at",
                "C. on",
                "D. up",
                "B. at", "B",
            )),


            Questions( objective = Objective(
                "62",
                section5,
                "",
                "",
                "The council appointed a ............ committee to look into the matter.",
                "A. five-men",
                "B. five-men's",
                "C. five man",
                "D. five-man's",
                "C. five man", "C"
            )),



            Questions( objective = Objective(
                "63",
                section5,
                "",
                "",
                "After the quarrel. he made it .............. to his friend.",
                "A. in",
                "B. out",
                "C. on",
                "D. up",
                "D. up", "D"
            )),


            Questions( objective = Objective(
                "64",
                section5,
                "",
                "",
                "The task is  ............. for us to undertake.",
                "A. much too difficult",
                "B. too much difficult",
                "C. more too difficult",
                "D. quit to difficult",
                "A. much too difficult", "A"
            )),


            Questions( objective = Objective(
                "65",
                section5,
                "",
                "",
                "I will always stand ............ him",
                "A. by",
                "B. with",
                "C. to",
                "D. for",
                "A. by", "A"
            )),

            Questions( objective = Objective(
                "66",
                section5,
                "",
                "",
                "We arrived just ...........time for the grand opening.",
                "A. by",
                "B. about",
                "C. before",
                "D. in",
                "D. in", "D"
            )),


            Questions( objective = Objective(
                "67",
                section5,
                "",
                "",
                "Bakary can lift this heavy log .........?",
                "A. isn't it",
                "B. can't he",
                "C. does he",
                "D. doesn't he",
                "B. can't he", "B"
            )),


            Questions( objective = Objective(
                "68",
                section5,
                "",
                "",
                "The president's speech ............yesterday at 8.00 p.m.",
                "A. is broadcast",
                "B. is being broadcast",
                "C. has been broadcast",
                "D. was broadcast",
                "C. has been broadcast", "C"
            )),


            Questions( objective = Objective(
                "69",
                section5,
                "",
                "",
                "It is such a bad place ............. i will never dream of going there again",
                "A. thus",
                "B. therefore",
                "C. that",
                "D. then",
                "C. that", "C"
            )),

            Questions( objective = Objective(
                "70",
                section5,
                "",
                "",
                "We will leave……….. you are ready",
                "A. as when",
                "B. whenever",
                "C. as ever",
                "D. soon as",
                "B. whenever", "B"
            )),



            Questions( objective = Objective(
                "71",
                section6,
                "",
                "",
                passageA2015,
                "A. jump suit",
                "B. tracksuit",
                "C. swimsuit",
                "D. shell suit",
                "B. tracksuit", "B"
            )),



            Questions( objective = Objective(
                "72",
                section6,
                "",
                "",
                passageA2015,
                "A. trot cord",
                "B. skip",
                "C. jog",
                "D. jump",
                "C. jog", "C"
            )),



            Questions( objective = Objective(
                "73",
                section6,
                "",
                "",
                passageA2015,
                "A. cord",
                "B. rope",
                "C. string",
                "D. twine",
                "B. rope", "B"
            )),


            Questions( objective = Objective(
                "74",
                section6,
                "",
                "",
                passageA2015,
                "A. practice",
                "B. sessions",
                "C. regime",
                "D. rehearsal",
                "B. sessions", "B"
            )),


            Questions( objective = Objective(
                "75",
                section6,
                "",
                "",
                passageA2015,
                "A. stadium ",
                "B. sports club",
                "C. sports centre",
                "D. gymnasium",
                "D. gymnasium", "D"
            )),


            Questions( objective = Objective(
                "76",
                section6,
                "",
                "",
                passageA2015,
                "A. supervision",
                "B. custody",
                "C. command",
                "D. charge",
                "A. supervision", "A"
            )),

            Questions( objective = Objective(
                "77",
                section6,
                "",
                "",
                passageA2015,
                "A. calculating",
                "B. gauging",
                "C. timing ",
                "D. assessing",
                "C. timing ", "C"
            )),


            Questions( objective = Objective(
                "78",
                section6,
                "",
                "",
                passageA2015,
                "A. techniques",
                "B. systems",
                "C. method",
                "D. procedures",
                "A. techniques", "A"
            )),


            Questions( objective = Objective(
                "79",
                section6,
                "",
                "",
                passageA2015,
                "A. achieved",
                "B. secured",
                "C. won",
                "D. lifted",
                "C. won", "C"
            )),


            Questions( objective = Objective(
                "80",
                section6,
                "",
                "",
                passageA2015,
                "A. struggles",
                "B. pains",
                "C. hurts",
                "D. rigours",
                "D. rigours", "D"
            )),



        )
}