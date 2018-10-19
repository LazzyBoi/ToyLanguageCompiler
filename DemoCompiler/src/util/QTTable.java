package util;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import Demo.CMinusParserGUI;

public class QTTable {
	public ArrayList<QTInfo> QTList = new ArrayList<QTInfo>();
	public ArrayList<QTInfo> falseChain=new ArrayList<QTInfo>();
	public ArrayList<QTInfo> trueChain=new ArrayList<QTInfo>();
	public static boolean flag = true;
	
	public void addQTInfo(QTInfo info) {
		QTList.add(info);
	}

	public void addQTInfo(int index, QTInfo info) {
		QTList.add(index, info);
	}

	public QTInfo get(int index) {
		return (QTInfo) QTList.get(index);
	}

	public QTInfo remove(int index) {
		return QTList.remove(index - 1);
	}

	public void clear() {
		QTList.clear();
		QTInfo.innerIdSeqen = 0;
	}

	public void printQTTable() {
		// System.out.println(toString());
		Iterator<QTInfo> itr = QTList.iterator();
		try {
			File f = new File("result3.c");	//����ļ����
			if (f.exists()) {
			} else {
				f.createNewFile();// �������򴴽�
			}
			FileWriter output;
			output = new FileWriter(f,false);
			while (itr.hasNext()) {
				QTInfo tmp = (QTInfo) itr.next();
				output.write(tmp.toString()+"\n");
				output.flush();
				System.out.println(tmp.toString());
				CMinusParserGUI.gra.add(tmp.toString());
			}
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
	public QTInfo getLastQt(){		//��ȡ��������һ��Ԫ��
		return get(QTList.size()-1);
	}
	public QTInfo getNextQt(QTInfo first){
		Iterator<QTInfo> itr = QTList.iterator();
		while(itr.hasNext()){
			if(itr.next()==first)
				return (QTInfo)itr.next();
		}
		return null;
	}
	public void mergeFalseChain(){	//�������
			Iterator<QTInfo> itr=falseChain.iterator();
			int count=0;
			while(itr.hasNext()&&count<falseChain.size()-1){
				QTInfo one = (QTInfo) itr.next();
				//QTInfo next = (QTInfo) itr.next();
				//�˴���Ҫ�õ���һ��QTInfo�����ֲ���ʹitr��ָ��������
				QTInfo next = falseChain.get(count++);
				one.setResult(next.getInnerIdSeqen()-1);
			}
			
			/*Iterator<QTInfo> itr0=QTList.iterator();
			while(itr0.hasNext()){
				QTInfo temp0=(QTInfo) itr0.next();
				itr=falseChain.iterator();
				while(itr.hasNext()){
					QTInfo temp=(QTInfo) itr.next();
					if(temp0.getInnerIdSeqen()==temp.getInnerIdSeqen()){
						temp0.setInnerId(temp.getInnerIdSeqen());
					}
				}
			}*/
	}
	public void mergeTrueChain(){	//��������
			Iterator<QTInfo> itr=trueChain.iterator();
			int count=0;
			while(itr.hasNext()&&count<trueChain.size()-1){
				QTInfo one = (QTInfo) itr.next();
				if(count==0){
					one.setResult(4);
					count++;
				}else{
				QTInfo next = trueChain.get(count++);
				one.setResult(next.getInnerIdSeqen());
				}
			}
	}
	public void mergeTrueChain(int trueExit){
		if(trueChain!=null)
			for (int i = 0; i < trueChain.size(); i++) {
				QTInfo info = trueChain.get(i);
				info.setResult(trueExit);
			}
	}
	public void mergeFalseChain(int falseExit){
		if(falseChain!=null)
			for (int i = 0; i < falseChain.size(); i++) {
				QTInfo info = falseChain.get(i);
				info.setResult(falseExit);
			}
		
	}
	// public ArrayList<QTInfo> getQTList() {
	// // TODO Auto-generated method stub
	// return QTList;
	// }

}
