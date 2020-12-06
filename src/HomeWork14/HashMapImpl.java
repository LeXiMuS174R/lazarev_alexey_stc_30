package HomeWork14;

public class HashMapImpl<K, V> implements Map<K, V> {
    private static final int DEFAULT_SIZE = 16;

    private static class MapEntry<K, V> {
        K key;
        V value;
        MapEntry<K, V> next;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final MapEntry<K, V>[] entries = new MapEntry[DEFAULT_SIZE];


    @Override
    public void put(K key, V value) {
        MapEntry<K, V> newMapEntry = new MapEntry<>(key, value);
        MapEntry<K, V> prevMapEntry;
        int index = key.hashCode() & (entries.length - 1);
        if (entries[index] == null) {
            entries[index] = newMapEntry;
        } else {
            MapEntry<K, V> current = entries[index];
            do {
                if (current.key == newMapEntry.key) {
                    entries[index].value = newMapEntry.value;
                    return;
                }
                prevMapEntry = current;
                current = current.next;
            }
            while (prevMapEntry.next != null);
            prevMapEntry.next = newMapEntry;
        }
    }

    @Override
    public V get(K key) {
        MapEntry<K, V> current;
        for (MapEntry<K, V> entry : entries) {
            current = entry;
            if (current != null) {
                if (!current.key.equals(key)) {
                    while (current.next != null) {
                        current = current.next;
                        if (current.key.equals(key)) {
                            return current.value;
                        }
                    }
                } else {
                    return current.value;
                }
            }
        }
        return null;
    }
}
