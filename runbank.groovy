import com.example.bank.Account

def a1 = new Account(name: 'mehul', type: 'Savings', balance: 9000)
// println (a1.withdraw (-9000))

def ub = a1 + 3000 // deposit money in the account
// def ub = a1.plus(3000) -> Account.plus(3000, a1)

println ub
