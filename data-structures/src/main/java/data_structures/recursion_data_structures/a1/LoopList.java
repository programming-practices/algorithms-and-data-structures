package data_structures.recursion_data_structures.a1;

/**
 * Sources: http://www.quizful.net/interview/java/poisk-zatsiklennosti-v-odnosvyaznom-spiske
 *
 *
 * Пускаем по списку два указателя: первый идёт с шагом в 1 элемент, второй с шагом в 2 элемента. На каждом шаге 2-го указателя проверяем, указывают ли они на один и тот же объект. Если да - есть зацикленность.
 *
 * Пример: создадим совершенно бесполезную реализацию односвязного списка, которая умеет:
 * 1) добавлять записи
 * 2) приводить себя к строке
 * 3) при каждом добавлении (начиная со второго) примерно с 20% шансом создавать зацикленность и больше ничего никогда не добавлять
 * 4) проверять саму себя на наличие зацикленности.
 *
 * */
public class LoopList {

    private Entry root;
    private Entry last;
    private boolean loop;

    public void add(Object o) {

        if (loop) return;

        if (root == null) {
            last = root = new Entry(o);
        } else if (Math.random() < .2) {
            Entry e = root;
            while (true) {
                if (Math.random() > .5 || e.next == last || e.next == null) break;
                e = e.next;
            }
            last = last.next = e;
            loop = true;
        } else {
            last = last.next = new Entry(o);
        }
    }

    public boolean checkLoop() {
        if (root == null) return false;
        Entry agentA = root, agentB = root.next;
        while (true) {
            if (agentA == agentB) return true;
            if (agentA == null || agentB == null || agentB.next == null) return false;

            agentA = agentA.next;
            agentB = agentB.next.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (root != null) {
            sb.append(root.value);
            Entry e = root;
            while ((e = e.next) != null) {
                sb.append(", ").append(e.value);
            }
        }
        return sb.append(']').toString();
    }

    private static class Entry {
        private Object value;
        private Entry next;

        public Entry(Object value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {

        LoopList l = new LoopList();
        l.add("qwe");
        l.add(12);
        l.add(2.3);
        l.add('z');
        l.add(true);

        System.out.println(l.checkLoop() ? "Loop!" : l);
    }
}
