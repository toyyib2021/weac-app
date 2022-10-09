package com.example.repository.english

import com.example.repository.English


class EnglishAllYear {

    fun englishAllYear(): List<English> {

        val english2013 = English2013Repo()

        val englishAllYear = listOf<English>(
            English(
                year = "2013",
                english = english2013.english2013
            )
        )

        return englishAllYear
    }
}