/*
	���������+���÷�
		1.������ѧ�еļӷ�����
		2.�����ַ��������Ӳ���(�������ַ���ƴ�ӵ�һ��)
*/
public class Demo13Operator {
	public static void main(String[] args){
		//������ѧ�еļӷ�����
		System.out.println(5 + 5);//10
		//char + int ==> int + int ==> 97 + 5 ==> 102
		System.out.println('a' + 5);//102
		
		//byte/short/char ֻҪ�μ�����,�����Զ�����ת��Ϊint����
		//char + char ==> int + int ==> 97 + 98 ==> 195
		System.out.println('a' + 'b');//195
		
		System.out.println("HelloWorld");
		//+��ǰ�����ַ���,+�ĺ���Ҳ���ַ���,�˴�+���������ַ��������Ӳ���
		System.out.println("Hello"+"World");
		/*
			����ʽ"5+5="+5+5: �������Ҽ����
			�ȼ���"5+5="+5: �˴�+��ǰ�����ַ���"5+5=",+�ź���������5,�˴�+�Ŵ����ַ��������Ӳ���
			"5+5="+5�Ľ��: "5+5=5"
			�ټ���"5+5=5"+5: �˴�+��ǰ�����ַ���"5+5=5",+�ź���������5,�˴�+�Ŵ����ַ��������Ӳ���
			"5+5=5"+5�Ľ��: "5+5=55"
		*/
		System.out.println("5+5="+5+5);//5+5=55
		/*
			����ʽ"5+5="+(5+5): �������Ҽ����,�������ڱ���ʽ����(),���ȼ���()�е�����
			�ȼ���5+5: �˴�+��ǰ��������5,+�ź���������5,�˴�+�Ŵ�����ѧ�еļӷ�����
			5+5�Ľ��: 10
			�ټ���"5+5="+10:�˴�+��ǰ�����ַ���"5+5=",+�ź���������5,�˴�+�Ŵ����ַ��������Ӳ���
			"5+5="+10�Ľ��:"5+5=10"
		*/
		System.out.println("5+5="+(5+5));//5+5=10
	}
}