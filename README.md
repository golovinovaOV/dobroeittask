# Java course by DobroeIT.

## Week 1
### Task 1 
Написать программу, создающую три целочисленных переменных с произвольными значениями, и выводящую на консоль сумму трёх переменных.
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week1/src/Tasks/Task1.java)

### Task 2
Создать переменную с произвольным символом. Конвертировать символ в число, и вывести результат на консоль.
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week1/src/Tasks/Task2.java)

### Task 3
Создать программу, конвертирующую более узкий тип к более широкому.
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week1/src/Tasks/Task3.java)

### Task 4
Создать программу, конвертирующую более широкий тип к более узкому. Создать ситуацию, в которой часть данных более широкого типа теряется.
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week1/src/Tasks/Task4.java)

### Task 5
Запомнить 8 примитивных типов данных, их свойства и особенности. Создать по одной переменной каждого типа.
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week1/src/Tasks/Task5.java)

## Week 2
### Task 1 
Написать метод, который получает на вход 3 числа и возвращает сумму лишь положительных из них. К примеру, на вход 1, 100, -2 = 101(-2 - отрицательное).
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week2/src/com/holovinova/Task1.java)

### Task 2 
Написать метод, который принимает на вход массив целых чисел и возвращает сумму тех, которые делятся на 2 без остатка.
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week2/src/com/holovinova/Task2.java)

### Task 3 
Написать программу, которая принимает на вход двумерный массив, печатает его содержимое и ничего не возвращает. (реализовать с помощью вложенных циклов).
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week2/src/com/holovinova/Task3.java)

### Task 4 
Написать функцию, принимающую на вход целое число, и возвращающую факториал данного числа. *Написать две версии программы (итеративную и рекурсивную).
* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week2/src/com/holovinova/Task4.java)

### Task 5 
Самостоятельно разобраться - что же такое ООП. Написать своими словами о инкапсуляции, полиморфизме и наследовании.

**ООП** - парадигма в которой все из чего состоит продукт - объекты, которые являются экземплярами классов, а класы в свою очередь образуют некоторую иерархию. То есть объекты реального мира, и их взаимодейсвтие, переносятся в продукт, с некоторой степенью абстракции (фиксируются только те свойства и поведение, которое значимо для конкретного продукта). 
 
**Инкапсуляция** - данный принцип отвечает за то, чтобы внутреннее состояние объекта было защищено от изменения из вне и изменения вносились только с помощью методов самого объекта.

**Наследование** - принцип, который позволяет всем наследникам приобретать свойства родителя и в случае необходимости добавлять поведение и/или состояние.

**Полиморфизмм** -  принцип, который дает возможность обращаться со всеми объектами наследниками одинаковым образом, как будто они пренадлежат классу предка.

## Week 3
### Task 1 
Создать иерархию: супертип Animal, реализации - Dog, Cat. В супертипе должен быть объявлен метод void voice(), в подтипах - реализовать данный метод, собака должна печатать на консоль "Гав", кот - "Мяу". У собак и котов должен быть возраст и имя, и методы, позволяющие получать соответственно возраст и имя. Должна быть возможность узнать сколько всего животных было создано.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week3/src/com/holovinova/Task1)

### Task 2  
Создать массив животных, и добавить туда множество котов и собак. Итеративно пройтись по массиву, и распечатать на консоль вид животного, его возраст и имя.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week3/src/com/holovinova/Task2)

### Task 3 
Создать метод, который из созданного в п.2 массива удалит всех котов младше 1 года или старше 8 лет, а также всех собак, чьё имя содержит больше 4 согласных букв. 

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week3/src/com/holovinova/Task3)

### Task 4
Создать класс питомник, который будет хранить массив животных. Реализовать метод по добавлению животных в питомник, а также по получению всех животных по типу и диапазону лет включительно (метод должен принимать три аргумента - тип животного, число, соответствующее старту диапазона и число, соответствующее его концу).

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week3/src/com/holovinova/Task4)

### Task 5
*Создать метод, принимающий на вход массив, и возвращающий массив содержащий в качестве индексов значения входного массива, а в качестве значений - кол-во вхождений данного элемента во входном массиве. Значения входного массива не могут быть меньше 0 или больше 100.
Пример:
Вход: [5,3,7,3,1,9,2,9,0,4,9]
Выход: [1,1,1,2,1,1,0,1,3]

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week3/src/com/holovinova/Task5)

## Week 4
### Task 1 
 Сделать так, чтобы животные одинакового типа и с одинаковым возрастом и именем при проверке на equals были распознаны, как одинаковые.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week4/src/com/holovinova/Task1/TestEquals.java)

### Task 2 

Реализовать метод toString() в супертипе, чтобы он печатал информацию о типе животного, возрасте и имени.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week4/src/com/holovinova/Task2/TestToString.java)

### Task 3 
Создать реализации метода void dyingVoice() в Cat и Dog. Метод должен печатать на консоль звук, издаваемый животным перед смертью(можно выбрать любой). Сделать так, чтобы метод вызывался на животном перед его уничтожением сборщиком мусора. Спровоцировать выполнение сборщика мусора(создать очень много объектов, на которые нет ссылок). Убедиться, что животных слышно перед смертью.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week4/src/com/holovinova/Task3/TestGarbageCollector.java)

### Task 4 
Создать статический метод, который принимает на вход объект, и возвращает строку, содержащую имя класса данного объекта.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week4/src/com/holovinova/Task4/TestClassName.java)

