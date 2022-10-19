package com.example.repository.english

import com.example.repository.Objective
import com.example.repository.Questions

class English2014Repo {

    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    private val passageA2014 = "Let us discuss briefly one of the common means of modern transportation- the motor car. The car is a vehicle on four wheels. It is powered by - 71- that runs on petrol, although there are a few that run on diesel or gas. Most cars can attain speeds of more than 120 kilometres an hour, though you don't have to move your car that fast, especially if you are-72-on minor-73.\n" +
            "\n" +
            "A car is manned by a driver who sits in front, beside a passenger and up to three persons can sit at the rear. To determine where the car turns, the driver turns the steering-74-to the left or the right. To move the car forward, the driver engages the-75- and presses the- 76-which some people also call the throttle. The harder you press this, the faster the car moves. In manually operated cars, to change the -77- of acceleration, you have to change the gear by first pressing the-78-and then shifting the gear-79-from the first to the second, then to the third and then the fourth. All these require a lot of -80- and practice. To stop the car or reduce its speed, you have to apply the brakes.\n"

    val english2014 = listOf<Questions>(

        Questions( objective = Objective(
            "1",
            section1,
            "",
            "",
            "Many parents assume that their children are ",
            "A. enthusiastic",
            "B. hardworking",
            "C. brilliant",
            "D. knowledgeable",
            "D. knowledgeable",
            "D",
            "ignorant ",
            "whereas they are ........ ")
        ),


        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "",
            "A. indolent",
            "B. dishonest",
            "C. inactive",
            "D. sluggish",
            "A. indolent",
            "A",
            "Industrious",
            " workers should be promoted and ......... ones should be dismissed.")),

        Questions( objective = Objective(
                "3",
                section1,
                "",
                "",
                "While some people ……........ jollof rice, others",
                "A. rebuff",
                "B. abhor",
                "C. ignore",
                "D. condemn",
                "B. abhor",
            "B",
                " enjoy",
                " it.")),


            Questions( objective = Objective(
                "4",
                section1,
                "",
                "",
                "The ",
                "A. friendly",
                "B. carefree",
                "C. timid",
                "D. humble",
                "D. humble",
                "D",
                "haughty,",
                "and not the ....... are usually unpopular.")),



            Questions( objective = Objective(
                "5",
                section1,
                "",
                "",
                "Rather than ",
                "A. defied",
                "B. countered",
                "C. ignored",
                "D. spurned",
                "C. ignored",
                "C",
                "heed ",
                "advice, the children ........... it")),




            Questions( objective = Objective(
                "6",
                section1,
                "",
                "",
                "Dishonest traders sell ",
                "A. costly",
                "B. durable",
                "C. genuine",
                "D. perfect",
                "C. genuine",
                "C",
                "fake ",
                "products instead of ........... ones.")),



            Questions( objective = Objective(
                "7",
                section1,
                "",
                "",
                "The judge expected ",
                "A. illusive",
                "B. secretive",
                "C. delusive",
                "D. evasive",
                "D. evasive",
                "D",
                "direct ",
                "answers but the accused was .........")),


            Questions( objective = Objective(
                "8",
                section1,
                "",
                "",
                "Parents should ",
                "A. implore",
                "B. coerce",
                "C. enjoin",
                "D. cajole",
                "D. cajole",
                "D",
                "persuade",
                "their children to do chores, not .......... them. ")),



            Questions( objective = Objective(
                "9",
                section1,
                "",
                "",
                "Rather than ",
                "A. criticized",
                "B. refused",
                "C. addressed",
                "D. denied",
                "D. denied",
                "D",
                "accept ",
                "the blame, the manager ............ the accusation.")),




            Questions( objective = Objective(
                "10",
                section1,
                "",
                "",
                "It is often easier to ",
                "A. complete",
                "B. suppress",
                "C. quench",
                "D. quell",
                "D. quell",
                "D",
                "start ",
                "a riot than to ......... it.")),


            Questions( objective = Objective(
                "11",
                section2,
                "",
                "",
                "The policy will .......... havoc on the economy of the nation.",
                "A. wreak",
                "B. promote",
                "C. produce",
                "D. wreck",
                "D. wreck", "D"
            )),


            Questions( objective = Objective(
                "12",
                section2,
                "",
                "",
                "The librarian has not entered the new books in the ……........",
                "A. list",
                "B. directory",
                "C. catalogue",
                "D. roster",
                "C. catalogue", "C"
            )),


            Questions( objective = Objective(
                "13",
                section2,
                "",
                "",
                "The judge ............ the case.",
                "A. cancelled",
                "B. dismissed",
                "C. rejected",
                "D. withdrew",
                "B. dismissed", "B"
            )),


            Questions( objective = Objective(
                "14",
                section2,
                "",
                "",
                "Mosquito parasites have become …...... to quinine.",
                "A. resistant",
                "B. immune",
                "C. opposed",
                "D. defiant",
                "B. immune", "B"
            )),

            Questions( objective = Objective(
                "15",
                section2,
                "",
                "",
                "The unionists .......... the meeting with the management.",
                "A. rejected",
                "B. hindered",
                "C. boycotted",
                "D. banned",
                "C. boycotted", "C"
            )),




            Questions( objective = Objective(
                "16",
                section2,
                "",
                "",
                "The company failed to pay up the loan because it had become ..........",
                "A. corrupt",
                "B. bankrupt",
                "C. inefficient",
                "D. unreliable",
                "B. bankrupt", "B"
            )),



            Questions( objective = Objective(
                "17",
                section2,
                "",
                "",
                "The newly elected chairman has been ............ into office.",
                "A. sworn",
                "B. installed",
                "C. admitted",
                "D. inaugurated",
                "D. inaugurated", "D"
            )),



            Questions( objective = Objective(
                "18",
                section2,
                "",
                "",
                "The doctor declared that the sick child needed a blood............",
                "A. transformation",
                "B. transfer",
                "C. transmission",
                "D. transfusion",
                "D. transfusion", "D"
            )),



            Questions( objective = Objective(
                "19",
                section2,
                "",
                "",
                "Many slaves were ......... in the 19th century.",
                "A. released",
                "B. empowered",
                "C. emancipated",
                "D. relieved",
                "A. released", "A",
            )),


            Questions( objective = Objective(
                "20",
                section2,
                "",
                "",
                "The proprietor has promised to ......... the dilapidated classroom blocks.",
                "A. erect",
                "B. renovate",
                "C. patch",
                "D. fabricate",
                "B. renovate", "B",
            )),

            Questions( objective = Objective(
                "21",
                section3,
                "",
                "",
                "We heard that Bada has served time. This means that Bada has",
                "A. always been punctual",
                "B. been the time keeper",
                "C. been to prison",
                "D. been a faithful servant",
                "C. been to prison", "C"

                )),

            Questions( objective = Objective(
                "22",
                section3,
                "",
                "",
                "Mary and I have never seen eye to eye on politics. This means that we have never",
                "A. agreed on politics",
                "B. engaged in politics",
                "C. discussed politics",
                "D. benefited from politics",
                "C. discussed politics", "C"
            )),

            Questions( objective = Objective(
                "23",
                section3,
                "",
                "",
                "Helen has always been a wet blanket. This means that Helen",
                "A. always gets wet",
                "B. betrays her friends",
                "C. interacts freely with other people",
                "D. stops others from enjoying themselves",
                "B. betrays her friends", "B"
            )),

            Questions( objective = Objective(
                "24",
                section3,
                "",
                "",
                "The new policy has come under fire. This means that the policy is",
                "A. generating controversy",
                "B. being criticized",
                "C. being scrutinized",
                "D. causing a riot",
                "B. being criticized", "B"
            )),


            Questions( objective = Objective(
                "25",
                section3,
                "",
                "",
                "Please don't let them get under your skin. This means that you should not let them",
                "A. infect you",
                "B. defeat you",
                "C. bully you",
                "D. annoy you",
                "D. annoy you", "D"
            )),


            Questions( objective = Objective(
                "26",
                section3,
                "",
                "",
                "We were surprised to learn that Tom had been let off the hook. This means that Tom had",
                "A. not been punished",
                "B. gone fishing alone",
                "C. been sent away",
                "D. not been dismissed",
                "A. not been punished", "A"
            )),

            Questions( objective = Objective(
                "27",
                section3,
                "",
                "",
                "He is at the crossroads of his life. This means that it is time for him to",
                "A. make a very important decision",
                "B. retrace his steps",
                "C. make peace with everyone",
                "D. take his studies seriously",
                "A. make a very important decision", "A"
            )),


            Questions( objective = Objective(
                "28",
                section3,
                "",
                "",
                "We shall understand her better by and by. This means that we shall know her better",
                "A. without her knowing it",
                "B. much later",
                "C. before long",
                "D. by spending time with her",
                "D. by spending time with her", "D"
            )),

            Questions( objective = Objective(
                "29",
                section3,
                "",
                "",
                "The student's story did not ring true. This means that the student's story was",
                "A. not audible",
                "B. not believable",
                "C. full of suspense",
                "D. quite thrilling",
                "B. not believable", "B"
            )),

            Questions( objective = Objective(
                "30",
                section3,
                "",
                "",
                "Mathematics is a closed book to me. This means that I",
                "A. do not have to study Mathematics",
                "B. do not understand Mathematics",
                "C. have never passed Mathematics",
                "D. cannot avoid studying Mathematics",
                "B. do not understand Mathematics", "B"
            )),

            Questions( objective = Objective(
                "31",
                section4,
                "",
                "",
                "I think children are more ",
                "A. healthy and strong",
                "B. pleasant and cheerful",
                "C. vital and dependable",
                "D. plump and curvy",
                "A. healthy and strong",
                "A",
                "robust ",
                "than adults.", )),

            Questions( objective = Objective(
                "32",
                section4,
                "",
                "",
                "The new law was meant to ",
                "A. restrain",
                "B. moderate",
                "C. stop",
                "D. alleviate",
                "D. alleviate",
                "D",
                "mitigate ",
                "the people's suffering.")),


        Questions( objective = Objective(
            "33",
            section4,
            "",
            "",
            "The judge is ",
            "A. consistent",
            "B. honest",
            "C. responsible",
            "D. outspoken",
            "B. honest",
            "B",
            "incorruptible")),


        Questions( objective = Objective(
                "34",
                section4,
                "",
                "",
                "Whatever my boss decides is ",
                "A. final",
                "B. true",
                "C. necessary",
                "D. enforced",
                "A. final",
            "A",
                "irrevocable")),



            Questions( objective = Objective(
                "35",
                section4,
                "",
                "",
                "The printer took a",
                "A. quick",
                "B. long",
                "C. puzzled",
                "D. careful",
                "A. quick",
                "A",
                "cursory ",
                "look at the document.")),


            Questions( objective = Objective(
                "36",
                section4,
                "",
                "",
                "This morning, Audu arrived at the school looking ",
                "A. worried",
                "B. terrified",
                "C. untidy",
                "D. confused",
                "C. untidy",
                "C",
                "dishevelled")),


            Questions( objective = Objective(
                "37",
                section4,
                "",
                "",
                "Corporal punishment is meant to be a",
                "A. remedy",
                "B. measure",
                "C. discouragement",
                "D. prevention",
                "B. measure",
                "B",
                "deterrent ",
                "to indiscipline")),


            Questions( objective = Objective(
                "38",
                section4,
                "",
                "",
                "The new bank is",
                "A. evolving",
                "B. attractive",
                "C. flourishing",
                "D. supportive",
                "C. flourishing",
                "C",
                "thriving")),


            Questions( objective = Objective(
                "39",
                section4,
                "",
                "",
                "It is not safe to engage in ",
                "A. secret",
                "B. exclusive",
                "C. unimportant",
                "D. doubtful",
                "A. secret",
                "A",
                "clandestine ",
                "deals.")),



            Questions( objective = Objective(
                "40",
                section4,
                "",
                "",
                "Bola",
                "A. strongly",
                "B. fearlessly",
                "C. openly",
                "D. strictly",
                "A. strongly",
                "A",
                "vehemently ",
                "denied stealing the money.")),


            Questions( objective = Objective(
                "41",
                section5,
                "",
                "",
                "It's been smooth so far ............. ?",
                "A. hadn't it",
                "B. wasn't it",
                "C. isn't it",
                "D. hasn't it",
                "D. hasn't it", "D"
            )),

            Questions( objective = Objective(
                "42",
                section5,
                "",
                "",
                "The test seemed .......... simple that we thought we would all pass.",
                "A. too",
                "B. very",
                "C. so",
                "D. much",
                "B. very", "B"
            )),

            Questions( objective = Objective(
                "43",
                section5,
                "",
                "",
                "Good citizens are expected to abide ........ the stipulated laws.",
                "A. with",
                "B. in",
                "C. to",
                "D. by",
                "D. by", "D"
            )),


            Questions( objective = Objective(
                "44",
                section5,
                "",
                "",
                "In the olden days, people gave cowries ........... food.",
                "A. on exchange for",
                "B. in exchange of",
                "C. in exchange for",
                "D. on exchange with",
                "C. in exchange for", "C"
            )),


            Questions( objective = Objective(
                "45",
                section5,
                "",
                "",
                "The man tried to cash in ........ the boy's ignorance.",
                "A. by",
                "B. at",
                "C. on",
                "D. with",
                "C. on", "C"
            )),

            Questions( objective = Objective(
                "46",
                section5,
                "",
                "",
                "Adamu studied very hard ........ passing the examination.",
                "A. with a view to",
                "B. with the view of",
                "C. with a view of",
                "D. with the view to",
                "B. with the view of", "B"
            )),


            Questions( objective = Objective(
                "47",
                section5,
                "",
                "",
                "No sooner had the judge read the verdict ......... pandemonium broke out.",
                "A. than",
                "B. when",
                "C. and",
                "D. then",
                "A. than", "A"
            )),


            Questions( objective = Objective(
                "48",
                section5,
                "",
                "",
                "I could not distinguish the original ......... the fake.",
                "A. from",
                "B. to",
                "C. by",
                "D. with",
                "A. from", "A"
            )),





            Questions( objective = Objective(
                "49",
                section5,
                "",
                "",
                "When I came home, my mother asked me if I ............",
                "A. ate",
                "B. was eating",
                "C. have eaten",
                "D. had eaten",
                "D. had eaten", "D"
            )),


            Questions( objective = Objective(
                "50",
                section5,
                "",
                "",
                "Uncle Richard invited Naza and ............ to his house.",
                "A. me",
                "B. I",
                "C. myself",
                "D. she",
                "A. me", "A"
            )),



            Questions( objective = Objective(
                "51",
                section5,
                "",
                "",
                "My sister prides herself .......... her cooking.",
                "A. on",
                "B. for",
                "C. over",
                "D. in",
                "A. on", "A"
            )),

            Questions( objective = Objective(
                "52",
                section5,
                "",
                "",
                "I suppose it's high time we .......... attention to our studies.",
                "A. pay",
                "B. are paying",
                "C. paid",
                "D. should pay",
                "C. paid", "C"
            )),


            Questions( objective = Objective(
                "53",
                section5,
                "",
                "",
                "We were expecting them in the evening but they arrived ........... dawn.",
                "A. on",
                "B. at",
                "C. in",
                "D. for",
                "B. at", "B"
            )),





            Questions( objective = Objective(
                "54",
                section5,
                "",
                "",
                "Children often try to live up ........ their parents' expectations.",
                "A. in",
                "B. by",
                "C. to",
                "D. on",
                "C. to", "C"
            )),



            Questions( objective = Objective(
                "55",
                section5,
                "",
                "",
                "He ........ be fat, but he is still smart.",
                "A. may",
                "B. could",
                "C. can",
                "D. might",
                "A. may", "A"
            )),



            Questions( objective = Objective(
                "56",
                section5,
                "",
                "",
                "The students had no choice ........... to do as they had been commanded.",
                "A. even",
                "B. but",
                "C. rather",
                "D. ony",
                "C. rather", "C"
            )),


            Questions( objective = Objective(
                "57",
                section5,
                "",
                "",
                "The dog was run........ by a careless driver.",
                "A. under",
                "B. upon",
                "C. across",
                "D. over",
                "D. over", "D"
            )),


            Questions( objective = Objective(
                "58",
                section5,
                "",
                "",
                "When will the strike be ...........?",
                "A. called off",
                "B. called back",
                "C. called out",
                "D. called over",
                "A. called off", "A"
            )),


            Questions( objective = Objective(
                "59",
                section5,
                "",
                "",
                "I received an award ....... my outstanding performance in the debate.",
                "A. for",
                "B. through",
                "C. in",
                "D. over",
                "A. for", "A"
            )),





            Questions( objective = Objective(
                "60",
                section5,
                "",
                "",
                "The earlier we leave, ......... for us.",
                "A. the best",
                "B. the much better",
                "C. the better",
                "D. it is better",
                "C. the better", "C"
            )),



            Questions( objective = Objective(
                "61",
                section5,
                "",
                "",
                "I just couldn't .......... what he was saying.",
                "A. make do",
                "B. make out",
                "C. make up",
                "D. make by",
                "C. make up", "C"
            )),

            Questions( objective = Objective(
                "62",
                section5,
                "",
                "",
                "The men were charged ......... murder.",
                "A. of",
                "B. for",
                "C. with",
                "D. on",
                "B. for", "B",
            )),


            Questions( objective = Objective(
                "63",
                section5,
                "",
                "",
                "It is I who ......... to blame for the lapses.",
                "A. was",
                "B. am",
                "C. is",
                "D. are",
                "C. is", "C"
            )),

            Questions( objective = Objective(
                "64",
                section5,
                "",
                "",
                "We had to look ........ the word in the dictionary.",
                "A. with",
                "B. on",
                "C. at",
                "D. up",
                "D. up", "D"
            )),


            Questions( objective = Objective(
                "65",
                section5,
                "",
                "",
                "Each of the winners ........ to receive five thousand dollars.",
                "A. are",
                "B. is",
                "C. have",
                "D. were",
                "B. is", "B"
            )),



            Questions( objective = Objective(
                "66",
                section5,
                "",
                "",
                "Everyone was happy when the two friends made....... after their disagreement.",
                "A. off",
                "B. do",
                "C. away",
                "D. up",
                "D. up", "D")),

            Questions( objective = Objective(
                "67",
                section5,
                "",
                "",
                "It is rude to cut ......... when people are talking.",
                "A. in",
                "B. through",
                "C. off",
                "D. from",
                "A. in", "A"
            )),


            Questions( objective = Objective(
                "68",
                section5,
                "",
                "",
                "I............. a song when I got my letter of promotion.",
                "A. broke into",
                "B. broke out",
                "C. broke for",
                "D. broke in",
                "A. broke into", "A"
            )),


            Questions( objective = Objective(
                "69",
                section5,
                "",
                "",
                "Our tour of the tower came to an end all ……..... soon.",
                "A. much",
                "B. rather",
                "C. too",
                "D. more",
                "C. too", "C"
            )),


            Questions( objective = Objective(
                "70",
                section5,
                "",
                "",
                "The ....... of the various dailies attended the conference.",
                "A. Editors-in-Chiefs",
                "B. Editors'-in-Chief",
                "C. Editors-in-Chief",
                "D. Editor's-in-Cheif",
                "C. Editors-in-Chief", "C"
            )),

            Questions( objective = Objective(
                "71",
                section6,
                "",
                "",
                passageA2014,
                "A. a device",
                "B. an appliance",
                "C. a machine",
                "D. an engine",
                "D. an engine", "D"
            )),


            Questions( objective = Objective(
                "72",
                section6,
                "",
                "",
                passageA2014,
                "A. cruising",
                "B. speeding",
                "C. driving",
                "D. racing",
                "A. cruising", "A"
            )),



            Questions( objective = Objective(
                "73",
                section6,
                "",
                "",
                passageA2014,
                "A. tracks",
                "B. channels",
                "C. roads",
                "D. paths",
                "C. roads", "C"
            )),



            Questions( objective = Objective(
                "74",
                section6,
                "",
                "",
                passageA2014,
                "A. bar",
                "B. wheel",
                "C. gear",
                "D. rod",
                "B. wheel", "B"
            )),



            Questions( objective = Objective(
                "75",
                section6,
                "",
                "",
                passageA2014,
                "A. gear ",
                "B. shaft",
                "C. knob",
                "D. button",
                "A. gear ", "A"
            )),



            Questions( objective = Objective(
                "76",
                section6,
                "",
                "",
                passageA2014,
                "A. carburettor",
                "B. generator",
                "C. aerator",
                "D. accelerator",
                "D. accelerator", "D"
            )),



            Questions( objective = Objective(
                "77",
                section6,
                "",
                "",
                passageA2014,
                "A. pace ",
                "B. flow",
                "C. speed",
                "D. rate",
                "C. speed", "C"
            )),

            Questions( objective = Objective(
                "78",
                section6,
                "",
                "",
                passageA2014,
                "A. throttle",
                "B. clutch",
                "C. brake",
                "D. axle",
                "B. clutch", "B"
            )),


            Questions( objective = Objective(
                "79",
                section6,
                "",
                "",
                passageA2014,
                "A. switch",
                "B. boy",
                "C. handle",
                "D. lever",
                "C. handle", "C"
            )),


            Questions( objective = Objective(
                "80",
                section6,
                "",
                "",
                passageA2014,
                "A. training",
                "B. thinking",
                "C. coaching",
                "D. tuition",
                "A. training", "A"
            )),




            )

}