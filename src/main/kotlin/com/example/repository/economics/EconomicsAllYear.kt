package com.example.repository.economics

import com.example.repository.Chemistry
import com.example.repository.Economics
import com.example.repository.chemistry.Chemistry2012Repo

class EconomicsAllYear {

    fun economicsAllYear(): List<Economics> {

        val economics2012Repo = Economics2012Repo()
        val economics2013Repo = Economics2013Repo()
        val economics2014Repo = Economics2014Repo()
        val economics2015Repo = Economics2015Repo()
        val economics2016Repo = Economics2016Repo()
        val economics2017Repo = Economics2017Repo()
        val economics2018Repo = Economics2018Repo()
        val economics2019Repo = Economics2019Repo()
        val economics2020Repo = Economics2020Repo()

        val economicsAllYear = listOf<Economics>(
            Economics(year = "2012", economics2012Repo.economics2012),
            Economics(year = "2013", economics2013Repo.economics2013),
            Economics(year = "2014", economics2014Repo.economics2014),
            Economics(year = "2015", economics2015Repo.economics2015),
            Economics(year = "2016", economics2016Repo.economics2016),
            Economics(year = "2017", economics2017Repo.economics2017),
            Economics(year = "2018", economics2018Repo.economics2018),
            Economics(year = "2019", economics2019Repo.economics2019),
            Economics(year = "2020", economics2020Repo.economics2020),
        )

        return economicsAllYear
    }
}