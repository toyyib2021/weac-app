package com.example.repository.chemistry


import com.example.repository.Chemistry

class ChemistryAllYear {

    fun chemistryAllYear(): List<Chemistry> {

        val chemistry2012Repo = Chemistry2012Repo()
        val chemistry2013Repo = Chemistry2013Repo()
        val chemistry2014Repo = Chemistry2014Repo()
        val chemistry2015Repo = Chemistry2015Repo()
        val chemistry2016Repo = Chemistry2016Repo()
        val chemistry2017Repo = Chemistry2017Repo()
        val chemistry2018Repo = Chemistry2018Repo()
        val chemistry2019Repo = Chemistry2019Repo()
        val chemistry2020Repo = Chemistry2020Repo()

        val chemistryAllYear = listOf<Chemistry>(
            Chemistry(year = "2012", chemistry2012Repo.chemistry2012),
            Chemistry(year = "2013", chemistry2013Repo.chemistry2013),
            Chemistry(year = "2014", chemistry2014Repo.chemistry2014),
            Chemistry(year = "2015", chemistry2015Repo.chemistry2015),
            Chemistry(year = "2016", chemistry2016Repo.chemistry2016),
            Chemistry(year = "2017", chemistry2017Repo.chemistry2017),
            Chemistry(year = "2018", chemistry2018Repo.chemistry2018),
            Chemistry(year = "2019", chemistry2019Repo.chemistry2019),
            Chemistry(year = "2020", chemistry2020Repo.chemistry2020)
        )

        return chemistryAllYear
    }
}