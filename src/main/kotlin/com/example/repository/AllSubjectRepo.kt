package com.example.repository

import com.example.repository.english.EnglishRepo
import com.example.repository.maths.MathsRepoDB

class AllSubjectRepo {

    private val englishRepo = EnglishRepo()
    private val mathsRepoDB = MathsRepoDB()

    val allSubjectRepo = listOf<Subjects>(
        Subjects(
            subject = englishRepo.englishYear,
            id = 1
        ),
        Subjects(
            subject = mathsRepoDB.mathYear,
            id = 2
        ),
        

    )

}