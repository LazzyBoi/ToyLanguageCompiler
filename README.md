# ToyLanguageCompiler
编译原理课程项目——基于JavaCC的toy language分析程序
## 词法与语法规则
### 词法规则
•	comments:    Comments starts with  // characters and ends with the end of line character.  
•	keywords:     The keywords given in the grammar:   
int real if then else while   
•	identifiers:   An identifier starts with a letter and continues with a letter or digit. A keyword cannot be   
  an identifier,  and the maximum length of an identifier is 64 characters.  
•	operators:    The followings are operators:   +  -  /  *  =  ==  <  <=  >  >=  !=    
•	delimiters:   The followings are delimeters:   (  )  {  }  ;  ，  
•	numbers:     The numbers are defined as follows:  
digit       0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9  
intnumber   digit+                                           (the maximum integer number is 231)  
exponent    (E|e) ( + | - |  ) digit+   (the maximum exponent value is 128)  
fraction    . digit+  
realnumber  digit+ exponent | digit+ fraction ( exponent |  )  
### 语法规则
program  compoundstmt  
stmt   ifstmt  |  whilestmt  |  assgstmt  |  compoundstmt  
compoundstmt   { stmts }  
stmts   stmt stmts   |     
ifstmt   if ( boolexpr ) then stmt else stmt  
whilestmt   while ( boolexpr ) stmt  
assgstmt   ID = arithexpr ;  
boolexpr    arithexpr boolop arithexpr  
boolop    <  |  >  |  <=  |  >=  | ==  
arithexpr    multexpr arithexprprime  
arithexprprime   + multexpr arithexprprime  |  - multexpr arithexprprime  |     
multexpr   simpleexpr  multexprprime  
multexprprime   * simpleexpr multexprprime  |  / simpleexpr multexprprime  |     
simpleexpr   ID  |  NUM  |  ( arithexpr )  
## 功能实现
### 词法分析
词法分析器调用后返回一个符号表，其中包括四项属性，分别是每个token的token type、attribute value、line number、line position。（注释应当被跳过）  
在设计过程中，需要考虑如下问题：  
	token的类型、属性值是什么，它们分别代表什么  
	符号表的结构是什么，如何存储  
	词法分析器可以分析的错误有哪些类型，如何进行错误处理
### 语法分析
创建LL(1)分析表。对于输入的程序，根据给定语法构建语法分析树。如果程序中出现错误，进行错误定位并报告错误类型
### 语义分析
#### 符号表
在词法分析的过程中，对每个token，获取他们的token type、attribute value、line number、line position等属性，并据此构建符号表。符号表应当可以进行查询、添加、修改等操作。
#### 出错处理
在词法分析过程中，对于出错的token报告出错的位置以及出错类型；在语法分析过程中，实现错误定位并报告错误类型。
#### 输入/输出显示
程序应当具有读取输入文件的功能区显示。读取输入文件并通过点击分析按钮进行分析后，应当在程序中对输入程序文本、符号表、语法分析树、LL(1)分析表、语义分析信息、错误信息进行显示。