### Task 5 
Создать класс Fish, который будет наследовать Animal. При вызове метода voice, рыба должна выбрасывать NotImplementedException. Добавить несколько рыб в массив с разными животными. Проитерироваться по массиву, и вызвать метод voice на каждом животном. Подсчитать, сколько раз выпадет NotImplementedException, и вывести кол-во на консоль.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week4/src/com/holovinova/Task5/TestFish.java)

## Week 5
### Task 1
Написать алгоритм бинарного поиска:
	int binarySearch(int [] data, int element); <- Ищет элемент element в data, возвращает индекс искомого элемента, или в случае отсутствия: -1.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week5/src/com/holovinova/BinarySearch/BinarySearch.java)

### Task 2
Создать класс UserLinkedList. Класс должен содержать методы:
	boolean add(Object element) <- добавление в конец списка.
	boolean contains(Object element) <- проверка на наличие.
	int size() <- возвращает размер списка.
	boolean isEmpty() <- возвращает true, если список пустой.
	boolean remove(Object element) <- удаление элемента.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week5/src/com/holovinova/CustomLinkedList/CustomLinkedList.java)

### Task 3
Написать юнит тесты к классу UserLinkedList.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week5/src/com/holovinova/CustomLinkedList/TestCustomLinkedList.java)

### Task 4
 Написать реализацию бинарного дерева поиска, UserBinarySet. Класс должен содержать методы:
	boolean add(Object element) <- добавление в дерево.
	boolean contains(Object element) <- проверка на наличие.
	int size() <- количество элементов в дереве.
	boolean isEmpty() <- возвращает true, если дерево пустое.
	boolean remove(Object element) <- удаление элемента.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week5/src/com/holovinova/BinarySearchTree/BinarySearchTreeSet.java)

### Task 5
Написать метод дерева void print(), который распечатает все элементы из дерева в отсортированном виде.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week5/src/com/holovinova/BinarySearchTree/BinarySearchTreeSet.java)

### Task 6
Написать методы для поиска минимального| максимального значения из дерева.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week5/src/com/holovinova/BinarySearchTree/BinarySearchTreeSet.java)

### Task 7
При реализации структур данных использовать обобщения. Тогда сигнатуры будут не с Object, а с обобщенным типом T.

## Week 6
### Task 1
Создать UserHashMap. Реализовать операции: put(T key, T value); get(T key);

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week6/src/com/holovinova/Task1/CustomHashMap.java)

### Task 2
Написать метод, который принимает на вход строку и подсчитывает кол-во уникальных символов в строке.* использовать структуру данных из Collection framework.
Написать метод, который принимает на вход строку, и подсчитывает кол-во вхождений каждого из символов в строке.* использовать структуру данных из Collection framework.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week6/src/com/holovinova/Task2/CharacterCounter.java)

## Week 7
### Task 1
Создать функциональный интерфейс, который содержит метод, принимающий массив строк и возвращающий int. Реализовать данный интерфейс с помощью лямбды. Метод должен возвращать сумму кол-ва символов во всех строках.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week7/src/com/holovinova/Lambda/TestStringCounter.java)

### Task 2
Написать метод, который принимает на вход массив животных и возвращает первые 5 животных, чей возраст не больше 5 лет и имя начинается на a,b или c в отсортированном по возрасту виде. Использовать stream api.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week7/src/com/holovinova/StreamApi/TestAnimals.java)

### Task 3
Написать метод, который принимает на вход массив положительных int, и возвращает коллекцию животных, возраст которых будет равнятся значению из переданного извне массива. Животное должно быть котом, если число четное, в противном случае - собакой. Имя может быть произвольным. Использовать stream api.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week7/src/com/holovinova/StreamApi/TestAnimals.java)

### Task 4
Создать поток, который при старте напечатает своё собственное имя.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week7/src/com/holovinova/Threads/TestThread.java)

## Week 8 
### Task 1
Написать класс, содержащий методы по сериализации и десериализации животных.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week8/src/com/holovinova/serialization/AnimalSerializer.java)

### Task 2
Написать программу, которая 4 раза считает сумму от 1 до 10000000 и выводит результат на консоль.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week8/src/com/holovinova/threads/TestCalculation.java)

### Task 3
Написать программу, которая задание 2 выполнит в 4 потоках из пула. Сравнить, быстрее ли параллельное выполнение.

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week8/src/com/holovinova/threads/TestCalculation.java)

### Task 4
Написать программу, демонстрирующую race conditions(доказать, что при одновременной записи в одну и ту же память из более чем одного потока, возможна потеря данных).

* [Solution](https://github.com/golovinovaOV/dobroeittask/blob/master/Week8/src/com/holovinova/racecondition/RaceConditionTest.java)

## Week 9 
Создать таблицы animal type, animal.
Создать AnimalDao класс, который должен содержать:
	boolean add(Animal animal);
	boolean remove(long animalId);
	boolean update(Animal animal); <- обновление по id.
	Animal findById(long animalId);
	List<Animal> findAll();
	List<Animal> findByType(AnimalType type);
	
* [Solution](https://github.com/golovinovaOV/dobroeittask/tree/master/Week9)

## Week 10
Написать веб приложение с использованием spark framework, которое должно позволять работать с AnimalDAO через веб интерфейс.

* [Solution](https://github.com/golovinovaOV/dobroeittask/tree/master/Week10)