package com.example.repository.biology

import com.example.repository.Agriculture
import com.example.repository.Biology


class BiologyAllYear {

    fun biologyAllYear(): List<Biology> {

        val biology2012Repo = Biology2012Repo()
        val biology2013Repo = Biology2013Repo()
        val biology2014Repo = Biology2014Repo()
        val biology2015Repo = Biology2015Repo()
        val biology2017Repo = Biology2017Repo()
        val biology2018Repo = Biology2018Repo()
        val biology2019Repo = Biology2019Repo()
        val biology2020Repo = Biology2020Repo()

        val biologyAllYear = listOf<Biology>(

            Biology(year = "2012", biology = biology2012Repo.biology2012),
            Biology(year = "2013", biology = biology2013Repo.biology2013),
            Biology(year = "2014", biology = biology2014Repo.biology2014),
            Biology(year = "2015", biology = biology2015Repo.biology2015),
            Biology(year = "2017", biology = biology2017Repo.biology2017),
            Biology(year = "2018", biology = biology2018Repo.biology2018),
            Biology(year = "2019", biology = biology2019Repo.biology2019),
            Biology(year = "2020", biology = biology2020Repo.biology2020),
        )

        return biologyAllYear
    }
}