package com.ccwan.tryantlr.app;

import com.ccwan.tryantlr.gen.HelloBaseListener;
import com.ccwan.tryantlr.gen.HelloParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ShortToUnicodeString extends HelloBaseListener {

    public void enterInit(HelloParser.InitContext ctx) {

    }

    public void exitInit(HelloParser.InitContext ctx) {

    }

    public void enterValue(HelloParser.ValueContext ctx) {
        if (ctx.INT() == null) {
            System.out.print(ctx.INT());
        }
        else {
            System.out.printf("\\u%04x", Integer.valueOf(ctx.INT().getText()));
        }

    }

    public void exitValue(HelloParser.ValueContext ctx) {

    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
