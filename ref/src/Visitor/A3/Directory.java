import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                    // �ǥ��쥯�ȥ��̾��
    private ArrayList dir = new ArrayList();      // �ǥ��쥯�ȥꥨ��ȥ�ν���
    public Directory(String name) {         // ���󥹥ȥ饯��
        this.name = name;
    }
    public String getName() {               // ̾��������
        return name;
    }
    public int getSize() {                  // ������������
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {         // ����ȥ���ɲ�
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {      // Iterator������
        return dir.iterator();
    }
    public void accept(Visitor v) {         // ˬ��Ԥμ�������
        v.visit(this);
    }
}
