package com.example.repository.mathematics

import com.example.repository.Subjects


class MathsAllYear {

    fun mathsAllYear(): List<Subjects> {

        val maths2012Repo = Maths2012Repo()

        val mathsAllYear = listOf<Subjects>(

            Subjects(
                year = "2012",
                subject = maths2012Repo.maths2012
            )
        )

        return mathsAllYear
    }
}