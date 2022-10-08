package com.example.repository.english

import com.example.repository.Subjects


class EnglishAllYear {

    fun englishAllYear(): List<Subjects> {

        val english2013 = English2013Repo()

        val englishAllYear = listOf<Subjects>(

            Subjects(
                year = "2013",
                subject = english2013.english2013
            )
        )

        return englishAllYear
    }
}