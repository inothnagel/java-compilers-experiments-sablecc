package com.inothnagel.compilers.visual_shapes_manipulator.application;

import com.inothnagel.compilers.sablecc.english_calculator.application.Interpreter;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.lexer.Lexer;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.lexer.LexerException;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.Start;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.parser.Parser;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.parser.ParserException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

public class VisualShapesManipulatorMain {

    public static void main(String[] args) {
        try {
            parse();
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
        }

    }

    public static void parse() throws ParserException, IOException, LexerException {
        System.out.println("Type visual instructions and then hit Return followed by EOF (cmd+d):");
        Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024)));
        Start tree = p.parse();
        System.out.println(tree);
//        tree.apply(new Interpreter());
    }
}
