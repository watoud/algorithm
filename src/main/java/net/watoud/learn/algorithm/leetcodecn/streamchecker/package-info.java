/**
 * 
 */
/**
 * @author 18033403557
 *
 */
package net.watoud.learn.algorithm.leetcodecn.streamchecker;

/**
 * 1032. 字符流
 */

/**
 * 按下述要求实现 StreamChecker 类：
 * 
 * StreamChecker(words)：构造函数，用给定的字词初始化数据结构。 query(letter)：如果存在某些 k >= 1，可以用查询的最后
 * k个字符（按从旧到新顺序，包括刚刚查询的字母）拼写出给定字词表中的某一字词时，返回 true。否则，返回 false。
 */

/**
 * 示例：
 * 
 * StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // 初始化字典
 * </br>
 * streamChecker.query('a'); // 返回 false </br>
 * streamChecker.query('b'); // 返回 false </br>
 * streamChecker.query('c'); // 返回 false </br>
 * streamChecker.query('d'); // 返回 true，因为 'cd' 在字词表中 </br>
 * streamChecker.query('e'); // 返回 false </br>
 * streamChecker.query('f'); // 返回 true，因为 'f' 在字词表中 </br>
 * streamChecker.query('g'); // 返回 false </br>
 * streamChecker.query('h'); // 返回 false </br>
 * streamChecker.query('i'); // 返回 false </br>
 * streamChecker.query('j'); // 返回 false </br>
 * streamChecker.query('k'); // 返回 false </br>
 * streamChecker.query('l'); // 返回 true，因为 'kl' 在字词表中。 </br>
 * 
 * 
 * 提示： </br>
 * 
 * 1 <= words.length <= 2000 </br>
 * 1 <= words[i].length <= 2000 </br>
 * 字词只包含小写英文字母。 </br>
 * 待查项只包含小写英文字母。 </br>
 * 待查项最多 40000 个。 </br>
 */