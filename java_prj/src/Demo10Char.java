//char��int������ԭ��
public class Demo10Char {
	public static void main(String[] args){
		//����char���͵ı���ch,����ʼ��
		char ch = 'a';		
		System.out.println(ch);//a
		/*
			ch��char����,����1��int����,���Ͳ�һ��,��Ҫ�����Զ�����ת��
			byte/short/char ֻҪ�μ�����,�����Զ�����ת��Ϊint����
			��char���͵�ch,�Զ�����ת����int����
			����:
				��ΰ�char����ת����int������?
			�������:
				�鿴ASCII���,'a'��Ӧ��int���� 97
				
			char + int ==> int + int ==> int �����int����98
		*/
		System.out.println(ch + 1);//98
		
		/*
			ch��char����,����1��int����,���Ͳ�һ��,��Ҫ�����Զ�����ת��
			byte/short/char ֻҪ�μ�����,�����Զ�����ת��Ϊint����
			��char���͵�ch,�Զ�����ת����int����
			����:
				��ΰ�char����ת����int������?
			�������:
				�鿴ASCII���,'a'��Ӧ��int���� 97				
			char + int ==> int + int ==> int �����int����98
			
			��������int���͵Ľ������98����ǿ������ת����char����
			����:
				��ΰ�int����ת����char������?
			�������:
				�鿴ASCII���,����98��Ӧ���ַ� b		
		*/
		System.out.println((char)(ch + 1));//b
		
		
	}
} 