/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.sablecc.grammars.ig01.parser;

import com.inothnagel.sablecc.grammars.ig01.node.*;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    private Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}