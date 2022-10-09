package com.example.repository.physics

import com.example.repository.Physics


class PhysicsAllYear {

    fun physicsAllYear(): List<Physics> {

        val physics2019 = Physics2019Repository()

        val physicsAllYear = listOf<Physics>(

            Physics(
                year = "2019",
                physics = physics2019.physics2019
            )
        )

        return physicsAllYear
    }
}