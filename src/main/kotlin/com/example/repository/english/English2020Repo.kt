package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2020Repo {

    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    val passageA2020 = "Hardly a day passes without news of terrible accidents on our roads. Most of the time, these are caused by the ignorance and -71- of drivers. Besides the ignorance of the drivers, most of the vehicles that ply our roads are not -72- vehicles are supposed to be tested annually before certificates are issued. However, vehicle Owners are issued with these certificates even when their vehicles have not been properly -73-. Most of the drivers do not have valid driver's -74 - There are driving schools with qualified -75- to prepare prospective drivers. After a period of training, the prospective drivers are made to go through a road test. It is only when they pass this test that they are -76- to drive. Some drivers never even had a learner's -77- when they were learning to drive. Consequently, they have no knowledge of -78- rules. They are ignorant of what speed -79- means. To them, 100 kilometres per hour may mean minimum speed allowed. Little wonder the -80- on our roads."

    val english2020 = listOf<Questions>(
        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "A guest should not make ",
            "A. candid",
            "B. appealing",
            "C. polite",
            "D. complimentary",
            "A guest should not make ", "A",
            "derogatory ",
            "remarks about what he is offered by his host but __________ statements.")),


        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "The audience ",
            "A. booed",
            "B. rejected",
            "C. abused",
            "D. scorned",
            "A. booed", "A",
            "applauded ",
            "the last speaker, but the first was")),



        Questions( objective = Objective(
            "3",
            section1,
            "",
            "",
            "The commander said that ",
            "A. skilled",
            "B. practical",
            "C. learned",
            "D. seasoned",
            "A. skilled", "A",
            "raw ",
            "recruits could not dislodge the enemies: he needed ______ men.")),


                Questions( objective = Objective(
            "4",
            section1,
            "",
            "",
            "John gave a ",
            "A. probable",
            "B. compelling",
            "C. factual",
            "D. necessary",
            "C. factual",
            "fictitious ",
            "account of the incident but his son's account was_______")),




        Questions( objective = Objective(
            "5",
            section1,
            "",
            "",
            "While the refuse dump smelled  ",
            "A. fragrant",
            "B. spicy",
            "C. clean",
            "D. dry",
            "A. fragrant", "A",
            "fetid, ",
            "the orchard exuded a _______Smell.")),



        Questions( objective = Objective(
            "6",
            section1,
            "",
            "",
            "Only some of the accused were ",
            "A. remanded",
            "B. convicted",
            "C. detained",
            "D. interdicted",
            "B. convicted", "B",
            "acquitted: ",
            "the rest were ________")),


        Questions( objective = Objective(
            "7",
            section1,
            "",
            "",
            "The principal chastised Ben for his use of",
            "A. pure",
            "B. neat",
            "C. refined",
            "D. organised",
            "C. refined", "C",
            "coarse ",
            "language and advised him to emulate his sister's ________ behaviour.")),


        Questions( objective = Objective(
            "8",
            section1,
            "",
            "",
            "It would have been my pleasure to ",
            "A. jettison",
            "B. defer",
            "C. suspend",
            "D. decline",
            "D. decline", "D",
            "accept ",
            "your invitation but I have to ________ it because of a previous engagement.")),


        Questions( objective = Objective(
            "9",
            section1,
            "",
            "",
            "Older people are expected to be ________ where youths are ",
            "A. experienced",
            "B. cautious",
            "C. equipped",
            "D. considerate",
            "A. experienced", "A",
            "green.")),


        Questions( objective = Objective(
            "10",
            section1,
            "",
            "",
            "I",
            "A. thoughtfully",
            "B. intuitively",
            "C. deliberately",
            "D. annoyingly",
            "C. deliberately", "C",
            "accidentally ",
            "stepped on my brother but he told Mummy")),




        Questions( objective = Objective(
            "11",
            section2,
            "",
            "",
            "The runner was _________ at fifteen seconds at the end of the race.",
            "A. taped",
            "B. timed",
            "C. belled",
            "D. flagged",
            "B. timed", "B"
        )),


        Questions( objective = Objective(
            "12",
            section2,
            "",
            "",
            "The appellate court has ________ the decision of the lower court.",
            "A. obstructed",
            "B. nullified",
            "C. neutralized",
            "D. balanced",
            "B. nullified", "B"
        )),


        Questions( objective = Objective(
            "13",
            section2,
            "",
            "",
            "The defeated boxer left the ring looking extremely _________",
            "A. dislocated",
            "B. distorted",
            "C. desert",
            "D. dejected",
            "D. dejected", "D"
        )),


        Questions( objective = Objective(
            "14",
            section2,
            "",
            "",
            "There is an election _________ pending against the senator.",
            "A. application",
            "B. appeal",
            "C. petition",
            "D. complaint",
            "C. petition", "C"
        )),

        Questions( objective = Objective(
            "15",
            section2,
            "",
            "",
            "The manager was not in when Addo called, so he left his ________  card.",
            "A. supplementary",
            "B. complimentary",
            "C. complementary",
            "D. identification",
            "B. complimentary", "B"
        )),

        Questions( objective = Objective(
            "16",
            section2,
            "",
            "",
            "Coming from the kitchen was the sweet ________ of Mummy's soup.",
            "A. aroma",
            "B. odour",
            "C. fragrance",
            "D. scent",
            "A. aroma", "A"
        )),



        Questions( objective = Objective(
            "17",
            section2,
            "",
            "",
            "There is a need to raise teachers' salary in order to boost their _______",
            "A. spirit",
            "B. moral",
            "C. soul",
            "D. morale",
            "B. moral", "B"
        )),


        Questions( objective = Objective(
            "18",
            section2,
            "",
            "",
            "The librarian has not entered the new books in the __________",
            "A. catalogue",
            "B. roster",
            "C. list",
            "D. directory",
            "A. catalogue", "A"
        )),


        Questions( objective = Objective(
            "19",
            section2,
            "",
            "",
            "The textbook is very costly; I cannot _________ it to my students. ",
            "A. commit",
            "B. afford",
            "C. endorse",
            "D. recommend",
            "D. recommend", "D"
        )),


        Questions( objective = Objective(
            "20",
            section2,
            "",
            "",
            "The weather is too hot; I need some water to ________ my thirst.",
            "A. wet",
            "B. quench",
            "C. cool",
            "D. soak",
            "B. quench", "B"
        )),




        Questions( objective = Objective(
            "21",
            section3,
            "",
            "",
            "My grandmother once told me that old habits die hard. This means that old habits are",
            "A. easily corrected",
            "B. difficult to change",
            "C. short-lived",
            "D. forever changing",
            "B. difficult to change", "B"
        )),


        Questions( objective = Objective(
            "22",
            section3,
            "",
            "",
            "If you ask him to sing, he will do it at the drop of a hat. This means that he will sing",
            "A. joyfully",
            "B. melodiously",
            "C. immediately",
            "D. sluggishly",
            "C. immediately", "C"
        )),


        Questions( objective = Objective(
            "23",
            section3,
            "",
            "",
            "The man has lost a lot and he only keeps up appearances by driving a big car. This means that the man",
            "A. intends to work harder",
            "B. pretends that all is well",
            "C. wants everybody to see him",
            "D. wants to please his people",
            "B. pretends that all is well", "B"
        )),



        Questions( objective = Objective(
            "24",
            section3,
            "",
            "",
            "The game was tough but our team lost by a whisker. This means that our team lost by",
            "A. default",
            "B. a wide margin",
            "C. not preparing well",
            "D. a narrow margin",
            "D. a narrow margin", "D"
        )),


        Questions( objective = Objective(
            "25",
            section3,
            "",
            "",
            "When the result was announced, it was discovered that Bimbo and Pam were neck and neck. This means that Bimbo and Pam",
            "A. had almost the same result",
            "B. failed badly",
            "C. had equal result",
            "D. passed well",
            "C. had equal result", "C"
        )),



        Questions( objective = Objective(
            "26",
            section3,
            "",
            "",
            "The old woman 's birthday was marked by her children with pomp. This means that the birthday was",
            "A. greatly celebrated",
            "B. remembered fondly",
            "C. widely advertise",
            "D. filmed and played back",
            "A. greatly celebrated", "A"
        )),

        Questions( objective = Objective(
            "27",
            section3,
            "",
            "",
            "When the man was accused of stealing the money, nobody raised an eyebrow. This means that nobody was",
            "A. sad",
            "B. pleased",
            "C. interested",
            "D. surprised",
            "D. surprised", "D"
        )),


        Questions( objective = Objective(
            "28",
            section3,
            "",
            "",
            "People do not often rely on men who allow their exalted position to go to their head. This means that people shun those who",
            "A. are highly placed",
            "B. are conceited because of their position",
            "C. are rude because of their position",
            "D. do not do their work",
            "B. are conceited because of their position", "B"
        )),


        Questions( objective = Objective(
            "29",
            section3,
            "",
            "",
            "The manager hit the roof when he was presented with the estimate for the new project. This means that the manager",
            "A. mobilised the workers",
            "B. became very angry",
            "C. became very suspicious",
            "D. cancelled the project",
            "B. became very angry", "B"
        )),

        Questions( objective = Objective(
            "30",
            section3,
            "",
            "",
            "When he received the news that he had lost the election, he did not bat an eyelid. " +
                    "This means that he",
            "A. expected to lose the election",
            "B. stood perfectly still",
            "C. was shocked to have lost the election",
            "D. showed no feelings",
            "D. showed no feelings", "D"
        )),


        Questions( objective = Objective(
            "31",
            section4,
            "",
            "",
            "The boy was ",
            "A. adamant",
            "B. slow",
            "C. sluggish",
            "D. unwilling",
            "D. unwilling", "D",
            "reluctant ",
            "to carry out the order of his senior")),


        Questions( objective = Objective(
            "32",
            section4,
            "",
            "",
            "Dr. Azeez ",
            "A. rescinded",
            "B. shunned",
            "C. refused",
            "D. avoided",
            "C. refused", "C",
            "declined ",
            "the offer to chair the meeting.")),


        Questions( objective = Objective(
            "33",
            section4,
            "",
            "",
            "The match came to an ",
            "A. sharp",
            "B. brisk",
            "C. quick",
            "D. sudden",
            "D. sudden", "D",
            "abrupt ",
            "end when the rain started.")),


        Questions( objective = Objective(
            "34",
            section4,
            "",
            "",
            "The boy came through the window as ",
            "A. quietly",
            "B. carefully",
            "C. quickly",
            "D. slowly",
            "A. quietly", "A",
            "stealthily ",
            "as he could.")),


        Questions( objective = Objective(
            "35",
            section4,
            "",
            "",
            "Bimbo was ",
            "A. positive",
            "B. surprised",
            "C. contented",
            "D. appeased",
            "C. contented", "C",
            "satisfied ",
            "with the result she got.")),


        Questions( objective = Objective(
            "36",
            section4,
            "",
            "",
            "It is ",
            "A. strange",
            "B. abnormal",
            "C. alarming",
            "D. interesting",
            "B. abnormal", "B",
            "absurd ",
            "that people find it difficult to be honest")),

        Questions( objective = Objective(
            "37",
            section4,
            "",
            "",
            "Even a ",
            "A. dull",
            "B. fresh",
            "C. average",
            "D. lazy",
            "C. average", "C",
            "mediocre ",
            "student can pass that test.")),


        Questions( objective = Objective(
            "38",
            section4,
            "",
            "",
            "We called the carpenter to ",
            "A. restore",
            "B. renovate",
            "C. replace",
            "D. mend",
            "D. mend", "D",
            "repair ",
            "the broken door.")),


        Questions( objective = Objective(
            "39",
            section4,
            "",
            "",
            "Mrs. Okpala gave the drunk a ",
            "A. happy",
            "B. sorrowful",
            "C. knowing",
            "D. scornful",
            "D. scornful", "D",
            "contemptuous ",
            "look.")),


        Questions( objective = Objective(
            "40",
            section4,
            "",
            "",
            "The Vice-Chancellor's speech at the occasion was ",
            "A. misrepresented",
            "B. misquoted",
            "C. misunderstood",
            "D. misreported",
            "C. misunderstood", "C",
            "misconstrued.")),


        Questions( objective = Objective(
            "41",
            section5,
            "",
            "",
            "The soldiers lay _______ the town to arrest the terrorists.",
            "A. siege on",
            "B. siege to",
            "C. siege with",
            "D. siege by",
            "B. siege to", "B",
        )),

        Questions( objective = Objective(
            "42",
            section5,
            "",
            "",
            "Power has not been restored _________ many parts of the town.",
            "A. to",
            "B. in",
            "C. of",
            "D. with",
            "A. to", "A",
        )),


        Questions( objective = Objective(
            "43",
            section5,
            "",
            "",
            "We got to the hall after the płay ________ started.",
            "A. is",
            "B. have",
            "C. had",
            "D. was",
            "C. had", "C",
        )),

        Questions( objective = Objective(
            "44",
            section5,
            "",
            "",
            "The woman said the maid should ________ all the plates before going to bed.",
            "A. wash out",
            "B. wash up",
            "C. wash off",
            "D. wash away",
            "B. wash up", "B"
        )),


        Questions( objective = Objective(
            "45",
            section5,
            "",
            "",
            "John, would you mind lifting the box? _______",
            "A. yes, i do",
            "B. No, i wouldn't",
            "C. Yes, i wouldn't",
            "D. No, i don't",
            "D. No, i don't", "D"
        )),




        Questions( objective = Objective(
            "46",
            section5,
            "",
            "",
            "It was a long poem, but Rasheed learnt it ________",
            "A. from memory",
            "B. to memory",
            "C. by heart",
            "D. to heart",
            "C. by heart", "C"
        )),

        Questions( objective = Objective(
            "47",
            section5,
            "",
            "",
            "Let's begin all over again,_________",
            "A. may we",
            "B. shall we",
            "C. can we",
            "D. must we",
            "B. shall we", "B"
        )),


        Questions( objective = Objective(
            "48",
            section5,
            "",
            "",
            "Something must be wrong with the school driver, he is _________ today.",
            "A. rather driving carelessly",
            "B. carelessly driving rather",
            "C. driving rather carelessly",
            "D. rather carelessly driving",
            "C. driving rather carelessly", "C"
        )),


        Questions( objective = Objective(
            "49",
            section5,
            "",
            "",
            "What I admire about our football team is that they love ________",
            "A. themselves",
            "B. one another",
            "C. the other",
            "D. ourselves",
            "A. themselves", "A"
        )),

        Questions( objective = Objective(
            "50",
            section5,
            "",
            "",
            "This is the teacher _______ told me the answer.",
            "A. whom i said",
            "B. who i said",
            "C. who i said he",
            "D. i said that he",
            "B. who i said", "B"
        )),


        Questions( objective = Objective(
            "51",
            section5,
            "",
            "",
            "Mary shouldn't have disobeyed the teacher,_________?",
            "A. should she",
            "B. didn't she",
            "C. did she",
            "D. could he",
            "A. should she", "A"
        )),


        Questions( objective = Objective(
            "52",
            section5,
            "",
            "",
            "She wondered if the water vas not _________ hot for drinking.",
            "A. very",
            "B. so",
            "C. much",
            "D. too",
            "D. too", "D"
        )),


        Questions( objective = Objective(
            "53",
            section5,
            "",
            "",
            "I told him not to play _______ fire.",
            "A. on",
            "B. with",
            "C. beneath",
            "D. upon",
            "B. with", "B"
        )),




        Questions( objective = Objective(
            "54",
            section5,
            "",
            "",
            "We enjoyed ourselves ________ much at the party.",
            "A. too",
            "B. that",
            "C. as",
            "D. very",
            "D. very", "D"
        )),


        Questions( objective = Objective(
            "55",
            section5,
            "",
            "",
            "You will need to commit the formula ________ memory.",
            "A. to",
            "B. in",
            "C. for",
            "D. by",
            "A. to", "A"
        )),

        Questions( objective = Objective(
            "56",
            section5,
            "",
            "",
            "The ushers told the people to _________ their shoes before they enter the hall.",
            "A. put off",
            "B. put out",
            "C. take off",
            "D. take out",
            "C. take off", "C"
        )),

        Questions( objective = Objective(
            "57",
            section5,
            "",
            "",
            "That book is neither _________",
            "A. his or yours",
            "B. his not yours",
            "C. his nor yours",
            "D. his own nor yours",
            "C. his nor yours", "C"
        )),


        Questions( objective = Objective(
            "58",
            section5,
            "",
            "",
            "The boy vomited a lot on the journey, doctor told us he suffered from ________",
            "A. travel sickness",
            "B. travelling sickness",
            "C. travel sicknesses",
            "D. traveller sickness",
            "C. travel sicknesses", "C"
        )),


        Questions( objective = Objective(
            "59",
            section5,
            "",
            "",
            "The man gave the girl a _________ fountain pen.",
            "A. small new blue",
            "B. blue small new",
            "C. blue new small",
            "D. new small blue",
            "D. new small blue", "D"
        )),



        Questions( objective = Objective(
            "60",
            section5,
            "",
            "",
            "I realized that i ________ you before.",
            "A. had met",
            "B. met",
            "C. have met",
            "D. meet",
            "A. had met", "A"
        )),



        Questions( objective = Objective(
            "61",
            section5,
            "",
            "",
            "The boy had been warned not to _________ the money given to him.",
            "A. loosen",
            "B. loose",
            "C. lost",
            "D. lose",
            "D. lose", "D"
        )),


        Questions( objective = Objective(
            "62",
            section5,
            "",
            "",
            "The police officer was sacked because he gave _________ the command's secret.",
            "A. off",
            "B. in",
            "C. away",
            "D. up",
            "C. away", "C"
        )),


        Questions( objective = Objective(
            "63",
            section5,
            "",
            "",
            "He bought a new set of _________ television.",
            "A. coloured",
            "B. colour",
            "C. colours",
            "D. colouring",
            "B. colour", "B"
        )),



        Questions( objective = Objective(
            "64",
            section5,
            "",
            "",
            "The newspaper reported that ________ everybody died in the accident.",
            "A. hardly",
            "B. almost",
            "C. scarcely",
            "D. barely",
            "B. almost", "B"
        )),


        Questions( objective = Objective(
            "65",
            section5,
            "",
            "",
            "He isn't coming here,_________?",
            "A. is he",
            "B. isn't he",
            "C. doesn't he",
            "D. does he",
            "A. is he", "A"
        )),


        Questions( objective = Objective(
            "66",
            section5,
            "",
            "",
            "__________ are often quite caring.",
            "A. mother-in-law",
            "B. mother-in-laws",
            "C. mothers-in-laws",
            "D. mothers-in-law",
            "B. mother-in-laws", "B"
        )),


        Questions( objective = Objective(
            "67",
            section5,
            "",
            "",
            "A spoilt child is usually prone ________laziness.",
            "A. to",
            "B. for",
            "C. with",
            "D. at",
            "A. to", "A"
        )),


        Questions( objective = Objective(
            "68",
            section5,
            "",
            "",
            "We do not accept the punishment __________ the boy.",
            "A. meted to",
            "B. meted on",
            "C. meted out to",
            "D. meted in to",
            "C. meted out to", "C"
        )),



        Questions( objective = Objective(
            "69",
            section5,
            "",
            "",
            "The team practised intensely for weeks before the match ________ it lost.",
            "A. still yet",
            "B. for",
            "C. yet",
            "D. despite",
            "C. yet", "C"
        )),


        Questions( objective = Objective(
            "70",
            section5,
            "",
            "",
            "You cannot come between my sister and ________",
            "A. myself",
            "B. me",
            "C. I",
            "D. mine",
            "C. I", "C"
        )),

        Questions( objective = Objective(
            "71",
            section6,
            "",
            "",
            passageA2020,
            "A. forgetfulness",
            "B. carelessness",
            "C. wickedness",
            "D. doubtfulness",
            "B. carelessness", "B"
        )),

        Questions( objective = Objective(
            "72",
            section6,
            "",
            "",
            passageA2020,
            "A. road-friendly",
            "B. roadworthy",
            "C. streetwise",
            "D. road-tested",
            "B. roadworthy", "B"
        )),

        Questions( objective = Objective(
            "73",
            section6,
            "",
            "",
            passageA2020,
            "A. scrutinised",
            "B. appraised",
            "C. considered",
            "D. inspected",
            "D. inspected", "D"
        )),


        Questions( objective = Objective(
            "74",
            section6,
            "",
            "",
            passageA2020,
            "A. document",
            "B. papers",
            "C. licence",
            "D. particulars",
            "C. licence", "C"
        )),


        Questions( objective = Objective(
            "75",
            section6,
            "",
            "",
            passageA2020,
            "A. trainers",
            "B. instructors",
            "C. experts",
            "D. teachers",
            "B. instructors", "B"
        )),




        Questions( objective = Objective(
            "76",
            section6,
            "",
            "",
            passageA2020,
            "A. certified",
            "B. confirmed",
            "C. graded",
            "D. accredited",
            "A. certified", "A"
        )),


        Questions( objective = Objective(
            "77",
            section6,
            "",
            "",
            passageA2020,
            "A. permit",
            "B. clearance",
            "C. authority",
            "D. order",
            "A. permit", "A"
        )),



        Questions( objective = Objective(
            "78",
            section6,
            "",
            "",
            passageA2020,
            "A. expressway",
            "B. traffic",
            "C. highway",
            "D. road",
            "B. traffic", "B"
        )),


        Questions( objective = Objective(
            "79",
            section6,
            "",
            "",
            passageA2020,
            "A. distance",
            "B. control",
            "C. mileage",
            "D. limit",
            "D. limit", "D"
        )),


        Questions( objective = Objective(
            "80",
            section6,
            "",
            "",
            passageA2020,
            "A. murder",
            "B. scenes",
            "C. incidence",
            "D. carnage",
            "D. carnage", "D"
        )
        ),

        )
}