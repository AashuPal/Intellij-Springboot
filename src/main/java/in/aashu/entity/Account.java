package in.aashu.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {

    private String holderName;
    private String branch;

    @EmbeddedId
    private AccountPk accountPk;

    public Account(String holderName, String branch, AccountPk accountPk) {
        this.holderName = holderName;
        this.branch = branch;
        this.accountPk = accountPk;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "holderName='" + holderName + '\'' +
                ", branch='" + branch + '\'' +
                ", accountPk=" + accountPk +
                '}';
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public AccountPk getAccountPk() {
        return accountPk;
    }

    public void setAccountPk(AccountPk accountPk) {
        this.accountPk = accountPk;
    }
}
