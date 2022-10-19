package com.example.repository.account

import com.example.repository.Account


class AccountAllYear {

    fun accountAllYear(): List<Account> {

        val account2012Repo = Account2012Repo()
        val account2013Repo = Account2013Repo()
        val account2014Repo = Account2014Repo()
        val account2015Repo = Account2015Repo()
        val account2016Repo = Account2016Repo()
        val account2017Repo = Account2017Repo()
        val account2018Repo = Account2018Repo()
        val account2019Repo = Account2019Repo()

        val accountAllYear = listOf<Account>(

            Account(year = "2012", account = account2012Repo.account2012),
            Account(year = "2013", account = account2013Repo.account2013),
            Account(year = "2014", account = account2014Repo.account2014),
            Account(year = "2015", account = account2015Repo.account2015),
            Account(year = "2016", account = account2016Repo.account2016),
            Account(year = "2017", account = account2017Repo.account2017),
            Account(year = "2018", account = account2018Repo.account2018),
            Account(year = "2019", account = account2019Repo.account2019),
        )

        return accountAllYear
    }
}