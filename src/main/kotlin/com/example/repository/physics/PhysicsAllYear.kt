package com.example.repository.physics

import com.example.repository.Physics


class PhysicsAllYear {

    fun physicsAllYear(): List<Physics> {

        val physics2012Repo = Physics2012Repo()
        val physics2013Repo = Physics2013Repo()
        val physics2014Repo = Physics2014Repo()
        val physics2015Repo = Physics2015Repo()
        val physics2016Repo = Physics2016Repo()
        val physics2017Repo = Physics2017Repo()
        val physics2018Repo = Physics2018Repo()
        val physics2019Repo = Physics2019Repo()
        val physics2020Repo = Physics2020Repo()


        val physicsAllYear = listOf<Physics>(

            Physics(year = "2012", physics = physics2012Repo.physics2012),
            Physics(year = "2013", physics = physics2013Repo.physics2013),
            Physics(year = "2014", physics = physics2014Repo.physics2014),
            Physics(year = "2015", physics = physics2015Repo.physics2015),
            Physics(year = "2016", physics = physics2016Repo.physics2016),
            Physics(year = "2017", physics = physics2017Repo.physics2017),
            Physics(year = "2018", physics = physics2018Repo.physics2018),
            Physics(year = "2019", physics = physics2019Repo.physics2019),
            Physics(year = "2020", physics = physics2020Repo.physics2020),
        )

        return physicsAllYear
    }
}