# Experimenting with building compilers and interpreters in Java using SableCC

### Current experiments (see below for sections):
- English Calculator 

### Ideas for future experiments:
- Visual Shapes Manipulator
- Manipulating virtual world objects ("kill the dragon with my bare hands")
- Fantasy language based programming language
    - (Sindarin? What do Elven geeks code in?)
        - (must surely be Pythonic in nature)

## English Calculator
Experimenting with an "English Language Calculator" interpreter that
will read arithmetic expressions in English, interpret the expression,
construct and output the standard arithmetic format, and produce the
correct result.

Example of desired behavior:
```
Input:			one plus two minus three multiplied by four divided by five
Interpretation:	((1+2)-((3*4)/5))
Result:			-0.6
```

### Todo:
- Calculate and print the result.
- Add module to convert a larger set of english words to numbers.
- gradle tasks to regenerate the compiler
    - clean the `generated` directory
    - run the sablecce generation
 
### Done:
- Generate and parse the grammar
- Print the interpretation, e.g. "((1+2)-((3*4)/5))"

## Visual Shapes Manipulator

Create a visual display that accepts instructions designed to create and manipulate basic graphic elements:

```
draw a red dot
draw a small yellow triangle
make it green
make it larger
make it as small as the dot
make the red dot disappear
make the green dot smaller
double the size of the blue square
half the size of the ten largest triangles
make two red dots
make the smaller red dot green
make the smaller red dot the same colour as the larger square
move the red dot upwards
move the red dot to the yellow square
draw a polygon with seven sides
```