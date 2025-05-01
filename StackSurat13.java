public class StackSurat13 {
    Surat13[] stack;
    int size;
    int top;

    public StackSurat13(int size) {
        this.size = size;
        stack = new Surat13[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat13 s) {
        if (isFull()) {
            System.out.println("Stack penuh. Tidak bisa menerima surat baru.");
        } else {
            stack[++top] = s;
        }
    }

    public Surat13 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak ada surat yang bisa diproses.");
            return null;
        } else {
            return stack[top--];
        }
    }

    public Surat13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
