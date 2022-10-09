package com.example.repository.mathematics

import com.example.repository.Maths


class MathsAllYear {

    fun mathsAllYear(): List<Maths> {

        val maths2012Repo = Maths2012Repo()

        val mathsAllYear = listOf<Maths>(

            Maths(
                year = "2012",
                maths = maths2012Repo.maths2012
            )
        )

        return mathsAllYear
    }
}