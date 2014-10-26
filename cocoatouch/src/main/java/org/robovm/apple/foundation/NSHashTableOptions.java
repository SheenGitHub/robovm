/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSHashTableOptions/*</name>*/ extends Bits</*<name>*/NSHashTableOptions/*</name>*/> {
    /*<values>*/
    public static final NSHashTableOptions None = new NSHashTableOptions(0L);
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final NSHashTableOptions StrongMemory = new NSHashTableOptions(0L);
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final NSHashTableOptions CopyIn = new NSHashTableOptions(65536L);
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final NSHashTableOptions ObjectPointerPersonality = new NSHashTableOptions(512L);
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final NSHashTableOptions WeakMemory = new NSHashTableOptions(5L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSHashTableOptions/*</name>*/[] values = _values(/*<name>*/NSHashTableOptions/*</name>*/.class);

    public /*<name>*/NSHashTableOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSHashTableOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSHashTableOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSHashTableOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSHashTableOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSHashTableOptions/*</name>*/[] values() {
        return values.clone();
    }
}
