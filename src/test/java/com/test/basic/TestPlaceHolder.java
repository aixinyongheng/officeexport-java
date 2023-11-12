package com.test.basic;

import com.kmood.basic.PlaceHolder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @Auther: SunBC
 * @Date: 2019/7/1 12:55
 * @Description: 测试占位符
 */
public class TestPlaceHolder {
    @Test
    public  void  testAIsEffective(){
        ArrayList<Character> stack = new ArrayList<Character>();
        stack.add('[');
        stack.add('*');
        ArrayList<Character> charArr = new ArrayList<Character>();
        charArr.add('@');
        charArr.add('#');
        boolean b = PlaceHolder.AIsEffective(charArr, stack, 0);
        System.out.println(b);
    }
    @Test
    public void  testXIsEffective(){
        ArrayList<Character> stack = new ArrayList<Character>();
        stack.add('[');
        stack.add('*');

        ArrayList<Character> charArr = new ArrayList<Character>();
        charArr.add('[');
        charArr.add('*');
        charArr.add('*');
        charArr.add('@');
        charArr.add('*');
        charArr.add('{');
        charArr.add('}');
        charArr.add('*');
        charArr.add('*');
        charArr.add(']');
        boolean b = PlaceHolder.XJIsEffective(charArr, stack, 2,'*');
        System.out.println(b);
    }
    @Test
    public void  testToEsc(){
        String x = PlaceHolder.ToESC("\\*   \\#   \\{   \\}  \\[  \\@");
        System.out.println(x);
        String s = PlaceHolder.FromESC(x);
        System.out.println(s);
        Assert.assertEquals("*   #   {   }  [  @",s);
    }

}
