package basics;

import java.util.Scanner;

public class Review {

    boolean practiceMode = false;

    public Review() {

    }

    public Review(boolean practiceMode) {
        this.practiceMode = practiceMode;
    }

    public void Chapter1() {

        System.out.println("--- Introduction to Computers, Programs and Java ---");
        System.out.println("Key Points");
        System.out.println("A computer consists of a CPU, RAM (memory), hard drive, monitor, and I/O");
        System.out.println("A CPU gets instructions from the memory and executes them!");
        System.out.println("A program must be brought into memory before execution.");
        System.out.println("At the most base level computers store data in bits (0s and 1s)");
        System.out.println("The smallest unit of accessible data is a byte, i.e.");
        System.out.println("two entries cannot share the space of one byte");
        System.out.println("Memory is volatile, it is lost when you pull the cord, but storage is permanent.");
        System.out.println("Machine Language: 1101101010011010, Assembly: ADDF3 R1, R2, R3, Java: int num = 1");
        System.out.println("Languages have evolved to become less complex and more readable through abstraction.");
        System.out.println("However compilers have the task of taking high level English languages and then");
        System.out.println("compiling them as assembly which then works with register via machine language (binary)");
        System.out.println("The program written in Java is source code, which is compiled into machine language and");
        System.out.println("then executed. Interpreters differ slightly as they execute the source file directly into");
        System.out.println("output. We use Java as it is general purpose and the backbone of most modern internet");
        System.out.println("applications (especially when you consider JavaScript) ");

        if (practiceMode) {
            System.out.println("Examine the following program and fill in the blanks");
            System.out.println("public __1__ HelloWorld {");
            System.out.println("    public __2__ void main(__3__[] args) {");
            System.out.println("        System.out.__4__(\"Hello World\");");
            System.out.println("    }");
            System.out.println("__5__");

            System.out.println("Solve for what goes in each blank spot!");
            System.out.println("Type something to see answers!");
            Scanner input = new Scanner(System.in);
            input.next();
            System.out.println("1) class\n2) static\n3) String\n4) println\n5) } ");
        }

    }

    public void Chapter2() {

        System.out.println();
    }

    public void Chapter3() {
        System.out.println();
    }

    public void Chapter4() {
        System.out.println();
    }

    public void Chapter5() {
        System.out.println();
    }

    public void Chapter6() {
        System.out.println();
    }

    public void Chapter7() {
        System.out.println();
    }

    public void Chapter9() {
        System.out.println();
    }
}
