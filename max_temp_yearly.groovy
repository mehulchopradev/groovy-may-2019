def f = new File('data/weather_data.csv')

def map = [:]
f.eachLine {
  def tokens = it.split(',')
  def year = tokens[1] as Integer
  def temperature = tokens[4] as Float

  if (!map[year]) {
    map[year] = temperature
  } else {
    def tempFound = map[year]
    if (temperature > tempFound) {
      map[year] = temperature
    }
  }
}

println map
