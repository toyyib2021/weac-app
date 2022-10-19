package com.example.repository.literture
import com.example.repository.Literature


class LiteratureAllYear {
    fun literatureAllYear(): List<Literature> {

        val literature2012Repo = Literature2012Repo()
        val literature2013Repo = Literature2013Repo()
        val literature2014Repo = Literature2014Repo()
        val literature2015Repo = Literature2015Repo()
        val literature2016Repo = Literature2016Repo()
        val literature2017Repo = Literature2017Repo()
        val literature2018Repo = Literature2018Repo()
        val literature2019Repo = Literature2019Repo()
        val literature2020Repo = Literature2020Repo()

        val literatureAllYear = listOf<Literature>(
            Literature(year = "2012", literature2012Repo.literature2012),
            Literature(year = "2013", literature2013Repo.literature2013),
            Literature(year = "2014", literature2014Repo.literature2014),
            Literature(year = "2015", literature2015Repo.literature2015),
            Literature(year = "2016", literature2016Repo.literature2016),
            Literature(year = "2017", literature2017Repo.literature2017),
            Literature(year = "2018", literature2018Repo.literature2018),
            Literature(year = "2019", literature2019Repo.literature2019),
            Literature(year = "2020", literature2020Repo.literature2020),
        )

        return literatureAllYear
    }
}