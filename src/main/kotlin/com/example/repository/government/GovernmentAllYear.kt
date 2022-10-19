package com.example.repository.government

import com.example.repository.Government

class GovernmentAllYear {

    fun governmentAllYear(): List<Government> {

        val government2012Repo = Government2012Repo()
        val government2013Repo = Government2013Repo()
        val government2014Repo = Government2014Repo()
        val government2015Repo = Government2015Repo()
        val government2016Repo = Government2016Repo()
        val government2017Repo = Government2017Repo()
        val government2018Repo = Government2018Repo()
        val government2019Repo = Government2019Repo()
        val government2020Repo = Government2020Repo()

        val governmentAllYear = listOf<Government>(
            Government(year = "2012", government2012Repo.government2012),
            Government(year = "2013", government2013Repo.government2013),
            Government(year = "2014", government2014Repo.government2014),
            Government(year = "2015", government2015Repo.government2015),
            Government(year = "2016", government2016Repo.government2016),
            Government(year = "2017", government2017Repo.government2017),
            Government(year = "2018", government2018Repo.government2018),
            Government(year = "2019", government2019Repo.government2019),
            Government(year = "2020", government2020Repo.government2020),
        )
        return governmentAllYear
    }

}