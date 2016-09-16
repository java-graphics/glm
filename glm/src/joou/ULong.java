/**
 * Copyright (c) 2011-2016, Data Geekery GmbH (http://www.datageekery.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package joou;

import java.math.BigInteger;

/**
 * The <code>unsigned long</code> type
 *
 * @author Lukas Eder
 * @author Jens Nerche
 * @author Ivan Sokolov
 */
public final class ULong extends UNumber implements Comparable<ULong> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6821055240959745390L;

    /**
     * A constant holding the minimum value an <code>unsigned long</code> can
     * have, 0.
     */
    public static final BigInteger MIN_VALUE = BigInteger.ZERO;
    /**
     * A constant holding the maximum value an <code>unsigned long</code> can
     * have, 2<sup>64</sup>-1.
     */
    public static final BigInteger MAX_VALUE = new BigInteger("18446744073709551615");

    /**
     * A constant holding the maximum value + 1 an <code>signed long</code> can
     * have, 2<sup>63</sup>.
     */
    public static final BigInteger MAX_VALUE_LONG = new BigInteger("9223372036854775808");

    /**
     * A constant holding the minimum value an <code>unsigned long</code> can
     * have as ULong, 0.
     */
    public static final ULong MIN = new ULong(MIN_VALUE.longValue());

    /**
     * A constant holding the maximum value + 1 an <code>signed long</code> can
     * have as ULong, 2<sup>63</sup>.
     */
    public static final ULong MAX = new ULong(MAX_VALUE);

    /**
     * The value modelling the content of this <code>unsigned long</code>
     */
    public BigInteger value;

    public ULong() {
        value = MIN_VALUE;
    }

    /**
     * Create an <code>unsigned long</code>
     *
     * @param value
     * @throws NumberFormatException If <code>value</code> is not in the range
     * of an <code>unsigned long</code>
     */
    public ULong(BigInteger value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned long</code> by masking it with
     * <code>0xFFFFFFFFFFFFFFFF</code> i.e. <code>(long) -1</code> becomes
     * <code>(uint) 18446744073709551615</code>
     *
     * @param value
     */
    public ULong(long value) {
        this.value = BigInteger.valueOf(value);
    }

    /**
     * Create an <code>unsigned long</code>
     *
     * @throws NumberFormatException If <code>value</code> does not contain a
     * parsable <code>unsigned long</code>.
     */
    private ULong(String value) throws NumberFormatException {

        if (value == null) {
            throw new NumberFormatException("null");
        }

        int length = value.length();

        if (length == 0) {
            throw new NumberFormatException("Empty input string");
        }

        if (value.charAt(0) == '-') {
            throw new NumberFormatException(String.format("Illegal leading minus sign on unsigned string %s", value));
        }

        if (length <= 18) {
            this.value = BigInteger.valueOf(Long.parseLong(value, 10));
            return;
        }

        final long first = Long.parseLong(value.substring(0, length - 1), 10);
        final int second = Character.digit(value.charAt(length - 1), 10);
        if (second < 0) {
            throw new NumberFormatException("Bad digit at end of " + value);
        }
        long result = first * 10 + second;
        if (compare(result, first) < 0) {
            throw new NumberFormatException(String.format("String value %s exceeds range of unsigned long", value));
        }

        this.value = BigInteger.valueOf(result);
    }

    public static int compare(long x, long y) {
        long a = x + Long.MIN_VALUE, b = y + Long.MIN_VALUE;
        return (a < b) ? -1 : ((a == b) ? 0 : 1);
    }

    public ULong set(BigInteger value) {
        this.value = rangeCheck(value);
        return this;
    }

    public ULong clear() {
        value = MIN_VALUE;
        return this;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ULong) {
            return value == ((ULong) obj).value;
        }
        return false;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(ULong o) {
        return value.compareTo(o.value);
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws NumberFormatException if value is out of range
     */
    private BigInteger rangeCheck(BigInteger value) throws NumberFormatException {
        if (value.compareTo(MIN_VALUE) < 0 || value.compareTo(MAX_VALUE) > 0) {
            throw new NumberFormatException("Value is out of range : " + value);
        }
        return value;
    }

    public ULong add_(ULong b) throws NumberFormatException {
        return new ULong(value.add(b.value));
    }

    public ULong add_(BigInteger s) throws NumberFormatException {
        return new ULong(value.add(s));
    }

    public ULong add(ULong b) throws NumberFormatException {
        return add(b.value);
    }

    public ULong add(BigInteger s) throws NumberFormatException {
        return set(value.add(s));
    }

    public ULong div_(ULong b) throws NumberFormatException {
        return new ULong(value.divide(b.value));
    }

    public ULong div_(BigInteger s) throws NumberFormatException {
        return new ULong(value.divide(s));
    }

    public ULong div(ULong b) throws NumberFormatException {
        return div(b.value);
    }

    public ULong div(BigInteger s) throws NumberFormatException {
        return set(value.divide(s));
    }

    public ULong mul_(ULong b) throws NumberFormatException {
        return new ULong(value.multiply(b.value));
    }

    public ULong mul_(BigInteger s) throws NumberFormatException {
        return set(value.multiply(s));
    }

    public ULong mul(ULong b) throws NumberFormatException {
        return mul(b.value);
    }

    public ULong mul(BigInteger s) throws NumberFormatException {
        return set(value.multiply(s));
    }

    public ULong sub_(ULong b) throws NumberFormatException {
        return new ULong(b.value);
    }

    public ULong sub_(BigInteger s) throws NumberFormatException {
        return new ULong(value.subtract(s));
    }

    public ULong sub(ULong b) throws NumberFormatException {
        return sub(b.value);
    }

    public ULong sub(BigInteger s) throws NumberFormatException {
        return set(value.subtract(s));
    }
}
