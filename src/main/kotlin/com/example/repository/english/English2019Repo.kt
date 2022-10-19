package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2019Repo {

    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"


    private val passageA2019 = "The day of the great tournament arrived and -71- trooped into the stadium in their thousands. Meanwhile, the home team had arrived and was in the -72-. The visiting team was late. With both teams now around, the referee - 73 - his whistle and the two teams emerged from the tunnel and walked onto the pitch. The referee, his assistants and the players stood still while the national anthems of both countries were being played. After this, the captains of both teams came forward for the -74-. The home team won, they then exchanged -75 - and shook hands." +
            "At exactly 4.30 pm, the referee signalled for the start of the match. The supporters were singing and dancing in the- 76-. Both teams played very well but -77-a lot of chances. After playing for forty-five minutes. the referee stopped the match for the hall time break. During this brief break. the -78 - of both teams came out to warm themselves up. When the match resumed, the home team now played better. A -79- from the half-back at the opponent's goal was - 80- into the net. There was a thunderous shout from the crowd. The match continued till the ninetieth minute. The result at the end of the match was 1-0. The home team had won."



    val english2019 = listOf<Questions>(
        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "Though my mother was ",
            "A. Skeptical",
            "B. serious",
            "C. confused",
            "D. concerned",
            "A. Skeptical",
            "A",
            "convinced ",
            "about the success of the business, her manager remained ___________")
        ),


        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "Judgment should always be in favour of the ",
            "A. guilty",
            "B. accused",
            "C. weak",
            "D. elderly",
            "A. guilty",
            "A",
            "innocent ",
            "and not the _________")),



        Questions( objective = Objective(
            "3",
            section1,
            "",
            "",
            "Layi is quite ",
            "A. unswerving",
            "B. untrustworthy",
            "C. deceptive",
            "D. pretentious",
            "B. untrustworthy",
            "B",
            "reliable ",
            "but his sister is _________")),


        Questions( objective = Objective(
            "4",
            section1,
            "",
            "",
            "The ",
            "A. unfriendly",
            "B. carefree",
            "C. brave",
            "D. discerning",
            "D. discerning",
            "D",
            "gullible",
            "and not the _______ usually fall prey to tricksters.")),


        Questions( objective = Objective(
            "5",
            section1,
            "",
            "",
            "Tom's ",
            "A. haughtiness",
            "B. stubbornness",
            "C. gentleness",
            "D. quietness",
            "A. haughtiness",
            "A",
            "humility ",
            "contrasts with his brother's __________")),


        Questions( objective = Objective(
            "6",
            section1,
            "",
            "",
            "The life of man appears ",
            "A. brief",
            "B. quick",
            "C. shortened",
            "D. stunted",
            "A. brief",
            "A",
            "long ",
            "but, in reality, it is _________")),


        Questions( objective = Objective(
            "7",
            section1,
            "",
            "",
            "In the interest of peace, it is better to ",
            "A. controversial",
            "B. rational",
            "C. confrontational",
            "D. forceful",
            "C. confrontational",
            "C",
            "dialogue ",
            "than to be _________",)),


        Questions( objective = Objective(
                "8",
                section1,
                "",
                "",
                "All the wealth ",
                "A. destroyed",
                "B. scattered",
                "C. squandered",
                "D. ruined",
                "C. squandered",
            "C",
                "amassed ",
                "by a greedy father is often _________ by undisciplined children.")),


            Questions( objective = Objective(
                "9",
                section1,
                "",
                "",
                "Many people find cod liver oil ",
                "A. refreshing",
                "B. medicinal",
                "C. pleasant",
                "D. bitter",
                "A. refreshing",
                "A",
                "disgusting ",
                "but soldiers find it _________")),


            Questions( objective = Objective(
                "10",
                section1,
                "",
                "",
                "The arrival of the riot police at our campus _______ the tension rather than ",
                "A. lengthened",
                "B. heightened",
                "C. prolonged",
                "D. created",
                "B. heightened",
                "B",
                "mitigate ",
                "it.")),


            Questions( objective = Objective(
                "11",
                section2,
                "",
                "",
                "Investigations revealed that the senior students __________ the juniors to throw stones at the Principal's car.",
                "A. infuriated",
                "B. integrated",
                "C. instigated",
                "D. instituted",
                "C. instigated", "C"
            )),

            Questions( objective = Objective(
                "12",
                section2,
                "",
                "",
                "Supreme court ________ the ruling of the lower court.",
                "A. nullified",
                "B. abused",
                "C. proclaimed",
                "D. cancelled",
                "D. cancelled", "D"
            )),


            Questions( objective = Objective(
                "13",
                section2,
                "",
                "",
                "The board has ______ the film because it contains some nude scenes.",
                "A. edited",
                "B. censored",
                "C. examined",
                "D. isolated",
                "B. censored", "B"
            )),


            Questions( objective = Objective(
                "14",
                section2,
                "",
                "",
                "Many young graduates have _________ to the West in search of greener pastures.",
                "A. hurried",
                "B. emigrated",
                "C. absconded",
                "D. flown",
                "B. emigrated", "B"
            )),


            Questions( objective = Objective(
                "15",
                section2,
                "",
                "",
                "The Committee let her go because they considered her explanation __________",
                "A. permissible",
                "B. clear",
                "C. plausible",
                "D. necessary",
                "C. plausible", "C"
            )),


            Questions( objective = Objective(
                "16",
                section2,
                "",
                "",
                "The company has paid dividends to its________",
                "A. buyers",
                "B. wholesalers",
                "C. shareholders",
                "D. consumers",
                "C. shareholders", "C"
            )),


            Questions( objective = Objective(
                "17",
                section2,
                "",
                "",
                "Within one year, that country has _________ its currency five times.",
                "A. reduced",
                "B. devalued",
                "C. revamped",
                "D. defaced",
                "B. devalued", "B"
            )),

            Questions( objective = Objective(
                "18",
                section2,
                "",
                "",
                "The man was arrested because he __________ in the repayment of the loan.",
                "A. paused",
                "B. delayed",
                "C. deferred",
                "D. defaulted",
                "D. defaulted", "D"
            )),



            Questions( objective = Objective(
                "19",
                section2,
                "",
                "",
                "Many members of political parties __________ to opposing parties just before elections.",
                "A. depart",
                "B. change",
                "C. defect",
                "D. go",
                "C. defect", "C"
            )),


            Questions( objective = Objective(
                "20",
                section2,
                "",
                "",
                "The boy must have _________ the disease from the school.",
                "A. received",
                "B. taken",
                "C. contracted",
                "D. carried",
                "C. contracted", "C"
            )),

            Questions( objective = Objective(
                "21",
                section3,
                "",
                "",
                "The Class captain got cold feet when he was asked to lead the protest. This means that the class captain became.",
                "A. nervous",
                "B. afraid",
                "C. concerned",
                "D. calm",
                "A. nervous", "A"
            )),


            Questions( objective = Objective(
                "22",
                section3,
                "",
                "",
                "Street traders often try to palm their customers off with faulty goods. This means that street traders",
                "A. trick customers into buying faulty goods",
                "B. assist customers in choosing perfect items",
                "C. ask for a lot of money for faulty goods",
                "D. are ready to swap faulty items for good ones",
                "A. trick customers into buying faulty goods", "A"
            )),



            Questions( objective = Objective(
                "23",
                section3,
                "",
                "",
                "He has broken new ground in cancer treatment with his drug, This means that he has",
                "A. been highly acclaimed",
                "B. introduced a new method in cancer treatment",
                "C. solved all cancer problems",
                "D. thought of a new drug, for cancer treatment",
                "B. introduced a new method in cancer treatment", "B"
            )),


            Questions( objective = Objective(
                "24",
                section3,
                "",
                "",
                "The Principal stood her ground even when the students revolted. This means that the Principal",
                "A. maintained her position",
                "B. remained standing",
                "C. refused to listen",
                "D. condemned the protest",
                "A. maintained her position", "A"
            )),

            Questions( objective = Objective(
                "25",
                section3,
                "",
                "",
                "Looking after young children can tax ones patience. This means that looking after children",
                "A. is pleasant",
                "B. requires endurance",
                "C. is a lot of fun",
                "D. takes time",
                "B. requires endurance", "B"
            )),



            Questions( objective = Objective(
                "26",
                section3,
                "",
                "",
                "When the show was about to begin, we were still at sixes and sevens. This means that we were",
                "A. confused",
                "B. in groups",
                "C. excited",
                "D. faraway",
                "A. confused", "A"
            )),



            Questions( objective = Objective(
                "27",
                section3,
                "",
                "",
                "My aunt's rough driving could make one tear one's hair out. This means that her driving could make one",
                "A. lose the hair on one's head",
                "B. feel very sad",
                "C. get very worried",
                "D. feel like crying",
                "C. get very worried", "C"
            )),



            Questions( objective = Objective(
                "28",
                section3,
                "",
                "",
                "We never expected that Father would read us the riot act. This means that our father",
                "A. taught us the riot act",
                "B. cautioned us 'not to be involved in riots",
                "C. warned us to stop making trouble",
                "D. encouraged us to make trouble",
                "D. encouraged us to make trouble", "D"
            )),


            Questions( objective = Objective(
                "29",
                section3,
                "",
                "",
                "You will certainly break his heart if you tell him that. This means that telling him that would",
                "A. make him very sad",
                "B. meet his expectations",
                "C. greatly disappoint him",
                "D. make him confirm his suspicion",
                "A. make him very sad", "A"
            )),


            Questions( objective = Objective(
                "30",
                section3,
                "",
                "",
                "He is at the crossroads of his life. This means that it is time for him to",
                "A. make a very important decision",
                "B. retrace his steps",
                "C. make peace with everyone",
                "D. take matters seriously",
                "A. make a very important decision", "A"
            )),

            Questions( objective = Objective(
                "31",
                section4,
                "",
                "",
                "Amina is fond of making ",
                "A. inconsiderate",
                "B. discreet",
                "C. unnecessary",
                "D. belittling",
                "D. belittling", "D",
                "derogatory ",
                "remarks about her brother.")),


            Questions( objective = Objective(
                "32",
                section4,
                "",
                "",
                "His jail terms are to run ",
                "A. consistently",
                "B. alternately",
                "C. simultaneously",
                "D. consecutively",
                "C. simultaneously", "C",
                "concurrently.")),


            Questions( objective = Objective(
                "33",
                section4,
                "",
                "",
                "Here's a man who comes from a ",
                "A. an experience",
                "B. a place",
                "C. a culture",
                "D. a mood",
                "B. a place", "B",
                "background ",
                "of entertainment,")),


        Questions( objective = Objective(
                "34",
                section4,
                "",
                "",
                "She has always been ",
                "A. content",
                "B. comforted",
                "C. happy",
                "D. thankful",
                "D. thankful", "D",
                "grateful ",
                "that you saved her from kidnappers.")),


            Questions( objective = Objective(
                "35",
                section4,
                "",
                "",
                "The whole place was in ",
                "A. confusion",
                "B. disturbance",
                "C. mourning",
                "D. agitation",
                "A. confusion", "A",
                "turmoil ",
                "when we got there. ")),


            Questions( objective = Objective(
                "36",
                section4,
                "",
                "",
                "Charles' concern for Anna is ",
                "A. insincere",
                "B. incorrect",
                "C. weak",
                "D. unfair",
                "A. insincere", "A",
                "affected."
            )),


            Questions( objective = Objective(
                "37",
                section4,
                "",
                "",
                "Corporal punishment is meant to be a ",
                "A. remedy",
                "B. measure",
                "C. discouragement",
                "D. prevention",
                "B. measure", "B",
                "deterrent ",
                "to indiscipline.")),

            Questions( objective = Objective(
                "38",
                section4,
                "",
                "",
                "The new bank is fast becoming  ",
                "A. inactive",
                "B. ineffective",
                "C. bankrupt",
                "D. lax",
                "C. bankrupt", "C",
                "insolvent.")),

            Questions( objective = Objective(
                "39",
                section4,
                "",
                "",
                "He did all he could to ",
                "A. fortify",
                "B. secure",
                "C. protect",
                "D. cover",
                "C. protect", "C",
                "defend ",
                "his master.")),


            Questions( objective = Objective(
                "40",
                section4,
                "",
                "",
                "I hope the Principal would be ",
                "A. cordial",
                "B. polite",
                "C. merciful",
                "D. gentle",
                "C. merciful", "C",
                "gracious ",
                "enough to forgive us.")),


            Questions( objective = Objective(
                "41",
                section5,
                "",
                "",
                "You have no excuse________late.",
                "A. in being",
                "B. to being",
                "C. been",
                "D. for being",
                "D. for being", "D",
            )),


            Questions( objective = Objective(
                "42",
                section5,
                "",
                "",
                "My phone is superior ________ yours.",
                "A. to",
                "B. than",
                "C. from",
                "D. over",
                "B. than", "B"
            )),

            Questions( objective = Objective(
                "43",
                section5,
                "",
                "",
                "You will surely help me with my work, _________?",
                "A. can you",
                "B. won't you",
                "C. would you",
                "D. you won't",
                "B. won't you", "B"
            )),


            Questions( objective = Objective(
                "44",
                section5,
                "",
                "",
                "The trader tried to cash in ________ the customer's ignorance.",
                "A. by",
                "B. at",
                "C. on",
                "D. with",
                "B. at", "B"
            )),


            Questions( objective = Objective(
                "46",
                section5,
                "",
                "",
                "She hates ________ waiting.",
                "A. to have been kept",
                "B. having been kept",
                "C. being kept",
                "D. to be keeping",
                "D. to be keeping", "D"
            )),


            Questions( objective = Objective(
                "46",
                section5,
                "",
                "",
                "He took his share and gave them ______",
                "A. their",
                "B. there's",
                "C. there",
                "D. theirs",
                "D. theirs", "D"
            )),


            Questions( objective = Objective(
                "47",
                section5,
                "",
                "",
                "it is advisable to mind your own business and not _________",
                "A. somebody's else",
                "B. somebody else's",
                "C. somebody's else's",
                "D. somebody else",
                "D. somebody else", "D"
            )),


            Questions( objective = Objective(
                "48",
                section5,
                "",
                "",
                "Mike was very glad _________ that he had won the lottery.",
                "A. to hear",
                "B. for hearing",
                "C. at hearing",
                "D. on hearing",
                "A. to hear", "A"
            )),

            Questions( objective = Objective(
                "49",
                section5,
                "",
                "",
                "Mr kwesi bought _______",
                "A. a cupboard attractive new",
                "B. attractive a new cupboard",
                "C. a new attractive cupboard",
                "D. an attractive new cupboard",
                "C. a new attractive cupboard", "C"
            )),


            Questions( objective = Objective(
                "50",
                section5,
                "",
                "",
                "Don't let Jack bully you: stand up ________ him.",
                "A. for",
                "B. against",
                "C. above",
                "D. to",
                "B. against", "B"
            )),

            Questions( objective = Objective(
                "51",
                section5,
                "",
                "",
                "The culprits _______ when we entered the courtroom.",
                "A. were being interrogated",
                "B. are being interrogated",
                "C. will be interrogated",
                "D. would be interrogated",
                "A. were being interrogated", "A"
            )),

            Questions( objective = Objective(
                "52",
                section5,
                "",
                "",
                "The students had no choice _______ to do as they had been commanded.",
                "A. except",
                "B. but",
                "C. rather",
                "D. even",
                "B. but", "B"
            )),


            Questions( objective = Objective(
                "53",
                section5,
                "",
                "",
                "My submission ________ by the Council at the moment.",
                "A. considering",
                "B. is being considered",
                "C. considers",
                "D. is considered",
                "B. is being considered", "B"
            )),


            Questions( objective = Objective(
                "54",
                section5,
                "",
                "",
                "If she had known, she wouldn't have come,________?",
                "A. could she",
                "B. couldn't she",
                "C. wouldn't she",
                "D. would she",
                "D. would she", "D"
            )),


            Questions( objective = Objective(
                "55",
                section5,
                "",
                "",
                "Last week's assignment was _________for me.",
                "A. much too difficult",
                "B. too much difficult",
                "C. difficult too much",
                "D. much difficult too",
                "B. too much difficult", "B"
            )),

            Questions( objective = Objective(
                "56",
                section5,
                "",
                "",
                "Could you please _________ a receipt for my purchase?",
                "A. make in",
                "B. make out",
                "C. make up",
                "D. make for",
                "B. make out", "B"
            )),


            Questions( objective = Objective(
                "57",
                section5,
                "",
                "",
                "This is an improvement ________ the last report.",
                "A. over",
                "B. on",
                "C. in",
                "D. of",
                "B. on", "B"
            )),

            Questions( objective = Objective(
                "58",
                section5,
                "",
                "",
                "You can apply if you agree _______ their terms.",
                "A. upon",
                "B. to",
                "C. about",
                "D. in",
                "B. to", "B"
            )),


            Questions( objective = Objective(
                "59",
                section5,
                "",
                "",
                "When we were in boarding school, my parents usually came to check _________ us every week.",
                "A. with",
                "B. on",
                "C. over",
                "D. for",
                "B. on", "B"
            )),

            Questions( objective = Objective(
                "60",
                section5,
                "",
                "",
                "It is I who ________ to blame for the lapses.",
                "A. was",
                "B. am",
                "C. is",
                "D. are",
                "C. is", "C"
            )),

            Questions( objective = Objective(
                "61",
                section5,
                "",
                "",
                "The holiday came to an end all _________ soon.",
                "A. too",
                "B. rather",
                "C. much",
                "D. more",
                "A. too", "A"
            )),


            Questions( objective = Objective(
                "62",
                section5,
                "",
                "",
                "The research was carried out _________ a sample population.",
                "A. over",
                "B. in",
                "C. with",
                "D. on",
                "C. with", "C"
            )),


            Questions( objective = Objective(
                "63",
                section5,
                "",
                "",
                "Though ________ by opposition from his own supporters, the Chairman pressed ahead with his plans.",
                "A. shaking",
                "B. shook",
                "C. shaken",
                "D. was shaken",
                "B. shook", "B"
            )),


            Questions( objective = Objective(
                "64",
                section5,
                "",
                "",
                "To avoid trouble, it is best to say very _________ on the case.",
                "A. less",
                "B. little",
                "C. few",
                "D. small",
                "B. little", "B"
            )),


            Questions( objective = Objective(
                "65",
                section5,
                "",
                "",
                "He offered no explanation, ________ apology.",
                "A. still less an",
                "B. and even less an",
                "C. not less the",
                "D. still less the",
                "B. and even less an", "B"
            )),

            Questions( objective = Objective(
                "66",
                section5,
                "",
                "",
                "Our school wil ________ one hundred and twenty students this year.",
                "A. turn in",
                "B. turn on",
                "C. turn out",
                "D. turn over",
                "C. turn out", "C"
            )),


            Questions( objective = Objective(
                "67",
                section5,
                "",
                "",
                "At the last minute, Amidu _______ of the plan.",
                "A. backed up",
                "B. backed for",
                "C. backed out",
                "D. backed in",
                "C. backed out", "C"
            )),


            Questions( objective = Objective(
                "68",
                section5,
                "",
                "",
                "We need to _______ for lost ground.",
                "A. make in",
                "B. make by",
                "C. make up",
                "D. make through",
                "C. make up", "C"
            )),


            Questions( objective = Objective(
                "69",
                section5,
                "",
                "",
                "Blood is usually screened _________ transfusion.",
                "A. before",
                "B. in",
                "C. by",
                "D. upon",
                "A. before", "A"
            )),



            Questions( objective = Objective(
                "70",
                section5,
                "",
                "",
                "I believe he'll be arrested _________",
                "A. some days",
                "B. many days",
                "C. many a day",
                "D. some day",
                "D. some day", "D"
            )),

            Questions( objective = Objective(
                "71",
                section6,
                "",
                "",
                passageA2019,
                "A. audience",
                "B. spectators",
                "C. crowd",
                "D. congregation",
                "B. spectators", "B"
            )),


            Questions( objective = Objective(
                "72",
                section6,
                "",
                "",
                passageA2019,
                "A. pitch",
                "B. court",
                "C. dressing room",
                "D. rest room",
                "C. dressing room", "C"
            )),


            Questions( objective = Objective(
                "73",
                section6,
                "",
                "",
                passageA2019,
                "A. signalled",
                "B. blew",
                "C. sounded",
                "D. played",
                "B. blew", "B"
            )),


            Questions( objective = Objective(
                "74",
                section6,
                "",
                "",
                passageA2019,
                "A. toss",
                "B. kick-off",
                "C. offside",
                "D. throw-in",
                "A. toss", "A"
            )),



            Questions( objective = Objective(
                "75",
                section6,
                "",
                "",
                passageA2019,
                "A. gloves",
                "B. pennants",
                "C. jerseys",
                "D. memoirs",
                "D. memoirs", "D"
            )),

            Questions( objective = Objective(
                "76",
                section6,
                "",
                "",
                passageA2019,
                "A. stands",
                "B. arena",
                "C. tracks",
                "D. steps",
                "D. steps", "D"
            )),



            Questions( objective = Objective(
                "77",
                section6,
                "",
                "",
                passageA2019,
                "A. squandered",
                "B. lost",
                "C. diverted",
                "D. dropped",
                "B. lost", "B"
            )),


            Questions( objective = Objective(
                "78",
                section6,
                "",
                "",
                passageA2019,
                "A. coaches",
                "B. supporters",
                "C. managers",
                "D. substitutes",
                "A. coaches", "A"
            )),




            Questions( objective = Objective(
                "79",
                section6,
                "",
                "",
                passageA2019,
                "A. shot",
                "B. kick",
                "C. play",
                "D. dribble",
                "A. shot", "A"
            )),


            Questions( objective = Objective(
                "80",
                section6,
                "",
                "",
                passageA2019,
                "A. pushed",
                "B. headed",
                "C. moved",
                "D. swayed",
                "B. headed", "B"
            )),

            )

}