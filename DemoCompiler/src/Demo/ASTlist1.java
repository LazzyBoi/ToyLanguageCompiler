/* Generated By:JJTree: Do not edit this line. ASTlist1.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Demo;

public
class ASTlist1 extends SimpleNode {
  public ASTlist1(int id) {
    super(id);
  }

  public ASTlist1(CMinusParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CMinusParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3d83b73f9a08b1aecf179ec7e8808dbe (do not edit this line) */
