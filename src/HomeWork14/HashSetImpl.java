package HomeWork14;

public class HashSetImpl<V> implements Set<V> {

    private static final int DEFAULT_SIZE = 16;

    private int count = 0;

    private final int[] hashes = new int[DEFAULT_SIZE];

    private final HashMapImpl<Integer, V> hashMap = new HashMapImpl<>();


    @Override
    public void add(V value) {
        int hash = value.hashCode();
        if (!checkHashes(hash)) {
            hashes[count] = hash;
            hashMap.put(hash, value);
            count++;
        } else {
            System.out.println("Значние " + value.toString() + " не добавилось");
        }
    }

    @Override
    public boolean contains(V value) {
        for (int i = 0; i < count; i++) {
            if (value.equals(hashMap.get(hashes[i])))
                return true;
        }
        return false;
    }

    private boolean checkHashes(int hash) {
        for (int i = 0; i < count; i++) {
            if (hashes[i] == hash) {
                return true;
            }
        }
        return false;
    }
}
