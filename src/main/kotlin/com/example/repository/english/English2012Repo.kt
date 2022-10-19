package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2012Repo {

    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    val passageA2012 = "Fred loves the weekends because they afford him the opportunity of visit the popular -74- where his friend, the -75- always allows him to go through the newspapers at no cost to him. There are usually many daily and weekly -76- of newspapers, magazines and journals on sale. Fred’s habit is to quickly note from the -77- the papers that had arrived. Next, he glances at the -78- of the leading stories and then the -79- that are printed underneath the pictures on the front and back pages. Thereafter, he decides on which one to read. He has his favourite -80- and he especially loves to read the -81- which are usually written by editors. He also enjoys the -82- sent in by the -83- journalists because he believes that they write objectively. The -84- sadden him because they remind him that life is transient. However, whatever gloominess these bring about is quickly wiped away by the excitement from the -85- pages. These pages keep him informed of his favourite clubs, players and match fixtures."
    val passageB2012 = "Last week Mrs Coker took her sick daughter to the hospital. After examining her, the doctor said that the child didn’t have much -86- to the parasites, which the laboratory -87- discovered in her blood -88-. He advised her to give the child the prescribed drugs and to keep out the files that-89- the disease. He told Mrs Coker that the disease was in its early -90- and that the obvious symptom was the -91- of the eye membranes. This was caused by the trachoma virus which could not be seen under a -92- because it is smaller than bacterial -93-. He made her realise that trachoma could cause blindness. Therefore, Mrs Coker should protect her family from this -94- disease she should maintain a high standard of -95- by -96- her towels and face cloths. The doctor then wrote out a -97- of antibiotic drugs and tablets, which should be obtained from a -98-. He assured Mrs Coker that the treatment he had prescribed would -99- the child to good -100- in two or three days."

    val english2012 = listOf<Questions>(


        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "Although the atmosphere was  ",
            "A. gentle",
            "B. unacceptable",
            "C. suspicious",
            "D. amicable",
            "D. amicable", "D",
            "hostile,",
            " the meeting ended on .......... terms.")
        ),


        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "The company had to ....... the restaurant in order to  ",
            "A. demolish",
            "B. abandon",
            "C. damage",
            "D. relocate",
            "A. demolish",
            "A",
            "construct",
            "a hotel",)),



        Questions( objective = Objective(
            "3",
            section1,
            "",
            "",
            "Five years ago the economy of our country was  ",
            "A. profitable",
            "B. distressed",
            "C. unbearable",
            "D. low",
            "B. distressed",
            "B",
            "buoyant ",
            "but nowadays it has become ........... ",)),



        Questions( objective = Objective(
            "4",
            section1,
            "",
            "",
            "We enjoy  ",
            "A. imaginary",
            "B. practical",
            "C. vague",
            "D. undefined",
            "A. imaginary",
            "A",
            "real ",
            "stories not those that are .........: ")),




        Questions( objective = Objective(
            "5",
            section1,
            "",
            "",
            "Ann's  ",
            "A. lateness",
            "B. capability",
            "C. incompetence",
            "D. laziness",
            "C. incompetence",
            "C",
            "efficiency ",
            "earned her a promotion while Jane's ........... caused her dismissal.")),



        Questions( objective = Objective(
            "6",
            section1,
            "",
            "",
            "While Rashida's business is  ",
            "A. declining",
            "B. diminishing",
            "C. vanishing",
            "D. withering",
            "A. declining",
            "A",
            "flourishing, ",
            "Ida's is ............. ")),



        Questions( objective = Objective(
            "7",
            section1,
            "",
            "",
            "Clara is full of  ",
            "A. despair",
            "B. callousness",
            "C. carelessness",
            "D. disdain",
            "D. disdain",
            "D",
            "admiration :",
            "for Lena but she treat me with ........... ")),




        Questions( objective = Objective(
            "8",
            section1,
            "",
            "",
            "The contributions should be ........... not  ",
            "A. wilful",
            "B. voluntary",
            "C. deliberate",
            "D. outright",
            "B. voluntary",
            "B",
            "compulsory ")),



        Questions( objective = Objective(
            "9",
            section1,
            "",
            "",
            "In those societies, the ............ and the ",
            "A. ignorant",
            "B. rich",
            "C. barbaric",
            "D. arrogant",
            "C. barbaric",
            "C",
            "cultured ",
            "lived together.")),




        Questions( objective = Objective(
            "10",
            section1,
            "",
            "",
            "Some people live in abject ",
            "A. affluence",
            "B. greatness",
            "C. fame",
            "D. peace",
            "A. affluence",
            "A",
            "poverty ",
            "while others live in .............. ")),




        Questions( objective = Objective(
            "11",
            section2,
            "",
            "",
            "When you ........... someone's point of view, you should do so politely.",
            "A. refute",
            "B. rebuke",
            "C. recall",
            "D. refuse",
            "A. refute", "A")),



        Questions( objective = Objective(
            "12",
            section2,
            "",
            "",
            "One should ........... the land very well if one expects a bumper harvest",
            "A. water",
            "B. dig",
            "C. cultivate",
            "D. clear",
            "C. cultivate", "C")),


        Questions( objective = Objective(
            "13",
            section2,
            "",
            "",
            "His lecture was ............. and so the students did not understand it.",
            "A. indefinite",
            "B. illegible",
            "C. unintelligible",
            "D. unimpressive",
            "C. unintelligible", "C")),


        Questions( objective = Objective(
            "14",
            section2,
            "",
            "",
            "In Botany, one is bound to ........ flowers",
            "A. read",
            "B. know",
            "C. study",
            "D. examine",
            "C. study", "C")),



        Questions( objective = Objective(
            "15",
            section2,
            "",
            "",
            "Harry cannot do without his ........... of short stories because he loves reading.",
            "A. file",
            "B. library",
            "C. collection",
            "D. dictionary",
            "C. collection", "C")),


        Questions( objective = Objective(
            "16",
            section2,
            "",
            "",
            "Can you ............ the result of tomorrow's match?",
            "A. conclude",
            "B. predict",
            "C. order",
            "D. verify",
            "B. predict", "B")),



        Questions( objective = Objective(
            "17",
            section2,
            "",
            "",
            "The river .......... across the plain",
            "A. rolled",
            "B. meandered",
            "C. trickled",
            "D. passed",
            "B. meandered", "B")),


        Questions( objective = Objective(
            "18",
            section2,
            "",
            "",
            "Since the army was no longer needed, it was ............... ",
            "A. demolished",
            "B. dismantled",
            "C. disbanded",
            "D. fired",
            "C. disbanded", "C")),


        Questions( objective = Objective(
            "19",
            section2,
            "",
            "",
            "It is most ........... that the company spent five million naira on that fragile fence",
            "A. outstanding",
            "B. wonderful",
            "C. remarkable",
            "D. astonishing",
            "D. astonishing", "D")),




        Questions( objective = Objective(
            "20",
            section2,
            "",
            "",
            "Matters that are confidential must not be made .......... ",
            "A. public",
            "B. popular",
            "C. unreasonable",
            "D. uncertain",
            "A. public", "A")),




        Questions( objective = Objective(
            "21",
            section3,
            "",
            "",
            "The boy went scot-free even though he insulted his teacher. This means that the boy was",
            "A. not punished",
            "B. free to move about",
            "C. expelled from schoo",
            "D. cautioned seriously",
            "A. not punished", "A")),


        Questions( objective = Objective(
            "22",
            section3,
            "",
            "",
            "The driver escaped death by a hair's breadth. This means that the driver escaped death",
            "A. fast",
            "B. luckily",
            "C. surprisingly",
            "D. narrowly",
            "D. narrowly ", "D")),

        Questions( objective = Objective(
            "23",
            section3,
            "",
            "",
            "I am given a free hand to run this business. This means that I",
            "A. am allowed to make my own decisions",
            "B. make my own appointments.",
            "C. assist the workers willingly.",
            "D. alone can choose my executives",
            "A. am allowed to make my own decisions", "A")),

        Questions( objective = Objective(
            "24",
            section3,
            "",
            "",
            "In every good transaction, there should be some give-and-take. This means that",
            "A. transaction are about giving",
            "B. transaction give and take",
            "C. any gift should be accepted willingly",
            "D. people should be willing to make compromises",
            "D. people should be willing to make compromises", "D")),

        Questions( objective = Objective(
            "25",
            section3,
            "",
            "",
            "That account of the incident is true to a degree. This means that the account is",
            "A. totally wrong.",
            "B. not clear",
            "C. completely true",
            "D. partly true",
            "D. partly true", "D")),


        Questions( objective = Objective(
            "26",
            section3,
            "",
            "",
            "Moses won the contest hands down. This means that Moses won",
            "A. surprisingly",
            "B. very easily",
            "C. narrowly",
            "D. with difficulty",
            "B. very easily", "B")),



        Questions( objective = Objective(
            "27",
            section3,
            "",
            "",
            "They vowed to win the race by hook or by crook. This means that they vowed to win by",
            "A. peaceful negotiations",
            "B. any possible means",
            "C. bribing the other competitors",
            "D. being honest",
            "B. any possible means", "B")),



        Questions( objective = Objective(
            "28",
            section3,
            "",
            "",
            "William spent the first three months learning the ropes. This means that he",
            "A. pulled all the ropes that should be pulled",
            "B. learnt what the job demanded",
            "C. knew what to do",
            "D. was unwilling to learn",
            "B. learnt what the job demanded", "B")),


        Questions( objective = Objective(
            "29",
            section3,
            "",
            "",
            "Our teacher advised us not to go with the crowd. This means that he advised us not to",
            "A. stay too much in the crowd",
            "B. travel with the crowd",
            "C. have many friends",
            "D. be unduly influenced by others",
            "D. be unduly influenced by others", "D")),




        Questions( objective = Objective(
            "30",
            section3,
            "",
            "",
            "Although the men were foreigners, they were given preferential treatment. This means that the men were treated",
            "A. better than others",
            "B. with caution",
            "C. with respect",
            "D. very quickly",
            "A. better than others", "A")),


        Questions( objective = Objective(
            "31",
            section4,
            "",
            "",
            "John bled ",
            "A. slowly",
            "B. excessively",
            "C. extremely",
            "D. abundantly",
            "B. excessively",
            "B",
            "profusely ",
            "as a result of the accident")),



        Questions( objective = Objective(
            "32",
            section4,
            "",
            "",
            "What you are suggesting is not ",
            "A. capable",
            "B. practicable",
            "C. attractive",
            "D. easy",
            "B. practicable",
            "B",
            "feasible")),




        Questions( objective = Objective(
            "33",
            section4,
            "",
            "",
            "Pa Bakary ",
            "A. save",
            "B. preserved",
            "C. increased",
            "D. economized",
            "C. increased",
            "C",
            "augmented ",
            "his income by selling firewood")),



        Questions( objective = Objective(
            "34",
            section4,
            "",
            "",
            "He plays the kora with ",
            "A. wisdom",
            "B. force",
            "C. pride",
            "D. skill",
            "D. skill",
            "D",
            "dexterity")),



        Questions( objective = Objective(
            "35",
            section4,
            "",
            "",
            "The police could not  ",
            "A. charge",
            "B. interrogate",
            "C. arrest",
            "D. prosecute",
            "C. arrest",
            "C",
            "apprehend ",
            "all the gamblers")),




        Questions( objective = Objective(
            "36",
            section4,
            "",
            "",
            "Fafa has a ",
            "A. prominent",
            "B. flat",
            "C. battered",
            "D. pointed",
            "A. prominent",
            "A",
            "conspicuous ",
            "nose")),



        Questions( objective = Objective(
            "37",
            section4,
            "",
            "",
            "Many parents are ",
            "A. repulsed",
            "B. constrained",
            "C. confused",
            "D. troubled",
            "A. repulsed",
            "A",
            "upset",
            "by the laxity with which children treat academic work nowadays")),


        Questions( objective = Objective(
            "38",
            section4,
            "",
            "",
            "In order to keep the peace I had to ",
            "A. alter",
            "B. refine",
            "C. withdraw",
            "D. deny",
            "C. withdraw",
            "C",
            "retract ",
            "my statement")),



        Questions( objective = Objective(
            "39",
            section4,
            "",
            "",
            "Their father is so ",
            "A. intelligent",
            "B. watchful",
            "C. rigid",
            "D. concerned",
            "B. watchful",
            "B",
            "vigilant ",
            "that it is not possible for his children to play truant")),




        Questions( objective = Objective(
            "40",
            section4,
            "",
            "",
            "The principal ",
            "A. corrected",
            "B. checked",
            "C. reviewed",
            "D. approved",
            "D. approved",
            "D",
            "endorsed ",
            "my traveling documents without delay.")),


        Questions( objective = Objective(
            "41",
            section5,
            "",
            "",
            "Please, run ...... fifty copies of this report for me",
            "A. off",
            "B. on",
            "C. over",
            "D. out",
            "D. out", "D")),


        Questions( objective = Objective(
            "42",
            section5,
            "",
            "",
            "My father's seventieth birthday ........... a celebration.",
            "A. is called for",
            "B. will be called for",
            "C. calls for",
            "D. call for",
            "C. calls for", "C")),


        Questions( objective = Objective(
            "43",
            section5,
            "",
            "",
            "Kojo succeeded in passing his examination ................. the odds he faced",
            "A. regardless",
            "B. despite",
            "C. moreover",
            "D. however",
            "B. despite", "B")),


        Questions( objective = Objective(
            "44",
            section5,
            "",
            "",
            "If the police had not intervened quickly, the suspected thief .......... by the mob.",
            "A. would have been killed",
            "B. would be killed",
            "C. will have been killed",
            "D. will be killed",
            "A. would have been killed", "A")),





        Questions( objective = Objective(
            "45",
            section5,
            "",
            "",
            "Harry hates.............in suspense",
            "A. been kept",
            "B. keeping",
            "C. being kept",
            "D. have been kept",
            "C. being kept", "C")),

        Questions( objective = Objective(
            "46",
            section5,
            "",
            "",
            "We are not bound to believe all ............. He said",
            "A. what",
            "B. which",
            "C. these",
            "D. that",
            "D. that", "D")),


        Questions( objective = Objective(
            "47",
            section5,
            "",
            "",
            "Margaret forgot to buy ................. ",
            "A. a trousers",
            "B. one trousers",
            "C. a pair of trousers",
            "D. plenty trousers",
            "C. a pair of trousers", "C")),


        Questions( objective = Objective(
            "48",
            section5,
            "",
            "",
            "He was charged ........... stealing from the company's safe",
            "A. about",
            "B. in",
            "C. of",
            "D. with",
            "D. with", "D")),

        Questions( objective = Objective(
            "49",
            section5,
            "",
            "",
            "The teacher had hardly turned his back ........... the class became noisy",
            "A. than",
            "B. when",
            "C. then",
            "D. hence",
            "B. when", "B")),




        Questions( objective = Objective(
            "50",
            section5,
            "",
            "",
            "This hardened criminal was convicted ............. breaking into Danso's house",
            "A. with",
            "B. in",
            "C. of",
            "D. for",
            "C. of", "C")),



        Questions( objective = Objective(
            "51",
            section5,
            "",
            "",
            "This is Kunle's handwriting; there.....be no argument about it",
            "A. could",
            "B. couldn't",
            "C. can",
            "D. can't",
            "D. can't", "D")),



        Questions( objective = Objective(
            "52",
            section5,
            "",
            "",
            "In Matamina no one is .......... the law",
            "A. over",
            "B. within",
            "C. above",
            "D. outside",
            "C. above", "C")),





        Questions( objective = Objective(
            "53",
            section5,
            "",
            "",
            "Luckily, Frank arrived just .......... time to catch the plane",
            "A. by",
            "B. within",
            "C. to",
            "D. in",
            "D. in", "D")),




        Questions( objective = Objective(
            "54",
            section5,
            "",
            "",
            "Those boys will have to blame .......... for not listening to advice",
            "A. each other",
            "B. ourselves",
            "C. the other",
            "D. themselves",
            "D. themselves", "D")),




        Questions( objective = Objective(
            "55",
            section5,
            "",
            "",
            "This is not your book, it is ............. ",
            "A. Andrew",
            "B. Andrews",
            "C. Andrew's",
            "D. Andrews'",
            "B. Andrews", "B")),



        Questions( objective = Objective(
            "56",
            section5,
            "",
            "",
            "John said he had never ......... insulted in his life",
            "A. so been",
            "B. been so",
            "C. being so",
            "D. so being",
            "B. been so", "B")),




        Questions( objective = Objective(
            "57",
            section5,
            "",
            "",
            "I asked Penda to stand ........... for me since I could not attend the meeting",
            "A. on",
            "B. aside",
            "C. in",
            "D. by",
            "C. in", "C")),




            Questions( objective = Objective(
                "58",
                section5,
                "",
                "",
                "Femi, Tom is Aka's son .........?",
                "A. is he",
                "B. isn't it",
                "C. isn't he",
                "D. he is",
                "D. he is", "D")),




            Questions( objective = Objective(
                "59",
                section5,
                "",
                "",
                "You will help me lift this box ..........?",
                "A. won't you",
                "B. would you",
                "C. can you",
                "D. could you",
                "A. won't you", "A")),





            Questions( objective = Objective(
                "60",
                section5,
                "",
                "",
                "Sally assisted me in buying my ............. yesterday",
                "A. very first party dress",
                "B. first very party dress",
                "C. party very first dress",
                "D. party dress first very",
                "A. very first party dress", "A")),





            Questions( objective = Objective(
                "61",
                section5,
                "",
                "",
                "The cook had .......... oil and so could not prepare the soup",
                "A. little",
                "B. small",
                "C. some",
                "D. much",
                "A. little", "A")),




            Questions( objective = Objective(
                "62",
                section5,
                "",
                "",
                "we will have to set up a ............ panel to investigate this matter",
                "A. seven men",
                "B. seven-men",
                "C. seven man",
                "D. seven-man",
                "D. seven-man", "D")),




            Questions( objective = Objective(
                "63",
                section5,
                "",
                "",
                "The workers could not move the heavy stone .............. they tried",
                "A. how much",
                "B. as much",
                "C. no matter that",
                "D. however hard",
                "D. however hard", "D")),




            Questions( objective = Objective(
                "64",
                section5,
                "",
                "",
                "The friendly match will kick ........... at 4,00 p.m. today as scheduled",
                "A. up",
                "B. on",
                "C. of",
                "D. off",
                "D. off", "D")),





            Questions( objective = Objective(
                "65",
                section5,
                "",
                "",
                "The boys ......... football when the teacher entered the class",
                "A. are discussing",
                "B. were discussing",
                "C. will be discussing",
                "D. will discuss",
                "B. were discussing", "B")),




            Questions( objective = Objective(
                "66",
                section5,
                "",
                "",
                "Our teacher is ............ to make such a mistake",
                "A. too much intelligent",
                "B. intelligent too much",
                "C. much too intelligent",
                "D. too intelligent much",
                "C. much too intelligent", "C")),





            Questions( objective = Objective(
                "67",
                section5,
                "",
                "",
                "Some people find it difficult not to give ........... to temptation",
                "A. away",
                "B. over",
                "C. in",
                "D. off",
                "C. in", "C")),




            Questions( objective = Objective(
                "68",
                section5,
                "",
                "",
                "If your argument is not strong enough, you ........... your claim to your father's property",
                "A. had forfeited",
                "B. would forfeit",
                "C. will forfeit",
                "D. have forfeited",
                "C. will forfeit", "C")),




        Questions( objective = Objective(
                "69",
                section5,
                "",
                "",
                "While he was in prison he had ......... time to read a lot of books.",
                "A. ample",
                "B. real",
                "C. few",
                "D. most",
                "A. ample", "A")),




            Questions( objective = Objective(
                "70",
                section5,
                "",
                "",
                "Anyone who wants to succeed in any endeavour should ......... his lazy habits",
                "A. shake off",
                "B. shake down",
                "C. shake out",
                "D. shake in",
                "A. shake off", "A")),




            Questions( objective = Objective(
                "71",
                section5,
                "",
                "",
                "No sooner had they arrived ............. we left the hall",
                "A. than",
                "B. when",
                "C. so",
                "D. therefore",
                "A. than", "A")),




        Questions( objective = Objective(
                "72",
                section5,
                "",
                "",
                "Any good newspaper will cater for the needs of the ........... public",
                "A. reader",
                "B. readers",
                "C. reading",
                "D. readable",
                "C. reading", "C")),




            Questions( objective = Objective(
                "73",
                section5,
                "",
                "",
                "The little boy found it difficult to keep peace .......... his father",
                "A. against",
                "B. by",
                "C. with",
                "D. over",
                "C. with", "C")),





            Questions( objective = Objective(
                "74",
                section6,
                "",
                "",
                passageA2012,
                "A. newsagent",
                "B. newsstand",
                "C. newsletter",
                "D. newscast",
                "B. newsstand", "B")),




            Questions( objective = Objective(
                "75",
                section6,
                "",
                "",
                passageA2012,
                "A. vendor",
                "B. hawker",
                "C. trader",
                "D. merchant",
                "A. vendor", "A")),






            Questions( objective = Objective(
                "76",
                section6,
                "",
                "",
                passageA2012,
                "A. reprints",
                "B. impressions",
                "C. units",
                "D. editions",
                "D. editions", "D")),






            Questions( objective = Objective(
                "77",
                section6,
                "",
                "",
                passageA2012,
                "A. mastheads",
                "B. names",
                "C. index",
                "D. title",
                "A. mastheads", "A")),




            Questions( objective = Objective(
                "78",
                section6,
                "",
                "",
                passageA2012,
                "A. topics",
                "B. timelines",
                "C. headlines",
                "D. layouts",
                "C. headlines", "C")),






            Questions( objective = Objective(
                "79",
                section6,
                "",
                "",
                passageA2012,
                "A. copies",
                "B. subscripts",
                "C. documents",
                "D. captions",
                "D. captions", "D")),




            Questions( objective = Objective(
                "80",
                section6,
                "",
                "",
                passageA2012,
                "A. extracts",
                "B. columns",
                "C. corners",
                "D. sections",
                "B. columns", "B")),







            Questions( objective = Objective(
                "81",
                section6,
                "",
                "",
                passageA2012,
                "A. features",
                "B. publications",
                "C. editorials",
                "D. serials",
                "C. editorials", "C")),




            Questions( objective = Objective(
                "82",
                section6,
                "",
                "",
                passageA2012,
                "A. articles",
                "B. works",
                "C. entries",
                "D. writings",
                "A. articles", "A")),







            Questions( objective = Objective(
                "83",
                section6,
                "",
                "",
                passageA2012,
                "A. amateur",
                "B. lay",
                "C. freelance",
                "D. carefree",
                "C. freelance", "C")),





            Questions( objective = Objective(
                "84",
                section6,
                "",
                "",
                passageA2012,
                "A. obituaries",
                "B. dirges",
                "C. pictures",
                "D. entries",
                "A. obituaries", "A")),





            Questions( objective = Objective(
                "85",
                section6,
                "",
                "",
                passageA2012,
                "A. football",
                "B. games",
                "C. recreation",
                "D. sports",
                "D. sports", "D")),






            Questions( objective = Objective(
                "86",
                section6,
                "",
                "",
                passageB2012,
                "A. resistance",
                "B. reaction",
                "C. opposition",
                "D. energy",
                "A. resistance", "A")),




            Questions( objective = Objective(
                "87",
                section6,
                "",
                "",
                passageB2012,
                "A. operator",
                "B. technician",
                "C. nurse",
                "D. aide",
                "B. technician", "B")),






            Questions( objective = Objective(
                "88",
                section6,
                "",
                "",
                passageB2012,
                "A. sample",
                "B. type",
                "C. group",
                "D. portion",
                "A. sample", "A")),







            Questions( objective = Objective(
                "89",
                section6,
                "",
                "",
                passageB2012,
                "A. maintain",
                "B. give",
                "C. carry",
                "D. deliver",
                "C. carry", "C")),





            Questions( objective = Objective(
                "90",
                section6,
                "",
                "",
                passageB2012,
                "A. circumstances",
                "B. position",
                "C. steps",
                "D. stages",
                "D. stages", "D")),






            Questions( objective = Objective(
                "91",
                section6,
                "",
                "",
                passageB2012,
                "A. itching",
                "B. enlargement",
                "C. inflammation",
                "D. growth",
                "C. inflammation", "C")),






            Questions( objective = Objective(
                "92",
                section6,
                "",
                "",
                passageB2012,
                "A. telescope",
                "B. endoscope",
                "C. stethoscope",
                "D. microscope",
                "A. telescope", "A")),






            Questions( objective = Objective(
                "93",
                section6,
                "",
                "",
                passageB2012,
                "A. organisms",
                "B. fungi",
                "C. vermin",
                "D. pests",
                "A. organisms", "A")),







            Questions( objective = Objective(
                "94",
                section6,
                "",
                "",
                passageB2012,
                "A. pervasive",
                "B. contagious",
                "C. dreadful",
                "D. potent",
                "B. contagious", "B")),






            Questions( objective = Objective(
                "95",
                section6,
                "",
                "",
                passageB2012,
                "A. hygiene",
                "B. upkeep",
                "C. living",
                "D. health",
                "A. hygiene", "A")),






            Questions( objective = Objective(
                "96",
                section6,
                "",
                "",
                passageB2012,
                "A. sterilizing",
                "B. washing",
                "C. cooking",
                "D. drying",
                "B. washing", "B")),






            Questions( objective = Objective(
                "97",
                section6,
                "",
                "",
                passageB2012,
                "A. concoction",
                "B. recommendation",
                "C. description",
                "D. prescription",
                "D. prescription", "D")),






            Questions( objective = Objective(
                "98",
                section6,
                "",
                "",
                passageB2012,
                "A. pharmacist",
                "B. scientist",
                "C. practitioner",
                "D. nurse",
                "A. pharmacist", "A")),







            Questions( objective = Objective(
                "99",
                section6,
                "",
                "",
                passageB2012,
                "A. revive",
                "B. restore",
                "C. repair",
                "D. cure",
                "B. restore", "B")),





            Questions( objective = Objective(
                "100",
                section6,
                "",
                "",
                passageB2012,
                "A. standard",
                "B. state",
                "C. health",
                "D. position",
                "C. health", "C")),

            )
}