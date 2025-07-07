package array;

public class midway {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 3, 6};
        int[] res = {a[a.length / 2], b[b.length / 2]};

        System.out.print(res[0] + " " + res[1]);
    }
}
