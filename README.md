# extension-lambda
针对java8+的增强型lambda api

# usage
- 便捷的map操作
```java
// 把一个map转成另一个value不变，key不一样的map
java.util.Map<Integer, Integer> map = java.util.Map.of(1, 1, 2, 2, 3, 3);
java.util.Map<String, Integer> anotherMap = Map.mapKey(map, entry -> entry.getKey().toString());

// 把一个map转成另一个key不变，value不一样的map
java.util.Map<Integer, Integer> map = java.util.Map.of(1, 1, 2, 2, 3, 3);
java.util.Map<Integer, String> anotherMap = Map.mapValue(map, entry -> entry.getKey().toString());

// 可以在lambda方法里引用list的下标
List<Integer> integers = mapIndex(pairs, (index, pair) -> {
    Assertions.assertEquals(index, atomicInteger.getAndIncrement());
    return pair.getLeft();
}).collect(Collectors.toList());
```

- 分组，转换相关
```java
// 把list转换成map, key的值由lambda得到
Map<String, Pair<Integer, String>> map = associateBy(pairs, Pair::getRight);

// 把list转换成map, value的值由lambda得到
Map<String, Pair<Integer, String>> map = associateWith(pairs, Pair::getRight);

// 分组，相同key的item在一个list里，key由lambda得到
Map<Integer, List<Pair<Integer, String>>> map = GroupBy.groupBy(pairs, Pair::getLeft);
// 与上面不同的是list中的value也可以通过lambda得到
Map<Integer, List<String>> map = GroupBy.groupBy(pairs, Pair::getLeft, Pair::getRight);
```

- let with
```java
// with的lambda里返回的是传入的对象
Pair<Integer, Integer> pair = With.with(Pair.pair(1, 2), innerPair -> {
    innerPair.setLeft(2);
    innerPair.setRight(3);
    return innerPair;
});
// let的lambda里返回的是lambda里最后return语句的值
Integer integer = Let.let(Pair.pair(1, 2), Pair::getLeft);
```

- 判断
```java
// any 任何一个元素符合predicate, 返回true, 类似or
boolean result = Any.any(pairs, p -> p.getLeft() % 2 == 0);
// all 所有元素符合predicate,返回true, 类似and
boolean result = All.all(pairs, p -> p.getLeft() > 0);
```

