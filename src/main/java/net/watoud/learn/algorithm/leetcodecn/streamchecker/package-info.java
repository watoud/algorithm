/**
 * 
 */
/**
 * @author 18033403557
 *
 */
package net.watoud.learn.algorithm.leetcodecn.streamchecker;

/**
 * 1032. �ַ���
 */

/**
 * ������Ҫ��ʵ�� StreamChecker �ࣺ
 * 
 * StreamChecker(words)�����캯�����ø������ִʳ�ʼ�����ݽṹ�� query(letter)���������ĳЩ k >= 1�������ò�ѯ�����
 * k���ַ������Ӿɵ���˳�򣬰����ող�ѯ����ĸ��ƴд�������ִʱ��е�ĳһ�ִ�ʱ������ true�����򣬷��� false��
 */

/**
 * ʾ����
 * 
 * StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // ��ʼ���ֵ�
 * </br>
 * streamChecker.query('a'); // ���� false </br>
 * streamChecker.query('b'); // ���� false </br>
 * streamChecker.query('c'); // ���� false </br>
 * streamChecker.query('d'); // ���� true����Ϊ 'cd' ���ִʱ��� </br>
 * streamChecker.query('e'); // ���� false </br>
 * streamChecker.query('f'); // ���� true����Ϊ 'f' ���ִʱ��� </br>
 * streamChecker.query('g'); // ���� false </br>
 * streamChecker.query('h'); // ���� false </br>
 * streamChecker.query('i'); // ���� false </br>
 * streamChecker.query('j'); // ���� false </br>
 * streamChecker.query('k'); // ���� false </br>
 * streamChecker.query('l'); // ���� true����Ϊ 'kl' ���ִʱ��С� </br>
 * 
 * 
 * ��ʾ�� </br>
 * 
 * 1 <= words.length <= 2000 </br>
 * 1 <= words[i].length <= 2000 </br>
 * �ִ�ֻ����СдӢ����ĸ�� </br>
 * ������ֻ����СдӢ����ĸ�� </br>
 * ��������� 40000 ���� </br>
 */