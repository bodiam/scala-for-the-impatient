/**
 * @author Erik Pragt
 */

def product(s: String) = {
   s.foldLeft(1L)(_ * _.toLong)
}

product("erik")
product("Hello")



