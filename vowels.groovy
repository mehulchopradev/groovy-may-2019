def ch = 'y'

// a, e, i, o, u
// switch selection statement

// in java we can switch only on int and string
// in groovy, we can switch on any data type that supports casing
switch(ch) {
  case 'a': // fall through in switch cases. Whenever match in a case, rest of the cases will execute blindly
  case 'e':
  case 'i':
  case 'o':
  case 'u': println 'Is a vowel'
            break // stops the fall through to the further case/default
  default: println 'Not a vowel'
}
