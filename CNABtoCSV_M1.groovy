File context = new File("C:/Users/200018899/Box Sync/Documents/Trax/Payroll/Brazil/Scripts/CNABTESTFILE.txt")
def fileContent = context.readLines()

def segment
def registration
 def debitor
 def debitorDetails
 def paymentLine
 def paymentLineDetails

 def line3a
 def map = []

// extract the payer information from  Registration Type = 0
def extractPaymentInformation = {payment ->
       registration = payment.substring(7,8)
        println registration
       if (registration == '0')
        {    println "In registration 0"
             debitor = [dFileSequentialNumber:         payment.substring(157,163),
                        dFileCreationDateTime:         payment.substring(143,157),
                        dCompanyName:                  payment.substring(72,102),
                        dPmtMtd:                       'TRF',
                        dCatPur:                       'SALA',
                        dDebitBankCode:                payment.substring(0,2),
                        dBankName:                     payment.substring(102,132),
                        dDebitorID:                    payment.substring(18,32),
                        dCurrentAccountNumber:         payment.substring(58,70)]

        }
   // extract the payer information from Registration Type = 1
     else if (registration == '1')
       {
            println "In registration 1"

         debitorDetails= [ dPaymentInfID:   payment.substring(3,7),
           dDebitorBranch:  payment.substring(52,57),
           dCompanyName:  payment.substring(72,102)]
       }
// extract Creditor information from Registration Type = 3 and section A
//extract Creditor additional details from Registration Type = 3 and section B

    else if (registration == '3' )
    {
        println "In registration 3"
        segment = payment.substring(13,14)
        println segment
        if (segment == 'A') {
          line3a = payment
         }
         else if (segment == 'B') {
           dEndtoEndID: payment.substring(18,32)]
           def e = new Employee(cPaymentAmount: line3a.substring(119,134), cCurrencyType: line3a.substring(101,104))
           map[dEndtoEndID] = e
         }
     }
}


//Pass each line from file to closure to get Debitor/creditor details
 fileContent.each {line -> extractPaymentInformation(line)}

 map.each {employeeId, employee ->
  def csvString = employee.csv()
 }

 //HashMap Iterator
def hashMapIterator = { map ->
     def setOfKeys = map.keySet()
     Iterator iterator = setOfKeys.iterator()
     while (iterator.hasNext())
     {
      key = iterator.next()
      value = map.get(key)
      map1=[key,value]
      return map1

      }
   }

// This is where I am Stuck..
//Trying to get all key/value set from all 4 hashmaps (tryied with paymentLineDetails hashmap)
// Input File will have multiple rows of registartion type 3 and segment A , B lines
// that means multiple sets of paymentLine and paymentLineDetails hashmaps
//need to iterate thru the hashmaps and get the values for the key
//my end goal is to create CSV file with ',' values
def mapping = [
//debitor: debitor.
 paymentLineDetails: hashMapIterator(paymentLineDetails)
]
println mapping
// Define template
def singleBatchTemplate = /*'''
/*
${Date.parse('DDMMYYYYHHMMSS', debitor.dFileCreationDateTime).format("MM/dd/yyyy HH:MM:SS")};
${debitor.dFileSequentialNumber.trim()};
${debitor.dCompanyName};
${debitor.dPmtMtd};
${debitor.dCatPur};
${debitor.dDebitBankCode.trim()};
${debitor.dBankName.trim()};
${debitor.dDebitorID.trim()};
${debitor.dCurrentAccountNumber.trim()};
${debitorDetails.dPaymentInfID.trim()};
${debitorDetails.dDebitorBranch.trim()};
${debitorDetails.dCompanyName.trim()};
${paymentLine.cPaymentAmount.trim()};
${paymentLine.cCurrencyType.trim()};
${paymentLine.cBankID.trim()};
${paymentLine.cBranchID.trim()};
${paymentLine.cCreditorName.trim()};
${paymentLine.cCreditorAccount.trim()}; */
'''${paymentLineDetails.dDueDate.trim()};
${paymentLineDetails.dEndtoEndID.trim()}'''


def payTemplate = singleBatchTemplate // 'singleBatchTemplate' or 'multiBatchTemplate'



// apply the mapping to the template and return the result
 /*assert new StringReader(
    new groovy.text.SimpleTemplateEngine()
        .createTemplate(template)
        .make(mapping).toString()) */
/*def engine = new groovy.text.SimpleTemplateEngine()
def template = engine.createTemplate(payTemplate)
template.make(mapping).toString()   */
