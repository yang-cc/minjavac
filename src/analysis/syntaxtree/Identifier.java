package analysis.syntaxtree;import analysis.visitors.TypeVisitor;import analysis.visitors.Visitor;import parser.Token;public class Identifier implements Exp {  public String s;  private Token tok;  public Identifier(String as, Token token) {    s = as;    tok = token;  }  public void accept(Visitor v) {    v.visit(this);  }  public void accept(TypeVisitor v) {    v.visit(this);  }    @Override  public String toString() {    return s;  }  public String getDescriptor() {    return s + ":" + tok.beginLine;  }}