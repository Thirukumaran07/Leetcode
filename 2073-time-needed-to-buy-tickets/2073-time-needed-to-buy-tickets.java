import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            q.offer(new int[] { i, tickets[i] });
        }

        int time = 0;

        while (!q.isEmpty()) {

            int[] person = q.poll();

            int index = person[0];
            int remaining = person[1];

            remaining--;
            time++;

            if (remaining == 0) {

                if (index == k) {
                    return time;
                }

            } else {

                q.offer(new int[] { index, remaining });
            }
        }

        return time;
    }
}