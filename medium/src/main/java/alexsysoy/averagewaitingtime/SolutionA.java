package alexsysoy.averagewaitingtime;

public class SolutionA implements Solution {
    @Override
    public double averageWaitingTime(int[][] customers) {

        int[] order = customers[0];
        int time = order[0];
        int duration = order[1];
        int count = 1;
        double avg = duration;
        int curTime = time + duration;

        for (int i = 1; i < customers.length; i++) {
            order = customers[i];
            time = order[0];
            duration = order[1];
            if (time > curTime) {
                // успеваем
                time = duration;
                curTime += time;
            } else {
                // ещё предыдущий заказ в работе
                time = (curTime - time) + duration;
                curTime = curTime + duration;
            }
            count++;
            avg += avg + ((time - avg) / count);
        }

        return avg;
    }
}
