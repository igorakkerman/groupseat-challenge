# Group Seats

### Task
For an airplane flight, given the positive number of seat rows _n_ and a textual reservation list _r_,
find the maximum number of groups of 4 people that can make a reservation to sit together on the flight,
taking into account the aready reserved seats.

The airplane seats in every row are labeled as follows:
    
_A B C --- D E F G --- H J K_

A group of 4 people sit 'together' if at least 2 people occupy adjacent seats,
not separated by an aisle. 

The reservations list is given as a string of seat identifiers, separated by a single space character,
e.g. "1D 1G 2E 2F"

### Examples
#### Example 1
_n = 2_  
_r = "1A 2J 2K"_  
  
The groups can be best seated as follows:  
_"1B 1C 1D 1E",  
"1F 1G 1H 1J",  
"2D 2E 2F 2G"_.  

Hence:  
_result = 3_

---

### License
Copyright 2019 Igor Akkerman

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
