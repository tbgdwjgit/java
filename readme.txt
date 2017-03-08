目录说明:

OperationTest.java 
因为整个表达式最高的是DOUBLE型，所以自动向上转型,显示9.0。

ForTest.java
BACDACDA

HasStatic.java
102

OverrideTest.java
覆盖时不能改变返回类型

switch 控制表达式支持的类型有byte、short、char、int、enum（Java 5）、String(Java 7)。
switch-case语句完全可以与if-else语句互转，但通常来说，switch-case语句执行效率要高。

int num = 1_000_123;
System.out.println(num);

String:是对象不是原始类型.
           为不可变对象,一旦被创建,就不能修改它的值.
           对于已经存在的String对象的修改都是重新创建一个新的对象,然后把新的值保存进去.
           String 是final类,即不能被继承.
 
StringBuffer:
           是一个可变对象,当对他进行修改的时候不会像String那样重新建立对象
           它只能通过构造函数来建立,
          StringBuffer sb = new StringBuffer();
          对象被建立以后,在内存中就会分配内存空间,并初始保存一个null.通过它的append方法向其赋值.
          sb.append("hello");

ArrayList和LinkedList的大致区别： 
     1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。 
     2.对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。 
     3.对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据。
     
     ArrayList和LinkedList在性能上各有优缺点，都有各自所适用的地方，总的说来可以描述如下： 
     1．对ArrayList和LinkedList而言，在列表末尾增加一个元素所花的开销都是固定的。对ArrayList而言，
     主要是在内部数组中增加一项，指向所添加的元素，偶尔可能会导致对数组重新进行分配；而对LinkedList而言，这个开销是统一的，分配一个内部Entry对象。
     2．在ArrayList的中间插入或删除一个元素意味着这个列表中剩余的元素都会被移动；而在LinkedList的中间插入或删除一个元素的开销是固定的。
     3．LinkedList不支持高效的随机元素访问。
     4．ArrayList的空间浪费主要体现在在list列表的结尾预留一定的容量空间，而LinkedList的空间花费则体现在它的每一个元素都需要消耗相当的空间
     可以这样说：当操作是在一列数据的后面添加数据而不是在前面或中间,并且需要随机地访问其中的元素时,使用ArrayList会提供比较好的性能；
     当你的操作是在一列数据的前面或中间添加或删除数据,并且按照顺序访问其中的元素时,就应该使用LinkedList了。     
     
泛型




















