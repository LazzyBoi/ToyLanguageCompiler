/* Generated By:JJTree&JavaCC: Do not edit this line. MyNewGrammar.java */
package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import util.*;

public class MyNewGrammar/*@bgen(jjtree)*/implements MyNewGrammarTreeConstants, MyNewGrammarConstants {/*@bgen(jjtree)*/
  protected JJTMyNewGrammarState jjtree = new JJTMyNewGrammarState();public static void main(String args [])
  {
    FileInputStream fileStream;
    try
    {
      fileStream = new FileInputStream("test3.c");                       //�������ڴ˴��޸�test1.c,test2.c,test3.c
      MyNewGrammar parser = new MyNewGrammar(fileStream);
      System.out.println("Reading from file ...");
      try
      {
        SimpleNode rootNode = parser.Start();
        rootNode.dump(" "); //ץȡ���ص��﷨����    
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
      }
    }
    catch (FileNotFoundException e1)
    {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }

  final public SimpleNode Start() throws ParseException {
 /*@bgen(jjtree) Start */
 SimpleNode jjtn000 = new SimpleNode(JJTSTART);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);QTTable qtTable = new QTTable();
    try {
      Expression(qtTable);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    QTInfo END = new QTInfo("", "", "", "");
    qtTable.addQTInfo(END);
    //qtTable.trueChain.add(END);
    //qtTable.falseChain.add(END);
    qtTable.mergeFalseChain();
    qtTable.mergeTrueChain();
    qtTable.printQTTable();
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

//程序
  final public void Expression(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) Expression */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LB);
      MainStatement(qtTable);
      jj_consume_token(RB);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void MainStatement(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) MainStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTMAINSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Statement(qtTable);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Statement(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) Statement */
  SimpleNode jjtn000 = new SimpleNode(JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case FLOAT:
        case IF:
        case WHILE:
        case IDENTIFIER:
        case LB:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case FLOAT:
        case IDENTIFIER:
          SequenceStatement(qtTable);
          break;
        case IF:
          IfStatement(qtTable);
          break;
        case WHILE:
          While(qtTable);
          break;
        case LB:
          Expression(qtTable);
          break;
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;

    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

//˳��
  final public void SequenceStatement(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) SequenceStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTSEQUENCESTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case FLOAT:
        declaration(qtTable);
        break;
      case IDENTIFIER:
        copy(qtTable);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(45);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void declaration(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) declaration */
  SimpleNode jjtn000 = new SimpleNode(JJTDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token first, middle;
  Token eq = null;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        jj_consume_token(INT);
        break;
      case FLOAT:
        jj_consume_token(FLOAT);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      middle = jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ASSIGN:
        eq = jj_consume_token(ASSIGN);
        first = jj_consume_token(CONSTANT);
      QTInfo qt = new QTInfo(eq.image, first.image, "_", middle.image);
      qtTable.addQTInfo(qt);
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 46:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_2;
        }
        jj_consume_token(46);
        jj_consume_token(IDENTIFIER);
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LM:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_3;
        }
        jj_consume_token(LM);
        jj_consume_token(CONSTANT);
        jj_consume_token(RM);
      }
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void copy(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) copy */
  SimpleNode jjtn000 = new SimpleNode(JJTCOPY);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String first;
  Token middle;
  Token eq = null;
    try {
      middle = jj_consume_token(IDENTIFIER);
      eq = jj_consume_token(ASSIGN);
      first = expression(qtTable);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    QTInfo qt = new QTInfo(eq.image, first, "_", middle.image);
    qtTable.addQTInfo(qt);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

//����
  final public void IfStatement(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) IfStatement */
  SimpleNode jjtn000 = new SimpleNode(JJTIFSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String skipStr;
  QTInfo pre;
    try {
      jj_consume_token(IF);
      jj_consume_token(LC);
      BoolExpression(qtTable);
      jj_consume_token(RC);
      jj_consume_token(THEN);
    pre = qtTable.getLastQt();
      Statement(qtTable);

      ElseStatement(qtTable);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ElseStatement(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) ElseStatement */
 SimpleNode jjtn000 = new SimpleNode(JJTELSESTATEMENT);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);String skipStr;
    try {
      jj_consume_token(ELSE);
    skipStr = VariableNameGenerator.genVariableName();
    QTInfo qt1 = new QTInfo("J", "_", "_", skipStr);
    qtTable.addQTInfo(qt1);
    qtTable.trueChain.add(qt1);
      Statement(qtTable);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    qtTable.falseChain.add(qtTable.getLastQt());
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

//Ϊʹ����ģ����⣬copy()��assign()ʵ����ͬ
  final public void assign(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) assign */
  SimpleNode jjtn000 = new SimpleNode(JJTASSIGN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String first;
  Token middle;
  Token eq = null;
    try {
      middle = jj_consume_token(IDENTIFIER);
      eq = jj_consume_token(ASSIGN);
      first = expression(qtTable);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    QTInfo qt = new QTInfo(eq.image, first, "_", middle.image);
    qtTable.addQTInfo(qt);
    qtTable.trueChain.add(qt);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

//��������?
  final public String BoolExpression(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) BoolExpression */
  SimpleNode jjtn000 = new SimpleNode(JJTBOOLEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String newTemp=null,left=null,right=null;
    try {
      left = AndExp(qtTable);

      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OR:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_4;
        }
        jj_consume_token(OR);
        right = AndExp(qtTable);

      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return newTemp;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public String AndExp(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) AndExp */
  SimpleNode jjtn000 = new SimpleNode(JJTANDEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String newTemp=null,left=null,right=null;
    try {
      left = NotExp(qtTable);
    newTemp=left;
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case AND:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_5;
        }
        jj_consume_token(AND);
             //�Ǻ����߷��������������������?+1
      qtTable.mergeFalseChain();
        right = NotExp(qtTable);

      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return newTemp;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public String NotExp(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) NotExp */
  SimpleNode jjtn000 = new SimpleNode(JJTNOTEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String Temp=null;
  int tag = 0;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NOT:
        jj_consume_token(NOT);
           tag = 1;
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      Temp = Condition(qtTable);

          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          {if (true) return Temp;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

//��ϵ����?
  final public String Condition(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) Condition */
  SimpleNode jjtn000 = new SimpleNode(JJTCONDITION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String left=null, right=null, newTemp = null, falseStr, trueStr;
  Token rp=null;
  QTInfo pre;
    try {
      left = expression(qtTable);
                                newTemp=left;
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LT:
        case LE:
        case GT:
        case GE:
        case EQ:
        case NE:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_6;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LT:
          rp = jj_consume_token(LT);
          break;
        case LE:
          rp = jj_consume_token(LE);
          break;
        case GT:
          rp = jj_consume_token(GT);
          break;
        case GE:
          rp = jj_consume_token(GE);
          break;
        case EQ:
          rp = jj_consume_token(EQ);
          break;
        case NE:
          rp = jj_consume_token(NE);
          break;
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        right = expression(qtTable);
      newTemp = VariableNameGenerator.genVariableName();
      falseStr = VariableNameGenerator.genVariableName();
      QTInfo qt1 = new QTInfo("J" + rp.image, left, right, newTemp);
      qtTable.addQTInfo(qt1);
      qtTable.trueChain.add(qt1);

      QTInfo qt2 = new QTInfo("J", "_", "_", falseStr);
      qtTable.addQTInfo(qt2);
      qtTable.falseChain.add(qt2);
      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
         if(right==null)
    {
        String enter = VariableNameGenerator.genVariableName();
        QTInfo qt1 = new QTInfo("JNZ",newTemp, "_", enter);
        qtTable.addQTInfo(qt1);
        qtTable.trueChain.add(qt1);

        String newTemp2=VariableNameGenerator.genVariableName();
                QTInfo qt2 = new QTInfo("J","_", "_", newTemp2);
        //qt2.setResult(qt2.getInnerIdSeqen()+1);
        qtTable.addQTInfo(qt2);
        qtTable.falseChain.add(qt2);
    }
    {if (true) return newTemp;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

//����?
  final public String expression(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) expression */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String first, middle, newTemp;
  Token op;
    try {
      first = term(qtTable);
    newTemp = first;
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
        case MINUS:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_7;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          op = jj_consume_token(PLUS);
          break;
        case MINUS:
          op = jj_consume_token(MINUS);
          break;
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        middle = term(qtTable);
      newTemp = VariableNameGenerator.genVariableName();
      QTInfo qt = new QTInfo(op.image, first, middle, newTemp);
      qtTable.addQTInfo(qt);
      first = newTemp;
      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return newTemp;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public String term(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) term */
  SimpleNode jjtn000 = new SimpleNode(JJTTERM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String first=null, middle=null, newTemp=null;
  Token op;
    try {
      first = unary(qtTable);
    newTemp = first;
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MULTIPLY:
        case DIVIDE:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_8;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MULTIPLY:
          op = jj_consume_token(MULTIPLY);
          break;
        case DIVIDE:
          op = jj_consume_token(DIVIDE);
          break;
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        middle = unary(qtTable);
      newTemp = VariableNameGenerator.genVariableName();
      QTInfo qt = new QTInfo(op.image, first, middle, newTemp);
      qtTable.addQTInfo(qt);
      first = newTemp;
      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return newTemp;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public String unary(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) unary */
  SimpleNode jjtn000 = new SimpleNode(JJTUNARY);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String str = null;
  Token token = null;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        token = jj_consume_token(IDENTIFIER);
      str = token.image;
        break;
      case CONSTANT:
        token = jj_consume_token(CONSTANT);
      str = token.image;
        break;
      case LC:
        jj_consume_token(LC);
        str = expression(qtTable);
        jj_consume_token(RC);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return str;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

//ѭ��
  final public void While(QTTable qtTable) throws ParseException {
 /*@bgen(jjtree) While */
  SimpleNode jjtn000 = new SimpleNode(JJTWHILE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(WHILE);
      jj_consume_token(LC);
      Condition(qtTable);
      jj_consume_token(RC);
      Statement(qtTable);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  /** Generated Token Manager. */
  public MyNewGrammarTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[17];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xac000,0xac000,0xc000,0xc000,0x8000000,0x0,0x0,0x0,0x0,0x0,0xf0000000,0xf0000000,0x1800000,0x1800000,0x6000000,0x6000000,0x80,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x820,0x820,0x20,0x0,0x0,0x4000,0x200,0x8,0x4,0x10,0x3,0x3,0x0,0x0,0x0,0x0,0xa0,};
   }

  /** Constructor with InputStream. */
  public MyNewGrammar(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MyNewGrammar(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MyNewGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public MyNewGrammar(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MyNewGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public MyNewGrammar(MyNewGrammarTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(MyNewGrammarTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[47];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 17; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 47; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
