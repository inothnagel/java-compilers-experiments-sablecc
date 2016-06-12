# Experimenting with building compilers and interpreters in Java using SableCC

### Current experiments:
- English Calculator 

### Future experiments:
- Manipulating virtual world objects ("kill the dragon with my bare hands")

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
