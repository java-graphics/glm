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
 * The <code>unsigned short</code> type
 *
 * @author Lukas Eder
 * @author Jens Nerche
 */
public final class UShort extends UNumber implements Comparable<UShort> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6821055240959745390L;

    /**
     * A constant holding the minimum value an <code>unsigned short</code> can
     * have, 0.
     */
    public static final int MIN_VALUE = 0x0000;

    /**
     * A constant holding the maximum value an <code>unsigned short</code> can
     * have, 2<sup>16</sup>-1.
     */
    public static final int MAX_VALUE = 0xffff;

    /**
     * A constant holding the minimum value an <code>unsigned short</code> can
     * have as UShort, 0.
     */
    public static final UShort MIN = new UShort(MIN_VALUE);

    /**
     * A constant holding the maximum value an <code>unsigned short</code> can
     * have as UShort, 2<sup>16</sup>-1.
     */
    public static final UShort MAX = new UShort(MAX_VALUE);

    /**
     * The value modelling the content of this <code>unsigned short</code>
     */
    public int value;

    public UShort() {
        value = MIN_VALUE;
    }

    /**
     * Create an <code>unsigned short</code>
     *
     * @throws NumberFormatException If <code>value</code> is not in the range
     * of an <code>unsigned short</code>
     */
    public UShort(int value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned short</code>
     *
     * @throws NumberFormatException If <code>value</code> does not contain a
     * parsable <code>unsigned short</code>.
     */
    private UShort(String value) throws NumberFormatException {
        this.value = rangeCheck(Integer.parseInt(value));
    }

    private int rangeCheck(int value) throws NumberFormatException {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new NumberFormatException("Value is out of range : " + value);
        }
        return value;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(value).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UShort) {
            return value == ((UShort) obj).value;
        }
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int compareTo(UShort o) {
        return (value < o.value ? -1 : (value == o.value ? 0 : 1));
    }

    public UShort set(int value) {
        this.value = rangeCheck(value);
        return this;
    }

    public UShort clear() {
        value = MIN_VALUE;
        return this;
    }

    public UShort add_(UShort b) throws NumberFormatException {
        return new UShort(value + b.value);
    }

    public UShort add_(int s) throws NumberFormatException {
        return new UShort(value + (s & MAX_VALUE));
    }

    public UShort add(UShort b) throws NumberFormatException {
        return add(b.value);
    }

    public UShort add(int s) throws NumberFormatException {
        return set((short) (value + (s & MAX_VALUE)));
    }

    public UShort div_(UShort b) throws NumberFormatException {
        return new UShort(value / b.value);
    }

    public UShort div_(int s) throws NumberFormatException {
        return new UShort(value / (s & MAX_VALUE));
    }

    public UShort div(UShort b) throws NumberFormatException {
        return div(b.value);
    }

    public UShort div(int s) throws NumberFormatException {
        return set((short) (value / (s & MAX_VALUE)));
    }

    public UShort mul_(UShort b) throws NumberFormatException {
        return new UShort(value * b.value);
    }

    public UShort mul_(int s) throws NumberFormatException {
        return set((short) (value * (s & MAX_VALUE)));
    }

    public UShort mul(UShort b) throws NumberFormatException {
        return mul(b.value);
    }

    public UShort mul(int s) throws NumberFormatException {
        return set((short) (value * (s & MAX_VALUE)));
    }

    public UShort sub_(UShort b) throws NumberFormatException {
        return new UShort(b.value);
    }

    public UShort sub_(int s) throws NumberFormatException {
        return new UShort((short) (value - (s & MAX_VALUE)));
    }

    public UShort sub(UShort b) throws NumberFormatException {
        return sub(b.value);
    }

    public UShort sub(int s) throws NumberFormatException {
        return set((short) (value - (s & MAX_VALUE)));
    }
}
