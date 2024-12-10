package algo;

public class Runner {
    public static void main(String args[]){
        Stack nums = new Stack();
        nums.push(15);
        nums.push(17);
        nums.push(5);
        nums.push(22);

        nums.show();
        System.out.println();


        System.out.print(nums.pop());

        nums.push(43);
        System.out.println();

        System.out.print(nums.peek());

        nums.push(25);
        System.out.println();

        nums.show();

    }
}
