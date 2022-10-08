package com.example.repository.account

import com.example.repository.Subjects
import com.pktech.data.repository.account.Account2012Repo


class AccountAllYear {

    fun accountAllYear(): List<Subjects> {

        val account2012Repo = Account2012Repo()

        val accountAllYear = listOf<Subjects>(

            Subjects(
                year = "2012",
                subject = account2012Repo.account2012
            )
        )

        return accountAllYear
    }
}