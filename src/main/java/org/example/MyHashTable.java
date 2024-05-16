package org.example;

public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key; // assigning key
            this.value = value; // assigning value
        }

        //  TO string returns everything as a string
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }
}