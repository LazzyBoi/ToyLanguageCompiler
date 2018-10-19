package Demo;
//package org.amila.cm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;


public class CMinusParserGUI extends JFrame {

    private DefaultListModel listModel;
    private CMinusParser parser;
    private StyledDocument doc;
    private File sourceFile;
    public test.MyNewGrammar parser2;


    public CMinusParserGUI() {
        this.setLocationRelativeTo(null);
        listModel = new DefaultListModel();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }

        CMinusParserGUI gui = new CMinusParserGUI();
        gui.setVisible(true);
    }

    private void initComponents() {

    	ansHead[0] = "NT";
    	ansHead[1] = "{";
    	ansHead[2] = "}";
    	ansHead[3] = "if";
    	ansHead[4] = "(";
    	ansHead[5] = ")";
    	ansHead[6] = "then";
    	ansHead[7] = "else";
    	ansHead[8] = "while";
    	ansHead[9] = "ID";
    	ansHead[10] = "=";
    	ansHead[11] = ";";
    	ansHead[12] = "<";
    	ansHead[13] = ">";
    	ansHead[14] = "<=";
    	ansHead[15] = ">=";
    	ansHead[16] = "==";
    	ansHead[17] = "+";
    	ansHead[18] = "-";
    	ansHead[19] = "*";
    	ansHead[20] = "/";
    	ansHead[21] = "NUM";
    	ansHead[22] = "$";
    	
    	for (int i = 0; i < 14; i++) {
    		for (int j = 0; j < 23; j++) {
    			answer[i][j] = "";
    		}
    	}
    	
    	answer[0][0] = "program";
    	answer[1][0] = "stmt";
    	answer[2][0] = "compoundstmt";
    	answer[3][0] = "stmts";
    	answer[4][0] = "ifstmt";
    	answer[5][0] = "whilestmt";
    	answer[6][0] = "assgstmt";
    	answer[7][0] = "boolexpr";
    	answer[8][0] = "boolop";
    	answer[9][0] = "arithexpr";
    	answer[10][0] = "arithexprprime";
    	answer[11][0] = "multexpr";
    	answer[12][0] = "multexprprime";
    	answer[13][0] = "simpleexpr";
    	
    	answer[0][1] = "1";
    	answer[1][1] = "5";
    	answer[1][3] = "2";
    	answer[1][8] = "3";
    	answer[1][9] = "4";
    	answer[2][1] = "6";
    	answer[3][1] = "7";
    	answer[3][2] = "8";
    	answer[3][3] = "7";
    	answer[3][8] = "7";
    	answer[3][9] = "7";
    	answer[4][3] = "10";
    	answer[5][8] = "10";
    	answer[6][9] = "11";
    	answer[7][4] = "12";
    	answer[7][9] = "12";
    	answer[7][21] = "12";
    	answer[8][12] = "13";
    	answer[8][13] = "14";
    	answer[8][14] = "15";
    	answer[8][15] = "16";
    	answer[8][16] = "17";
    	answer[9][4] = "18";
    	answer[9][9] = "18";
    	answer[9][21] = "18";
    	answer[10][11] = "21";
    	answer[10][12] = "21";
    	answer[10][13] = "21";
    	answer[10][14] = "21";
    	answer[10][15] = "21";
    	answer[10][16] = "21";
    	answer[10][17] = "19";
    	answer[10][18] = "20";
    	answer[11][4] = "22";
    	answer[11][9] = "22";
    	answer[11][21] = "22";
    	answer[12][5] = "25";
    	answer[12][11] = "25";
    	answer[12][12] = "25";
    	answer[12][13] = "25";
    	answer[12][14] = "25";
    	answer[12][15] = "25";
    	answer[12][16] = "25";
    	answer[12][17] = "25";
    	answer[12][18] = "25";
    	answer[12][19] = "23";
    	answer[12][20] = "24";
    	answer[13][4] = "28";
    	answer[13][9] = "26";
    	answer[13][21] = "27";
    	
        jScrollPane2 = new JScrollPane();
        List = new JList(listModel);
        parseButton = new JButton();
        browseButton = new JButton();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        sourceTextArea = new JTextPane();
        doc = sourceTextArea.getStyledDocument();
        errorScrollPane = new JScrollPane();
        errorTextArea = new JTextPane();
        colName[0] = "Row";
        colName[1] = "Col";
        colName[2] = "Name";
        // colName[3] = "Value";
        colName[3] = "Type";
        jTable = new JTable();
        dtm = (DefaultTableModel)jTable.getModel();
        dtm.setColumnIdentifiers(colName);
        tableScrollPane = new JScrollPane(jTable);
        treeScrollPane = new JScrollPane();
        treeTextArea = new JTextPane();
        tree = new ArrayList<String>();
        graScrollPane = new JScrollPane();
        graTextPane = new JTextPane();
        ansTable = new JTable(answer, ansHead);
        for (int i = 0; i < 23; i++) {
        	TableColumn column = ansTable.getColumnModel().getColumn(i);
        	column.setResizable(true);
        }
        
        ansScrollPane = new JScrollPane(ansTable);        
        codeLabel = new JLabel();
        codeLabel.setText("Code: ");
        tableLabel = new JLabel();
        tableLabel.setText("Token: ");
        errorLabel = new JLabel();
        errorLabel.setText("Error Message: ");
        treeLabel = new JLabel();
        treeLabel.setText("Abstract Syntax Tree: ");
        graLabel = new JLabel();
        graLabel.setText("Semantic Analysis: ");
        ansLabel = new JLabel();
        ansLabel.setText("Predictive Parsing Table");
        gra = new ArrayList<String>();
        namee[0] = "Row";
        namee[1] = "Col";
        namee[2] = "Name";
        namee[3] = "Value";
        // namee[4] = "Type";
        symTable = new JTable();
        sym = (DefaultTableModel)symTable.getModel();
        sym.setColumnIdentifiers(namee);
        symbolScrollPane = new JScrollPane(symTable);
        symLabel = new JLabel();
        symLabel.setText("Symbol Table");
        
        ansTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
        // 代码高亮颜色设置
        Style style = sourceTextArea.addStyle("Blue", null);
        StyleConstants.setForeground(style, Color.blue);
        Style style1 = sourceTextArea.addStyle("Green", null);
        StyleConstants.setForeground(style1, Color.green);
        Style style2 = sourceTextArea.addStyle("Red", null);
        StyleConstants.setBackground(style2, Color.red);
        Style style3 = sourceTextArea.addStyle("Usual", null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MyCompiler");
        setResizable(false);

        List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(List);
        graScrollPane.setViewportView(graTextPane);

        parseButton.setText("Parse");
        parseButton.setEnabled(false);
        parseButton.setIconTextGap(30);
        parseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					parseButtonActionPerformed(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        browseButton.setText("Browse...");
        browseButton.setIconTextGap(10);
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Source:");

        jLabel1.setText("<select file>");
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                browseButtonActionPerformed(null);
            }

            public void mouseReleased(MouseEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            public void mouseEntered(MouseEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            public void mouseExited(MouseEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });


        sourceTextArea.setFont(new Font("Sagoe UI", 0, 14));
        jScrollPane1.setViewportView(sourceTextArea);
        errorScrollPane.setViewportView(errorTextArea);
        treeScrollPane.setViewportView(treeTextArea);
        graScrollPane.setViewportView(graTextPane);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(codeLabel)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                        		.addComponent(errorLabel)
                                                .addComponent(errorScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                   
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(browseButton, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        // .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(tableLabel)
                                        .addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(treeLabel)
                                        .addComponent(treeScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(parseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                		.addComponent(graLabel)
                                		.addComponent(graScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                		.addComponent(ansLabel)
                                		.addComponent(ansScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                		.addComponent(symLabel)
                                		.addComponent(symbolScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup()
                                		.addComponent(codeLabel)
                                		.addComponent(tableLabel)
                                		.addComponent(graLabel)
                                		.addComponent(symLabel))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        //.addGroup(layout.createSequentialGroup()
                                		.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                		.addComponent(graScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                		        // .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)      
                                                //.addGap(18, 18, 18)
                                                // .addComponent(parseButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)//)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(symbolScrollPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup()
                                		.addComponent(errorLabel)
                                		.addComponent(treeLabel)
                                		.addComponent(ansLabel))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(errorScrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(treeScrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ansScrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(parseButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private void parseButtonActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        clearFormatting();
        boolean scanSuccess = scan();
        if (scanSuccess) parse();
    }

    private boolean scan() {
        try {
            CMinusParserTokenManager lexer = new CMinusParserTokenManager(new JavaCharStream(new StringReader(sourceTextArea.getText())));
            listModel.clear();
            for (int j = dtm.getRowCount() - 1; j >= 0; j--) {
            	dtm.removeRow(j);
            }
            for (int j = sym.getRowCount() - 1; j >= 0; j--) {
            	sym .removeRow(j);
            }
        	treeTextArea.setText("");
        	errorTextArea.setText("");
        	graTextPane.setText("");
            values = new ArrayList<ArrayList<String>>();
            Token t;
            ArrayList<Token> tmp = new ArrayList<Token>();
            int i = 0;
            while (!(t = lexer.getNextToken()).image.equals("")) {
                i++;
                tmp.add(t);
                // String item = "L" + t.beginLine + "C" + t.beginColumn + ": " + t.image;
                ArrayList<String> newsub = new ArrayList<String>();
                ArrayList<String> newsub2 = new ArrayList<String>();
                Vector newv = new Vector();
                Vector newv2 = new Vector();
                sub = new ArrayList<String>();
                v = new Vector();
                sub.add(String.valueOf(t.beginLine));
                sub.add(String.valueOf(t.beginColumn));
                sub.add(t.image);
                if (i >= 3 && t.kind == 15 && tmp.get(i - 2).image == "=" && tmp.get(i - 3).kind == 24) {
                	//dtm.removeRow(dtm.getRowCount() - 1);
                	//dtm.removeRow(dtm.getRowCount() - 1);
                	newsub.add(String.valueOf(tmp.get(i - 3).beginLine));
                    newsub.add(String.valueOf(tmp.get(i - 3).beginColumn));
                    newsub.add(tmp.get(i - 3).image);
                    newsub.add(t.image);
                    // newsub.add("identifiers");
                    newv.add(newsub.get(0));
                    newv.add(newsub.get(1));
                    newv.add(newsub.get(2));
                    newv.add(newsub.get(3));
                    // newv.add(newsub.get(4));
                    //dtm.addRow(newv);
                    newsub2.add(String.valueOf(tmp.get(i - 2).beginLine));
                    newsub2.add(String.valueOf(tmp.get(i - 2).beginColumn));
                    newsub2.add(tmp.get(i - 2).image);
                    newsub2.add(tmp.get(i - 2).image);
                    newsub2.add("operators");
                    newv2.add(newsub2.get(0));
                    newv2.add(newsub2.get(1));
                    newv2.add(newsub2.get(2));
                    newv2.add(newsub2.get(3));
                    newv2.add(newsub2.get(4));
                    //dtm.addRow(newv2);
                    //sub.add(t.image);
                    sym.addRow(newv);
                }
                switch(t.kind) {
                case 0:
                	sub.add("EOF");
                	break;
                case 12:
                	sub.add("exponent");
                	break;
                case 13:
                	sub.add("fraction");
                	break;
                case 14:
                	sub.add("real number");
                	break;
                case 15:
                	sub.add("number");
                	break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                	sub.add("keywords");
                	break;
                case 24:
                	sub.add("identifiers");
                	break;
                case 25:
                	sub.add("letter");
                	break;
                case 26:
                	sub.add("int number");
                	break;
                case 27:
                	sub.add("digit");
                	break;
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                	sub.add("delimiters");
                	break;
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                	sub.add("operators");
                	break;
                default:
                	break;
                }
                values.add(sub);
                v.add(sub.get(0));
                v.add(sub.get(1));
                v.add(sub.get(2));
                v.add(sub.get(3));
                // v.add(sub.get(4));
                dtm.addRow(v);
                jTable.updateUI();
                syntaxHighlight(t);
            }
            List.setSelectedIndex(0);
            List.ensureIndexIsVisible(0);
            return true;
        } catch (TokenMgrError e) {
        	errorTextArea.setText("");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Lexical Analyzing failed due to unidentified token: \n" + e.getMessage(), "Scanning Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void parse() throws ParseException {
    	tree.clear();
    	treeTextArea.setText("");
    	errorTextArea.setText("");
    	graTextPane.setText("");
        parser = new CMinusParser(new StringReader(sourceTextArea.getText()));
        ParseResult result = parser.Parse();
        if (result.isSuccess()) {
        	errorTextArea.setText("");
        	for (int i = 0; i < tree.size(); i++) {
        		treeTextArea.setText(treeTextArea.getText() + tree.get(i) + "\n");
        	}
            JOptionPane.showMessageDialog(this, "Parsing Process successfully completed", "Parsing Complete", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ArrayList<ParseException> exceptionList = result.getExceptionList();
//
            String errors = "";
            String error;
            for (ParseException e : exceptionList) {
                error = e.getMessage();
                errorHighlight(e.currentToken);
                errors = errors + error + "\n";
            }
            // JOptionPane.showMessageDialog(this, "Parsing Failed. Encountered " + exceptionList.size() + " error(s) while parsing: \n\n" + errors, "Parsing Failed", JOptionPane.ERROR_MESSAGE);
            errorTextArea.setText("Parsing Failed. Encountered " + exceptionList.size() + " error(s) while parsing: \n\n" + errors);
            errorScrollPane.setViewportView(errorTextArea);
            // errorTextArea.setText("");
            treeTextArea.setText("");
        	for (int i = 0; i < tree.size(); i++) {
        		treeTextArea.setText(treeTextArea.getText() + tree.get(i) + "\n");
        	}
        }
        parser22();
    }

    private void parser22(){
    	gra.clear();
    	parser2 = new test.MyNewGrammar(new StringReader(sourceTextArea.getText()));
        test.SimpleNode rootNode;
		try {
			rootNode = parser2.Start();
			rootNode.dump("");
		} catch (test.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		graTextPane.setText("");
    	for (int i = 0; i < gra.size(); i++) {
    		graTextPane.setText(graTextPane.getText() + gra.get(i) + "\n");
    	}
    	
    }

    private void errorHighlight(Token t) {
        try {
            int sOffset = getLineStartOffset(sourceTextArea, t.beginLine - 1);
            sOffset += t.beginColumn;
            System.out.println("Highlighting error: "+ t);
            doc.setCharacterAttributes(sOffset, t.image.length(), sourceTextArea.getStyle("Red"), true);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    private void syntaxHighlight(Token t) {
        if (
                t.kind == CMinusParserConstants.INT
                        || t.kind == CMinusParserConstants.IF
                        || t.kind == CMinusParserConstants.ELSE
                        || t.kind == CMinusParserConstants.WHILE
                        || t.kind == CMinusParserConstants.VOID
                        || t.kind == CMinusParserConstants.RETURN
                ) {
            try {
                int sOffset = getLineStartOffset(sourceTextArea, t.beginLine - 1);
                sOffset += t.beginColumn - 1;
                doc.setCharacterAttributes(sOffset, t.image.length(), sourceTextArea.getStyle("Blue"), true);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        } else if (t.kind == CMinusParserConstants.ID) {
            try {
                int sOffset = getLineStartOffset(sourceTextArea, t.beginLine - 1);
                sOffset += t.beginColumn - 1;
                doc.setCharacterAttributes(sOffset, t.image.length(), sourceTextArea.getStyle("Green"), true);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
    }

    private void clearFormatting() {
        doc.setCharacterAttributes(0,doc.getLength(), sourceTextArea.getStyle("Usual"), true);
    }

    static int getLineStartOffset(JTextComponent comp, int line) throws BadLocationException {
        Element map = comp.getDocument().getDefaultRootElement();
        if (line < 0) {
            throw new BadLocationException("Negative line", -1);
        } else if (line >= map.getElementCount()) {
            throw new BadLocationException("No such line", comp.getDocument().getLength() + 1);
        } else {
            Element lineElem = map.getElement(line);
            return lineElem.getStartOffset();
        }
    }


    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        processFile();
    }

    private void processFile() {

        final JFileChooser fc = new JFileChooser(".");
        fc.showOpenDialog(this);
        File sFile = fc.getSelectedFile();
        if (sFile != null) {
            listModel.clear();
            sourceTextArea.setText("");
            parseButton.setEnabled(false);
            try {

                String fileContent = readFile(sFile.getAbsolutePath());
                if (fileContent != null && !fileContent.equals("")) {
                    sourceTextArea.setText(fileContent);
                    jLabel1.setText(sFile.getName());
                    sourceFile = sFile;
                    parseButton.setEnabled(true);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
    }

    private String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        return stringBuilder.toString();
    }

    private JList List;
    private JButton browseButton;
    private JButton parseButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextPane sourceTextArea;
    private JScrollPane errorScrollPane;
    private JTextPane errorTextArea;
    private JTable jTable;
    private String [] colName = new String[4];
    private ArrayList<ArrayList<String>> values;
    private ArrayList<String> sub;
    private JScrollPane tableScrollPane;
    private JScrollPane treeScrollPane;
    private JTextPane treeTextArea;
    public static ArrayList<String> tree;
    private Vector v;
    private DefaultTableModel dtm;
    private JScrollPane graScrollPane;
    private JTextPane graTextPane;
    private JScrollPane ansScrollPane;
    private JTable ansTable;
    private JLabel codeLabel;
    private JLabel tableLabel;
    private JLabel errorLabel;
    private JLabel treeLabel;
    private JLabel graLabel;
    private JLabel ansLabel;
    public static ArrayList<String> gra;
    private String [][] answer = new String [14][23];
    private String [] ansHead = new String [23];
    private ArrayList<ArrayList<String>> symbol = new ArrayList<ArrayList<String>>();
    private JScrollPane symbolScrollPane;
    private DefaultTableModel sym;
    private JTable symTable;
    private String [] namee = new String[4];
    private JLabel symLabel;
}
