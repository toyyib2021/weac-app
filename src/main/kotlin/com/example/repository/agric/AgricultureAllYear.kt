package com.example.repository.agric

import com.example.repository.Agriculture


class AgricultureAllYear {

    fun agricultureAllYear(): List<Agriculture> {

        val agriculture2012Repo = Agriculture2012Repo()
        val agriculture2013Repo = Agriculture2013Repo()
        val agriculture2014Repo = Agriculture2014Repo()
        val agriculture2015Repo = Agriculture2015Repo()
        val agriculture2016Repo = Agriculture2016Repo()
        val agriculture2017Repo = Agriculture2017Repo()
        val agriculture2018Repo = Agriculture2018Repo()
        val agriculture2019Repo = Agriculture2019Repo()
        val agriculture2020Repo = Agriculture2020Repo()

        val agricultureAllYear = listOf<Agriculture>(

            Agriculture(year = "2012", agriculture = agriculture2012Repo.agriculture2012),
            Agriculture(year = "2013", agriculture = agriculture2013Repo.agriculture2013),
            Agriculture(year = "2014", agriculture = agriculture2014Repo.agriculture2014),
            Agriculture(year = "2015", agriculture = agriculture2015Repo.agriculture2015),
            Agriculture(year = "2016", agriculture = agriculture2016Repo.agriculture2016),
            Agriculture(year = "2017", agriculture = agriculture2017Repo.agriculture2017),
            Agriculture(year = "2018", agriculture = agriculture2018Repo.agriculture2018),
            Agriculture(year = "2019", agriculture = agriculture2019Repo.agriculture2019),
            Agriculture(year = "2020", agriculture = agriculture2020Repo.agriculture2020)

        )

        return agricultureAllYear
    }
}