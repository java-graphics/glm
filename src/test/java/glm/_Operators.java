/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._2.Vec2;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author GBarbieri
 */
public class _Operators {

    @Test
    public void vec2() {

        {
            Vec2 a = new Vec2(1.0f), b = new Vec2(1.0f);
            assertFalse(a.notEquals(b));
            assertTrue(a.equals(b));
        }
        {
            Vec2 a = new Vec2(1.0f);
            Vec2 c = a.add_(1.0f);
            a.add(1.0f);
            assertTrue(a.equals(new Vec2(2.0f)));
            assertTrue(a.equals(c));
        }
        {
            Vec2 a = new Vec2(1.0f);
            Vec2 b = new Vec2(2.0f, -1.0f);
            Vec2 c = a.add_(b);
            a.add(b);
            assertTrue(a.equals(new Vec2(3.0f, 0.0f)));
            assertTrue(a.equals(c));
        }
        {
            Vec2 a = new Vec2(1.0f);
            Vec2 c = a.sub_(1.0f);
            a.sub(1.0f);
            assertTrue(a.equals(new Vec2(0.0f)));
            assertTrue(a.equals(c));
        }

        {
            Vec2 a = new Vec2(1.0f);
            Vec2 b = new Vec2(2.0f, -1.0f);
            Vec2 c = a.sub_(b);
            a.sub(b);
            assertTrue(a.equals(new Vec2(-1.0f, 2.0f)));
            assertTrue(a.equals(c));
        }
        {
            Vec2 a = new Vec2(1.0f);
            Vec2 c = a.mul_(2.0f);
            a.mul(2.0f);
            assertTrue(a.equals(new Vec2(2.0f)));
            assertTrue(a.equals(c));
        }
        {
            Vec2 a = new Vec2(2.0f);
            Vec2 b = new Vec2(2.0f);
            Vec2 c = a.div_(b);
            a.div(b);
            assertTrue(a.equals(new Vec2(1.0f)));
            assertTrue(a.equals(c));
        }
        {
            Vec2 a = new Vec2(1.0f, 2.0f);
            Vec2 b = new Vec2(4.0f, 5.0f);

            Vec2 c = a.add_(b);
            assertTrue(c.equals(new Vec2(5.0f, 7.0f)));

            Vec2 d = b.sub_(a);
            assertTrue(d.equals(new Vec2(3.0f)));

            Vec2 e = a.mul_(b);
            assertTrue(e.equals(new Vec2(4.0f, 10.0f)));

            Vec2 f = b.div_(a);
            assertTrue(f.equals(new Vec2(4.0f, 2.5f)));

            Vec2 g = a.add_(1.0f);
            assertTrue(g.equals(new Vec2(2.0f, 3.0f)));

            Vec2 h = b.sub_(1.0f);
            assertTrue(h.equals(new Vec2(3.0f, 4.0f)));

            Vec2 i = a.mul_(2.0f);
            assertTrue(i.equals(new Vec2(2.0f, 4.0f)));

            Vec2 j = b.div_(2.0f);
            assertTrue(j.equals(new Vec2(2.0f, 2.5f)));

            Vec2 k = Glm.add_(1.0f, a);
            assertTrue(k.equals(new Vec2(2.0f, 3.0f)));

            Vec2 l = Glm.sub_(1.0f, b);
            assertTrue(l.equals(new Vec2(-3.0f, -4.0f)));

            Vec2 m = Glm.mul_(2.0f, a);
            assertTrue(m.equals(new Vec2(2.0f, 4.0f)));

            Vec2 n = Glm.div_(2.0f, b);
            assertTrue(n.equals(new Vec2(0.5f, 2.0 / 5.0f)));
        }
        {
            Vec2 a = new Vec2(1.0f, 2.0f);
            Vec2 b = new Vec2(4.0f, 5.0f);

            a.add(b);
            assertTrue(a.equals(new Vec2(5.0f, 7.0f)));

            a.add(1.0f);
            assertTrue(a.equals(new Vec2(6.0f, 8.0f)));
        }
        {
            Vec2 a = new Vec2(1.0f, 2.0f);
            Vec2 b = new Vec2(4.0f, 5.0f);

            b.sub(a);
            assertTrue(b.equals(new Vec2(3.0f, 3.0f)));

            b.sub(1.0f);
            assertTrue(b.equals(new Vec2(2.0f)));
        }
        {
            Vec2 a = new Vec2(1.0f, 2.0f);
            Vec2 b = new Vec2(4.0f, 5.0f);

            b.div(a);
            assertTrue(b.equals(new Vec2(4.0f, 2.5f)));

            b.div(2.0f);
            assertTrue(b.equals(new Vec2(2.0f, 1.25f)));
        }
        {
            Vec2 b = new Vec2(2.0f);

            b.div(b.y);
            assertTrue(b.equals(new Vec2(1.0f)));
        }
        {
//            Vec2 a = new Vec2(1.0f, 2.0f);
////            Vec2 b = a.n;
//
//            b.div(b.y);
//            assertTrue(b.equals(new Vec2(1.0f)));
        }
    }
}
