<<<<<<< HEAD
package ca.jrvs.apps;

public class CacheRuntime {

    public static class Cache {}

    public static class DiskCache extends Cache {}

    public static class MemoryCache extends Cache {}

    public static class OptimizeddiskCache extends DiskCache {

    }



    public static void main(String[] args) {
        //good
//        OptimizeddiskCache optimizeddiskCache1 = new OptimizeddiskCache();
//        Cache cache1 = (Cache) optimizeddiskCache1;

        //Exception
//        MemoryCache memoryCache2 = new MemoryCache();
//        Cache cache2 = (Cache) memoryCache2;
//        DiskCache diskCache2 = (DiskCache) cache2;
//
        //Exception
//        DiskCache diskCache3 = new DiskCache();
//        OptimizeddiskCache optimizeddiskCache3 = (OptimizeddiskCache) diskCache3;
//
        //Good
//        OptimizeddiskCache optimizeddiskCache4 = new OptimizeddiskCache();
//        DiskCache diskCache4 = (DiskCache) optimizeddiskCache4;

        //Exception
//        Cache cache5 = new Cache();
//        MemoryCache memoryCache5 = (MemoryCache) cache5;
//
        //Good
//        OptimizeddiskCache optimizeddiskCache6 = new OptimizeddiskCache();
//        Cache cache6 = (Cache) optimizeddiskCache6;
//        DiskCache diskCache6 = (DiskCache) cache6;
    }
}

=======
package ca.jrvs.apps;

public class CacheRuntime {

    public static class Cache {}

    public static class DiskCache extends Cache {}

    public static class MemoryCache extends Cache {}

    public static class OptimizeddiskCache extends DiskCache {

    }



    public static void main(String[] args) {
        //good
//        OptimizeddiskCache optimizeddiskCache1 = new OptimizeddiskCache();
//        Cache cache1 = (Cache) optimizeddiskCache1;

        //Exception
//        MemoryCache memoryCache2 = new MemoryCache();
//        Cache cache2 = (Cache) memoryCache2;
//        DiskCache diskCache2 = (DiskCache) cache2;
//
        //Exception
//        DiskCache diskCache3 = new DiskCache();
//        OptimizeddiskCache optimizeddiskCache3 = (OptimizeddiskCache) diskCache3;
//
        //Good
//        OptimizeddiskCache optimizeddiskCache4 = new OptimizeddiskCache();
//        DiskCache diskCache4 = (DiskCache) optimizeddiskCache4;

        //Exception
//        Cache cache5 = new Cache();
//        MemoryCache memoryCache5 = (MemoryCache) cache5;
//
        //Good
//        OptimizeddiskCache optimizeddiskCache6 = new OptimizeddiskCache();
//        Cache cache6 = (Cache) optimizeddiskCache6;
//        DiskCache diskCache6 = (DiskCache) cache6;
    }
}

>>>>>>> 4b6da9e7b1cf6e7c548213835c923b65a1ff8c35
