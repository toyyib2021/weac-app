package com.example.repository.physics

import com.example.repository.Subjects


class PhysicsAllYear {

    fun physicsAllYear(): List<Subjects> {

        val physics2019 = Physics2019Repository()

        val physicsAllYear = listOf<Subjects>(

            Subjects(
                year = "2019",
                subject = physics2019.physics2019
            )
        )

        return physicsAllYear
    }
}