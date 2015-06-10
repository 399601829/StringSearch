/*
 * BNDMTest.java
 *
 * Created on 21.10.2003
 *
 * eaio: StringSearch - high-performance pattern matching algorithms in Java
 * Copyright (c) 2003-2015 Johann Burkard (<http://johannburkard.de>)
 * <http://eaio.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package com.eaio.stringsearch;

import static org.junit.Assert.assertEquals;

/**
 * Test case for the {@link BNDM} class.
 *
 * @author <a href="http://johannburkard.de">Johann Burkard</a>
 * @version $Id: BNDMTest.java 6675 2015-01-17 21:02:35Z johann $
 */
public class BNDMTest extends AbstractStringSearchTest {

    @Override
    protected StringSearch createInstance() {
        return new BNDM();
    }

    public void testLongPatterns() {
        StringSearch b = createInstance();
        Object o32 = b.processString(" sublicense, and/or sell copies ");
        Object o33 = b.processString(" sublicense, and/or sell copies o");
        assertEquals(o32, o33);
    }

}