/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.sablecc.grammars.ig01.node;

import com.inothnagel.sablecc.grammars.ig01.analysis.*;

@SuppressWarnings("nls")
public final class TMinus extends Token
{
    public TMinus()
    {
        super.setText("minus");
    }

    public TMinus(int line, int pos)
    {
        super.setText("minus");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMinus(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMinus(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMinus text.");
    }
}
