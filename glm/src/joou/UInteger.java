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

/**
 * The <code>unsigned int</code> type
 *
 * @author Lukas Eder
 * @author Ed Schaller
 * @author Jens Nerche
 */
public final class UInteger extends UNumber implements Comparable<UInteger> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6821055240959745390L;

    /**
     * A constant holding the minimum value an <code>unsigned int</code> can
     * have, 0.
     */
    public static final long MIN_VALUE = 0x00000000;

    /**
     * A constant holding the maximum value an <code>unsigned int</code> can
     * have, 2<sup>32</sup>-1.
     */
    public static final long MAX_VALUE = 0xffffffffL;

    /**
     * A constant holding the minimum value an <code>unsigned int</code> can
     * have as UInteger, 0.
     */
    public static final UInteger MIN = new UInteger(MIN_VALUE);

    /**
     * A constant holding the maximum value an <code>unsigned int</code> can
     * have as UInteger, 2<sup>32</sup>-1.
     */
    public static final UInteger MAX = new UInteger(MAX_VALUE);

    /**
     * The value modelling the content of this <code>unsigned int</code>
     */
    public long value;

    public UInteger() {
        value = MIN_VALUE;
    }

    /**
     * Create an <code>unsigned int</code>
     *
     * @param value
     * @throws NumberFormatException If <code>value</code> is not in the range
     * of an <code>unsigned int</code>
     */
    public UInteger(long value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned int</code> by masking it with
     * <code>0xFFFFFFFF</code> i.e. <code>(int) -1</code> becomes
     * <code>(uint) 4294967295</code>
     */
    private UInteger(int value) {
        this.value = value & MAX_VALUE;
    }

    /**
     * Create an <code>unsigned int</code>
     *
     * @throws NumberFormatException If <code>value</code> does not contain a
     * parsable <code>unsigned int</code>.
     */
    private UInteger(String value) throws NumberFormatException {
        this.value = rangeCheck(Long.parseLong(value));
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws NumberFormatException if value is out of range
     */
    private static long rangeCheck(long value) throws NumberFormatException {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new NumberFormatException("Value is out of range : " + value);
        }
        return value;
    }
    
    public UInteger set(long value) {
        this.value = rangeCheck(value);
        return this;
    }
    
    public UInteger clear() {
        value = MIN_VALUE;
        return this;
    }

    @Override
    public int hashCode() {
        return Long.valueOf(value).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UInteger) {
            return value == ((UInteger) obj).value;
        }

        return false;
    }

    @Override
    public String toString() {
        return Long.toString(value);
    }

    @Override
    public int compareTo(UInteger o) {
        return (value < o.value ? -1 : (value == o.value ? 0 : 1));
    }

    public UInteger add_(UInteger b) throws NumberFormatException {
        return new UInteger(value + b.value);
    }

    public UInteger add_(long s) throws NumberFormatException {
        return new UInteger(value + (s & MAX_VALUE));
    }

    public UInteger add(UInteger b) throws NumberFormatException {
        return add(b.value);
    }

    public UInteger add(long s) throws NumberFormatException {
        return set(value + (s & MAX_VALUE));
    }

    public UInteger div_(UInteger b) throws NumberFormatException {
        return new UInteger(value / b.value);
    }

    public UInteger div_(long s) throws NumberFormatException {
        return new UInteger(value / (s & MAX_VALUE));
    }

    public UInteger div(UInteger b) throws NumberFormatException {
        return div(b.value);
    }

    public UInteger div(long s) throws NumberFormatException {
        return set((value / (s & MAX_VALUE)));
    }

    public UInteger mul_(UInteger b) throws NumberFormatException {
        return new UInteger(value * b.value);
    }

    public UInteger mul_(long s) throws NumberFormatException {
        return set(value * (s & MAX_VALUE));
    }

    public UInteger mul(UInteger b) throws NumberFormatException {
        return mul(b.value);
    }

    public UInteger mul(long s) throws NumberFormatException {
        return set(value * (s & MAX_VALUE));
    }

    public UInteger sub_(UInteger b) throws NumberFormatException {
        return new UInteger(b.value);
    }

    public UInteger sub_(long s) throws NumberFormatException {
        return new UInteger(value - (s & MAX_VALUE));
    }

    public UInteger sub(UInteger b) throws NumberFormatException {
        return sub(b.value);
    }

    public UInteger sub(long s) throws NumberFormatException {
        return set(value - (s & MAX_VALUE));
    }
}
