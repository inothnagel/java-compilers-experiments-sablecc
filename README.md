Experimenting with a basic "English Language Calculator" interpreter that will read basic calculations as they would be
expressed in English, interpret the expression, construct and output the standard arithmetic format,
and produce the correct result.

Example of desired interpreter behavior:
```
Input:			one plus two minus three multiplied by four divided by five
Interpretation:	((1+2)-((3*4)/5))
Result:			-0.6
```

### Todo:
 - print the normal arithmetic form of the AST
 - gradle tasks to regenerate the compiler
 -- clean the `generated` directory
 -- run the sablecce generation