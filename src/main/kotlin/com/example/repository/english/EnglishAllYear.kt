package com.example.repository.english

import com.example.repository.English


class EnglishAllYear {

    fun englishAllYear(): List<English> {

        val english2012 = English2012Repo()
        val english2013 = English2013Repo()
        val english2014 = English2014Repo()
        val english2015 = English2015Repo()
        val english2016 = English2016Repo()
        val english2017 = English2017Repo()
        val english2018 = English2018Repo()
        val english2019 = English2019Repo()
        val english2020 = English2020Repo()

        val englishAllYear = listOf<English>(
            English(year = "2012", english = english2012.english2012),
            English(year = "2013", english = english2013.english2013),
            English(year = "2014", english = english2014.english2014),
            English(year = "2015", english = english2015.english2015),
            English(year = "2016", english = english2016.english2016),
            English(year = "2017", english = english2017.english2017),
            English(year = "2018", english = english2018.english2018),
            English(year = "2019", english = english2019.english2019),
            English(year = "2020", english = english2020.english2020),
        )

        return englishAllYear
    }
}