package clases;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
%%
%class ArchivoFlex
%line
%column
%cup
%full
%char
%unicode
Palabra = [p,v,i,o]["i","n","v","e","r","o","a","t","p","m","ñ"]*
white = [ ]
%{
  public String lexeme;

%}
%{


    private Symbol symbol(int type){
      return new Symbol(type,yyline,yycolumn);
    }
    private Symbol symbol(int type, Object value){
      return new Symbol(type,yyline,yycolumn,value);
    }

    
%}
%eofval{
   return new Symbol(sym.EOF);
%eofval}
%%

{white} {/*Ignore*/}
{Palabra}  {return new Symbol(sym.Traduccion, new Token(yycolumn, yyline, yytext()));}
"Udrazma"  {return new Symbol(sym.Ejecutar, new Token(yycolumn, yyline, yytext()));}
"Dothraki" {return new Symbol(sym.OperadorDothraki, new Token(yycolumn, yyline, yytext()));}
"Valyrio" {return new Symbol(sym.OperadorValyrio, new Token(yycolumn, yyline, yytext()));}
"="        {return new Symbol(sym.Asigna, new Token(yycolumn, yyline, yytext()));}
";"        {return new Symbol(sym.FinSentencia, new Token(yycolumn, yyline, yytext()));}
.       {
           JOptionPane.showMessageDialog(null, "caracter invalido " + yytext() + "["+ yyline + ":"+ yycolumn + "]");
           System.err.println("caracter invalido " + yytext() + "["+ yyline + ":"+ yycolumn + "]");}
          