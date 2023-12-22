package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class explosive
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
ArrayList<Integer> al = new ArrayList<>();
for (int i = 0; i < N; i++) {
al.add(sc.nextInt());
}
Collections.sort(al);
int ans = Integer.MIN_VALUE;
for (int start = 0; start < N; start++) {
int left = 0;
{
int curr = start;
int jump = 1;
while (curr >= 0 && curr < N) {
int next = curr;
while (next - 1 >= 0 && Math.abs(al.get(next -

1) - al.get(curr)) <= jump) {
next -= 1;
}
if (next == curr) break;
curr = next;
jump += 1;
}
left = Math.abs(curr - start);
}
int right = 0;
{
int curr = start;
int jump = 1;
while (curr >= 0 && curr < N) {

int next = curr;
while (next + 1 < N && Math.abs(al.get(next +

1) - al.get(curr)) <= jump) {
next += 1;
}
if (next == curr) break;
curr = next;
jump += 1;
}
right = Math.abs(curr - start);
}
ans = Math.max(ans, left + right + 1);
}
System.out.print(ans);
}
}