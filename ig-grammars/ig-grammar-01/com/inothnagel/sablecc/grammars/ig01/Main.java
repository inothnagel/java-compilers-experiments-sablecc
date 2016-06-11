package com.inothnagel.sablecc.grammars.ig01;

import com.inothnagel.sablecc.grammars.ig01.lexer.Lexer;
import com.inothnagel.sablecc.grammars.ig01.lexer.LexerException;
import com.inothnagel.sablecc.grammars.ig01.node.Start;
import com.inothnagel.sablecc.grammars.ig01.parser.Parser;
import com.inothnagel.sablecc.grammars.ig01.parser.ParserException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

/**
 * Created by inothnagel on 2016/06/11.
 */
public class Main {
    public static void main(String[] args) {
        try {
            parse();
        }  catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static void parse() throws ParserException, IOException, LexerException {
        System.out.println("Hello!");

        Parser p =
                new Parser(
                        new Lexer(
                                new PushbackReader(
                                        new InputStreamReader(System.in), 1024)));

        Start tree = p.parse();
        System.out.println("tree: " + tree);
//        tree.apply(new Translation());
    }
}
