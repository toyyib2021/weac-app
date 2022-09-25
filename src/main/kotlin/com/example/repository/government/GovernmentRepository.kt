package com.example.repository.government

import com.example.repository.Objective
import com.example.repository.Questions
import com.example.repository.Theory

class GovernmentRepository {

    private val government2012 = listOf<Questions>(
        Questions( objective = Objective("1", "", "", "",
                "The study of government is important because it",
                "A. directs people's attention to development of non-state institutions",
                "B. enables citizens to understand the processes for managing state affairs",
                "C. encourages individuals to take decisions that satisfy their aspirations",
                "D. encourages the elite to remain in power",
                "B. enables citizens to understand the processes for managing state affairs"
            ),
            theory = Theory(
                "1", "", "", "",
                "Highlight six characteristics of a democratic government.",
                answer =
                """
                        (i) There should be majority rule.
                        (ii) Tolerance of opposition.
                        (iii) Protection of minority interests.
                        (iv) Provision for and guaranteeing of Fundamental Human Rights.
                        (v) Respect for the Rule of Law.
                        (vi) Independence of the Judiciary.
                    """.trimIndent()
            )

        ),
        Questions(
            objective = Objective(
                "2", "", "", "",
                "A system of government where political powers are inherited is called",
                "A. monarchy",
                "B. diarchy",
                "C. democracy",
                "D. aristocracy",
                "A. monarchy"
            ),
            theory = Theory(
                "2", "", "", "",
                question =
                """
                   (a) What is independence of the judiciary?
                   (b) State three reasons for the independence of the judiciary
                   
                """.trimIndent(),
                answer = """
                    (a) 
                    Judicial independence is the freedom of the judiciary to administer justice without any interference or influence from either the legislature or executive.

                    (b) 
                    (i) To serve as independent arbiter for the interpretation of the constitution and other laws.
                    (ii) To prevent abuse of power by government functionaries.
                    (iii) To promote strict observance of the rule of Law.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(
                "3", "", "", "",
                "Democracy can be promoted through",
                "A. genymandering",
                "B. slander",
                "C. accountability",
                "D. lobbying",
                "C. accountability",
            ),
            theory = Theory(
                "3", "", "", "",
                question = "Give three functions and three limitations of the legislature.",
                answer = """
                    Functions
                    (i) Impeachment De public officers/passing a vote of no confidence.
                    (ii) Discussion of national issues.
                    (iii) Ratification of treaties an: external agreements.
                    (iv) Investigatory/Oversight functions.
                    
                    Limitations
                    (i) The mass media/Public opinion
                    (ii) International organization.
                    (iii) Time/Period limitation.
                    (iv) The Mace limits the activities of the legislature.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(
                "4", "", "", "",
                "The ability to command obedience is called",
                "A. authority",
                "B. influence",
                "C. legitimacy",
                "D. mobilization",
                "A. authority"
            ),
            theory = Theory(
                "4", "", "", "",
                question = "Identify six merits of pressure groups in a democratic state",
                answer = """
                    (i) Assist in policy formulation and implementation.
                    (ii) Provide educational programmes seminar, lectures, debates, etc.
                    (iii) Conduct research useful for the administration of the state on technical issues.
                    (iv) Serve as link between the people and the government.
                    (v) Serve as yardstick for measuring the popularity of government policies.
                    (vi) Assist in championing the cause of the under privileged in the country.
                """.trimIndent()
            )

        ),
        Questions(
            objective = Objective(
                "5", "", "", "",
                "Legitimacy is determined mainly by",
                "A. charisma",
                "B. influence",
                "C. acceptance",
                "D. desire",
                "C. acceptance"
            ),
            theory = Theory(
                "5", "", "", "",
                question = """
                    (a) What is civil service?
                    (b) Explain the structure of the civil service.
                """.trimIndent(),
                answer = """
                    (a) 
                    The Civil Service is the administrative arm of the executive organ of government responsible for formulating and executing government policies.

                    (b)
                    (i)Administrative class: They advice the minister on policy matters.
                    (ii) Professional class: The offer professional/technical advice to the management on technical matters.
                    (iii) Executive class: They are responsible for implementation of government policies.
                    (iv) Clerical class: They carry out clerical duties in the ministry.
                    (v) Auxiliary/Manipulative class: They comprise of carpenters, cleaners, etc.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(
                "6", "", "", "",
                "Which of the following is a feature of democracy?",
                "A. Majority rule",
                "B. Election by selected adults",
                "C. Quick decision making",
                "D. Rule by wealth men",
                "A. Majority rule"
            ),
            theory = Theory(
                "6", "", "", "",
                question = "Identify any six features of the igbo traditional societies.",
                answer = """
                    (i) The family heads played important role in the administration of the village.
                    (ii) Title holders (Ozo title) played significant role in the traditional political system.
                    (iii) Decisions were reached by consensus.
                    (iv) Succession to leadership/coming into prominence was based on personal achievements.
                    (v) Political significance of deities in providing bonds of unity.
                    (vi) There was the existence of Council of Elders (Ama-ala) presided over by the eldest son in the village.
                    (vii) The market square served as the village assembly chambers.
                    (viii) The women (Umuada), composed of the first daughter of each family, constituted a socio-political group.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective("7", "", "", "",
                "Which of the following is a source of political power?",
                "A. Gerrymandering",
                "B. Election",
                "C. filibuster",
                "D. Immunity",
                "B. Election"
            ),
            theory = Theory(
                "7", "", "", "",
                question = """
                    (a) Define nationalism.
                    (b) state any five external factors that aided the growth of nationalism in West Africa.
                """.trimIndent(),
                answer = """
                    (a) 
                    Nationalism can be defined as a strong feeling of national consciousness and love for one's country to handle its own affairs devoid of foreign control and domination.

                    (b)
                    (i)Atlantic Charter: The 1941 Atlantic Charter emphasized the right to self-determination by all the peoples of the world.
                    (ii) Influence of African Americans like Dr. William Du Bois and Marcus Garvey. They supported decolonization of Africa.
                    (iii) The establishment of the United Nations Organization stimulated nationalist movements due to its stance on colonialism and Human Rights.
                    (iv) Independence of India in 1947 inspired West African Nationalists in the struggle to stamp out colonialism.
                    (v) British Labour Party supported self-rule for the colonized territories.
                    (vi) The Activities of the West African Student's Union (W.A.S.U) in Britain and the U.S.A.
                    (vii) The role played by the US and the former USSR in the decolonization agitation.
                    (viii) The defeat of Britain by Japan.
                """.trimIndent()
            )

        ),
        Questions(
            objective = Objective("8", "", "", "",
                "Laws made by the non-legislative bodies are called",
                "A. judiciary review",
                "B. delegated legislation",
                "C. criminal laws",
                "D. case law",
                "B. delegated legislation"
            ),
            theory = Theory(
                "8", "", "", "",
                question = "Identify any four features of the policy of indirect rule in West Africa.",
                answer = """
                    (i) Recognition and use of some traditional rulers/Emirs.
                    (ii) Warrant chiefs were appointed in Igboland.
                    (iii) The use of native laws and customs.
                    (iv) Resident officers/provincial commissioners were appointed to administer the provinces.
                    (v) District commissioners were appointed to administer the districts.
                    (vi) Native courts administered traditional laws.
                """.trimIndent()
            )
        ),
        Questions(objective = Objective("9", "", "", "",
            "Delegated legislation is unpopular because it",
            "A. quickens the lawmaking process",
            "B. receives wide publicity",
            "C. is not made by the legislature",
            "D. calters for emergency situations",
            "C. is not made by the legislature"
        ),
            theory = Theory(
                "9", "", "", "",
                question = "Identify six features  of the macpherson constitution of 1951",
                answer = """
                    (i) Council of Ministers was constituted and charged with the responsibility of executing policies.
                    (ii) Supremacy of the central legislature over regional legislature.
                    (iii) Increase in the membership of the central legislature.
                    (iv) It provided for a central legislature and executive council for the country.
                    (v) It provided for an Executive made up of 18 members.
                    (vi) Each region was also provided with regional Executive Council.
                    (vii) It also provided for a regional legislative council for each region.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective("10", "", "", "",
                "Political socialization begins from",
                "A. adulthood",
                "B. childhood",
                "C. old age",
                "D. manhood",
                "B. childhood"),
            theory = Theory(
                "10", "", "", "",
                question = """
                    (a) Describe the formation of the Nigeria National Alliance (NNA) of 1964
                    (b) Highlight five achievements of the alliance
                """.trimIndent(),
                answer = """
                    (a)
                    (i) NNA was formed on August 20, 1964 to contest the general elections of that year.
                    (ii) The political parties that joined to form the Alliance included: NPC, NNDP, Mid-Western Democratic Front (MDF), the Niger Delta Congress (NDC) and the Dynamic Party.
                    (iii) The Alliance was led by the Premier of Northern Region, Sir Ahmadu Bello.
                    (iv) NNA was formed to counter UPGA which was formed in June 1964.
                    
                    (b)
                    (i) It won more seats than the UPGA in the 1964 elections.
                    (ii) The Alliance formed the government at federal level after the 1964 general elections.
                    (iii) It also participated in the Western Regional election of 1965 through Akintola-led Nigeria National Democratic Party (NNDP).
                    (iv) It formed a national government in 1964.
                    (v) It participated in the northern general elections of 1965 through NPC.
                    (vi) It formed the government of Western Region in 1965.
                    (vii) It formed the government of Northern Region in 1965.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective("11", "", "", "",
                "A. V. Dicey popularized the principle of",
                "A. rule of law",
                "B. democracy",
                "C. political culture",
                "D. separation of powers",
                "A. rule of law"
            ),
            theory = Theory(
                "11", "", "", "",
                question = "Identify any six factors affecting Nigeria foreign policy. ",
                answer = """
                    (i) History: Nigeria has a strong link with Britain and some western European powers due to her colonial experience.
                    (ii) Geography: The location of Nigeria in West Africa determines her relationship with other countries.
                    (iii) Population: Nigeria is a diverse country with large population and this affects her foreign policy.
                    (iv) National Interest: Security of lives, territorial integrity and socio-economic developments as part of Nigeria national interest influence her foreign policy.
                    (v) Natural resources: Nigeria has one of the largest concentration of natural resources in the world. This greatly influences her foreign policy.
                    (vi) Public opinion: The general views of the Nigerian people are often considered in her foreign policy objectives.

                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective("12", "", "", "",
                "Which of the following is the lowest in the hierarchy of feudal system?",
                "A. Kinights",
                "B. Serfs",
                "C. Nobles",
                "D. Lords",
                "B. Serfs"
            ),
            theory = Theory(
                "12", "", "", "",
                question = "Identify any six problems facing the Economic Community of West African states (ECOWAS)",
                answer = """
                    (i) Military intervention in politics - West Africa is still bedeviled by military coups. This is seen as a major problem to the community's quest for good and democratic governance.
                    (ii) Language barrier: Member states are polarized into English, French and Portuguese languages. This is seen as a barrier to the unity of the peoples of the sub-region.
                    (iii) Fear of domination: Some of the smaller nations have great feat that big nations in the community might dominate them. Hence, there is mutual suspicion among them.
                    (iv) Influence of foreign powers and ex-colonial masters. Members states depend on them economically.
                    (v) Differences in currency: Different currencies create barriers in the exchange of goods and services in the sub-region.
                    (vi) Communication problems: Lack of good road network, railway, etc are barriers to economic integration.
                    (vii) Economic migrants: Citizens of the economically disadvantaged states migrate to the economically advantaged ones.
                    (viii) Inter-state conflict: Inter-state boundary disputes often slow down unity and cooperation within the community.
                    (ix) Interference in the internal affairs of member states e.g. Senegal and The Gambia over the Cassamance region of Senegal.
                    (x) Inadequate fund due to non-payment of dues by some member states.
                    (xi) Low commitment of some political leaders to the ideals of ECOWAS.
                """.trimIndent()
            )
        ),

        Questions(objective = Objective("13", "", "", "",
            "The ratification of major executive decisions by the legislature is in line with the application of",
            "A. separation of powers",
            "B. rule of law",
            "C. checks and balances",
            "D. fusion of powers",
            "C. checks and balances",)
        ),
        Questions(objective = Objective("14", "", "", "",
            "In which of the following political systems is rule of law most enhanced?",
            "A. Cabinet system",
            "B. Feudal system",
            "C. Fascist system",
            "D. Communist system",
            "D. Communist system")
        ),


        Questions(objective = Objective("15", "", "", "",
            "A constitution is the",
            "A. written document of traditional practices",
            "B. functional aspect of government activities",
            "C. supreme document of the government",
            "D. fundamental laws of the land",
            "D. fundamental laws of the land")
        ),



        Questions(objective = Objective("16", "", "", "",
            "A constitution is important because it",
            "A. teaches moral values of the society",
            "B. prescribes rules for those who govern",
            "C. serves as a source of conflict in society",
            "D. describes the laws and admonishes obedience",
            "D. describes the laws and admonishes obedience")
        ),

        Questions(objective = Objective("17", "", "", "",
            "Which of the following cannot be found in a constitution?",
            "A. Fundamental Human Rights",
            "B. Manifestoes of political parties",
            "C. Organs of government",
            "D. Duties and obligations of citizens",
            "B. Manifestoes of political parties")
        ),

        Questions(objective = Objective("18", "", "", "",
            "A rigid constitution is a feature of",
            "A. unitary system",
            "B. monarchical system",
            "C. confederal system",
            "D. federal system",
            "D. federal system")
        ),

        Questions(objective = Objective("19", "", "", "",
            "In a parliamentary system the executive is weak because it is",
            "A. accountable to parliament",
            "B. responsible for its own actions",
            "C. headed by a prime minister",
            "D. the head of state that controls the government",
            "A. accountable to parliament")
        ),

        Questions(objective = Objective("20", "", "", "",
            "In a federal system of government, the powers of state government are subordinate to",
            "A. the original constitutions",
            "B. the supreme body of state laws",
            "C. acts of the parliament at the centre",
            "D. provincial laws",
            "B. the supreme body of state laws")
        ),


        Questions(objective = Objective("21", "", "", "",
            "An advantage of a confederation over a federation is that the component units",
            "A. have the right to secede",
            "B. share resources equally",
            "C. are politically stable",
            "D. co-operate fully with the centre",
            "A. have the right to secede")
        ),

        Questions(objective = Objective("22", "", "", "",
            "Confederalism was once practised in",
            "A. Nigeria and Ghana",
            "B. Senegal and The Gambia",
            "C. Mali and Cole d'lvoire",
            "D. Ghana and Benin",
            "B. Senegal and The Gambia")
        ),

        Questions(objective = Objective("23", "", "", "",
            "Which of the following acts as a check on the Executive in the control of the finances of a state? The",
            "A. judiciary",
            "B. civil service",
            "C. press",
            "D. legislature",
            "D. legislature")
        ),

        Questions(objective = Objective("24", "", "", "",
            "In legislature, carpel-crossing means",
            "A. crossing over the carpet",
            "B. decamping to another party",
            "C. legislative dismissal",
            "D. legislative instrument",
            "B. decamping to another party")
        ),

        Questions(objective = Objective("25", "", "", "",
            "The responsibility of the judiciary is to",
            "A. make rules",
            "B. formulate decisions",
            "C. arrest offenders",
            "D. adjudicate cases",
            "D. adjudicate cases")
        ),


        Questions(objective = Objective("26", "", "", "",
            "One of the limitations on freedom of speech is",
            "A. libel",
            "B. trespassing",
            "C. bye-laws",
            "D. unlawful defention",
            "A. libel")
        ),

        Questions(objective = Objective("27", "", "", "",
            "A citizen's duties do not include",
            "A. defending the nation",
            "B. obeying the laws",
            "C. paying taxes",
            "D. giving alms to the poor",
            "D. giving alms to the poor")
        ),

        Questions(objective = Objective("28", "", "", "",
            "One-party system leads to",
            "A. dictatorship",
            "B. democracy",
            "C. diarchy",
            "D. theocracy",
            "A. dictatorship")
        ),

        Questions(objective = Objective("29", "", "", "",
            "In a democratic state the party system that usually operates is",
            "A. Mass pathy",
            "B. multi-party",
            "C. one-party",
            "D. elite party",
            "B. multi-party")
        ),

        Questions(objective = Objective("30", "", "", "",
            "The coming together of two or more political parties to from a government is",
            "A. coalition",
            "B. merger",
            "C. unification",
            "D. co-operation",
            "A. coalition")
        ),


        Questions(objective = Objective("31", "", "", "",
            "Universal Adult Suffrage is associated with a",
            "A. democratic government",
            "B. political culture",
            "C. public accountability",
            "D. political socialization",
            "A. democratic government")
        ),

        Questions(objective = Objective("32", "", "", "",
            "Restricted franchise violates the idea of",
            "A. political equality",
            "B. political culture",
            "C. public accountability",
            "D. political socialization",
            "A. political equality")
        ),

        Questions(objective = Objective("33", "", "", "",
            "A major advantage of the Secret Ballot System of voting is that",
            "A. it is faster than other systems",
            "B. it ensures the anonymity of the voter",
            "C. it extends the franchise to all adults",
            "D. nobody can be prevented from voting",
            "B. it ensures the anonymity of the voter")
        ),

        Questions(objective = Objective("34", "", "", "",
            "The 'first-past-the-post system of voting is also called",
            "A. second ballot system",
            "B. proportional representation",
            "C. second majority system",
            "D. alternative vote system",
            "C. second majority system")
        ),

        Questions(objective = Objective("35", "", "", "",
            "Proportional representation is more appropriate in a",
            "A. multi-party system",
            "B. plurality system",
            "C. unitary system",
            "D. monarchical system",
            "A. multi-party system")
        ),


        Questions(objective = Objective("36", "", "", "",
            "Which of the following can aid in the formation of public opinion?",
            "A. Order-in-council",
            "B. free press",
            "C. Existence of one party system",
            "D. Existence of pre censorship",
            "B. free press")
        ),

        Questions(objective = Objective("37", "", "", "",
            "The civil service is an institution for",
            "A. carrying out private organization goals",
            "B. effecting civil society policies",
            "C. formulating and executing public policies",
            "D. initiating bureaucratic private agenda",
            "C. formulating and executing public policies")
        ),

        Questions(objective = Objective("38", "", "", "",
            "The recruitment of personnel into civil service by the public/civil service commission prevents",
            "A. political patronage",
            "B. bribery and corruption",
            "C. overstaffing",
            "D. bureaucracy",
            "A. political patronage")
        ),


        Questions(objective = Objective("39", "", "", "",
            "Which of following manages a public corporation?",
            "A. Chambers of Commerce",
            "B. Board of Directors",
            "C. An Accountant-General",
            "D. An Auditor-General",
            "B. Board of Directors")
        ),

        Questions(objective = Objective("40", "", "", "",
            "Local governments are essential because they",
            "A. encourage division in a country",
            "B. implement government policies at national levels",
            "C. make laws for a nation",
            "D. train local people in the art of governing",
            "D. train local people in the art of governing")
        ),


        Questions(objective = Objective("41", "", "", "",
            "Which of the following delayed nationalist movements in French West Africa?",
            "A. Presence of educated elite",
            "B. The policy of Assimilation",
            "C. The use of local chiefs",
            "D. Granting of freedom to Africans",
            "B. The policy of Assimilation")
        ),


        Questions(objective = Objective("42", "", "", "",
            "The National Congress of British West Africa (NCBWA) was founded in",
            "A. Sierra Leone",
            "B. Liberia",
            "C. Ghana",
            "D. Nigeria",
            "C. Ghana")
        ),

        Questions(objective = Objective("43", "", "", "",
            "The west Africa Students Union (WASU) was formed by",
            "A. Siaka Stevents",
            "B. B.KA Gbedemah",
            "C. E.F.Smail",
            "D. Oladipo Solanke",
            "D. Oladipo Solanke")
        ),

        Questions(objective = Objective("44", "", "", "",
            "Military government usually rule through",
            "A. bye-laws",
            "B. decrees",
            "C. parliament",
            "D. statutes",
            "B. decrees")
        ),

        Questions(objective =  Objective("45", "", "", "",
            "A military coup déta is followed by",
            "A. enforcement of fundamental human rights",
            "B. suspension of the constitution",
            "C. breaking of diplomatic relations with foreign countries",
            "D. mass importation of fire arms",
            "B. suspension of the constitution")
        ),


        Questions(objective = Objective("46", "", "", "",
            "Which of the following factors influences a country's foreign policy?",
            "A. Size of the country's civil service",
            "B. Overall national interest of the country",
            "C. Capacity of the police force",
            "D. Type of traditional rulers in the country",
            "B. Overall national interest of the country")
        ),


        Questions(objective = Objective("47", "", "", "",
            "The Organization of African Unity (OAU) was set up in",
            "A. Accra",
            "B. Harare",
            "C. Cairo",
            "D. Addis Ababa",
            "D. Addis Ababa")
        ),

        Questions(objective = Objective("48", "", "", "",
            "The organ of the Organization of African Unity (OAU)established for peaceful settlement of disputes is the",
            "A. Commission of Mediation Conciliation and Arbitration",
            "B. Council of Ministers",
            "C. Secretariat",
            "D. Assembly of Heads of State and Government",
            "A. Commission of Mediation Conciliation and Arbitration")
        ),

        Questions(objective = Objective("49", "", "", "",
            "The head of the Commonwealth of Nations is the",
            "A. Prime Minister",
            "B. High Commissioner",
            "C. British Foreign Secretary",
            "D. British Monarch",
            "D. British Monarch")
        ),

        Questions(objective = Objective("50", "", "", "",
            "Which of the following organs of the United Nations Organization has outlived its usefulness? The",
            "A. General Assembly",
            "B. Trusteeship Council",
            "C. International Court of Justice",
            "D. Economic and Social Council",
            "B. Trusteeship Council")
        )

    )

    private val government2013 = listOf<Questions>(
        Questions(
            objective = Objective(
                id = "1", "", "", "",
                question =  " Who among the following could be described as the founding father of Nigerian nationalism?",
                optionA = "Nnamdi Azikiwe",
                optionB = "Herbert Macauley",
                optionC = "Ahmadu Bello",
                optionD = "Obafemi Awolowo",
                answer = ""
            ),
            theory = Theory(
                id = "1", "", "", "", "", "",
            )

        ),
        Questions(
            objective = Objective(
                id = "1", "", "", "",
                question =  " Who among the following could be described as the founding father of Nigerian nationalism?",
                optionA = "Nnamdi Azikiwe",
                optionB = "Herbert Macauley",
                optionC = "Ahmadu Bello",
                optionD = "Obafemi Awolowo",
                answer = ""
            ),
            theory = Theory(
                id = "1", "", "", "", "", "",
            )

        ),
    )

    private val government2014 = listOf<Questions>(
        Questions(objective = Objective("1", "", "", "",
            "Government protects the lives and property of the citizens of a state through the",
            "A. courts and the police",
            "B. legislature and prisons",
            "C. ministers and the police",
            "D. customs and the police",
            "A. courts and the police"),
            theory = Theory( "1", "", "", "",
                question = "State five reasons for the study of government ",
                answer ="""
                    (i) The study of government helps us to know what is going on in our country and around the world.
                    (ii) It helps us to know the successes and failures of our past leaders.
                    (iii) It enables us to differentiate between good and bad government.
                    (iv) It prepares us to take part in the governance of our country.
                    (v) It enables us to know our rights, duties and obligations as citizens.
                    (vi) It puts the citizens in a position to defend their rights when violated.
                    (vii) It helps to inculcate the spirit of nationalism and patriotism in the citizens.
                    (viii) It enables people to understand the systems of government adopted in a country.
                    (ix) It helps us to find solutions to our political problems/challenges.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective("2", "", "", "",
            "Political power could be acquired through",
            "A. persuasion",
            "B. election",
            "C. sanction",
            "D. nomination",
            "B. election"),
            theory = Theory( "2", "", "", "",
                question = """
                    (a) Define capitalism.
                    (b) State two advantages and two advantages of capitalism.
                """.trimIndent(),
                answer = """
                    (a) Capitalism can be defined as a political and economic system in which the means of production, distribution and exchange of goods and services are in the hands of individuals.
                    (b)
                    Advantages:                                                                                                                                                                                                                  (i) Capitalism guarantees maximum freedom of enterprises.
                    (ii) It brings about increase in the quality of goods and services produced;
                    (iii) It creates room for effective use of talents.
                    (iv) It encourages numerous inventions and innovations.
                    (v) it encourages diverse economic development. 
                    (vi) It leads to specialization. 
                    Disadvantages:                                                                                                                                                                                                                  (i) It encourages the exploitation of the poor by the rich
                    (ii) It leads to inequitable distribution of income and wealth
                    (iii) It may lead to unhealthy rivalry
                    (iv) It may threaten the sovereignty of the state 
                    (v) It may lead to conflict between employers and employers and employees
                    (vi) It may lead to job insecurity
                    (vii) It does not consider public interest because of profit motive.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective("3", "", "", "",
            "Which of the following countries in Africa practised socialism?",
            "A. Nigeria",
            "B. Togo",
            "C. Tanzania",
            "D. Kenya",
            "C. Tanzania"),
            theory = Theory( "3", "", "", "",
                question = """
                    (a) Define Legitimacy. 
                    (b) Highlight any four factors that determine legitimacy. 
                """.trimIndent(),
                answer = """
                    (a) 
                    Legitimacy is the acceptance and recognition by the people of the right of the ruler to govern.
                    (b) 
                    (i) International Recognition.
                    (ii) Popular Support Participation - For a government to be accorded legitimacy, the citizens must be a allowed to participate in political activities.
                    (iii) Periodic free and fair elections.
                    (iv) Good Leadership-Legitimacy will be accorded to a leader with sterling qualities.
                    (v) Ideology-The ability of the government to uphold the state ideology will help attain legitimacy.
                    (vi) Good Governance-Any government that operates on the tenets of good governance may earn legitimacy.
                    (vii) Respect for Fundamental Human Rights/Rule of Law.
                    (viii) Appreciative level of socio-economic development in the state by the Government.
                    (ix) Popular Support A government is legitimate if it receives the popular support of the citizens.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective("4", "", "", "",
            "Nazism was introduced by",
            "A. Adolf Hitler",
            "B. Tsar Nichilas ll",
            "C. Karl Marx",
            "D. Mao-Tse-Tung",
            "A. Adolf Hitler"),
            theory = Theory( "4", "", "", "",
                question = "Outline five factors that give rise to the adoption of federalism.",
                answer = """
                    (i) Geographical nearness/contiguity.
                    (ii) Desire for a union.
                    (iii) Availability of resources.
                    (iv) The size of the country/population.
                    (v) Absence of marked inequalities.
                    (vi) Common historical/colonial experience.
                    (vii) Fear of a-a 2 domination.
                    (viii) Preservation of local autonomy.
                    (ix) Ethnic diversity.
                    (x) Need for common defense system.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective("5", "", "", "",
            "The following are merits of separation of powers except",
            "A. abuse of power",
            "B. freedom and liberty",
            "C. stable political syste",
            "D. absence of dominance",
            "A. abuse of power"
        ),
            theory = Theory( "5", "", "", "",
                question = "In what five ways can elections be made free and fair in a country?",
                answer = """
                    (i) Compilation and availability of comprehensive votes register.
                    (ii) Regular and periodic public display of voters' list.
                    (iii) Polling offices and officers, ballot boxes and papers and other necessary election personnel and materials should be adequately provided.
                    (iv) Voting atmosphere devoid of fear of molestation intimidation and victimization.
                    (v) The requirement for qualification for election must be clearly stipulated and adequately publicized.
                    (vi) Counting of ballot papers/votes should be publicly done and the results declared immediately.
                    (vii) All elections materials should be tightly secured.
                    (viii) The electorate should be given adequate political education.
                    (xi) Equal access to the media by candidates and political education
                """.trimIndent())
        ),
        Questions( objective = Objective("6", "", "", "",
            "Which of the following is not a merits of checks and balances it?",
            "A. prevents excessive use of power",
            "B. has respect for human rights",
            "C. encourages the use of veto power",
            "D. prevents dictatorship",
            "C. encourages the use of veto power"),
            theory = Theory( "6", "", "", "",
                question = "Identify five functions and powers of the King Makers in the Yoruba pra-colonial",
                answer = """
                    (i) To request the ruling family to nominate some aspirants to be considered/screened for the vacant stool/post of the Oba/King.
                    (ii) To screen all nominees/aspirants (in conjunction with the ifa/oracle priest)for their vacant stool/post of the Oba/King.
                    (iii)To announce the successful nominee as the sole candidate for the vacant stool/post of the Oba/King.
                    (iv) To install the sole candidate as the new Oba/King.
                    (v) To carry out certain rituals before, and after the installation/crowning of the new Oba/King.
                    (vi) To decorate the new Oba/King as the by placing the crown and so the purified leaves on his head and hand over of him the staff of office.
                    (vii) To check against possible excesses, despotism, tyranny or abuse/misuse of power office by the Oba/King.
                    (viii) Te Council of King Makers had the power to investigate the Oba/King on any allegation brought to the Council by the people/subjects.
                    (ix) It had the power to proclaim or declare the total rejection of the Oba/King by the people and the gods of Yoruba land, if the Oba/King was found guilty.
                    (x) It had the power to advise the Oba/King to either commit suicide or go into exile (abdicate throne).
                    (xi) It had power to force/compel the Oba/King to sight the forbidden contents of the occult calabash.
                """.trimIndent())
        ),
        Questions( objective = Objective("7", "", "", "",
            "Representative government is alternatively called",
            "A. rule of law",
            "B. indirect democracy",
            "C. separation of powers",
            "D. classical democracy",
            "B. indirect democracy"),
            theory = Theory( "7", "", "", "",
                question = "Highlight five reasons for the slow rate of nationalism in French speaking West Africa",
                answer = """
                    (i) The use of oppressive measures such as indignant and forced labour.
                    (ii) The policy of Assimilation limited Africans' access to education.
                    (iii) Suppression of political freedom in French West Africa
                    (iv) The political parties formed after the Second World War were off-shoots of the parties in France and therefore could not mobilize the people for self-rule.
                    (v) Late establishment of newspapers.
                    (vi) The regard of French West African colonies by France as her oversea provinces.
                    (vii) The incorporation of the French West African economy into that of France.
                """.trimIndent())
        ),
        Questions( objective = Objective("8", "", "", "",
            "A constitution is a",
            "A. set of regulations and customs",
            "B. body of doctrine and principles",
            "C. set of principles and customs",
            "D. body of rules, regulations and conventions",
            "D. body of rules, regulations and conventions"),
            theory = Theory( "8", "", "", "",
                question = """
                    (a) Outline three features of the Macpherson Constitution.
                    (b) State two reasons for the breakdown of the Lyttleton Constitution.
                """.trimIndent(),
                answer = """
                    (a)
                    (i) Provision for the establishment of regional legislatures
                    (ii) Establishment of a unicameral legislature in the Eastern Region.
                    (iii) It provided for the establishment of Regional Executive Council it each region.
                    (iv) The extension of franchise from Lagos and Calabar to other parts of Nigeria.
                    (b)
                    (i) Formation of political parties based on regional boundaries.
                    (ii) The hostile inter-regional/ethnic friction, mutual mistrust and hostility made the Constitution practically unworkable.
                    (iii) The inability of any single political party to have the required majority with which to control the federal parliament
                    (iv) It failed to grant political independence to Nigeria contrary to the expectations of the nationalists and the political party which moved the motion for independence in 1953.
                    (v)The '• Constitution was weakened and made almost irrelevant by the resolutions of the 1057/1958 Constitutional Conferences.
                    (vi) The attainment of political independence by Nigeria in 1960.
                """.trimIndent())
        ),
        Questions( objective = Objective("9", "", "", "",
            "A feature of rigid constitution is that it requires",
            "A. amendment by the judiciary",
            "B. one-third majority for its amendment",
            "C. special amendment procedures",
            "D. the votes of electorate for its amendment",
            "C. special amendment procedures"),
            theory = Theory( "9", "", "", "",
                question = "Outline five reasons people prefer democratic government to military regimes.",
                answer = """
                    (i) In democratic governments, laws are generally made through democratic procedures while military regimes ruled by decrees.
                    (ii) in democratic governments, the constitution, as the fundamental law, is allowed to operate while in military regimes they are suspended.
                    (ii) Democratic governments promote free press while in military regime; they are usually gagged/censored or proscribed.
                    (iii) Democratic governments apply anti uphold separation of powers while in military regimes, powers are fussed.
                    (iv) Decisions in democratic governments are through persuasion while in military regimes, coercion and violence are utilized.
                    (v) Democratic governments are legitimate while military regimes are illegitimate
                    (vi) Democratic governments gained international recognition while military regime may not.
                """.trimIndent() )
        ),
        Questions( objective = Objective("10", "", "", "",
            "A characteristic of a federal system of government is that power is",
            "A. shared between the central and unit governments",
            "B. shared between the component units of government",
            "C. held by the national government",
            "D. held by the state government",
            "A. shared between the central and unit governments"),
            theory = Theory( "10", "", "", "",
                question = "Identify five challenges facing the Commonwealth of Nations.",
                answer = """
                    (i) Divided loyalty resulting from the membership of other international organization.
                    (ii) Ideological differences of members states.
                    (iii) Political instability of some members states.
                    (iv) Inability of some member states to the expense of the Common wealth.
                    (vi) Introduction of visas by Britain discouraged free movement of people and technology.
                    (vii) Inadequate funds for the execution of its projects
                """.trimIndent()
            )
        ),
        Questions( objective = Objective("11", "", "", "",
            "In a federal system of government, education and health are examples of",
            "A. separation of powers",
            "B. reserved powers",
            "C. concurrent powers",
            "D. exclusive powers",
            "C. concurrent powers")
        ),

        Questions( objective = Objective("12", "", "", "",
                "Which of the following is not a function of judiciary?",
                "A. settlement of disputes",
                "B. maintenance of law and order",
                "C. interpretation of law",
                "D. protection of right",
                "B. maintenance of law and order")
        ),


            Questions( objective = Objective("13", "", "", "",
                "Statutes are",
                "A. bills passed by local governments",
                "B. laws passed by the judiciary",
                "C. bills passed by the executive",
                "D. laws passed by the parliament",
                "A. bills passed by local governments")
            ),

            Questions( objective = Objective("14", "", "", "",
                "Slander limits a citizen's freedom of",
                "A. expression",
                "B. movement",
                "C. association",
                "D. religion",
                "A. expression")
            ),

            Questions( objective = Objective("15", "", "", "",
                "Which of the following bodies has the right to change the laws of the country? The",
                "A. Judiciary",
                "B. Ombudsman",
                "C. Legislature",
                "D. Executive",
                "C. Legislature")
            ),



            Questions( objective = Objective("16", "", "", "",
                "All the following are sources of revenue of a political party except",
                "A. payment of dues",
                "B. donations",
                "C. custom duties",
                "D. fund raising",
                "C. custom duties")
            ),

            Questions( objective = Objective("17", "", "", "",
                "Party manifesto is important in the following ways except to",
                "A. evaluate the party",
                "B. limit choice",
                "C. attract people",
                "D. guide the party",
                "B. limit choice")
            ),

            Questions( objective = Objective("18", "", "", "",
                "Coalition government can be defined as parties coming together",
                "A. to appoint a leader",
                "B. to form a government",
                "C. with a common manifesto",
                "D. to oppose the government",
                "B. to form a government")
            ),

            Questions( objective = Objective("19", "", "", "",
                "Which of the following West African countries practised a one-party system?",
                "A. Benin",
                "B. Nigeria",
                "C. Ghana",
                "D. Liberia",
                "C. Ghana")
            ),


            Questions( objective = Objective("20", "", "", "",
                "In limited franchise, restriction on voting can be based on",
                "A. height",
                "B. property",
                "C. strength",
                "D. exposure",
                "B. property")
            ),


            Questions( objective = Objective("21", "", "", "",
                "Which of the following is a limitation to Universal Adult Suffrage?",
                "A. Wealth",
                "B. Age",
                "C. Race",
                "D. Sex",
                "B. Age")
            ),

        Questions( objective = Objective("22", "", "", "",
                "Which of the following is an example of a general election?",
                "A. Bye-election",
                "B. Presidential election",
                "C. Local election",
                "D. Student union election",
                "B. Presidential election")
        ),

        Questions( objective = Objective("23", "", "", "",
                    "The purpose of an election is to",
                    "A. allow people to participate in choosing their leaders",
                    "B. provide social amenities for the electorate",
                    "C. give political education to the rich",
                    "D. allow the counting of votes in public",
                    "A. allow people to participate in choosing their leaders")
        ),

                Questions( objective = Objective("24", "", "", "",
                    "Universal Adult Suffrage is popular because it",
                    "A. allows for equal political representation",
                    "B. allows for greater political participation",
                    "C. encourages a multi-party system",
                    "D. ensures equal performance of all political parties",
                    "B. allows for greater political participation")
                ),


                Questions( objective = Objective("25", "", "", "",
                    "Which of the following is not a factor that promotes democratic electoral system?",
                    "A. political consciousness",
                    "B. periodic election",
                    "C. up-to-date electoral register",
                    "D. popularity of the governor",
                    "D. popularity of the governor")
                ),

        Questions( objective = Objective("26", "", "", "",
                    "A factor that could make elections to be free and fair is the",
                    "A. existence of dependent electoral commission",
                    "B. adoption of a flexible constitution",
                    "C. opportunity for people to vote twice",
                    "D. registration of eligible voters",
                    "D. registration of eligible voters")
        ),

        Questions( objective = Objective("27", "", "", "",
                        "The body responsible for conducting and supervising elections in West African countries is called",
                        "A. ombudsman",
                        "B. electoral commission",
                        "C. election observers",
                        "D. constituent assembly",
                        "B. electoral commission")
        ),

                    Questions( objective = Objective("28", "", "", "",
                        "Which of the following is not a problem of an electoral commission in West Africa?",
                        "A. Electoral malpractices",
                        "B. Inadequate personnel",
                        "C. Inadequate funds",
                        "D. Registration of voters",
                        "D. Registration of voters")
                    ),

                    Questions( objective = Objective("29", "", "", "",
                        "Which of the following is not an aim of pressure groups?",
                        "A. Contesting election",
                        "B. Agitating for interests",
                        "C. Influencing government decision",
                        "D. Educating their members",
                        "A. Contesting election")
                    ),

                    Questions( objective = Objective("30", "", "", "",
                        "A pressure group formed only by teachers is",
                        "A. a promotional group",
                        "B. an occupational group",
                        "C. a religious group",
                        "D. an economic group",
                        "B. an occupational group")
                    ),

                    Questions( objective = Objective("31", "", "", "",
                        "Neutrality in the civil service means that",
                        "A. the government can seek or replace top civil servants",
                        "B. officials can only be removed from office due to ill-health",
                        "C. civil servants should be loyal to the government and non-partisan",
                        "D. officials need to defend the budget in parliament",
                        "C. civil servants should be loyal to the government and non-partisan")
                    ),


        Questions( objective = Objective("32", "", "", "",
                            "Red-tapism in the civil service is a product of",
                            "A. democracy",
                            "B. autocracy",
                            "C. bureaucracy",
                            "D. theocracy",
                            "C. bureaucracy")
        ),

        Questions( objective = Objective("33", "", "", "",
                            "An advantage of public corporations in West Africa is",
                            "A. Creation of exposure",
                            "B. political interference",
                            "C. provision of employment",
                            "D. provision of all services needed",
                            "D. provision of all services needed")
        ),

                        Questions( objective = Objective("34", "", "", "",
                            "The central government can reduce annual subventions to public corporations through",
                            "A. parliamentary control",
                            "B. ministrial control",
                            "C. judicial control",
                            "D. public control",
                            "A. parliamentary control")
                        ),

                        Questions( objective = Objective("35", "", "", "",
                            "Collection of rates is a source of revenue to",
                            "A. civil servants",
                            "B. public corporation",
                            "C. local authorities",
                            "D. central government",
                            "C. local authorities")
                        ),


                        Questions( objective = Objective("36", "", "", "",
                            "The money given by the central government to local authorities is known as",
                            "A. block grants",
                            "B. capital expenditure",
                            "C. loans",
                            "D. royalities",
                            "A. block grants")
                        ),

                        Questions( objective = Objective("37", "", "", "",
                            "The laws of the pre-colonial African system were",
                            "A. written",
                            "B. codified",
                            "C. unwritten",
                            "D. rigid",
                            "C. unwritten")
                        ),


                        Questions( objective = Objective("38", "", "", "",
                            "Auditing the accounts of public corporations amounts to",
                            "A. media control",
                            "B. judicial control",
                            "C. public control",
                            "D. financial control",
                            "D. financial control")
                        ),


                        Questions( objective = Objective("39", "", "", "",
                            "The following were features of the French policy of Assimilation except",
                            "A. centralized administration",
                            "B. recognition of chieftaincy institution",
                            "C. limited education",
                            "D. indigent policy",
                            "B. recognition of chieftaincy institution")
                        ),


                        Questions( objective = Objective("40", "", "", "",
                            "The recurrent coups in West African countries resulted in",
                            "A. dictatorship",
                            "B. political instability",
                            "C. nepotism",
                            "D. poor conditions in the army",
                            "B. political instability")
                        ),

                        Questions( objective = Objective("41", "", "", "",
                            "Foreign policy refers to the",
                            "A. policy made by a foreign country",
                            "B. policy made by a country for forigners",
                            "C. principles that govern a country when it is at war",
                            "D. principle that govern a state's international behaviour",
                            "D. principle that govern a state's international behaviour")
                        ),

                        Questions( objective = Objective("42", "", "", "",
                            "Which of the following is a factor for the adoption of a unitary system of government in some West African countries?",
                            "A. Vast territories",
                            "B. small territories",
                            "C. Abundant resources",
                            "D. Heterogeneous culture",
                            "B. small territories")
                        ),


                        Questions( objective = Objective("43", "", "", "",
                            "Which of the following countries ia a permanent member of the Security Council of the United Nations Organization (UNO)?",
                            "A. Germany",
                            "B. Japan",
                            "C. Canada",
                            "D. Russia",
                            "D. Russia")
                        ),

                        Questions( objective = Objective("44", "", "", "",
                            "The Commonwealth is",
                            "A. an economic organization for the Carribeans",
                            "B. a political organization formed during the First World War",
                            "C. made up of all independent ex-colonies of Britain",
                            "D. made up of independent European Countries",
                            "C. made up of all independent ex-colonies of Britain")
                        ),

                        Questions( objective = Objective("45", "", "", "",
                            "The United Nations Organization (UNO) came into existence in",
                            "A. 1945",
                            "B. 1948",
                            "C. 1950",
                            "D. 1953",
                            "A. 1945")
                        ),


                        Questions( objective = Objective("46", "", "", "",
                            "The head of the Commonwealth of Nations is",
                            "A. German Chancellor",
                            "B. President of America",
                            "C. Queen of England",
                            "D. British Prime Minister",
                            "C. Queen of England")
                        ),

                        Questions( objective = Objective("47", "", "", "",
                            "A Commonwealth member that has no colonial link with the United Kingdom is",
                            "A. Nigeria",
                            "B. Kenya",
                            "C. Ghana",
                            "D. Mozambique",
                            "D. Mozambique")
                        ),

                        Questions( objective = Objective("48", "", "", "",
                            "The meetings of the Commonwealth of Nations are held once every",
                            "A. six years",
                            "B. five years",
                            "C. three years",
                            "D. two years",
                            "D. two years")
                        ),

                        Questions( objective = Objective("49", "", "", "",
                            "The ECOWAS Fund for Co-operation, Compensation and Development is located in",
                            "A. Togo",
                            "B. Nigeria",
                            "C. The Gambia",
                            "D. Sierra Leone.",
                            "A. Togo")
                        ),


                        Questions( objective = Objective("50", "", "", "",
                            "The organ responsible for investigating internal disputes in the United Nations Organization (UNO) is the",
                            "A. General Assembly",
                            "B. Security Council",
                            "C. Secretariat",
                            "D. Economic and Social Council",
                            "B. Security Council")
                        ),

    )

    private val government2015 = listOf<Questions>(
        Questions(
            objective = Objective( "1", "", "", "",
            "which of the following best defines government as an institution of a state?",
            "A. An institution established for class struggle",
            "B. Machinery established for exercising political power",
            "C. A process of organizing societal values",
            "D. The art through which political parties are managed",
            "B. Machinery established for exercising political power"
            ),
            theory = Theory( "1", "", "", "",
                question = """
                    (a) Explain constitutionalism.
                    (b) State four factors that can promote constitutionalism
                """.trimIndent(),
                answer = """
                    (a) 
                    constitutionalism; is Strict adherence to the provisions of the Constitution of the land by everyone including the leaders.
                    (b) 
                    i. Existence of a multi-party system.
                    ii. Entrenchment of Fundamental Human Rights in the constitution.
                    iii. Free, fair and periodic election.
                    iv. Existence of free press.
                    v. Fixed term of office for elected political office holders.
                    vi. Independent judiciary.
                    vii. Observance of Rule of Law.
                    viii. Raising the level of literacy/civic education.
                """.trimIndent() )
        ),

        Questions( objective = Objective( "2", "", "", "",
            "Which of the following is a reason for studying government?",
            "A. knowledge of the rights of the individuals",
            "B. Acquisition of skills to work in a state owned industry",
            "C. Helps the individual to form a pressure group",
            "D. Enables citizens to vote during elections",
            "A. knowledge of the rights of the individuals"),
            theory = Theory( "2", "", "", "",
                question = """
                    (a) What is separation of power?.
                    (b) How does it operate under the 
                    (i) Presidential System of government? 
                    (ii) Cabinet System of government?
                """.trimIndent(),
                answer = """
                    Separation of power; It implies that the three organs of government; the legislature, the executive and the judiciary are separated in personnel and functions.This means that no one person or organ of government should combine the legislative, executive and judicial functions of government. 
                    Its operation in presidential system of government : 
                    (bi) 
                    1. In Presidential system of government, the legislature makes laws, the executive applies the law, the judiciary interprets laws.
                    2. None of the three organs of government should usurp the powers or interfere in the workings of other two organs.
                    3. No one person or organ of government to combine the legislative, executive and judicial functions or powers. 
                    The operation of separation of powers in a cabinet system of Government: 
                    (bii)
                    1. There is no strict separation of powers in a cabinet system of government.
                    2. Individuals can operate in two or more organs of government
                    3. There is fusion of powers in the discharge of responsibilities.
                    4. Members of cabinet are also part of the legislature.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "3", "", "", "",
            "The most visible feature of a state is",
            "A. compulsory membership",
            "B. defined geographical territory",
            "C. written constitution",
            "D. sovereign power",
            "D. sovereign power"),
            theory = Theory( "3", "", "", "",
                question = """
                    (a) Define parliamentarianism.
                    (b) Identify four differences between parliamentary and presidential systems of government.
                """.trimIndent(),
                answer = """
                    (a) 
                    parliamentarianism; It is a system of government in which there exists a Head of State who performs ceremonial functions and a Head of Government who performs executive functions. 
                    (b) 
                    i. There is separation of powers in the presidential system, while there is fusion of powers in the parliamentary system.
                    ii. In the presidential system, the President chooses his ministers from outside parliament, whiles in the parliamentary system Ministers are chosen from parliament.
                    iii. In a presidential system, the Head of State is also Head of Government while in the parliamentary system, the Head of State is different from Head of Government.
                    iv. In a presidential system, the President can be removed by impeachment while in the parliamentary system, the Prime Minister can be removed through a vote of no confidence.
                    v. In a presidential system, the President is directly elected while in the parliamentary system; the Prime Minister is appointed from the majority party in parliament.
                    vi. In a presidential system, the role of the opposition is not constitutionally determined but in the parliamentary system, the constitution provides a role for the opposition in parliament. 
                    vii. In a presidential system, ministers are individually accountable to the president but in the parliamentary system, the ministers are collectively responsible to parliament.
                    viii. In a presidential system, there is fixed tenure for the government but in parliamentary system, there is flexibility in the tenure of the government.
                    ix. In a presidential system, party discipline is weak whiles in the parliamentary system, party discipline it rigidly enforced.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "4", "", "", "",
            "Representative democracy is characterized by",
            "A. free election and proper register of voters",
            "B. a politically educated elite",
            "C. representation of the poor only",
            "D. rule of the interest groups",
            "A. free election and proper register of voters"),
            theory = Theory( "4", "", "", "",
                question = """
                    (a) Define public opinion.
                    (b) Highlight three ways by which Public Opinion can be formed.
                    (c) In what three ways can Public Opinion be encouraged in your country?
                """.trimIndent(),
                answer = """
                    (a) 
                    Public Opinion can be described as the aggregate views of the people at a given time and on a particular issue / matter.
                     
                    (b)                                                                                                                                  i. Mass Media: Public opinion can be formed through information provided by the media.
                    i. The organizations that people belong to e.g. Religious/ Social.
                    ii. Trade Unions : The trade unions that people belong to serve as the source of information which eventually help them in building public opinion.
                    iii. Political parties : Parties serve as an aggregating factor for people's opinion.
                    iv. Pressure/Interest groups give information to their members and this helps them to form opinion.
                    v. Public lectures/ Seminars/Symposia/Conferences enable people to form opinion.
                    vi. Influential people in the society also help in forming opinion.
                     
                    (c) 
                    i. Guaranteeing press freedom ; This will enable the policies and actions of the government be made known to members of the public in their true perspectives.
                    ii. Raising Literacy level: If citizens can read and write, they will be in a better position to view and assess government policies.
                    iii. Establishment of Information Bureau: This will enable citizens to have access to information that will enable them form opinion.
                    iv. Guaranteeing freedom of speech and association: Members of the public should be allowed to air their views on government policies and actions/inaction.
                    v. Encouragement of functional civil society organizations.
                    vi. Encouragement of democratic government. 

                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "5", "", "", "",
            "The set of attitudes and beliefs that determine the behaviour of citizens in a political system is called",
            "A. socialization",
            "B. political culture",
            "C. representative government",
            "D. devolution",
            "B. political culture"),
            theory = Theory( "5", "", "", "",
                question = """
                    (a) IdentiMive officials used in the conduct of election on the polling day.
                    (b) State one function of each of the officials identified in (a). 
                """.trimIndent(),
                answer = """
                    (a) 
                    i. Chairman/Electoral Commissioners.
                    ii. Resident/Regional/State/Electoral Officers.
                    iii. Returning Officers. 
                    iv. Presiding Officers.
                    v. Polling Assistants/Clerks.
                    vi. Polling Agents/Party Agents.
                    vii. Security Officers! Polling Orderlies.
                    viii. Election Observers.
                    ix. Supervisory/Presiding Officers. 
                    (b) 
                    i. Chairman/Electoral Commissioners - move around to supervise the conduct of election.
                    ii. Resident/Regional/ State/Electoral Officer - Supervises the conduct of elections at the state/regional levels.
                    iii. Returning Officers - They announce results and declare winners at polling units and wards.
                    iv. Presiding Assistant/Clerks - They assist the presiding officer by checking the list of registered voters.
                    v. Polling/Agents/Party Agents - They represent the candidates or political parties at the polling booth/station.
                    vi. Security Officers/Polling Orderlies - They maintain law and order at the polling station/Centre.
                    vii. Election Observers - They monitor the conduct of elections and report on the freeness or otherwise of the elections.
                    viii. Supervisory/ Presiding Officers - They move from one polling Centre to the other within the electoral wards, Listening to the complaints and settling minor disagreements arising from the polling units Centre. 
                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "6", "", "", "",
            "Fundamental Human Rights are entrenched in constitutions purposely to",
            "A. ensure freedom of speech",
            "B. guarantee the liberty of citizens",
            "C. promote good governance",
            "D. promote trade",
            "B. guarantee the liberty of citizens"),
            theory = Theory( "6", "", "", "",
                question = "Highlight any five functions of the Secretary of State for the colonies in the colonial period." ,
                answer = """
                    i. Received petitions and grievances from the colonies on behalf of the British parliament.
                    ii. Submitted annual reports to the British on the colonies to the crown through the parliament.
                    iii. Approved the drafting of a new constitution for the colonies.
                    iv. Controlled the finances of the colonies through approval of budgets and auditing of accounts.
                    v. Set up Commissions of enquiry to investigate issues in the colonies.
                    vi. He could disallow any law which was not consistent with British colonial policies.
                    vii. He could override the Governors veto and power of certification.
                    viii. He approved major projects to be undertaken in the colonies.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "7", "", "", "",
            "Diplomatic and parliamentary immunities put limitations on",
            "A. the rule of law",
            "B. separation of powers",
            "C. checks and balances",
            "D. foreign policies",
            "A. the rule of law"),
            theory = Theory( "7", "", "", "",
                question = """
                    (a) State any three Newspapers formed by nationalist in Nigeria after the Second World War.
                    (b) Highlight any four roles played by local Newspapers in the struggle against colonial rule.

                """.trimIndent(),
                answer = """
                    (a) 
                    i. Nigerian Tribune
                    ii. Estern Guardian
                    iii. Northern Advocate
                    iv. Morning Post
                    v. New Africa.
                    (b)                                                                                                                                                                                  (b) i Mouthpiece of the nationalists.
                    ii. Exposing the ills of colonialism.
                    iii. Expressing the grievances of the people.
                    iv. Giving political and civic education.
                    v. Mobilizing the people against colonial rule.
                    vi. Pressing for political, social and economic reforms.
                    vii. Popularizing political ideology and manifestoes of political parties
                    viii. Promotion of African Cultural Values.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "8", "", "", "",
            "Montesquieu's political theory of separation of powers was meant to",
            "A. promote unity in government",
            "B. prevent dictatorial rule",
            "C. ensure social justice",
            "D. enhance state security",
            "B. prevent dictatorial rule"),

            theory = Theory( "8", "", "", "",
                question = "Outline five achievements of the Action Group as a political party in Nigeria. \n",
                answer =  """
                    i. The party provided political education to the people.
                    ii. It formed the government of the Western Region.
                    iii. Chief Anthony Enahora, A member of the party moved the motion for self-government for Nigeria in 1953.
                    iv. It participated in all constitutional conferences that led to the independence of Nigeria.
                    v. The party through its leader, Chief Obafemi Awolowo established the Nigerian Tribune.
                    vi. It introduced free education in all primary and secondary education in Nigeria.
                    vii. It established the first television station in Africa Western Nigerian Television (WNTV) in lbadan.
                    viii. It built Liberty stadium in Ibadan.
                    ix. It provided an effective opposition at the centre during the first republic.
                    x. It served as a link between the people and the government.
                    xi. It provided infrastructural facilities in the western region.
                """.trimIndent()

            )

        ),
        Questions( objective = Objective( "9", "", "", "",
            "Which of the following countries practices a centralized system of government?",
            "A. Nigeria",
            "B. Ghana",
            "C. USA",
            "D. India",
            "B. Ghana"),
            theory = Theory( "9", "", "", "",
                question = """
                    (a)
                    (i) Explain the term military. 
                    (ii) What is a military coup d' etat?
                    (b) Outline three basic features of military rule.
                """.trimIndent(),
                answer = """
                    (a)
                    (i) It is referred to as the armed forces comprising the Army (land troops), The Navy (sea troops) and the Air force (air troops).
                    (ii) Foreceful over throw of a constituted government by the armed forces.

                    (b) 
                    i. Military is characterized with control and use of means of violence.
                    ii. Suspension of the constitution when they seize power.
                    iii. Banning political parties.
                    iv. Abuse of Fundamental Human Rights. There is restricition on the movement of people and freedom of expression.
                    v. Perpetuates itself in office: The military stay in power and sometimes transform into a civilian government.
                    vi. A highly centralized system of government.
                    vii. Rule by decrees.
                    viii. Usually make use of civilians in their administration.
                    ix. Established military tribunals.

                """.trimIndent()
            )
        ),

        Questions( objective = Objective( "10", "", "", "",
            "Which of the following countries operates unwritten constitution?",
            "A. Britain",
            "B. USA",
            "C. Japan",
            "D. Canada",
            "A. Britain"),
            theory = Theory( "10", "", "", "",
                question = "What are the factors that determine the external relations of West African countries?",
                answer = """
                    i. Technological needs of West African countries determine their external relations.
                    ii. Economic development motives also determine the pattern of relationship of West African countries especially with the economically developed nations.
                    iii. Colonial heritage/ Historical experience of West African countries usually determines the country they relate with.
                    iv. Trade is another factor that determines the nature of West African countries' external relations.
                    v. Geographical nearness is a good determinant of West African external relations. Countries that are near to each other are bound to interact.
                    vi. Military strength/needs/ assistance.
                    vii Public opinion of the citizens of a country about a particular country can also determine the nature of interaction.
                    viii. Membership of international organizations e.g. ECOWAS, OAU/AU.
                    ix. International law and Conventions.
                    x. Religious affiliations.
                    xi. Political ideology.
                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "11", "", "", "",
            "A constitution that can be amended through ordinary law making process is said to be",
            "A. written",
            "B. unwritten",
            "C. rigid",
            "D. flexible",
            "D. flexible")
        ),

        Questions( objective = Objective( "12", "", "", "",
            "Which of the following systems of government operates on the checks and balances?",
            "A. Theocracy",
            "B. Presidential",
            "C. Parliamentary",
            "D. Monarchical",
            "B. Presidential")
        ),

        Questions( objective = Objective( "13", "", "", "",
            "Confederal systems of government means",
            "A. powerful centre and weak component units",
            "B. weak centre and powerful component units",
            "C. powerful centre and powerful component units",
            "D. weak component units and weak centre",
            "B. weak centre and powerful component units")
        ),

        Questions( objective = Objective( "14", "", "", "",
            "In a federal system of government, the power shared between the Centre and state governments is known as",
            "A. legislative power",
            "B. exclusive power",
            "C. concurrent power",
            "D. judicial power",
            "C. concurrent power")
        ),

        Questions( objective = Objective( "15", "", "", "",
            "The prerogative power resides with the",
            "A. ombudsman",
            "B. executive",
            "C. national assembly",
            "D. civil organization",
            "B. executive")
        ),

        Questions( objective = Objective( "16", "", "", "",
            "Quick decision making is an advantage of",
            "A. unicameralism",
            "B. constitutionalism",
            "C. federalism",
            "D. republicanism",
            "A. unicameralism")
        ),

        Questions( objective = Objective( "17", "", "", "",
            "The organ of government responsible for implementation of polices in a state is the",
            "A. legislature",
            "B. judiciary",
            "C. executive",
            "D. public bureau",
            "C. executive")
        ),

        Questions( objective = Objective( "18", "", "", "",
            "A citizen is an individual who",
            "A. has the legal and political rights in a country",
            "B. has lived in a country for sometime",
            "C. enjoys only economic rights",
            "D. enjoys immunity in the country",
            "A. has the legal and political rights in a country")
        ),


        Questions( objective = Objective( "19", "", "", "",
            "Which of the following is a condition for granting citizenship to a foreigner?",
            "A. Swearing an oath of allegiance",
            "B. Possession of a university degree",
            "C. A registered member of a political party",
            "D. Possession of an international passport",
            "A. Swearing an oath of allegiance")
        ),

        Questions( objective = Objective( "20", "", "", "",
            "Citizenship can be acquired through all of the following methods except",
            "A. birth",
            "B. nationalization",
            "C. naturalization",
            "D. marriage",
            "B. nationalization")
        ),

        Questions( objective = Objective( "21", "", "", "",
            "The conferment of citizenship on a distinguished personality of another country is called",
            "A. citizenship by birth",
            "B. honorary citizenship",
            "C. adoption",
            "D. citizenship by registration",
            "B. honorary citizenship")
        ),

        Questions( objective = Objective( "22", "", "", "",
            "The primary aim of any political party is to",
            "A. pressurize the government",
            "B. remain in the opposition",
            "C. control the government",
            "D. ensure fair play in business",
            "C. control the government")
        ),

        Questions( objective = Objective( "23", "", "", "",
            "A manifesto can be defined as the",
            "A. opportunity to form a political party",
            "B. proposed programmes of a political party",
            "C. policy of a political party in power",
            "D. power to rule the masses",
            "B. proposed programmes of a political party")
        ),


        Questions( objective = Objective( "24", "", "", "",
            "Which of the following exists in a one - party state?",
            "A. Only the workers party is allowed to exist",
            "B. Only the students' party is allowed to exist",
            "C. Elections to the legislature are held at the party's conference",
            "D. The ruling party is the only legal party",
            "D. The ruling party is the only legal party")
        ),

        Questions( objective = Objective( "25", "", "", "",
            "Which of the following party systems best represents all shades of opinions?",
            "A. Multi-party",
            "B. Two -party",
            "C. One- party",
            "D. Elite- party",
            "A. Multi-party")
        ),


        Questions( objective = Objective( "26", "", "", "",
            "The practice of multi - party system in West Africa tends to promote",
            "A. sectionalism and factionalism",
            "B. national integration",
            "C. social discrimination",
            "D. economic integration",
            "B. national integration")
        ),


        Questions( objective = Objective( "27", "", "", "",
            "Franchise is the right to",
            "A. express political views",
            "B. control the government",
            "C. vote and be voted for",
            "D. ensure good governance",
            "C. vote and be voted for")
        ),

        Questions( objective = Objective( "28", "", "", "",
            "The following are the aims of an election except that",
            "A. a group sticks on to power",
            "B. there is accountability of the leaders",
            "C. there is a smooth change of government",
            "D. the people determine who rules",
            "A. a group sticks on to power")
        ),


        Questions( objective = Objective( "29", "", "", "",
            "Politics is practically demonstrated during",
            "A. electioneering campaigns",
            "B. parliamentary debates",
            "C. formation of political parties",
            "D. inter-party consultative meetings",
            "A. electioneering campaigns")
        ),

        Questions( objective = Objective( "30", "", "", "",
            "An election held to fill a vacant post in the legislature due to the death or resignation of a member is called",
            "A. run - off election",
            "B. electoral college",
            "C. bye - election",
            "D. primary elections",
            "C. bye - election")
        ),


        Questions( objective = Objective( "31", "", "", "",
            "Which of the following is a function of pressure groups?",
            "A. Represent and protect the rich",
            "B. Protect the interest of government",
            "C. Serve as avenue for political victimization",
            "D. Provide forum for the ventilation of grievances",
            "D. Provide forum for the ventilation of grievances")
        ),

        Questions( objective = Objective( "32", "", "", "",
            "Public opinion is defined as the",
            "A. aggregate views of the people",
            "B. sentiments of opposition parties",
            "C. consensus of the mass media",
            "D. reaction of pressure groups",
            "A. aggregate views of the people")
        ),

        Questions( objective = Objective( "33", "", "", "",
            "Public opinion on the performance of a government is best measured by",
                    "A. military strength",
                    "B. general elections",
                    "C. the mass media",
                    "D. parliamentary debates",
                    "C. the mass media")
        ),


                    Questions( objective = Objective( "34", "", "", "",
                "The method in which a group of people are interviewed on a specific political issue is called",
                "A. referendum",
                "B. individual speech",
                "C. individual writing",
                "D. opinion sampling",
                "D. opinion sampling")
                    ),

            Questions( objective = Objective( "35", "", "", "",
                "The Civil Service is an administrative institution of",
                "A. the executive arm of government",
                "B. Public corporations",
                "C. Para - military organization",
                "D. a business enterprise",
                "A. the executive arm of government")
            ),

            Questions( objective = Objective( "36", "", "", "",
                "Which of the following is a feature of the civil service?",
                "A. Disloloyalty",
                "B. Impartiality",
                "C. Political activism",
                "D. Temporary tenure",
                "B. Impartiality")
            ),

            Questions( objective = Objective( "37", "", "", "",
                "The major source of local government revenue is",
                "A. donations",
                "B. income from investments",
                "C. loans from finance institutions",
                "D. grants from the central authority",
                "D. grants from the central authority")
            ),

            Questions( objective = Objective( "38", "", "", "",
                "In the pre -colonial African political system, the functions of the kingmakers were performed by",
                "A. Age grades",
                "B. Woman",
                "C. Council of elders",
                "D. Special people",
                "A. Age grades")
            ),


            Questions( objective = Objective( "39", "", "", "",
                "Colonialism is defined as the",
                "A. struggle against foreign domination",
                "B. political struggle for independence",
                "C. economic dependence on developed nations",
                "D. imposition of foreign rule on a territory",
                "D. imposition of foreign rule on a territory")
            ),

            Questions( objective = Objective( "40", "", "", "",
                "Casting vote' was one of the ways the Governor in British West Africa controlled the",
                "A. Colonial treasurer",
                "B. Colonial secretary",
                "C. Native authority",
                "D. Legislative council",
                "D. Legislative council")
            ),

            Questions( objective = Objective( "41", "", "", "",
                "The French policy of assimilation was based on the assumption that African culture was",
                "A. expensive",
                "B. inferior",
                "C. unpopular",
                "D. superior",
                "B. inferior")
            ),


            Questions( objective = Objective( "42", "", "", "",
                "The administrative structure  adopted in the French colonial territories was",
                "A. more of a centralized administration",
                "B. focused mainly on traditional rulers",
                "C. favourable to the African age grades",
                "D. for the development of African culture",
                "A. more of a centralized administration")
            ),

            Questions( objective = Objective( "43", "", "", "",
                "The Pan -African Movements emerged as a result of",
                "A. African cultural heritage",
                "B. European racial domination",
                "C. the formation of the African Union",
                "D. the growth of socialism in Europe",
                "B. European racial domination",)
            ),

            Questions( objective = Objective( "44", "", "", "",
                "Which of the following was the first print media used by nationalists to oppose colonialism in the British West Africa?",
                "A. Daily News",
                "B. Daily Times",
                "C. West African pilot",
                "D. Guardian newspaper",
                "C. West African pilot")
            ),

            Questions( objective = Objective( "45", "", "", "",
                "One of the prominent West African nationalist leaders was",
                "A. Kwane Nkrumah",
                "B. Jomo Kenyatta",
                "C. S. L. Akintola",
                "D. Sekou Tource",
                "A. Kwane Nkrumah")
            ),

            Questions( objective = Objective( "46", "", "", "",
                "Which of the following cannot be altered by a military coup d'etat? The",
                "A. constitution",
                "B. legal system",
                "C. legislature",
                "D. state",
                "A. constitution")
            ),

            Questions( objective = Objective( "47", "", "", "",
                "Laws promulgated by a military government are called",
                "A. bills",
                "B. acts",
                "C. decress",
                "D. proclamations",
                "C. decress")
            ),

            Questions( objective = Objective( "48", "", "", "",
                "The origin of the Commonwealth of Nations can be traced to",
                "A. colonial ties",
                "B. world economic order",
                "C. equality of states",
                "D. sovereignty of states",
                "A. colonial ties")
            ),

        Questions( objective = Objective( "49", "", "", "",
                    "The first black African to hold the position of UN Secretary-General was",
                    "A. Salim Ahmed Salirn",
                    "B. Kofi Annan",
                    "C. Emeka Anyaoku",
                    "D. Nelson Mandela",
                    "B. Kofi Annan")
        ),


        Questions( objective = Objective( "50", "", "", "",
                    "The Secretary-General of the United Nations Organization (UNO) is appointed for a period of",
                    "A. there years",
                    "B. five years",
                    "C. Seven years",
                    "D. nine years",
                    "B. five years")
        )



    )

    private  val government2016 = listOf<Questions>(
        Questions(
            objective = Objective( "1", "", "", "",
                "Government refers to all the following except",
                "A. an academic field of study",
                "B. an organized group of people that formulate policies",
                "C. a process of making and enforcing laws",
                "D. an institution made up of people with common interest",
                "B. an organized group of people that formulate policies"
            ),
            theory = Theory( "1", "", "", "",
                question = """
                    (a) What is fascism? 
                    (b) Highlight any four features of fascism
                """.trimIndent(),
                answer = """
                    (a) 
                    Fascism is a totalitarian system of government led by a dictator and emphasizes aggressive nationalism and racism.
                    (b) 
                    (i) The state is hierarchically organized/structured with a leader at the top.
                    (ii) The state is superior to individuals and groups
                    (iii) The government is autocratic
                    (iv) Its characterized by propaganda
                    (v) It is based on racial discrimination
                    
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "2", "", "", "",
                "All the following are experienced by a community without government except",
                "A. insecurity",
                "B. planned development",
                "C. lawlessness",
                "D. political anarchy",
                "B. planned development"
            ),
            theory = Theory( "2", "", "", "",
                question = "Highlight six characteristics of a democratic government.",
                answer = """
                    (i). Drafting and gazetting of the bill
                    (ii). The notice of the bill is given to the Clerk of the House 
                    (iii). First reading: the bill is presented to the house by the Clerk who will also read the nature and purpose of the bill.  
                    (iv). Second reading: here the bill is presented by the sponsor of the bill stating its importance /relevance  
                    (v). Committee stage: the bill is referred to the appropriate Standing Committee for detailed examination. 
                    (vi). Report stage: the appropriate Standing Committee reports back to the House making recommendations and amendments where necessary. 
                    (vii). Debate stage: the committee of the whole house debates the recommendations made by the appropriate Standing Committee and makes suggestions.
                    (viii).Third reading: further scrutiny and final amendments are made before going to the second chamber. If the legislature is bicameral, it undergoes the same process.
                    (ix) Assent: the bill goes to the President or Governor for assent so that the bill can become law.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "3", "", "", "",
                "As an academic field the study of government does not include",
                "A. Political economy",
                "B. Comparative politics",
                "C. Public administration",
                "D. Ecological interaction",
                "D. Ecological interaction"
            ),
            theory = Theory( "3", "", "", "",
                question = "State five factors that can limit the independence of the judiciary ",
                answer = """
                    (i). Government interference i.e. Legislature and Executive
                    (ii). Personal interest of the judge
                    (iii). System of government i.e. authoritarian regime.
                    (iv). Political party influence/interest
                    (v). Crisis of integrity: bribery and corruption
                    (vi). Modes of appointment and dismissal
                    (vii). Inadequate financial resources/poor funding
                    (viii). Poor remuneration for judges and judicial staff
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "4", "", "", "",
                "Which of the following systems of government is authoritarian in nature?",
                "A. Capitalist system",
                "B. Fascism",
                "C. Republicanism",
                "D. Constitutional monarchy",
                "B. Fascism"
            ),
            theory = Theory( "4", "", "", "",
                question = "Highlight six characteristics of a democratic government.",
                answer = """
                    (i). Provide avenues for alternative government if the ruling party fails to meet the aspirations of the people.
                    (ii). Project the interest of minority groups in the country
                    (iii). Help to promote unity and tolerance in the midst of diversities.
                    (iv). Keep the government on its toe to ensure good governance.
                    (v). Help to prevent violation of Fundamental Human Rights.
                    (vi). Offer useful suggestions and ideas for the formulation and implementation of government policies.
                    (vii) Contribute to thorough parliamentary debates and the passage of bills.
                    (viii) Minority party members serve on various  parliamentary committees to ensure smooth administration of the country.
                    (ix) They assist in national consensus building, unity and integrity.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "5", "", "", "",
                "The system that allows the opposition to participate in governance is",
                "A. dictatorial",
                "B. collectivism",
                "C. aristocratic",
                "D. democratic",
                "D. democratic"
            ),
            theory = Theory( "5", "", "", "",
                question = "Identify any five roles performed by the mass media in nation building",
                answer = """
                    (i). It provides employment opportunities to a large number of people such as editors, script writers, pressmen etc.
                    (ii). It generates revenue for the state through the payment of taxes.
                    (iii). It provides feedback to government on its policies.
                    (iv). It informs the people on important national issues.
                    (v). It educates the people about their rights, duties and obligation towards the state.
                    (vi). It serves as an instrument for change in a society e.g. fighting corruption and preaching morality.
                    (vii). It serves as an instrument for protecting I promoting the Fundamental Human Rights of the people.
                    (viii). It serves as a medium through which important national issues can be raised and debated and solutions provided. 
                    (ix). It provides a forum for making constructive criticisms on government policies. 
                    (x). It offers an avenue for expression of opinion by the public on both national and international issues.
                    (xi). It enlightens the people on government's programmes and policies.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "6", "", "", "",
                "Which of the following hinders the establishment of a representative government in a state?",
                "A. Mass illiteracy",
                "B. Existence of pressure groups",
                "C. Vibrant political culture",
                "D. Independent electoral commission",
                "A. Mass illiteracy"
            ),
            theory = Theory( "6", "", "", "",
                question = "Highlight any five features of the Igbo traditional societies.",
                answer = """
                    (i). Decentralized administration e.g. acephalous society.
                    (ii).The compound / family was the unit of administration.
                    (iii). Absence of formal political institutions.
                    (iv). Fusion of religious, judicial and political functions in administration
                    (v). Age- grades were important factors in the administration.
                    (vi). Council of Elders: The family heads played important roles in the administration of the village.
                    (vii). Title holders (Ozo title) played significant roles in the traditional political system.
                    (viii). Decisions were reached by consensus.
                    (ix). Succession to leadership / power is by achievement. 
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "7", "", "", "",
                "Which of the following is not an attribute of a state?",
                "A. Definite territory",
                "B. Population",
                "C. Government",
                "D. Common language",
                "D. Common language"
                ),
            theory = Theory( "7", "", "", "",
                question = """
                    (a). Mention three former French colonies in West Africa.
                    (b). Identify four qualifications for assimilation of indigenous African into French citizenship.
                """.trimIndent(),
                answer = """
                    (a) 
                    Senegal, Guinea, Mali, Niger, Togo, Ivory Coast/La Cote d'Ivoire. Benin/IDahomey, Burkina Faso/Upper Volta, Mauritania.
                    (b) 
                    (i) A native/inhabitant of any of the Senegalese four communes, Rufisque, Dakar,Goree, St. Louis.
                    (ii). An adult aged 18 years and above in the communes.
                    (iii). Ability to speak and write French proficiently.
                    (iv). Profession of the Christian/Catholic faith.
                    (v). Shunning the African culture and embracing French culture. 
                    (vi). Denunciation of polygamy.
                    (vii). Evidence of sound moral conduct.
                    (viii). Must have served the French colonial government for about 10 years.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "8", "", "", "",
                "In a democracy political sovereignty is vested in the",
                "A. judges",
                "B. people",
                "C. legislature",
                "D. executive",
                "B. people"
            ),
            theory = Theory( "8", "", "", "",
                question = "Outline five positive effects of colonialism on West Africa.",
                answer = """
                    (i). Introduction of modem system of government e.g. democracy.
                    (ii). Introduction of currency e.g. pounds.
                    (iii). Establishment of financial institutions i.e. banks and insurance companies.
                    (iv). Establishment of health institutions e.g. hospitals, clinics etc.
                    (v). The development of modem communication systems. i.e. telephone.
                    (vi).Introduction of modern transportation system e.g. roads, railways etc.
                    (vii). Introduction of lingua franca. 
                    (viii). The exploration of West African resources. 
                    (ix). Introduction of modem technology in mining, agriculture etc.
                    (x). Introduction of cash crops like cocoa, cashew, rubber etc.
                    (xi). Introduction of western education.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "9", "", "", "",
                "According to Charles Montesquieu, the theory of separation of powers is to prevent",
                "A. influence",
                "B. authority",
                "C. power",
                "D. arbitrariness",
                "D. arbitrariness"
            ),
            theory = Theory( "9", "", "", "",
                question = """
                    (a) Outline three aims and objectives of Peoples Party (NNP)
                    (b) Highlight two sources of finance of NNP.
                """.trimIndent(),
                answer = """
                    (a)
                    (i). To promote unity in the country.
                    (ii) To provide equal opportunity for all Nigerians. 
                    (iii). Provision of employment opportunities for all.

                    (b)
                    (i). Through special levy on members.
                    (ii). Through federal government! FEDECO grants for political parties.
                    (iii). Membership dues.
                    (iv). Fund raising / Launching.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "10", "", "", "",
                "Decentralization is a common feature of",
                "A. totalitarian system of government",
                "B. federal system of government",
                "C. unitary system of government",
                "D. fascist system",
                "B. federal system of government"
            ),
            theory = Theory( "10", "", "", "",
                question = """
                    (a) What is National Interest?
                    (b) Outline four objectives of your country's foreign policy
                """.trimIndent(),
                answer = """
                    (a). 
                    The national interest of a nation is the summation / totality of what a nation seeks to pursue or achieve in its relationship with others eg. preservation of territorial integrity, national welfare, national economic and industrial development etc.
                     
                    (b).
                    (i) Respect for the independence , sovereignty and territorial integrity of other nations.
                    (ii). Non- interference in the internal affairs of other states/nations
                    (iii). Commitment to functional co-operation as a way of promoting unity among nations.
                    (iv). Commitment to total eradication of racism and colonialism from the African continent.
                    (v). Promotion of international peace and security.

                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "11", "", "", "",
            "Bye-laws are made through",
            "A. delegated legislation",
            "B. executive instrument",
            "C. presidential order",
            "D. emergency power",
            "A. delegated legislation")
        ),
        Questions( objective = Objective( "12", "", "", "",
            "Power is transformed into legal authority through",
            "A. force",
            "B. prayers",
            "C. influence",
            "D. legitimacy",
            "D. legitimacy")
        ),

        Questions( objective = Objective( "13", "", "", "",
            "Conventions are mostly used by states that have",
            "A. a large number of illiterates",
            "B. a lot of people not interested in political activities",
            "C. unwritten constitution",
            "D. rigid constitution",
            "C. unwritten constitution")
        ),

        Questions( objective = Objective( "14", "", "", "",
            "One advantage of a flexible constitution is that it",
            "A. can lead to dictatorship",
            "B. can easily be manipulated",
            "C. is best suited for a federation",
            "D. can be amended by a simple majority",
            "D. can be amended by a simple majority")
        ),

        Questions( objective = Objective( "15", "", "", "",
            "A constitution that requires complicated procedure for its amendment is",
            "A. rigid",
            "B. flexible",
            "C. written",
            "D. unwritten",
            "A. rigid")
        ),

        Questions( objective = Objective( "16", "", "", "",
            "The official who enforces discipline among members of his party in parliament is the",
            "A. majority leader",
            "B. minority leader",
            "C. clerk of the House",
            "D. chief whip",
            "D. chief whip")
        ),

        Questions( objective = Objective( "17", "", "", "",
            "When an action of the executive is declared ultra-vires, it is a control exercised by the",
            "A. public",
            "B. minister",
            "C. judiciary",
            "D. parliament",
            "C. judiciary")
        ),


        Questions( objective = Objective( "18", "", "", "",
            "In a presidential system of government, the president can constitutionally be removed from the office through",
            "A. persuasion",
            "B. impeachment",
            "C. coup d' etat",
            "D. vote -of-no- confidence",
            "B. impeachment")
        ),

        Questions( objective = Objective( "19", "", "", "",
            "Which of the following is an important feature of a Unitary constitution?",
            "A. centralization of power",
            "B. Decentralization of power",
            "C. Deconcentration of power",
            "D. power shared by the constituion",
            "C. Deconcentration of power")
        ),

        Questions( objective = Objective( "20", "", "", "",
            "One of the features of an absolute monarch is that the ruler",
            "A. is elected by the electorate",
            "B. has a definite tenure of office",
            "C. is elected by the representatives of the people",
            "D. wields the supreme power in a state",
            "D. wields the supreme power in a state")
        ),

        Questions( objective = Objective( "21", "", "", "",
            "A notable feature of cabinet system of government is",
            "A. collective responsibility",
            "B. the separation of powers",
            "C. violation of human rights",
            "D. impeachment of the executive",
            "A. collective responsibility")
        ),

        Questions( objective = Objective( "22", "", "", "",
            "All the following are the conditions for the adoption of federalism except",
            "A. size",
            "B. defence",
            "C. population",
            "D. homogeneity",
            "D. homogeneity")
        ),

        Questions( objective = Objective( "23", "", "", "",
            "The privilege citizens enjoyed in a country irrespective of sex, tribe or creed is",
        "A. right",
        "B. constitution",
        "C. manifesto",
        "D. franchise",
        "A. right")
        ),

    Questions( objective = Objective( "24", "", "", "",
    "The judicial order requiring a detained person to be brought before a judge is the writ of",
    "A. Habeas corpus",
    "B. Mandamus",
    "C. Prohibition",
    "D. Certiorari",
    "A. Habeas corpus")
    ),

    Questions( objective = Objective( "25", "", "", "",
    "A political party can contest and win a widely accepted election if it has",
    "A. the ability to rig election",
    "B. intolerant attitude to oppositions",
    "C. a broad-based membership",
    "D. the support of very wealthy politicians",
    "C. a broad-based membership")
    ),


    Questions( objective = Objective( "26", "", "", "",
    "Political parties aim at all the following except",
    "A. contesting elections",
    "B. forming a government",
    "C. organizing general elections",
    "D. educating the electorate politically",
    "C. organizing general elections")
    ),

    Questions( objective = Objective( "27", "", "", "",
    "Which of the following is not a means through which political parties reach the populace?",
    "A. Posters",
    "B. newspapers",
    "C. schools",
    "D. the internet",
    "C. schools")
    ),

    Questions( objective = Objective( "28", "", "", "",
    "An association whose ultimate aim is to influence government policies is known as",
    "A. civil service",
    "B. pressure group",
    "C. political party",
    "D. public corporation",
    "B. pressure group")
    ),

    Questions( objective = Objective( "29", "", "", "",
    "Membership of pressure groups is usually limited because they",
    "A. pursue specific and narrow objectives",
    "B. promote other people's interests",
    "C. do not have dynamic leadership",
    "D. promote the interest of the government",
    "A. pursue specific and narrow objectives")
    ),

    Questions( objective = Objective( "30", "", "", "",
    "Elections are conducted to",
    "A. provide permanent employment for the people",
    "B. make the people choose their leaders",
    "C. known the number of people in a country",
    "D. know the social amenities in the community",
    "B. make the people choose their leaders")
    ),


    Questions( objective = Objective( "31", "", "", "",
    "Suffrage is also known as",
    "A. franchise",
    "B. plebiscite",
    "C. public opinion",
    "D. electoral college",
    "A. franchise")
    ),


    Questions( objective = Objective( "32", "", "", "",
    "For an election to be fair and free Electoral Commission Must be",
    "A. ready to manipulate results",
    "B. ready to reject criticisms",
    "C. headed by a minister in the executive",
    "D. independent of other institutions of government",
    "D. independent of other institutions of government")
    ),

    Questions( objective = Objective( "33", "", "", "",
    "Which of the following categories of people can vote in periodic elections?",
    "A. Minors",
    "B. Aliens",
    "C. Lunatics",
    "D. Citizens",
    "D. Citizens")
    ),


    Questions( objective = Objective( "34", "", "", "",
    "The anonymity of a civil servant means that he",
    "A. is above the law of the land",
    "B. should take part in partisan politics",
    "C. receives neither praise nor blame publicly",
    "D. should be prosecuted for professional misconduct",
    "C. receives neither praise nor blame publicly")
    ),

    Questions( objective = Objective( "35", "", "", "",
    "Which of the following functions is performed by the civil service?",
    "A. Enactment of laws",
    "B. Settlement of disputes",
    "C. Appointment of ministers",
    "D. Implementation of policies",
    "D. Implementation of policies")
    ),


    Questions( objective = Objective( "36", "", "", "",
    "Public corporations are established to",
    "A. make maximum profits",
    "B. help businessmen",
    "C. provide employment for defeated politicians",
    "D. provide utility services to the public at minimal cost",
    "D. provide utility services to the public at minimal cost")
    ),

    Questions( objective = Objective( "37", "", "", "",
    "A minister controls public corporation by",
    "A. provide the corporation's finances",
    "B. auditing the accounts of the corporation personally",
    "C. criticizing the corporation through the mass media",
    "D. ensuring the effective administration of the corporation",
    "D. ensuring the effective administration of the corporation")
    ),

    Questions( objective = Objective( "38", "", "", "",
    "An institution of government that makes bye-laws is the",
    "A. judiciary",
    "B. executive",
    "C. legislature",
    "D. local authorities",
    "D. local authorities")
    ),


    Questions( objective = Objective( "39", "", "", "",
    "Local governments are created to",
    "A. give more powers to the traditional rulers",
    "B. bring the government closer to the people",
    "C. make the people obey more of the local laws",
    "D. take over the functions of the central government",
    "B. bring the government closer to the people")
    ),

    Questions( objective = Objective( "40", "", "", "",
    "Some pre-colonial West African governments were democratic because of the existence of",
    "A. powerful traditional rulers",
    "B. age grades",
    "C. religious institutions",
    "D. checks and balances",
    "D. checks and balances")
    ),

    Questions( objective = Objective( "41", "", "", "",
    "One of the measures introduced by indirect rule was",
    "A. collection and keeping of taxes by the chiefs only",
    "B. not recognizing traditional institutions",
    "C. fixing and collection of taxes by British officials themselves",
    "D. exclusion of the educated elite from the colonial administration",
    "D. exclusion of the educated elite from the colonial administration")
    ),

    Questions( objective = Objective( "42", "", "", "",
    "Which of the following policies was replaced by the French policy of a association?",
    "A. Apartheid",
    "B. Assimilation",
    "C. Indirect rule",
    "D. Frenchification",
    "B. Assimilation")
    ),

    Questions( objective = Objective( "43", "", "", "",
    "The appointment and deposition of chiefs by their people was a demand of the",
    "A. Pan African Movements",
    "B. National Congress of British West Africa",
    "C. West African Students' Union",
    "D. West African Youth League",
    "A. Pan African Movements")
    ),

    Questions( objective = Objective( "44", "", "", "",
    "The desire for constitutional development in British West African Colonies was 'as a result of the",
    "A. rigidity of the constitution",
    "B. desire of the British to review the constitution",
    "C. power of traditional rulers in British West Africa",
    "D. growing agitation of the people for political independence",
    "D. growing agitation of the people for political independence")
    ),

    Questions( objective = Objective( "45", "", "", "",
    "The following are features of military regimes except",
    "A. respect for human rights",
    "B. suspension of the constitution",
    "C. rules by decrees and edicts",
    "D. curtailment of human rights",
    "A. respect for human rights")
    ),


    Questions( objective = Objective( "46", "", "", "",
    "Military regimes in West Africa have often made use of civilians because",
    "A. only civilians can make decrees",
    "B. the soldiers are democratic",
    "C. civilians are part of the armed forces",
    "D. they need the experience of civilians in government",
    "D. they need the experience of civilians in government")
    ),

    Questions( objective = Objective( "47", "", "", "",
    "One criticism leveled against the pre-independence political parties in West Africa was that some of them",
    "A. did not possess credible programmes",
    "B. did not contribute to political development",
    "C. were not national in outlook",
    "D. were instruments of the colonial administration",
    "C. were not national in outlook")
    ),

    Questions( objective = Objective( "48", "", "", "",
    "Foreign policy is the",
    "A. general principles that guide foreigners in a country",
    "B. policy made by a country during war",
    "C. policy made by a country in peace time",
    "D. general principles of a country in the conduct of international relations",
    "D. general principles of a country in the conduct of international relations")
    ),


    Questions( objective = Objective( "49", "", "", "",
    "The Commonwealth of Nations was originally made up of",
    "A. former Portuguese colonies in Africa",
    "B. former Spanish colonies in Africa",
    "C. independent nations formerly under British Empire",
    "D. France and her former colonies in West Africa",
    "C. independent nations formerly under British Empire")
    ),

    Questions( objective = Objective( "50", "", "", "",
    "Which of the following countries was not instrumental to the formation of the United Nations Organization (UNO)?",
    "A. United States of America",
    "B. Britain",
    "C. Germany",
    "D. USSR",
    "C. Germany")
    ),
    )

    private val government2017 = listOf<Questions>(

    )

    private val government2018 = listOf<Questions>(
        Questions(
            objective = Objective( "1", "", "", "",
                "A government performs the following functions except?",
                "A. safeguarding life and property",
                "B. maintaining law and order",
                "C. providing all the needs of its citizens",
                "D. providing basic welfare needs",
                "C. providing all the needs of its citizens"
        ),
            theory = Theory( "1", "", "", "",
                question = """
                    (a) Define society
                    (b) identify for features of a society
                """.trimIndent(),
                answer = """
                    (a). 
                    A society is a group of people who share similar values, laws, traditions, living in an organized community for mutual benefit.       
                    (b).   
                    (i). It is controlled by rules/regulations, norms, conventions and customs.
                    (ii). it applies sanctions on its members as a means of ensuring or effecting discipline
                    (iii). it also applies the use of coercive means to ensure compliance with norms, rules and customs
                    (iv). The rules and regulations of a society are binding on all residents
                    (v). membership of a society is voluntary
                    (vi). It is permanent in nature.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "2", "", "", "",
                "The basic purpose of setting up a state is to?",
                "A. maintain law and order",
                "B. protect foreign interest",
                "C. Promote development",
                "D. provide social facilities",
                "A. maintain law and order"
            ),
            theory = Theory( "2", "", "", "",
                question = """
                    (a) what is communalism
                    (b) state four difference between feudalism and communalism.
                """.trimIndent(),
                answer = """
                    (a). 
                    Communism is a socio-political system based on common ownership of land in which the sense of togetherness in the community is the factor of unity. is it also a system in which the mode of production, the land and what is produced belongs to all members of the community and are equitably distributed or shared.
                    (b). 
                    (i). There is feudal lord in feudalism while there is no lordship in communalism.
                    (ii). In feudalism, land is a symbol of security while in communalism land is used as a means of economic benefit only.
                    (iii). The land belongs to the lord in feudalism, which in communalism the land is communally owned.
                    (iv). The feudal system has conquest and subjugation as its feature while communalism is based on peace and tranquility.
                    (v). Feudalism is a more advanced political system while communalism is operated in a primitive, less advanced society.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "3", "", "", "",
                "A political system in which government controls every aspect of a citizens life is?",
                "A. feudalism",
                "B. monarchy",
                "C. democracy",
                "D. totalitarianism",
                "D. totalitarianism"
            ),
            theory = Theory( "3", "", "", "",
                question = """
                    (a). Highlight three methods of acquiring citizenship
                    (b). Outline two conditions an alien must satisfy before becoming a citizen of another country. 
                """.trimIndent(),
                answer = """
                    (a).
                    (i). Citizenship can be acquired by birth i.e, born by parents who are citizens of the country/state.
                    (ii). Citizenship can be acquired by naturalization; a citizen of another country can apply for citizenship of another country , where he/she resides.
                    (iii). Citizenship by registration i.e, through marriage.
                    (iv). Citizenship by descent or when grandparents claimed to have migrated from somewhere.
                    (v). Adoption through legal process.
                    
                    (b).
                    (i) The alien must have good character or of good reputation. 
                    (ii). The alien must have married a citizen for not less than a period of 5 years.
                    (iii). he/she must have lived in the country for a very long period of time which may range from 15-20 years.
                    (iv). The alien must have renounced his/her former nationality.
                    
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "4", "", "", "",
                "A political system in which the state owns and controls the major means of production is known as?",
                "A. feudalism",
                "B. socialism",
                "C. fascism",
                "D. capitalism",
                "B. socialism"
            ),
            theory = Theory( "4", "", "", "",
                question = """
                    (a) Define opinion poll.
                    (b). state any four factors that make the conduct of opinion poll unreliable in West Africa
                """.trimIndent(),
                answer = """
                    (a). 
                    Opinion poll; Is a scientific method of measuring view, opinions, and choice of the people based on predication of social, political and economic issues facing a state. E.g. Popularity of a government or predicting election results.
                    (b). 
                    (i). Lack of expertise knowledge by officials conducting the polls.
                    (ii). Reliable methods which may produce accurate results are expensive 
                    (iii). High level of illiteracy and ignorance among the people.
                    (iv). Problems of analyzing statistical data/poor knowledge of statistical analysis.
                    (v). Lack of objectivity among the respondents/ interviewees.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "5", "", "", "",
                "communist governments aim at distributing goods and services according to?",
                "A. gender and class",
                "B. loyalty to the party",
                "C. need and ability",
                "D. work and residence",
                "C. need and ability"
                ),
            theory = Theory( "5", "", "", "",
                question = """
                    (a). Define a constituency
                    (b). Highlight any four merits of the singular member constituency.
                """.trimIndent(),
                answer = """
                    a.  A constituency is an electoral district where the electorate exercises their right to elect their representatives into government/parliament.
                    b. 
                    (i) Community support: single member constituency encourages candidates who are community based
                    (ii). Better knowledge of candidates: it enables the voters to have better knowledge of their candidates.
                    (iii). Active interest: It stimulates the interests of the voters in the election.
                    (iv). Easy to operate: It is easy to practices as the winners emerge easily.
                    (v). Reduce cost: It is not costly as opposed to multi- member constituency election where election materials and personnel are fewer.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(  "6", "", "", "",
                "The theory of seperation of power is associated with?",
                "A. Jean Bodin",
                "B. Baron de Montesquieu",
                "C. A.V Dicey",
                "D. J.J Rousseau",
                "B. Baron de Montesquieu"

                ),
            theory = Theory( "6", "", "", "",
                question ="Highlight five features of the hausa/Fulani pre-colonial political system in Nigeria" ,
                answer = """
                    (i). Centralisation of authority and Hierarchy in governance; The Emir was the head of government. He was assisted by appointed chiefs. E.g. Madawaki, Galadima, Waziri.
                    (ii).Payment of tributes to sustain administration: There were rates paid by the people for land, property and cattle.
                    (iii).The size of the Emirate system was large: The emirate occupied a large expanse of land with many populations.
                    (iv).Stratification: The Hausa/ Fulani society was segmented into upper, middle and lower classes, and the Talakawas.
                    (v). Army: Every emirate kept a standing army under the control of Madawaki.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective( "7", "", "", "",
                "The process of taking part in the selection of leaders in a country is political?",
                "A. socialization",
                "B. participation",
                "C. interaction",
                "D. culture",
                "B. participation"
                ),
            theory = Theory( "7", "", "", "",
                question = """
                    (a) What is proto-Nationalism?
                    (b). Identify four features of proto-nationalism.
                """.trimIndent(),

                answer = """
                    (a) 
                    Proto-nationalism; denotes that the activities of the nationalist movements were geared towards reforms and participation of the natives in the colonial administration rather than for immediate self-government.

                    (b) 
                    (i). Demands of the nationalists were aimed at reforms and participation in the colonial administration.
                    (ii).Movements formed under proto-nationalism were elitist, i.e. domination by the elites.
                    (iii).The proto-nationalism organizers employed constitutional and non-violent means in seeking redress.
                    (iv).The leaders were conservative their activities were restricted to the urban centers.
                    (v) There was formation of inter-territorial movements such as the National Congress of British West Africa (NCBWA).
                    (vi) It was also characterized by the formation of youth movements e.g Gold Coast Congress etc.

                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(
                "8", "", "", "",
                "By comparism, a state is?",
                "A. less permanent than a government",
                "B. more permanent than a government",
                "C. more changeable than a government",
                "D. equally permanent with a government",
                "B. more permanent than a government"
            ),
            theory = Theory( "8", "", "", "",
                question = "Highlight five functions of the president in the 1989 constitution of Nigeria",
                answer = """
                    (I). The President is the Chief Executive of the country who performed the day to day administration of the country. 
                    (ii). He inaugurated the National Assembly at the beginning of each session. 
                    (iii). He assented to bills passed by the National Assembly into laws.
                    (iv). He appointed key officers e.g. ministers, ambassadors, the CBN Governor, Director of government agencies among others.
                    (v). He represented the country at international conferences like UNO, AU, Commonwealth, ECOWAS, etc.
                    (vi) He was the Commander-in-Chief of the Armed Forces.
                    (vii). He performed ceremonial functions
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(
                "9", "", "", "",
                "In modern democracy, a government is?",
                "A. a contract between the rulers and the ruled",
                "B. a preserve of the political party in power",
                "C. monopoly of the ethnic groups in the majority",
                "D. alternation of power between the minority and majority tribes",
                "A. a contract between the rulers and the ruled"
            ),
            theory = Theory( "9", "", "", "",
                question = "What mechanism should be put in place to forestall military intervention in politics.",
                answer = """
                    (i). The existence and promotion of democratically elected government
                    (ii). Promotion of good governance.
                    (iii). Eradication of corruption and abuse of office.
                    (iv). Avoidance of electoral malpractice by encouraging free and fair elections.
                    (v). Encouraging national unity by suppressing tribalism and nepotism.
                    (vi). Enhanced conditions of services for the military.
                    (vii). Proper civic education for the armed forces on their role/Enlightenment for military on their roles.
                    (viii). Promotion of accountability and transparency in governance.
                    (ix). Appeal to civilian administration to conform to the constitutional tenure of office.
                    (x). Equitable distribution of both human and natural resources.
                """.trimIndent()
            )
        ),
        Questions(
            objective = Objective(
                "10", "", "", "",
                "The rule of law can be limited by?",
                "A. power",
                "B. state of emergency",
                "C. legitimacy",
                "D. checks and balances",
                "B. state of emergency",
            ),
            theory = Theory( "10", "", "", "",
                question = "State five obstacles to the implementation of the Economic Community of West African States (ECOWAS) aims and objectives.",
                answer = """
                    (i) Intra and inter states conflicts/ political instability, e.g. Mali; DR Congo etc.
                    (ii). Fear or domination of smaller states by larger ones.
                    (iii). Inability of member states to pay their dues.
                    (iv). Inability to implement most of its policies.
                    (v). Language barrier.
                    (vi). The absence of an Africa High Command/ standing army.

                """.trimIndent()
            )
        ),
        Questions( objective = Objective( "11", "", "", "",
            "The principle of separation of power becomes meaningful when it is linked with the concept of?",
            "A. the certainty of the law",
            "B. checks and balances",
            "C. legality of the law",
            "D. judicial independence",
            "B. checks and balances")
        ),

        Questions( objective = Objective( "12", "", "", "",
            "which of the following  doesn’t militate against representative government in West Africa.",
            "A. electoral irregularities",
            "B. coup d' etat",
            "C. gagged media",
            "D. universal adult suffrage",
            "D. universal adult suffrage")
        ),

        Questions( objective = Objective( "13", "", "", "",
            "Those who believe in democracy and good governance are opposed to a single party system because?",
                    "A. encourages weak leadership",
                    "B. does not ensure national unity",
                    "C. curtails personal liberty",
                    "D. encourages divisiveness",
                    "C. curtails personal liberty")
        ),

        Questions( objective = Objective( "14", "", "", "",
                "The fundamental law of a country refers to its?",
                "A. acts of parliament",
                "B. conventions",
                "C. constitution",
                "D. judicial precedence",
                "C. constitution")
        ),

        Questions( objective = Objective( "15", "", "", "",
                "A country's constitution could be derived from the following sources except?",
                "A. judicial precedents",
                "B. customary sources",
                "C. statutory sources",
                "D. party manifestoes",
                "D. party manifestoes")
        ),

        Questions( objective = Objective( "16", "", "", "",
                "planning and formulation of government policies are first initiated at?",
                "A. cabinet meetings",
                "B. media houses",
                "C. political rallies",
                "D. open forum",
                "A. cabinet meetings")
        ),

            Questions( objective = Objective( "17", "", "", "",
                "which of the following is the primary function of a parliament",
                "A. impeachment of the president",
                "B. making of laws",
                "C. ratifying international treaties",
                "D. acting as an electoral college",
                "B. making of laws")
            ),

            Questions( objective = Objective( "18", "", "", "",
                "judicial review is a mechanism for checking?",
                "A. arbitrary use of power",
                "B. irresponsible journalism",
                "C. electoral malpractices",
                "D. military adventures",
                "A. arbitrary use of power")
            ),

            Questions( objective = Objective( "19", "", "", "",
                "in a parliamentary system of government, the legislature and executive are fused to ensure",
                "A. supremacy of the ruling party in administering the state",
                "B. smoothness in the administration of the state",
                "C. the constitution is read in parliament at all time",
                "D. the judiciary consults parliament before ruling on cases",
                "B. smoothness in the administration of the state")
            ),

            Questions( objective = Objective( "20", "", "", "",
                "A country with homogeneous societies and a small population is suitable for the establishment?",
                "A. a unitary state",
                "B. a nation state",
                "C. a federal state",
                "D. an autonomous state",
                "B. a nation state")
            ),

            Questions( objective = Objective( "21", "", "", "",
                "which of the following factors usually leads to the collapse of a confederal state",
                "A. weak central government",
                "B. absent of a confederal parliament",
                "C. ill equipped armed forces",
                "D. absence of a ceremonial head of state",
                "A. weak central government")
            ),

            Questions( objective = Objective( "22", "", "", "",
                "in the presidential system of government, the chief executive is responsible to the?",
                "A. judiciary",
                "B. monarch",
                "C. electorate",
                "D. senate",
                "C. electorate")
            ),

            Questions( objective = Objective( "23", "", "", "",
                "which of the following alternatives is a feature of a federation",
                "A. unwritten constitution",
                "B. unicameral legislature",
                "C. supremacy of the constitution",
                "D. right to secede",
                "C. supremacy of the constitution")
            ),

            Questions( objective = Objective( "24", "", "", "",
                "A federal government is a form of?",
                "A. decentralization",
                "B. centralization",
                "C. confederation",
                "D. revolution",
                "B. centralization")
            ),

            Questions( objective = Objective( "25", "", "", "",
                "To preserve individual liberties, the judiciary should?",
                "A. consist of honest and impartial judges",
                "B. be appointed by the executives",
                "C. be prosecuted for judgment against the executive",
                "D. participate in partisan politics",
                "A. consist of honest and impartial judges")
            ),

            Questions( objective = Objective( "26", "", "", "",
                "citizens can seek redress against injustice from the state through the",
                "A. ombudsman",
                "B. head of civil service",
                "C. civil service commission",
                "D. titular executive",
                "A. ombudsman")
            ),

                Questions( objective = Objective( "27", "", "", "",
                    "which of these is not a source of revenue for political parties?",
                    "A. dues",
                    "B. grants",
                    "C. tolls",
                    "D. donations",
                    "C. tolls")
                ),

                Questions( objective = Objective( "28", "", "", "",
                    "which of these functions is performed by both political parties and pressure groups?",
                    "A. interest aggregation and articulation",
                    "B. source of mediation in a state",
                    "C. provision of specialized information",
                    "D. seeking to manage the affairs of the state",
                    "A. interest aggregation and articulation")
                ),

                Questions( objective = Objective( "29", "", "", "",
                    "pressure groups seek to influence the polices of government.",
                    "A. to the advantage of their members",
                    "B. so that all citizens can benefit",
                    "C. to suit the manifestos of political parties",
                    "D. to conform with electoral act",
                    "A. to the advantage of their members")
                ),

                Questions( objective = Objective( "30", "", "", "",
                    "which of the following agencies helps the most in shaping public opinion?",
                    "A. pressure groups",
                    "B. mass media",
                    "C. college and universities",
                    "D. peer groups",
                    "B. mass media")
                ),

                Questions( objective = Objective( "31", "", "", "",
                    "public opinion can be measured through all of the following except the?",
                    "A. imposition of laws without any debate",
                    "B. conduct of opinion",
                    "C. general review",
                    "D. holding of referendum in a state",
                    "A. imposition of laws without any debate")
                ),

                Questions( objective = Objective( "32", "", "", "",
                    "on which of the following grounds can a citizen abstain from voting",
                    "A. religion",
                    "B. education",
                    "C. wealth",
                    "D. status",
                    "D. status")
                ),

                Questions( objective = Objective( "33", "", "", "",
                    "An electoral system which allows party members to elect candidates for elective offices is called?",
                    "A. by election",
                    "B. primary election",
                    "C. general election",
                    "D. direct election",
                    "B. primary election")
                ),


                Questions( objective = Objective( "34", "", "", "",
                    "Indirect election is best described as?",
                    "A. only women electing legislators",
                    "B. the citizenry electing legislators",
                    "C. electoral college electing legislators",
                    "D. only adults electing legislators",
                    "C. electoral college electing legislators")
                ),



                Questions( objective = Objective( "35", "", "", "",
                    "The class that controls and supervises the activities of the executive class in the civil service is?",
                    "A. clerical class",
                    "B. manipulative class",
                    "C. professional class",
                    "D. administrative class",
                    "D. administrative class")
                ),


                Questions( objective = Objective( "36", "", "", "",
                    "The agency responsible for investigating allegation of maladministration and punishing offending career officers in the executive is the?",
                    "A. federal character commission",
                    "B. ethics commission",
                    "C. judicial commission",
                    "D. public/civil service commission",
                    "D. public/civil service commission")
                ),


                Questions( objective = Objective( "37", "", "", "",
                    "The anonymity of civil servants means that they should not be?",
                    "A. prosecuted for any professional misconduct",
                    "B. disciplined because of their expertise",
                    "C. above the law of the land",
                    "D. praised or blamed publicly",
                    "D. praised or blamed publicly")
                ),


                Questions( objective = Objective( "38", "", "", "",
                    "The following were limitations imposed on traditional rulers under colonial rule except?",
                    "A. were not permitted to raise armed forces",
                    "B. had no power to impose tax",
                    "C. had no power to install or dispose a chief",
                    "D. were no longer spiritual heads of the people",
                    "D. were no longer spiritual heads of the people")
                ),


                Questions( objective = Objective( "39", "", "", "",
                    "A system of administration which allowed traditional rulers to rule their people under the supervision of the British officials in West Africa is?",
                    "A. divide and rule",
                    "B. colonization",
                    "C. indirect rule",
                    "D. assimilation",
                    "C. indirect rule")
                ),


                Questions( objective = Objective( "40", "", "", "",
                    "one reason for the adoption of indirect rule in British West Africa was?",
                    "A. availability of British officials",
                    "B. to ensure justice",
                    "C. inadequate finance",
                    "D. to assimilate the indigenes",
                    "D. to assimilate the indigenes ")
                ),


                Questions( objective = Objective( "41", "", "", "",
                    "local government is established in order to?",
                    "A. bring government nearer to the people",
                    "B. build churches and mosque",
                    "C. curb corruption in the society",
                    "D. promote political apathy",
                    "A. bring government nearer to the people")
                ),


                Questions( objective = Objective( "42", "", "", "",
                    "which of the following policies replaced assimilation?",
                    "A. indigenat",
                    "B. loi cadre",
                    "C. association",
                    "D. indirect rule",
                    "C. association")
                ),


                Questions( objective = Objective( "43", "", "", "",
                    "which of the following is a reason for the failure of the assimilation policy in French West Africa?",
                    "A. the change in the name of their culture",
                    "B. the refusal of Africans to be culturally colonized",
                    "C. the democratic policy of the French",
                    "D. bribery of the opinion leaders by the French",
                    "B. the refusal of Africans to be culturally colonized")
                ),


                Questions( objective = Objective( "44", "", "", "",
                    "Nationalism prior to the second world war was led by?",
                    "A. educated elites and chiefs",
                    "B. chiefs and elders",
                    "C. aggrieved cocoa farmers",
                    "D. African merchants",
                    "A. educated elites and chiefs")
                ),


                Questions( objective = Objective( "45", "", "", "",
                    "which of the following is not a factor leading to military intervention in west African states?",
                    "A. excessive control of public enterprise",
                    "B. falsification of election results",
                    "C. mismanagement of the country's economy",
                    "D. corruption in high places",
                    "A. excessive control of public enterprise")
                ),


                Questions( objective = Objective( "46", "", "", "",
                    "one of the problems of military administration in West Africa is that soldiers",
                    "A. are representatives of the people",
                    "B. lack discipline",
                    "C. are not well organized",
                    "D. are not trained for governance",
                    "D. are not trained for governance")
                ),


                Questions( objective = Objective( "47", "", "", "",
                    "foreign policy of a country could be influenced by?",
                    "A. personality of political leader",
                    "B. number of schools in a country",
                    "C. number of ministers in a country",
                    "D. national",
                    "A. personality of political leader")
                ),


                Questions( objective = Objective( "48", "", "", "",
                    "In order to promote democracy and  good governance, the commonwealth of Nations",
                    "A. prosecutes leaders who commit atrocities at the international criminal court",
                    "B. organises seminars and training programs on technical assistance to members",
                    "C. sanction members who do not pay their dues",
                    "D. sponsors election observer teams to monitor the conduct of elections.",
                    "D. sponsors election observer teams to monitor the conduct of elections.")
                ),


                Questions( objective = Objective( "49", "", "", "",
                    "which of the following is not a problem faced by ECOWAS",
                    "A. financial security",
                    "B. political instability",
                    "C. larger market",
                    "D. colonial heritage",
                    "A. financial security")
                ),


                Questions( objective = Objective( "50", "", "", "",
                    "The united nation organisation (UNO) is primary regarded as successful because",
                    "A. its members continue to increase",
                    "B. of its control of outbreak of another world war",
                    "C. all member countries have veto power ",
                    "D. more member countries acquire more nuclear power",
                    "B. of its control of outbreak of another world war")
                ),



        )


     val government = listOf<List<Questions>>(
        government2012, government2014, government2015 , government2016, government2018
     )

}