package com.inothnagel.compilers.sablecc.english_calculator.application;

import com.inothnagel.compilers.sablecc.english_calculator.generated.lexer.Lexer;
import com.inothnagel.compilers.sablecc.english_calculator.generated.lexer.LexerException;
import com.inothnagel.compilers.sablecc.english_calculator.generated.node.Start;
import com.inothnagel.compilers.sablecc.english_calculator.generated.parser.Parser;
import com.inothnagel.compilers.sablecc.english_calculator.generated.parser.ParserException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

public class Main {

    public static void main(String[] args) {
        try {
            parse();
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
        }

    }

    public static void parse() throws ParserException, IOException, LexerException {
        System.out.println("Write an arithmetic expression in English below and then hit Return followed by EOF (cmd+d):");
        Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024)));
        Start tree = p.parse();
        tree.apply(new Interpreter());
    }
}
