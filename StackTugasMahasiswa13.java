public class StackTugasMahasiswa13 {
    Mahasiswa13[] stack;
    int top;
    int size;

    public StackTugasMahasiswa13(int size) {
        this.size = size;
        stack = new Mahasiswa13[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa13 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    public Mahasiswa13 pop() {
        if (!isEmpty()) {
            Mahasiswa13 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    
    public Mahasiswa13 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }
    
    public String konversiDesimalKeBiner(int nilai) {               //Percobaan 2
        StackKonversi13 stack = new StackKonversi13();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }    
    
}
