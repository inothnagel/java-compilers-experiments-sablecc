//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.inothnagel.sablecc.grammars.ig01;

import com.inothnagel.sablecc.grammars.ig01.generated.lexer.Lexer;
import com.inothnagel.sablecc.grammars.ig01.generated.lexer.LexerException;
import com.inothnagel.sablecc.grammars.ig01.generated.node.Start;
import com.inothnagel.sablecc.grammars.ig01.generated.parser.Parser;
import com.inothnagel.sablecc.grammars.ig01.generated.parser.ParserException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            parse();
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
        }

    }

    public static void parse() throws ParserException, IOException, LexerException {
        System.out.println("Hello!");
        Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024)));
        Start tree = p.parse();
        System.out.println("tree: " + tree);

        tree.apply(new Interpreter());
    }
}
