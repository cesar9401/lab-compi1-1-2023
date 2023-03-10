
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.labcompi1.demo1.parser;

import java.util.ArrayList;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\007\004\000\002\002\004\000\002\007" +
    "\003\000\002\006\004\000\002\006\004\000\002\002\005" +
    "\000\002\002\005\000\002\002\003\000\002\003\005\000" +
    "\002\003\005\000\002\003\004\000\002\003\003\000\002" +
    "\004\005\000\002\004\006\000\002\004\006\000\002\004" +
    "\003\000\002\005\003\000\002\005\003\000\002\005\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\016\003\012\005\004\010\017\012\015\014" +
    "\007\015\006\001\002\000\012\010\017\012\015\014\007" +
    "\015\006\001\002\000\020\002\044\003\012\005\004\010" +
    "\017\012\015\014\007\015\006\001\002\000\020\004\ufff0" +
    "\005\ufff0\006\ufff0\007\ufff0\011\ufff0\013\ufff0\016\ufff0\001" +
    "\002\000\020\004\ufff1\005\ufff1\006\ufff1\007\ufff1\011\ufff1" +
    "\013\ufff1\016\ufff1\001\002\000\020\002\uffff\003\uffff\005" +
    "\uffff\010\uffff\012\uffff\014\uffff\015\uffff\001\002\000\020" +
    "\004\ufff2\005\ufff2\006\ufff2\007\ufff2\011\ufff2\013\037\016" +
    "\ufff2\001\002\000\004\016\036\001\002\000\016\004\ufff6" +
    "\005\ufff6\006\ufff6\007\ufff6\011\ufff6\016\ufff6\001\002\000" +
    "\016\004\ufffa\005\ufffa\006\026\007\025\011\ufffa\016\ufffa" +
    "\001\002\000\004\010\033\001\002\000\010\004\022\005" +
    "\023\016\032\001\002\000\014\005\004\010\017\012\015" +
    "\014\007\015\006\001\002\000\010\004\022\005\023\011" +
    "\021\001\002\000\020\004\uffef\005\uffef\006\uffef\007\uffef" +
    "\011\uffef\013\uffef\016\uffef\001\002\000\014\005\004\010" +
    "\017\012\015\014\007\015\006\001\002\000\014\005\004" +
    "\010\017\012\015\014\007\015\006\001\002\000\016\004" +
    "\ufffb\005\ufffb\006\026\007\025\011\ufffb\016\ufffb\001\002" +
    "\000\012\010\017\012\015\014\007\015\006\001\002\000" +
    "\012\010\017\012\015\014\007\015\006\001\002\000\016" +
    "\004\ufff9\005\ufff9\006\ufff9\007\ufff9\011\ufff9\016\ufff9\001" +
    "\002\000\016\004\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8" +
    "\016\ufff8\001\002\000\016\004\ufffc\005\ufffc\006\026\007" +
    "\025\011\ufffc\016\ufffc\001\002\000\020\002\ufffe\003\ufffe" +
    "\005\ufffe\010\ufffe\012\ufffe\014\ufffe\015\ufffe\001\002\000" +
    "\014\005\004\010\017\012\015\014\007\015\006\001\002" +
    "\000\010\004\022\005\023\011\035\001\002\000\016\004" +
    "\ufff3\005\ufff3\006\ufff3\007\ufff3\011\ufff3\016\ufff3\001\002" +
    "\000\020\002\ufffd\003\ufffd\005\ufffd\010\ufffd\012\ufffd\014" +
    "\ufffd\015\ufffd\001\002\000\014\005\040\010\017\012\015" +
    "\014\007\015\006\001\002\000\012\010\017\012\015\014" +
    "\007\015\006\001\002\000\016\004\ufff5\005\ufff5\006\ufff5" +
    "\007\ufff5\011\ufff5\016\ufff5\001\002\000\016\004\ufff4\005" +
    "\ufff4\006\ufff4\007\ufff4\011\ufff4\016\ufff4\001\002\000\020" +
    "\002\001\003\001\005\001\010\001\012\001\014\001\015" +
    "\001\001\002\000\004\002\000\001\002\000\016\004\ufff7" +
    "\005\ufff7\006\ufff7\007\ufff7\011\ufff7\016\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\016\002\015\003\013\004\012\005\010\006" +
    "\007\007\004\001\001\000\006\004\044\005\010\001\001" +
    "\000\014\002\015\003\013\004\012\005\010\006\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\002\017\003\013\004\012\005\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\003\030\004\012\005\010" +
    "\001\001\000\010\003\023\004\012\005\010\001\001\000" +
    "\002\001\001\000\006\004\027\005\010\001\001\000\006" +
    "\004\026\005\010\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\002\033" +
    "\003\013\004\012\005\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\004\040\005\010" +
    "\001\001\000\006\004\041\005\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public Parser(Lexer lexer) {
        super(lexer);
    }

    public Symbol scan() throws Exception {
        Symbol sym = this.getScanner().next_token();
        if (sym == null) {
            return this.getSymbolFactory().newSymbol("END_OF_FILE", this.EOF_sym());
        }

        while(sym != null && sym.sym == ParserSym.SYM) {
            this.report_expected_token_ids();
            System.out.println("Ingorando: " + sym.value.toString());
            sym = this.getScanner().next_token();
        }

        if (sym == null) {
            return this.getSymbolFactory().newSymbol("END_OF_FILE", this.EOF_sym());
        }

        return sym;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // operations ::= operations operation 
            {
              ArrayList<Double> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<Double> list = (ArrayList<Double>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 list.add(n1); RESULT = list; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operations",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= operations EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<Double> start_val = (ArrayList<Double>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // operations ::= operation 
            {
              ArrayList<Double> RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new ArrayList<Double>(); RESULT.add(n1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operations",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // operation ::= a SEMICOLON 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operation",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // operation ::= error SEMICOLON 
            {
              Double RESULT =null;
		
                // TODO: handle the error
                System.out.println("Got an error");
                RESULT = 0D;
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operation",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // a ::= a PLUS b 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 + n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // a ::= a MINUS b 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 - n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // a ::= b 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // b ::= b TIMES c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 * n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // b ::= b DIVIDE c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 / n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // b ::= MINUS c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = -1 * n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // b ::= c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // c ::= d POW c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Math.pow(n1, n2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // c ::= d POW MINUS c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Math.pow(n1, -1 * n2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // c ::= SQRT LPAREN a RPAREN 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Math.sqrt(n1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // c ::= d 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // d ::= INTEGER 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Double.valueOf(n1.getValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // d ::= DECIMAL 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Double.valueOf(n1.getValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // d ::= LPAREN a RPAREN 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
