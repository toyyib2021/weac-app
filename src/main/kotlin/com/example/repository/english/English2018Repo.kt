package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2018Repo {
    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    val passageA2018 = "An entrepreneur is a person who organises and manages any business enterprise, or one who combines the other factors of ___71___ to start a business and make profit, He possesses considerable initiative and is willing to take ___72___. An entrepreneur can be a farme, a dressmaker, a factory owner, a wholesaler or a ___73___. More often than not, it is best for an entrepreneur to start a business from scratch rather than ___74___ in or buy an existing business. One advantage is that he would be independent and not become a ___75___ or get to inherit some bad debt. The ___76___ of a good entrepreneur must include hard work, innovation and creativity. He must be well-informed and confident to make worthwhile decisions. As it takes a great deal of energy, time and money to operate one's own business, entrepreneurs must seek to possess goo managerial ___77___ in order to manage their business successfully." +
            "But how useful is the entrepreneur to the society? He is an innovator who develops new ____78____ and services to make life easier and more comfortable. He plans, organises, directs and ___79___ his business activities effectively, thus minimizing wastage of limited ____80____ and enhancing productivity. Also, he creates employment and contributes to the generation of revenue for the government by paying taxes."



    val english2018 = listOf<Questions>(
        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "Binetou's ",
            "A. indifference",
            "B. noisiness",
            "C. calmness",
            "D. dullness",
            "A. indifference",
            "D",
            "inquisitiveness ",
            "is in sharp contrast with her sister's")
        ),

        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "Though at first it appeared an ",
            "A. outstanding",
            "B. successful",
            "C. remarkable",
            "D. interesting",
            "D. interesting",
            "D",
            "insignificant ",
            "idea, it turned out to be quite _________")),


        Questions( objective = Objective(
            "3",
            section1,
            "",
            "",
            "After grasping the  ",
            "A. advanced",
            "B. academic",
            "C. subsidiary",
            "D. secondary",
            "D. secondary",
            "D",
            "fundamental ",
            "aspects of his job, Kwesi had to cope with more ________ procedures.")),



        Questions( objective = Objective(
            "4",
            section1,
            "",
            "",
            "The youth prefer discussing ",
            "A. archaic",
            "B. uninteresting",
            "C. stale",
            "D. political",
            "A. archaic",
            "A",
            "contemporary ",
            "issues to ______ ones. ")),


        Questions( objective = Objective(
            "5",
            section1,
            "",
            "",
            "As  ",
            "A. wise",
            "B. correct",
            "C. precise",
            "D. faulty",
            "B. correct",
            "B",
            "erroneous ",
            "as it might sound, the Headmaster's assumption was quite _______")),

        Questions( objective = Objective(
            "6",
            section1,
            "",
            "",
            "Halima likes to dwell on ",
            "A. strong",
            "B. popular",
            "C. weighty",
            "D. heavy",
            "A. strong",
            "A",
            "trivial, ",
            "rather than _______ matters. ")),



        Questions( objective = Objective(
            "7",
            section1,
            "",
            "",
            "We all know that Bola is ",
            "A. cowardly",
            "B. respectful",
            "C. humble",
            "D. modest",
            "B. respectful",
            "B",
            "insolent ",
            "whereas Ade is ________ ")),


        Questions( objective = Objective(
            "8",
            section1,
            "",
            "",
            "A few days after Musa's _______, his sister longed for his ",
            "A. coming",
            "B. entrance",
            "C. arrival",
            "D. welcome",
            "C. arrival",
            "C",
            "departure. ")),


        Questions( objective = Objective(
            "9",
            section1,
            "",
            "",
            "Algebra seems ",
            "A. solved",
            "B. simple",
            "C. accessible",
            "D. achievable",
            "B. simple",
            "B",
            "complicated, ",
            "but with practice it becomes ________ ")),


        Questions( objective = Objective(
            "10",
            section1,
            "",
            "",
            "Mrs. Agide is ",
            "A. cheerful",
            "B. boastful",
            "C. loud",
            "D. rude",
            "B. boastful",
            "B",
            "unassuming ",
            "whereas her twin sister is ________")),



        Questions( objective = Objective(
            "11",
            section2,
            "",
            "",
            "At Christmas, employees of the Sugar Factory receive huge ________",
            "A. benefits",
            "B. dividends",
            "C. bonuses",
            "D. salaries",
            "B. dividends", "B"
        )),

        Questions( objective = Objective(
            "12",
            section2,
            "",
            "",
            "The exposed milk in the container has turned _______",
            "A. sour",
            "B. putrid",
            "C. mouldy",
            "D. stale",
            "C. mouldy", "C"
        )),

        Questions( objective = Objective(
            "13",
            section2,
            "",
            "",
            "Not all activists champion ________ causes. ",
            "A. worthy",
            "B. real",
            "C. concrete",
            "D. favourable",
            "A. worthy", "A"
        )),


        Questions( objective = Objective(
            "14",
            section2,
            "",
            "",
            "The Mayor gave a glowing ________ at the funeral of the city's only curator. ",
            "A. citation",
            "B. statement",
            "C. tribute",
            "D. commendation",
            "C. tribute", "C"
        )),

        Questions( objective = Objective(
            "15",
            section2,
            "",
            "",
            "At the end of the _______. the National Anthem is played on our radio station.",
            "A. programming",
            "B. production",
            "C. transition",
            "D. transmission",
            "C. transition", "C"
        )),


        Questions( objective = Objective(
            "16",
            section2,
            "",
            "",
            "The defence counsel was unable to convince the ______ of John's innocence.",
            "A. plaintiff",
            "B. witness",
            "C. panel",
            "D. jury",
            "D. jury", "D"
        )),


        Questions( objective = Objective(
            "17",
            section2,
            "",
            "",
            "Unfortunately, corruption is the _______ of most African countries. ",
            "A. venom",
            "B. bane",
            "C. disaster",
            "D. backbone",
            "B. bane", "B"
        )),


        Questions( objective = Objective(
            "18",
            section2,
            "",
            "",
            "The _______ results proved that the patient had hepatitis.",
            "A. investigation",
            "B. diagnosis",
            "C. probe",
            "D. test",
            "B. diagnosis", "B"
        )),

        Questions( objective = Objective(
            "19",
            section2,
            "",
            "",
            "The new book has beautiful _______ which make it attractive. ",
            "A. illustrations",
            "B. demonstrations",
            "C. illuminations",
            "D. compositions",
            "D. compositions", "D"
        )),



        Questions( objective = Objective(
            "20",
            section2,
            "",
            "",
            "Their marriage was finally _____ after years of hostility. ",
            "A. cancelled",
            "B. annulled",
            "C. broken",
            "D. separated",
            "C. broken", "C"
        )),

        Questions( objective = Objective(
            "21",
            section3,
            "",
            "",
            "Can you imagine Oka behaving as if he has all the knowledge in the world? This means that Oka. ",
            "A. does not really know anything",
            "B. knows so much more than we think",
            "C. is admired by everybody",
            "D. respects other people",
            "A. does not really know anything", "A"
        )),


        Questions( objective = Objective(
            "22",
            section3,
            "",
            "",
            "Akin is too full of himself. This means that Akin",
            "A. Talks too much",
            "B. eats too much",
            "C. is too proud",
            "D. is quite annoying",
            "C. is too proud", "C"
        )),


        Questions( objective = Objective(
            "23",
            section3,
            "",
            "",
            "She slogged her guts out for the examinations. This means that she",
            "A. failed the examination despite working hard for it",
            "B. passed the examination despite not working hard for it",
            "C. used unfair means to face the examination",
            "D. really worked very hard for the examination",
            "D. really worked very hard for the examination", "D"
        )),


        Questions( objective = Objective(
            "24",
            section3,
            "",
            "",
            "I admire Modou: very few people can stomach all of Adaeze's insults. This means that Modou ",
            "A. tolerated Adaeze's insults",
            "B. was a weakling",
            "C. had no answer to Adaeze's insults",
            "D. did the right thing by remaining silent",
            "D. did the right thing by remaining silent", "D"
        )),


        Questions( objective = Objective(
            "25",
            section3,
            "",
            "",
            "After months of battling with stroke, he is now a shadow of his former self. This means that he",
            "A. is now frail",
            "B. is vulnerable",
            "C. is hopeless",
            "D. has almost recovered",
            "A. is now frail", "A"
        )),


        Questions( objective = Objective(
            "26",
            section3,
            "",
            "",
            "Kura, you can't be too careful when dealing with Wang. This means that Kura.",
            "A. has no reason to be suspicious of Wang",
            "B. can fully rely on Wang",
            "C. has to be very careful in his relationship with Wang",
            "D. may feel free in the company of Wang",
            "A. has no reason to be suspicious of Wang", "A"
        )),



        Questions( objective = Objective(
            "27",
            section3,
            "",
            "",
            "Don't tell me another cock and bull story. This means that the speaker does not want to. ",
            "A. be further baffled",
            "B. hear the same old story",
            "C. hear another drab story",
            "D. be further deceived",
            "B. hear the same old story", "B"
        )),


        Questions( objective = Objective(
            "28",
            section3,
            "",
            "",
            "Had he confessed much earlier, she would have trusted him. This means that he",
            "A. had confessed earlier on, but he wasn't trusted",
            "B. had confessed much earlier on and he was trusted",
            "C. hadn't confessed much earlier on and he was trusted",
            "D. hadn't confessed earlier on, and wasn't trusted",
            "D. hadn't confessed earlier on, and wasn't trusted", "D"
        )),

        Questions( objective = Objective(
            "29",
            section3,
            "",
            "",
            "Kola: You really worked hard to win the case. " +
                    "Didia: You don't know the half of it. This means that. ",
            "A. it wasn't as difficult as Kola had thought",
            "B. Kola's statement wasn't actually correct",
            "C. it was even more difficult than Kola could imagine",
            "D. Winning the case didn't mean much to Kola",
            "C. it was even more difficult than Kola could imagine", "C"
        )),




        Questions( objective = Objective(
            "30",
            section3,
            "",
            "",
            "Femi is too clever by half. This means that Femi ",
            "A. displays his cleverness in an annoying way",
            "B. is not as clever as he thinks",
            "C. pleases everyone he meets",
            "D. hides how clever he really is",
            "B. is not as clever as he thinks", "B"
        )),


        Questions( objective = Objective(
            "31",
            section4,
            "",
            "",
            "He was such a ",
            "A. an inspired",
            "B. an intelligent",
            "C. a dazzling",
            "D. skillful",
            "D. skillful",
            "D",
            "brilliant ",
            "footballer!")),


        Questions( objective = Objective(
            "32",
            section4,
            "",
            "",
            "The Politician is a ",
            "A. an eloquent",
            "B. a superficial",
            "C. an insightful",
            "D. a persuasive",
            "A. an eloquent",
            "A",
            "fluent ",
            "speaker. ")),


        Questions( objective = Objective(
            "33",
            section4,
            "",
            "",
            "Everyone has the ",
            "A. compulsion",
            "B. desire",
            "C. need",
            "D. courage",
            "B. desire",
            "B",
            "urge ",
            "to succeed in life. ",)),



            Questions( objective = Objective(
                "34",
                section4,
                "",
                "",
                "When he heard the gunshot, he ran into a",
                "A. tight",
                "B. deep",
                "C. dense",
                "D. close",
                "C. dense",
                "C",
                "thick ",
                "forest. ")),

            Questions( objective = Objective(
                "35",
                section4,
                "",
                "",
                "That was a ",
                "A. suitable",
                "B. accurate",
                "C. prompt",
                "D. major",
                "C. prompt",
                "C",
                "timely ",
                "intervention.")),


            Questions( objective = Objective(
                "36",
                section4,
                "",
                "",
                "David is not only hardworking but also ",
                "A. painstaking",
                "B. ambitious",
                "C. pleasant",
                "D. daring",
                "D",
                "A. painstaking",
                "scrupulous. ")),



            Questions( objective = Objective(
                "37",
                section4,
                "",
                "",
                "We really have to be careful because the situation is rather ",
                "A. deceitful",
                "B. trivial",
                "C. unexpected",
                "D. difficult",
                "A. deceitful",
                "A",
                "tricky.")),


        Questions( objective = Objective(
                    "38",
                    section4,
                    "",
                    "",
                    "I think that his essay is ",
                    "A. erroneous",
                    "B. correct",
                    "C. satisfactory",
                    "D. faultless",
                    "C. satisfactory",
            "C",
                    "impeccable.")),



        Questions( objective = Objective(
                    "39",
                    section4,
                    "",
                    "",
                    "There has been a ",
                    "A. significant",
                    "B. real",
                    "C. full",
                    "D. complete",
                    "A. significant",
            "A",
                    "marked ",
                    "change in her study habit.")),


                Questions( objective = Objective(
                    "40",
                    section4,
                    "",
                    "",
                    "He was ",
                    "A. advised",
                    "B. instructed",
                    "C. persuaded",
                    "D. forced",
                    "B. instructed",
                    "B",
                    "directed ",
                    "to write the letter. ")),


                Questions( objective = Objective(
                    "41",
                    section5,
                    "",
                    "",
                    "Every one of the students _______ to be excited about the excursion. ",
                    "A. was seeming",
                    "B. is seeming",
                    "C. seem",
                    "D. seems",
                    "C. seem", "C"
                )),


                Questions( objective = Objective(
                    "42",
                    section5,
                    "",
                    "",
                    "We should assist the poor ________ ?",
                    "A. shall we",
                    "B. isn't it",
                    "C. shouldn't we",
                    "D. we shouldn't",
                    "C. shouldn't we", "C"
                )),


                Questions( objective = Objective(
                    "43",
                    section5,
                    "",
                    "",
                    "Either he or you ______ to clean up the mess. ",
                    "A. has",
                    "B. have",
                    "C. were",
                    "D. was",
                    "B. have", "B"

                    )),


                Questions( objective = Objective(
                    "44",
                    section5,
                    "",
                    "",
                    "If Musa had woken up earlier, he ______ breakfast. ",
                    "A. would not have missed",
                    "B. ought not to miss.",
                    "C. shall have missed",
                    "D. may have missed",
                    "A. would not have missed", "A"
                )),

                Questions( objective = Objective(
                    "45",
                    section5,
                    "",
                    "",
                    "He would rather appeal the decision _______ defeat.",
                    "A. instead of accepting",
                    "B. than accepting",
                    "C. than accepts",
                    "D. than accept",
                    "A. instead of accepting", "A"
                )),


                Questions( objective = Objective(
                    "46",
                    section5,
                    "",
                    "",
                    "The student complained that he ______ the teacher.",
                    "A. was not hearing",
                    "B. could not hear",
                    "C. does not hear",
                    "D. is not hearing",
                    "B. could not hear", "B"

                    )),



                Questions( objective = Objective(
                    "47",
                    section5,
                    "",
                    "",
                    "My brother ______ in lagos for the past ten years. ",
                    "A. is living",
                    "B. lived",
                    "C. will lived",
                    "D. has been living",
                    "D. has been living", "D"
                )),

                Questions( objective = Objective(
                    "48",
                    section5,
                    "",
                    "",
                    "I am totally disappointed _______ such poor grades. ",
                    "A. from",
                    "B. with",
                    "C. for",
                    "D. on",
                    "B. with", "B"
                )),

                Questions( objective = Objective(
                    "49",
                    section5,
                    "",
                    "",
                    "He is a doctor but he dabbles _______ politics now and then. ",
                    "A. in",
                    "B. through",
                    "C. on",
                    "D. into",
                    "D. into", "D"
                )),



                Questions( objective = Objective(
                    "50",
                    section5,
                    "",
                    "",
                    "_______ arrived before the manager. ",
                    "A. Neither he nor I",
                    "B. Neither me nor him",
                    "C. Either I nor him",
                    "D. Neither me nor him",
                    "A. Neither he nor I", "A"
                )),

                Questions( objective = Objective(
                    "51",
                    section5,
                    "",
                    "",
                    "The evening was rounded _____ with a dance. ",
                    "A. off",
                    "B. up",
                    "C. out",
                    "D. down",
                    "B. up", "B"
                )),

                Questions( objective = Objective(
                    "52",
                    section5,
                    "",
                    "",
                    "I _______ have done the dishes but i haven't had the time. ",
                    "A. will",
                    "B. should",
                    "C. might",
                    "D. shall",
                    "B. should", "B"
                )),


                Questions( objective = Objective(
                    "53",
                    section5,
                    "",
                    "",
                    "I have heard all _______ you've said",
                    "A. what",
                    "B. which",
                    "C. that",
                    "D. whatever",
                    "C. that", "C"
                )),


                Questions( objective = Objective(
                    "54",
                    section5,
                    "",
                    "",
                    "Life in the city is ________ challenging for the lazy. ",
                    "A. too much",
                    "B. so much",
                    "C. very much",
                    "D. much too",
                    "A. too much", "A"
                )),




                Questions( objective = Objective(
                    "55",
                    section5,
                    "",
                    "",
                    "It is always ________ that gets the blame",
                    "A. me",
                    "B. I",
                    "C. myself",
                    "D. mine",
                    "A. me", "A"
                )),


                Questions( objective = Objective(
                    "56",
                    section5,
                    "",
                    "",
                    "He spends a ______ deal of his time studying. ",
                    "A. large",
                    "B. great",
                    "C. big",
                    "D. huge",
                    "B. great", "B"
                )),

        Questions( objective = Objective(
                    "57",
                    section5,
                    "",
                    "",
                    "I guess he holds _______ sensitive position in the company. ",
                    "A. some kind",
                    "B. many kind of",
                    "C. some kind of",
                    "D. many kind",
                    "A. some kind", "A"
                )),



                Questions( objective = Objective(
                    "58",
                    section5,
                    "",
                    "",
                    "He always gives ______ for coming late to school. ",
                    "A. one excuse or another",
                    "B. one excuse or the other",
                    "C. some excuse or another",
                    "D. some excuse or the other",
                    "B. one excuse or the other", "B"
                )),


                Questions( objective = Objective(
                    "59",
                    section5,
                    "",
                    "",
                    "___________ you turn down down the volume of the radio? I am trying to read! ",
                    "A. may",
                    "B. will",
                    "C. would",
                    "D. should",
                    "C. would", "C"
                )),



                Questions( objective = Objective(
                    "60",
                    section5,
                    "",
                    "",
                    "I know it's a secret, so I _____  tell anyone.",
                    "A. couldn't",
                    "B. shan't",
                    "C. needn't",
                    "D. mightn't",
                    "A. couldn't", "A"
                )),




                Questions( objective = Objective(
                    "61",
                    section5,
                    "",
                    "",
                    "At the last minute, Amidu backed _____ of the plan.",
                    "A. up",
                    "B. off",
                    "C. out",
                    "D. down",
                    "C. out", "C"
                )),


                Questions( objective = Objective(
                    "62",
                    section5,
                    "",
                    "",
                    "He ______ be very handsome but i don't like him. ",
                    "A. shall",
                    "B. will",
                    "C. might",
                    "D. can",
                    "C. might", "C"
                )),

                Questions( objective = Objective(
                    "63",
                    section5,
                    "",
                    "",
                    "During her early day in school, she ______ study for hours, ",
                    "A. would",
                    "B. may",
                    "C. can",
                    "D. shall",
                    "C. can", "C"
                )),


                Questions( objective = Objective(
                    "65",
                    section5,
                    "",
                    "",
                    "He _______ this morning in a dazzling white shirt.",
                    "A. turned off",
                    "B. turned in",
                    "C. turned by",
                    "D. turned out",
                    "B. turned in", "B"
                )),




                Questions( objective = Objective(
                    "65",
                    section5,
                    "",
                    "",
                    "The police have _________  a warning to all residents of the area. ",
                    "A. put on",
                    "B. put in",
                    "C. put off",
                    "D. put out",
                    "A. put on", "A"
                )),



                Questions( objective = Objective(
                    "66",
                    section5,
                    "",
                    "",
                    "My parents taught me a lot of lessons, most of ______ are difficult to forget. ",
                    "A. which",
                    "B. who",
                    "C. whom",
                    "D. what",
                    "A. which", "A"
                )),




                Questions( objective = Objective(
                    "67",
                    section5,
                    "",
                    "",
                    "Sani ______ on a banana peel and fell down. ",
                    "A. slide",
                    "B. slid",
                    "C. had slid",
                    "D. was sliding",
                    "B. slid", "B"
                )),



                Questions( objective = Objective(
                    "68",
                    section5,
                    "",
                    "",
                    "I look forward to _________ from you. ",
                    "A. hear",
                    "B. hearing",
                    "C. be hearing",
                    "D. have heard",
                    "B. hearing", "B"
                )),


                Questions( objective = Objective(
                    "69",
                    section5,
                    "",
                    "",
                    "I have made remarkable progress ______ learning French.",
                    "A. by",
                    "B. at",
                    "C. in",
                    "D. for",
                    "A. by", "A"
                )),



                Questions( objective = Objective(
                    "70",
                    section5,
                    "",
                    "",
                    "The beans have not been properly ________",
                    "A. grind",
                    "B. ground",
                    "C. grinding",
                    "D. grounded",
                    "A. grind", "A"
                )),


                Questions( objective = Objective(
                    "71",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. creation",
                    "B. provision",
                    "C. construction",
                    "D. production",
                    "D. production", "D"
                )),


                Questions( objective = Objective(
                    "72",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. debts",
                    "B. pitfalls",
                    "C. risks",
                    "D. problems",
                    "C. risks", "C"
                )),


                Questions( objective = Objective(
                    "73",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. hawker",
                    "B. peddler",
                    "C. retailer",
                    "D. trader",
                    "C. retailer", "C"
                )),


                Questions( objective = Objective(
                    "74",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. plunge",
                    "B. invest",
                    "C. break",
                    "D. delve",
                    "B. invest", "B"
                )),


                Questions( objective = Objective(
                    "75",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. colleague",
                    "B. comrade",
                    "C. fellow",
                    "D. partner",
                    "D. partner", "D"
                )),

                Questions( objective = Objective(
                    "76",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. tendencies",
                    "B. properties",
                    "C. attributes",
                    "D. features",
                    "C. attributes", "C"
                )),


                Questions( objective = Objective(
                    "77",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. skills",
                    "B. talents",
                    "C. knack",
                    "D. foresight",
                    "A. skills", "A"
                )),


                Questions( objective = Objective(
                    "78",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. outputs",
                    "B. yields",
                    "C. products",
                    "D. materials",
                    "A. outputs", "A"
                )),



                Questions( objective = Objective(
                    "79",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. controls",
                    "B. checks",
                    "C. restrains",
                    "D. bridles",
                    "A. controls", "A"
                )),


                Questions( objective = Objective(
                    "80",
                    section6,
                    "",
                    "",
                    passageA2018,
                    "A. assets",
                    "B. wealth",
                    "C. stock",
                    "D. resources",
                    "D. resources", "D"
                )),

                )
}