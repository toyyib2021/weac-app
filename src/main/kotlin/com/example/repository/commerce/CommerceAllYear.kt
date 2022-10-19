package com.example.repository.commerce
import com.example.repository.Commerce

class CommerceAllYear {

    fun commerceAllYear(): List<Commerce> {

        val commerce2012Repo = Commerce2012Repo()
        val commerce2013Repo = Commerce2013Repo()
        val commerce2014Repo = Commerce2014Repo()
        val commerce2015Repo = Commerce2015Repo()
        val commerce2016Repo = Commerce2016Repo()
        val commerce2017Repo = Commerce2017Repo()
        val commerce2018Repo = Commerce2018Repo()
        val commerce2019Repo = Commerce2019Repo()
        val commerce2020Repo = Commerce2020Repo()


        val commerceAllYear = listOf<Commerce>(
            Commerce(year = "2012", commerce2012Repo.commerce2012 ),
            Commerce(year = "2013", commerce2013Repo.commerce2013 ),
            Commerce(year = "2014", commerce2014Repo.commerce2014 ),
            Commerce(year = "2015", commerce2015Repo.commerce2015 ),
            Commerce(year = "2016", commerce2016Repo.commerce2016 ),
            Commerce(year = "2017", commerce2017Repo.commerce2017 ),
            Commerce(year = "2018", commerce2018Repo.commerce2018 ),
            Commerce(year = "2019", commerce2019Repo.commerce2019 ),
            Commerce(year = "2020", commerce2020Repo.commerce2020 ),

        )
        return commerceAllYear
    }
}