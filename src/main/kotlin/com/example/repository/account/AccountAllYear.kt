package com.example.repository.account

import com.example.repository.Account


class AccountAllYear {

    fun accountAllYear(): List<Account> {

        val account2012Repo = Account2012Repo()

        val accountAllYear = listOf<Account>(

            Account(
                year = "2012",
                account = account2012Repo.account2012
            )
        )

        return accountAllYear
    }
}