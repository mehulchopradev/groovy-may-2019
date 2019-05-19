import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def jsonSlurper = new JsonSlurper()
def u = new URL('http://www.mocky.io/v2/5ce16002320000492c2f62e0')

def connection = u.openConnection()
if (connection.getResponseCode() == 200) {
  def obj = jsonSlurper.parse(connection.getInputStream())
  println obj

  def jsonString = JsonOutput.toJson obj
  println jsonString
}

connection.disconnect()

// Groovy object -> Json : JsonOutput
