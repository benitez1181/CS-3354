package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList32 = constableList28.reversed();
        java.lang.Class<?> wildcardClass33 = constableList32.getClass();
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertNotNull(constableList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { '4', (-1), 10.0d };
        java.util.Vector<java.lang.constant.Constable> constableList4 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList4, constableArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.constant.Constable> constableItor7 = constableList4.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        // The following exception was thrown during execution in test generation
        try {
            constableList0.setElementAt((java.lang.constant.Constable) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList32 = constableList28.reversed();
        java.lang.Object obj33 = constableList28.clone();
        // The following exception was thrown during execution in test generation
        try {
            constableList28.removeElementAt((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100 >= 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertNotNull(constableList32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[10, 100.0, 0, 10.0, -1, 100.0, 1.0, 100, 100, 10.0, 1.0, 100, 10, 10, -1, 0, 1, 0, 10, 1, -1.0, 0.0, 1.0, 1, a,  , 0]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d, 10L };
        java.lang.Object[] objArray4 = constableList0.toArray(objArray3);
        java.util.Stack<java.lang.constant.Constable> constableList5 = new java.util.Stack<java.lang.constant.Constable>();
        int int6 = constableList5.capacity();
        int int8 = constableList5.indexOf((java.lang.Object) 1);
        boolean boolean9 = constableList0.removeAll((java.util.Collection<java.lang.constant.Constable>) constableList5);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[null, 10]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        java.util.Stack<java.lang.constant.Constable> constableList2 = new java.util.Stack<java.lang.constant.Constable>();
        boolean boolean3 = constableList0.removeElement((java.lang.Object) constableList2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable constable4 = constableList2.firstElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        java.util.Stack<java.lang.constant.Constable> constableList2 = new java.util.Stack<java.lang.constant.Constable>();
        boolean boolean3 = constableList0.removeElement((java.lang.Object) constableList2);
        java.util.Collection<java.lang.constant.Constable> constableCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = constableList0.removeAll(constableCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d, 10L };
        java.lang.Object[] objArray4 = constableList0.toArray(objArray3);
        java.lang.constant.Constable constable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable constable7 = constableList0.set((int) (short) 100, constable6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[null, 10]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 10]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        java.util.Stack<java.lang.constant.Constable> constableList2 = new java.util.Stack<java.lang.constant.Constable>();
        boolean boolean3 = constableList0.removeElement((java.lang.Object) constableList2);
        java.lang.String str4 = constableList0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d, 10L };
        java.lang.Object[] objArray4 = constableList0.toArray(objArray3);
        java.lang.constant.Constable constable6 = constableList0.push((java.lang.constant.Constable) false);
        constableList0.insertElementAt((java.lang.constant.Constable) (short) 0, 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[null, 10]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 10]");
        org.junit.Assert.assertEquals("'" + constable6 + "' != '" + false + "'", constable6, false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d, 10L };
        java.lang.Object[] objArray4 = constableList0.toArray(objArray3);
        constableList0.clear();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[null, 10]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 10]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable constable33 = constableList28.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList32 = constableList28.reversed();
        constableList28.removeElementAt((int) (byte) 0);
        java.util.Stack<java.lang.constant.Constable> constableList35 = new java.util.Stack<java.lang.constant.Constable>();
        int int36 = constableList35.capacity();
        java.lang.constant.Constable[] constableArray64 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList65 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList65, constableArray64);
        java.util.ListIterator<java.lang.constant.Constable> constableItor68 = constableList65.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList69 = constableList65.reversed();
        java.lang.Class<?> wildcardClass70 = constableList69.getClass();
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray71 = new java.lang.invoke.TypeDescriptor[] { wildcardClass70 };
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray72 = constableList35.toArray(typeDescriptorArray71);
        boolean boolean73 = constableList28.contains((java.lang.Object) typeDescriptorArray71);
        boolean boolean75 = constableList28.add((java.lang.constant.Constable) 10L);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertNotNull(constableList32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(constableItor68);
        org.junit.Assert.assertNotNull(constableList69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(typeDescriptorArray71);
        org.junit.Assert.assertArrayEquals(typeDescriptorArray71, new java.lang.invoke.TypeDescriptor[] { null });
        org.junit.Assert.assertNotNull(typeDescriptorArray72);
        org.junit.Assert.assertArrayEquals(typeDescriptorArray72, new java.lang.invoke.TypeDescriptor[] { null });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        java.util.List<java.lang.constant.Constable> constableList1 = constableList0.reversed();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { (-1), "hi!", (short) 0, 0.0f, ' ', (short) -1, 100.0d, (short) 0, 100L, (-1.0f), (short) -1, 100.0f, 0, 100.0f, 0.0d, wildcardClass18, wildcardClass20, 'a', (byte) 1, (-1.0d), (short) 1, '#' };
        java.util.ArrayList<java.lang.constant.Constable> constableList27 = new java.util.ArrayList<java.lang.constant.Constable>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList27, constableArray26);
        boolean boolean29 = constableList0.removeAll((java.util.Collection<java.lang.constant.Constable>) constableList27);
        java.lang.Object obj30 = constableList0.clone();
        org.junit.Assert.assertNotNull(constableList1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100.0d, (short) 0, (short) 0, '#', (short) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList6 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList6, constableArray5);
        java.lang.constant.Constable constable8 = constableList6.firstElement();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.constant.Constable> constableList11 = constableList6.subList((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + constable8 + "' != '" + 100.0d + "'", constable8, 100.0d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList32 = constableList28.reversed();
        constableList28.removeElementAt((int) (byte) 0);
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { 1 };
        java.lang.constant.Constable[] constableArray37 = constableList28.toArray(constableArray36);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertNotNull(constableList32);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray37);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList32 = constableList28.reversed();
        java.util.Spliterator<java.lang.constant.Constable> constableSpliterator33 = constableList28.spliterator();
        java.util.Stack<java.lang.constant.Constable> constableList34 = new java.util.Stack<java.lang.constant.Constable>();
        int int35 = constableList34.capacity();
        boolean boolean36 = constableList34.empty();
        boolean boolean37 = constableList28.containsAll((java.util.Collection<java.lang.constant.Constable>) constableList34);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertNotNull(constableList32);
        org.junit.Assert.assertNotNull(constableSpliterator33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        boolean boolean3 = constableList0.equals((java.lang.Object) (short) 100);
        java.lang.constant.Constable constable5 = constableList0.push((java.lang.constant.Constable) (-1.0d));
        constableList0.add(0, (java.lang.constant.Constable) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + constable5 + "' != '" + (-1.0d) + "'", constable5, (-1.0d));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100.0d, (short) 0, (short) 0, '#', (short) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList6 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList6, constableArray5);
        java.lang.constant.Constable constable8 = constableList6.firstElement();
        java.lang.constant.Constable constable9 = constableList6.firstElement();
        java.lang.constant.Constable constable10 = constableList6.getLast();
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + constable8 + "' != '" + 100.0d + "'", constable8, 100.0d);
        org.junit.Assert.assertEquals("'" + constable9 + "' != '" + 100.0d + "'", constable9, 100.0d);
        org.junit.Assert.assertEquals("'" + constable10 + "' != '" + (short) 0 + "'", constable10, (short) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        boolean boolean2 = constableList0.removeElement((java.lang.Object) 0.0d);
        java.lang.Object obj3 = constableList0.clone();
        java.util.ListIterator<java.lang.constant.Constable> constableItor4 = constableList0.listIterator();
        java.util.Stack<java.lang.constant.Constable> constableList5 = new java.util.Stack<java.lang.constant.Constable>();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 10L };
        java.lang.Object[] objArray9 = constableList5.toArray(objArray8);
        java.lang.constant.Constable constable11 = constableList5.push((java.lang.constant.Constable) false);
        java.util.stream.Stream<java.lang.constant.Constable> constableStream12 = constableList5.parallelStream();
        boolean boolean13 = constableList0.removeAll((java.util.Collection<java.lang.constant.Constable>) constableList5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertNotNull(constableItor4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null, 10]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null, 10]");
        org.junit.Assert.assertEquals("'" + constable11 + "' != '" + false + "'", constable11, false);
        org.junit.Assert.assertNotNull(constableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        int int3 = constableList0.indexOf((java.lang.Object) 1);
        constableList0.trimToSize();
        java.lang.Object obj5 = constableList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.lang.constant.Constable constable32 = constableList28.firstElement();
        constableList28.setSize(100);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertEquals("'" + constable32 + "' != '" + (byte) 10 + "'", constable32, (byte) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        java.util.Stack<java.lang.constant.Constable> constableList2 = new java.util.Stack<java.lang.constant.Constable>();
        boolean boolean3 = constableList0.removeElement((java.lang.Object) constableList2);
        boolean boolean4 = constableList0.isEmpty();
        java.lang.Object[] objArray5 = constableList0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        boolean boolean2 = constableList0.removeElement((java.lang.Object) 0.0d);
        java.lang.Object obj3 = constableList0.clone();
        java.util.ListIterator<java.lang.constant.Constable> constableItor4 = constableList0.listIterator();
        constableList0.trimToSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertNotNull(constableItor4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        boolean boolean33 = constableList28.equals((java.lang.Object) "");
        int int36 = constableList28.indexOf((java.lang.Object) 10.0f, 0);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        constableList0.removeAllElements();
        boolean boolean2 = constableList0.empty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0, 10, 1L, (-1.0f), 0.0d, 1.0d, (byte) 1, 'a', ' ', (byte) 0 };
        java.util.Vector<java.lang.constant.Constable> constableList28 = new java.util.Vector<java.lang.constant.Constable>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.Constable>) constableList28, constableArray27);
        java.util.ListIterator<java.lang.constant.Constable> constableItor31 = constableList28.listIterator(0);
        java.util.List<java.lang.constant.Constable> constableList32 = constableList28.reversed();
        constableList28.removeElementAt((int) (byte) 0);
        java.util.List<java.lang.constant.Constable> constableList35 = constableList28.reversed();
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(constableItor31);
        org.junit.Assert.assertNotNull(constableList32);
        org.junit.Assert.assertNotNull(constableList35);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        boolean boolean3 = constableList0.equals((java.lang.Object) (short) 100);
        java.util.Stack<java.lang.constant.Constable> constableList4 = new java.util.Stack<java.lang.constant.Constable>();
        java.util.List<java.lang.constant.Constable> constableList5 = constableList4.reversed();
        boolean boolean6 = constableList0.containsAll((java.util.Collection<java.lang.constant.Constable>) constableList5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(constableList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.Stack<java.lang.constant.Constable> constableList0 = new java.util.Stack<java.lang.constant.Constable>();
        int int1 = constableList0.capacity();
        boolean boolean3 = constableList0.equals((java.lang.Object) (short) 100);
        java.util.Stack<java.lang.constant.Constable> constableList4 = new java.util.Stack<java.lang.constant.Constable>();
        constableList4.clear();
        int int6 = constableList0.search((java.lang.Object) constableList4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }
}

