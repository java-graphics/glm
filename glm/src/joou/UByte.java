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
 * The <code>unsigned byte</code> type
 *
 * @author Lukas Eder
 * @author Ed Schaller
 * @author Jens Nerche
 */
public final class UByte extends UNumber implements Comparable<UByte> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6821055240959745390L;

    /**
     * A constant holding the minimum value an <code>unsigned byte</code> can
     * have, 0.
     */
    public static final short MIN_VALUE = 0x00;

    /**
     * A constant holding the maximum value an <code>unsigned byte</code> can
     * have, 2<sup>8</sup>-1.
     */
    public static final short MAX_VALUE = 0xff;

    /**
     * A constant holding the minimum value an <code>unsigned byte</code> can
     * have as UByte, 0.
     */
    public static final UByte MIN = new UByte(0x00);

    /**
     * A constant holding the maximum value an <code>unsigned byte</code> can
     * have as UByte, 2<sup>8</sup>-1.
     */
    public static final UByte MAX = new UByte(0xff);

    /**
     * The value modelling the content of this <code>unsigned byte</code>
     */
    public short value;

    public UByte() throws NumberFormatException {
        value = MIN_VALUE;
    }

    /**
     * Create an <code>unsigned byte</code>
     *
     * @param value
     * @throws NumberFormatException If <code>value</code> is not in the range
     * of an <code>unsigned byte</code>
     */
    public UByte(long value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned byte</code>
     *
     * @param value
     * @throws NumberFormatException If <code>value</code> is not in the range
     * of an <code>unsigned byte</code>
     */
    public UByte(int value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned byte</code>
     *
     * @param value
     * @throws NumberFormatException If <code>value</code> is not in the range
     * of an <code>unsigned byte</code>
     */
    public UByte(short value) throws NumberFormatException {
        this.value = rangeCheck(value);
    }

    /**
     * Create an <code>unsigned byte</code> by masking it with <code>0xFF</code>
     * i.e. <code>(byte) -1</code> becomes <code>(ubyte) 255</code>
     *
     * @param value
     */
    public UByte(byte value) {
        this.value = (short) (value & MAX_VALUE);
    }

    /**
     * Create an <code>unsigned byte</code>
     *
     * @param value
     * @throws NumberFormatException If <code>value</code> does not contain a
     * parsable <code>unsigned byte</code>.
     */
    public UByte(String value) throws NumberFormatException {
        this.value = rangeCheck(Short.parseShort(value));
    }

    /**
     * Throw exception if value out of range (short version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws NumberFormatException if value is out of range
     */
    private static short rangeCheck(short value) throws NumberFormatException {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new NumberFormatException("Value is out of range : " + value);
        }
        return value;
    }

    /**
     * Throw exception if value out of range (int version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws NumberFormatException if value is out of range
     */
    private static short rangeCheck(int value) throws NumberFormatException {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new NumberFormatException("Value is out of range : " + value);
        }
        return (short) value;
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws NumberFormatException if value is out of range
     */
    private static short rangeCheck(long value) throws NumberFormatException {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new NumberFormatException("Value is out of range : " + value);
        }
        return (short) value;
    }

    public UByte set(short value) {
        this.value = rangeCheck(value);
        return this;
    }

    public UByte clear() {
        value = MIN_VALUE;
        return this;
    }

    @Override
    public int hashCode() {
        return Short.valueOf(value).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UByte) {
            return value == ((UByte) obj).value;
        }

        return false;
    }

    @Override
    public String toString() {
        return Short.toString(value);
    }

    @Override
    public int compareTo(UByte o) {
        return (value < o.value ? -1 : (value == o.value ? 0 : 1));
    }

    @Override
    public BigInteger toBigInteger() {
        return BigInteger.valueOf(value);
    }

    public UByte add_(UByte b) throws NumberFormatException {
        return new UByte(value + b.value);
    }

    public UByte add_(int s) throws NumberFormatException {
        return new UByte(value + (s & MAX_VALUE));
    }

    public UByte add(UByte b) throws NumberFormatException {
        return add(b.value);
    }

    public UByte add(int s) throws NumberFormatException {
        return set((short) (value + (s & MAX_VALUE)));
    }

    public UByte div_(UByte b) throws NumberFormatException {
        return new UByte(value / b.value);
    }

    public UByte div_(int s) throws NumberFormatException {
        return new UByte(value / (s & MAX_VALUE));
    }

    public UByte div(UByte b) throws NumberFormatException {
        return div(b.value);
    }

    public UByte div(int s) throws NumberFormatException {
        return set((short) (value / (s & MAX_VALUE)));
    }

    public UByte mul_(UByte b) throws NumberFormatException {
        return new UByte(value * b.value);
    }

    public UByte mul_(int s) throws NumberFormatException {
        return set((short) (value * (s & MAX_VALUE)));
    }

    public UByte mul(UByte b) throws NumberFormatException {
        return mul(b.value);
    }

    public UByte mul(int s) throws NumberFormatException {
        return set((short) (value * (s & MAX_VALUE)));
    }

    public UByte sub_(UByte b) throws NumberFormatException {
        return new UByte(b.value);
    }

    public UByte sub_(int s) throws NumberFormatException {
        return new UByte((short) (value - (s & MAX_VALUE)));
    }

    public UByte sub(UByte b) throws NumberFormatException {
        return sub(b.value);
    }

    public UByte sub(int s) throws NumberFormatException {
        return set((short) (value - (s & MAX_VALUE)));
    }
}
