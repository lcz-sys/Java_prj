/*
	��ֵ��������ص�:
		1.+=,-=,*=,/=,%= ����� ������յĽ�����������ͺ������������Ͳ�һ��,
			�ڲ���������ǽ���ǿ������ת��(���ص�,���ǿ�����)
		
		2.��������ֻҪ����������ֵ������ȡֵ��Χ,����ֱ�Ӹ�ֵ,�ڲ������ؽ���ǿ������ת��		
*/
public class Demo15Operator {
	public static void main(String[] args){	
		/*
			�Ҳ������1��int����(ռ4���ֽ�),�����ı���s��short����(ռ2���ֽ�)
			���յ�������,�ǲ��ܰ�int��������,ֱ�Ӹ�ֵ��short������
			���Ƿ��ִ���������е�,û�������
			ԭ��:
				����1��һ������,����û�г���short������ȡֵ��Χ,JVM�ڲ����Զ���������
				��int���͵�����1,ǿ��ת����short����,�������������ֽڵ�0
				
		*/
		short s = /*(short)*/1;
		System.out.println(s);
		
		/*	
			����: 
			s��short����(ռ2���ֽ�),1��int����(ռ4���ֽ�),���Ͳ�һ��,�ᷢ���Զ�����ת��
			��short���͵�s,�Զ�ת��Ϊint����(��ಹ��2���ֽڵ�0),s�Ĵ�С��Ȼ1
			short + int ==> int + int ==> int �����int����,ռ4���ֽ�,
			����ֱ�Ӹ�ֵ������ռ��2���ֽڵ�short���͵ı���s
			���ܲ�����ֱ�ӷ���С����
			�������:
				1.�����Ŀӱ��(��ǰ�������ַ�ʽ)
				2.���Ҳ���ܲ���С(Ŀǰʹ��ǿ������ת��)
		*/
		//s = s + 1;//����ʧ��
		/*
			+= ��������ʱ,������յĽ�����������ͺ������������Ͳ�һ��,
			�ڲ���������ǽ���ǿ������ת��(���ص�,���ǿ�����)
		*/
		s += 1;//s = (short)(s + 1)
		
		System.out.println(s);
	}
}