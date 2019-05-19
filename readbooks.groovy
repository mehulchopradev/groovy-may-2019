import groovy.json.JsonSlurper

def f = new File('data/books.json')

def j = new JsonSlurper()
def obj = j.parse f

obj.each {
  println it['title']
}
