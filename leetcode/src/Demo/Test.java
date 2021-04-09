package Demo;

import DesignModel.A;
import DesignModel.Singletion;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangyuhao-2362578972@qq.com
 * @since 2020/9/28
 */

public class Test{

    class Singleton{
        private Singleton(){}

        private  Singletion instance=null;


    }
}