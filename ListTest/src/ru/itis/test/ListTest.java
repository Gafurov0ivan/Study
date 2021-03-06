package ru.itis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static ru.itis.test.ObjectGenerator.next;
import static ru.itis.test.ObjectGenerator.nextWithNulls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author igafurov
 * @since 21.10.2016
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListTest {

    private static final Class<?> ARRAY_LIST_CLASS = MyArrayList.class;
    // USE
    // HERE
    // YOUR
    // CLASS!!!

    private static final int REPEAT = 100;
    private static final int DETAILED_TEST_OPERATIONS_COUNT = 5000;
    private static final int OBJECTS_COUNT_FOR_PERFORMANCE_TESTS = 100000;

    private List<Object> arrayList = null;
    private Random rnd = new Random(System.currentTimeMillis());

    @SuppressWarnings("unchecked")
    @Before
    public void before() throws IllegalAccessException, InstantiationException {
        arrayList = (List<Object>) ARRAY_LIST_CLASS.newInstance();
    }

    @After
    public void after() {
        arrayList = null;
    }

    @Test
    public void order1_smokeTest() {
        assertTrue("isEmpty() returns false for new empty list!", arrayList.isEmpty());
        assertEquals("size() not equals to zero for new empty list!", 0, arrayList.size());

        // Insert first element
        Object firstElement = next();
        boolean result = arrayList.add(firstElement);

        assertTrue("add(o) method should returns 'true'", result);
        assertTrue("isEmpty() returns 'false' after element insertion!", !arrayList.isEmpty());
        assertEquals("size() <> 1", 1, arrayList.size());

        // Insert second element
        Object secondElement = next();
        result = arrayList.add(secondElement);

        assertTrue("add(o) method should returns 'true'", result);
        assertTrue("isEmpty() returns 'false' after element insertion!", !arrayList.isEmpty());
        assertEquals("size() <> 2", 2, arrayList.size());

        // Insert second element
        Object thirdElement = next();
        result = arrayList.add(thirdElement);

        assertTrue("add(o) method should returns 'true'", result);
        assertTrue("isEmpty() returns 'false' after element insertion!", !arrayList.isEmpty());
        assertEquals("size() <> 3", 3, arrayList.size());

        assertTrue("get() method returned unexpected element for index = 1!", arrayList.get(1) == secondElement);
        assertTrue("get() method returned unexpected element for index = 0!", arrayList.get(0) == firstElement);
        assertTrue("get() method returned unexpected element for index = 2!", arrayList.get(2) == thirdElement);

        // get()
        Object forthElement = next();
        arrayList.add(1, forthElement);
        assertEquals("size() <> 4", 4, arrayList.size());
        assertTrue("get() method returned unexpected element for index = 0!", arrayList.get(0) == firstElement);
        assertTrue("get() method returned unexpected element for index = 1!", arrayList.get(1) == forthElement);
        assertTrue("get() method returned unexpected element for index = 2!", arrayList.get(2) == secondElement);
        assertTrue("get() method returned unexpected element for index = 3!", arrayList.get(3) == thirdElement);

        Object fifthElement = next();
        arrayList.add(0, fifthElement);
        assertEquals("size() <> 5", 5, arrayList.size());
        assertTrue("get() method returned unexpected result for index = 0!", arrayList.get(0) == fifthElement);
        assertTrue("get() method returned unexpected result for index = 1!", arrayList.get(1) == firstElement);
        assertTrue("get() method returned unexpected result for index = 2!", arrayList.get(2) == forthElement);
        assertTrue("get() method returned unexpected result for index = 3!", arrayList.get(3) == secondElement);
        assertTrue("get() method returned unexpected result for index = 4!", arrayList.get(4) == thirdElement);

        // set()
        Object o = next();
        assertTrue("set() method returned unexpected result for index = 0!", arrayList.set(0, o) == fifthElement);
        assertTrue("set() method returned unexpected result for index = 1!", arrayList.set(1, o) == firstElement);
        assertTrue("set() method returned unexpected result for index = 2!", arrayList.set(2, o) == forthElement);
        assertTrue("set() method returned unexpected result for index = 3!", arrayList.set(3, o) == secondElement);
        assertTrue("set() method returned unexpected result for index = 4!", arrayList.set(4, o) == thirdElement);

        assertTrue("set() method returned unexpected result for index = 0!", arrayList.set(0, fifthElement) == o);
        assertTrue("set() method returned unexpected result for index = 1!", arrayList.set(1, firstElement) == o);
        assertTrue("set() method returned unexpected result for index = 2!", arrayList.set(2, forthElement) == o);
        assertTrue("set() method returned unexpected result for index = 3!", arrayList.set(3, secondElement) == o);
        assertTrue("set() method returned unexpected result for index = 4!", arrayList.set(4, thirdElement) == o);

        // contains()
        assertTrue("contains() method returns unexpected result!", arrayList.contains(firstElement));
        assertTrue("contains() method returns unexpected result!", arrayList.contains(thirdElement));
        assertTrue("contains() method returns unexpected result!", arrayList.contains(fifthElement));

        // indexOf()
        assertEquals("indexOf() method returns unexpected result!", -1, arrayList.indexOf(null));
        assertEquals("indexOf() method returns unexpected result!", 0, arrayList.indexOf(fifthElement));
        assertEquals("indexOf() method returns unexpected result!", 4, arrayList.indexOf(thirdElement));
        assertEquals("indexOf() method returns unexpected result!", 2, arrayList.indexOf(forthElement));

        // lastIndexOf
        assertEquals("lastIndexOf() method returns unexpected result!", -1, arrayList.lastIndexOf(null));
        assertEquals("lastIndexOf() method returns unexpected result!", 0, arrayList.lastIndexOf(fifthElement));
        assertEquals("lastIndexOf() method returns unexpected result!", 4, arrayList.lastIndexOf(thirdElement));
        assertEquals("lastIndexOf() method returns unexpected result!", 2, arrayList.lastIndexOf(forthElement));
        arrayList.add(fifthElement);
        assertEquals("lastIndexOf() method returns unexpected result!", 5, arrayList.lastIndexOf(fifthElement));

        // Remove
        assertEquals("remove(index) method returned unexpected result", fifthElement, arrayList.remove(5));
        assertEquals("size() <> 5", 5, arrayList.size());
        assertTrue("get() method returned unexpected result for index = 0!", arrayList.get(0) == fifthElement);
        assertTrue("get() method returned unexpected result for index = 1!", arrayList.get(1) == firstElement);
        assertTrue("get() method returned unexpected result for index = 2!", arrayList.get(2) == forthElement);
        assertTrue("get() method returned unexpected result for index = 3!", arrayList.get(3) == secondElement);
        assertTrue("get() method returned unexpected result for index = 4!", arrayList.get(4) == thirdElement);

        assertEquals("remove(index) method returned unexpected result", firstElement, arrayList.remove(1));

        assertEquals("size() <> 4", 4, arrayList.size());
        assertTrue("get() method returned unexpected result for index = 0!", arrayList.get(0) == fifthElement);
        assertTrue("get() method returned unexpected result for index = 1!", arrayList.get(1) == forthElement);
        assertTrue("get() method returned unexpected result for index = 2!", arrayList.get(2) == secondElement);
        assertTrue("get() method returned unexpected result for index = 3!", arrayList.get(3) == thirdElement);

        assertTrue("remove(o) method returned unexpected result", arrayList.remove(thirdElement));
        assertTrue("remove(o) method returned unexpected result", !arrayList.remove(null));
        assertEquals("size() <> 3", 3, arrayList.size());
        assertTrue("remove()", !arrayList.contains(thirdElement));

        arrayList.clear();
        assertTrue("isEmpty() returns 'false' after clear() method!", arrayList.isEmpty());
        assertEquals("size() returns non zero after clear() method!", 0, arrayList.size());
    }

    private static final void assertList(List<?> expected, List<?> actual) {
        Assert.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals("Not equals lists after operation! Please, see stacktrace for more details.",
                    expected.get(i),
                    actual.get(i));
        }
    }

    @Test
    public void order2_detailedRandomTestListModifyMethods() throws Exception {
        for (int i = 0; i < REPEAT; i++) {
            before();
            detailedRandomTestListModifyMethods();
            after();
        }
    }

    public void detailedRandomTestListModifyMethods() {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < DETAILED_TEST_OPERATIONS_COUNT; i++) {
            Object item = nextWithNulls();
            int index = 0;
            if (!list.isEmpty()) {
                index = rnd.nextInt(list.size());
            }
            if (list.isEmpty() || Math.random() < 0.6d) { // Add element with
                // 60%
                if (list.isEmpty()) {
                    list.add(item);
                    arrayList.add(item);
                    assertList(list, arrayList);
                } else {
                    switch (rnd.nextInt(4)) {
                        case 0:
                            list.add(item);
                            arrayList.add(item);
                            assertList(list, arrayList);
                            break;
                        case 1:
                            list.add(index, item);
                            arrayList.add(index, item);
                            assertList(list, arrayList);
                            break;
                        case 2:
                            Object o1 = list.set(index, item);
                            Object o2 = arrayList.set(index, item);
                            assertEquals("set() method returned unexpected result!", o1, o2);
                            assertList(list, arrayList);
                            break;
                        case 3:
                            Collection<Object> listForAdding = createRandomList(20);
                            if (Math.random() < 0.5d) {
                                boolean f = list.addAll(listForAdding);
                                assertEquals("addAll() returned unexpected result!", f, arrayList.addAll(listForAdding));
                                assertList(list, arrayList);
                            } else {
                                boolean f = list.addAll(index, listForAdding);
                                assertEquals("addAll() returned unexpected result!", f,
                                        arrayList.addAll(index, listForAdding));
                                assertList(list, arrayList);
                            }
                            break;
                        default:
                            throw new IllegalStateException();
                    }
                }
            } else {
                switch (rnd.nextInt(2)) {
                    case 0:
                        assertEquals("remove() returned unexpected result!", list.remove(index), arrayList.remove(index));
                        assertList(list, arrayList);
                        break;
                    case 1:
                        Object o = list.get(index);
                        assertEquals("remove(index) returned unexpected result!", list.remove(o), arrayList.remove(o));
                        assertList(list, arrayList);
                        break;
                    case 2:
                        int endIndex = index + rnd.nextInt(50);
                        if (endIndex > list.size() - 1) {
                            endIndex = list.size() - 1;
                        }
                        Collection<Object> listForRemoving = list.subList(index, endIndex);
                        assertEquals("remove(Collection) returned unexpected result!", list.remove(listForRemoving),
                                arrayList.remove(listForRemoving));
                        assertList(list, arrayList);
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }
        }
    }

    @Test
    public void order3_detailedRandomTestListGetMethods() throws Exception {
        for (int i = 0; i < REPEAT; i++) {
            before();
            detailedRandomTestListGetMethods();
            after();
        }
    }

    private void detailedRandomTestListGetMethods() {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < DETAILED_TEST_OPERATIONS_COUNT; i++) {
            Object item = nextWithNulls();
            int index = 0;
            if (!list.isEmpty()) {
                index = rnd.nextInt(list.size());
            }
            if (list.isEmpty() || Math.random() < 0.4d) { // Add element with
                // 40%
                if (list.isEmpty()) {
                    list.add(item);
                    arrayList.add(item);
                } else {
                    switch (rnd.nextInt(4)) {
                        case 0:
                            list.add(item);
                            arrayList.add(item);
                            break;
                        case 1:
                            list.add(index, item);
                            arrayList.add(index, item);
                            break;
                        case 2:
                            list.set(index, item);
                            arrayList.set(index, item);
                            break;
                        case 3:
                            Collection<Object> listForAdding = createRandomList(50);
                            if (Math.random() < 0.5d) {
                                list.addAll(listForAdding);
                                arrayList.addAll(listForAdding);
                            } else {
                                list.addAll(index, listForAdding);
                                arrayList.addAll(index, listForAdding);
                            }
                        default:
                            break;
                    }
                }
            } else {
                switch (rnd.nextInt(10)) {
                    case 0:
                        assertEquals("get() returned unexpected result!", list.get(index), arrayList.get(index));
                        assertList(list, arrayList);
                        break;
                    case 1:
                        int endIndex = index + rnd.nextInt(100);
                        if (endIndex > list.size() - 1) {
                            endIndex = list.size() - 1;
                        }
                        Collection<Object> list1 = list.subList(index, endIndex);
                        Collection<Object> list2 = arrayList.subList(index, endIndex);
                        //Assert.assertThat("subList() returned not equal sub-lists!", list2, is(list1));
                        assertList(list, arrayList);
                        break;
                    case 2:
                        if (Math.random() > 0.8d) {
                            Object o = list.get(index);
                            assertEquals("contains() returned unexpected result!", list.contains(o), arrayList.contains(o));
                            assertList(list, arrayList);
                        } else {
                            assertEquals("contains() returned unexpected result!", list.contains(item),
                                    arrayList.contains(item));
                            assertList(list, arrayList);
                        }
                        break;
                    case 3:
                        if (Math.random() > 0.8d) {
                            Object o = list.get(index);
                            list.add(index, o);
                            arrayList.add(index, o);
                            assertEquals("indexOf() returned unexpected result!", list.indexOf(o), arrayList.indexOf(o));
                            assertList(list, arrayList);
                            assertEquals("lastIndexOf() returned unexpected result!", list.lastIndexOf(o),
                                    arrayList.lastIndexOf(o));
                            assertList(list, arrayList);
                        } else {
                            assertEquals("indexOf() returned unexpected result!", list.indexOf(item),
                                    arrayList.indexOf(item));
                            assertList(list, arrayList);
                        }
                        break;
                    case 4:
                        if (Math.random() > 0.8d) {
                            assertEquals("size() returned unexpected result!", list.size(), arrayList.size());
                            assertList(list, arrayList);
                        } else {
                            assertEquals("size() returned unexpected result!", list.isEmpty(), arrayList.isEmpty());
                            assertList(list, arrayList);
                        }
                        break;
                    case 5:
                        int j = rnd.nextInt(Math.min(30, list.size()));
                        List<Object> containsAllList = new ArrayList<Object>();
                        while (j > 0) {
                            containsAllList.add(list.get(rnd.nextInt(list.size())));
                            j--;
                        }
                        if (Math.random() > 0.5d) {
                            assertEquals("containsAll() returned unexpected result!", list.containsAll(containsAllList),
                                    arrayList.containsAll(containsAllList));
                            assertList(list, arrayList);
                        } else {
                            if (!containsAllList.isEmpty()) {
                                containsAllList.add(rnd.nextInt(containsAllList.size()), item);
                            } else {
                                containsAllList.add(item);
                            }
                            assertEquals("containsAll() returned unexpected result!", list.containsAll(containsAllList),
                                    arrayList.containsAll(containsAllList));
                            assertList(list, arrayList);
                        }
                        break;
                    case 6:
                        j = rnd.nextInt(Math.min(30, list.size()));
                        List<Object> removeAllList = new ArrayList<Object>();
                        while (j > 0) {
                            removeAllList.add(list.get(rnd.nextInt(list.size())));
                            j--;
                        }
                        j = rnd.nextInt(Math.min(30, list.size()));
                        while (j > 0) {
                            removeAllList.add((nextWithNulls()));
                            j--;
                        }
                        assertEquals("removeAll() returned unexpected result!", list.removeAll(removeAllList),
                                arrayList.removeAll(removeAllList));
                        assertList(list, arrayList);
                        break;
                    case 7:
                        j = 0;
                        if (list.size() > 1) {
                            j = list.size() / 2 + rnd.nextInt(list.size() / 2);
                        }
                        List<Object> retainAllList = new ArrayList<Object>();
                        while (j > 0) {
                            retainAllList.add(list.get(rnd.nextInt(list.size())));
                            j--;
                        }
                        j = rnd.nextInt(Math.min(50, list.size()));
                        while (j > 0) {
                            retainAllList.add((nextWithNulls()));
                            j--;
                        }
                        assertEquals("retainAll() returned unexpected result!", list.retainAll(retainAllList),
                                arrayList.retainAll(retainAllList));
                        assertList(list, arrayList);
                        break;
                    case 8:
                        Object[] a1 = list.toArray();
                        Object[] a2 = arrayList.toArray();
                        assertArrayEquals("toArray() returned unexpected result!", a1, a2);
                        assertList(list, arrayList);
                        break;
                    case 9:
                        Object[] objectArray1 = new Object[list.size()];
                        Object[] objectArray2 = new Object[list.size()];
                        a1 = list.toArray(objectArray1);
                        a2 = arrayList.toArray(objectArray2);
                        assertArrayEquals("toArray(o[]) returned unexpected result!", a1, a2);
                        assertTrue("toArray(o[]) returned not the same array!", a2 == objectArray2);
                        assertList(list, arrayList);
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }
        }
    }

    private Collection<Object> createRandomList(int size) {
        Collection<Object> listForAdding = new ArrayList<Object>();
        int j = rnd.nextInt(size + 1);
        while (j > 0) {
            listForAdding.add(nextWithNulls());
            j--;
        }
        return listForAdding;
    }

    @Test
    public void order4_performanceRemoveAllTest() throws Exception {
        Collection<Object> list = new ArrayList<Object>();
        Collection<Object> listForRemoving = new ArrayList<Object>();
        for (int i = 0; i < OBJECTS_COUNT_FOR_PERFORMANCE_TESTS; i++) {
            Object o = nextWithNulls();
            arrayList.add(o);
            list.add(o);
            if (Math.random() > 0.1d) {
                listForRemoving.add(o);
            }
        }
        long d = System.currentTimeMillis();
        list.removeAll(listForRemoving);
        long d1 = System.currentTimeMillis() - d;
        d = System.currentTimeMillis();
        arrayList.removeAll(listForRemoving);
        long d2 = System.currentTimeMillis() - d;
        if (d2 > d1 * 10) {
            Assert.fail("removeAll() works more than ten times longer that Java realization!");
        }
    }
}
