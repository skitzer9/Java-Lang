/*
 * Copyright 2013 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.lang.model;

import net.openhft.lang.model.constraints.MaxSize;

public interface JavaBeanInterface {
    void busyLockRecord() throws InterruptedException;

    boolean tryLockRecord();

    void unlockRecord();

    void setFlag(boolean flag);

    boolean getFlag();

    void setByte(byte b);

    byte getByte();

    StringBuilder getUsingByte(StringBuilder b);

    void setShort(short s);

    short getShort();

    StringBuilder getUsingShort(StringBuilder b);

    void setChar(char ch);

    char getChar();

    StringBuilder getUsingChar(StringBuilder b);

    void setInt(int i);

    int getVolatileInt();

    void setOrderedInt(int i);

    int getInt();

    StringBuilder getUsingInt(StringBuilder b);

    void setFloat(float f);

    float getFloat();

    StringBuilder getUsingFloat(StringBuilder b);

    void setLong(long l);

    long getLong();

    StringBuilder getUsingLong(StringBuilder b);

    long addAtomicLong(long toAdd);

    void setDouble(double d);

    StringBuilder getUsingDouble(StringBuilder b);

    double getDouble();

    double addAtomicDouble(double toAdd);

    void setString(@MaxSize(8) String s);

    String getString();

    StringBuilder getUsingString(StringBuilder b);
}
