package com.example.repository.civic

import com.example.repository.Chemistry
import com.example.repository.CivicEdu
import com.example.repository.chemistry.Chemistry2012Repo

class CivicAllYear {

    fun civicEducationAllYear(): List<CivicEdu> {

        val civicEducation2014Repo = CivicEducation2014Repo()
        val civicEducation2015Repo = CivicEducation2015Repo()
        val civicEducation2016Repo = CivicEducation2016Repo()
        val civicEducation2017Repo = CivicEducation2017Repo()
        val civicEducation2018Repo = CivicEducation2018Repo()
        val civicEducation2019Repo = CivicEducation2019Repo()
        val civicEducation2020Repo = CivicEducation2020Repo()

        val civicEducationAllYear = listOf<CivicEdu>(
            CivicEdu(year = "2014", civicEducation2014Repo.civicEducation2014),
            CivicEdu(year = "2015", civicEducation2015Repo.civicEducation2015),
            CivicEdu(year = "2016", civicEducation2016Repo.civicEducation2016),
            CivicEdu(year = "2017", civicEducation2017Repo.civicEducation2017),
            CivicEdu(year = "2018", civicEducation2018Repo.civicEducation2018),
            CivicEdu(year = "2019", civicEducation2019Repo.civicEducation2019),
            CivicEdu(year = "2020", civicEducation2020Repo.civicEducation2020),
        )

        return civicEducationAllYear
    }
}