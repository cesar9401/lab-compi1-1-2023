
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.labcompi1.demo1.parser;

import java.util.ArrayList;
import com.labcompi1.demo1.figure.Circle;
import com.labcompi1.demo1.figure.Figure;
import com.labcompi1.demo1.figure.Rectangle;
import com.labcompi1.demo1.figure.Square;
import java_cup.Lexer;
import java_cup.Lexer;
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
    "\000\024\000\002\012\004\000\002\002\004\000\002\012" +
    "\003\000\002\011\005\000\002\010\003\000\002\010\003" +
    "\000\002\010\003\000\002\007\006\000\002\006\005\000" +
    "\002\006\003\000\002\002\005\000\002\002\005\000\002" +
    "\002\003\000\002\003\005\000\002\003\005\000\002\003" +
    "\003\000\002\004\004\000\002\004\003\000\002\005\003" +
    "\000\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\004\013\005\001\002\000\006\002\044\013" +
    "\005\001\002\000\010\014\011\015\012\016\007\001\002" +
    "\000\006\002\uffff\013\uffff\001\002\000\004\010\ufffb\001" +
    "\002\000\004\010\014\001\002\000\004\010\ufffd\001\002" +
    "\000\004\010\ufffc\001\002\000\006\002\ufffe\013\ufffe\001" +
    "\002\000\010\005\021\010\022\012\015\001\002\000\016" +
    "\004\uffef\005\uffef\006\uffef\007\uffef\011\uffef\020\uffef\001" +
    "\002\000\016\004\ufff5\005\ufff5\006\033\007\032\011\ufff5" +
    "\020\ufff5\001\002\000\012\004\027\005\030\011\ufff8\020" +
    "\ufff8\001\002\000\006\011\041\020\040\001\002\000\006" +
    "\010\022\012\015\001\002\000\010\005\021\010\022\012" +
    "\015\001\002\000\016\004\ufff0\005\ufff0\006\ufff0\007\ufff0" +
    "\011\ufff0\020\ufff0\001\002\000\016\004\ufff2\005\ufff2\006" +
    "\ufff2\007\ufff2\011\ufff2\020\ufff2\001\002\000\010\004\027" +
    "\005\030\011\026\001\002\000\016\004\uffee\005\uffee\006" +
    "\uffee\007\uffee\011\uffee\020\uffee\001\002\000\010\005\021" +
    "\010\022\012\015\001\002\000\010\005\021\010\022\012" +
    "\015\001\002\000\016\004\ufff6\005\ufff6\006\033\007\032" +
    "\011\ufff6\020\ufff6\001\002\000\010\005\021\010\022\012" +
    "\015\001\002\000\010\005\021\010\022\012\015\001\002" +
    "\000\016\004\ufff4\005\ufff4\006\ufff4\007\ufff4\011\ufff4\020" +
    "\ufff4\001\002\000\016\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\011\ufff3\020\ufff3\001\002\000\016\004\ufff7\005\ufff7\006" +
    "\033\007\032\011\ufff7\020\ufff7\001\002\000\016\004\ufff1" +
    "\005\ufff1\006\ufff1\007\ufff1\011\ufff1\020\ufff1\001\002\000" +
    "\010\005\021\010\022\012\015\001\002\000\004\017\042" +
    "\001\002\000\006\002\ufffa\013\ufffa\001\002\000\012\004" +
    "\027\005\030\011\ufff9\020\ufff9\001\002\000\004\002\000" +
    "\001\002\000\006\002\001\013\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\006\011\005\012\003\001\001\000\004\011" +
    "\044\001\001\000\004\010\007\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\002\016" +
    "\003\015\004\023\005\022\006\017\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\036\001\001\000\012\002\024\003\015\004" +
    "\023\005\022\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\003\035\004" +
    "\023\005\022\001\001\000\010\003\030\004\023\005\022" +
    "\001\001\000\002\001\001\000\006\004\034\005\022\001" +
    "\001\000\006\004\033\005\022\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\002\042\003\015\004\023\005\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

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
          case 0: // mainProd ::= mainProd prodGraph 
            {
              ArrayList<Figure> RESULT =null;
		int figuresleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int figuresright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<Figure> figures = (ArrayList<Figure>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int figureleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int figureright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Figure figure = (Figure)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                if (figure != null) {
                    figures.add(figure);
                    RESULT = figures;
                }
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("mainProd",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= mainProd EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<Figure> start_val = (ArrayList<Figure>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // mainProd ::= prodGraph 
            {
              ArrayList<Figure> RESULT =null;
		int figureleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int figureright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Figure figure = (Figure)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = new ArrayList<Figure>();
                if (figure != null) {
                    RESULT.add(figure);
                }
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("mainProd",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // prodGraph ::= GRAPH typeFigure prodConf 
            {
              Figure RESULT =null;
		int tokenleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tokenright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token token = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int typeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer type = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int arregloleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int arregloright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList<Integer> arreglo = (ArrayList<Integer>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                if (type == ParserSym.CIRCLE) {
                    // TODO: crear circulo
                    if (arreglo.size() != 3) {
                        System.out.println("Error al construir ciculo: " + arreglo);
                        return null;
                    }

                    RESULT = new Circle(token, arreglo.get(0), arreglo.get(1), arreglo.get(2));

                } else if (type == ParserSym.SQUARE) {
                    // TODO: crear cuadrado

                   if (arreglo.size() != 3) {
                        System.out.println("Error al construir cuadrado: " + arreglo);
                        return null;
                   }

                    RESULT = new Square(token, arreglo.get(0), arreglo.get(1), arreglo.get(2));

                } else if (type == ParserSym.RECTANGLE) {
                    // TODO: crear rectangulo
                    if (arreglo.size() != 4) {
                        System.out.println("Error al construir rectangulo: " + arreglo);
                        return null;
                    }

                    RESULT = new Rectangle(token, arreglo.get(0), arreglo.get(1), arreglo.get(2), arreglo.get(3));

                }  else {
                    // TODO: return something
                    RESULT = null;
                }
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("prodGraph",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // typeFigure ::= CIRCLE 
            {
              Integer RESULT =null;
		 RESULT = ParserSym.CIRCLE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typeFigure",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // typeFigure ::= SQUARE 
            {
              Integer RESULT =null;
		 RESULT = ParserSym.SQUARE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typeFigure",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // typeFigure ::= RECTANGLE 
            {
              Integer RESULT =null;
		 RESULT = ParserSym.RECTANGLE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("typeFigure",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // prodConf ::= LPAREN operatorProd RPAREN SEMICOLON 
            {
              ArrayList<Integer> RESULT =null;
		int valuesleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int valuesright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArrayList<Integer> values = (ArrayList<Integer>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
                System.out.println("Devolviendo arreglo: " + values);
                RESULT = values;
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("prodConf",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // operatorProd ::= operatorProd COMMA a 
            {
              ArrayList<Integer> RESULT =null;
		int arregloleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int arregloright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArrayList<Integer> arreglo = (ArrayList<Integer>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                 arreglo.add(num);
                 RESULT = arreglo;
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operatorProd",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // operatorProd ::= a 
            {
              ArrayList<Integer> RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = new ArrayList<Integer>();
                RESULT.add(num);
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operatorProd",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // a ::= a PLUS b 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 + n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // a ::= a MINUS b 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 - n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // a ::= b 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // b ::= b TIMES c 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1 * n2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // b ::= b DIVIDE c 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // b ::= c 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // c ::= MINUS d 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = -1 * n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // c ::= d 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // d ::= INTEGER 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Integer.valueOf(n1.getValue()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // d ::= LPAREN a RPAREN 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
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