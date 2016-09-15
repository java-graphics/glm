glm
====

Glm is the java port of the [OpenGL Mathematics (GLM)](http://glm.g-truc.net/0.9.7/index.html) a mathematics library for graphics software based on the OpenGL Shading Language (GLSL) specifications.

Glm provides classes and functions designed and implemented with the same naming conventions (within reasonable terms) and functionalities than GLSL so that anyone, who knows GLSL or GLM, can use the java glm as well.

This project isn't limited to GLSL features. An extension system, based on the GLSL extension conventions, provides extended capabilities: matrix transformations, quaternions, data packing, random numbers, noise, etc...


http://glm.g-truc.net/0.9.4/api/modules.html


Code sample:

```java
import glm.glm;
import glm.mat._4.Mat4;
import glm.vec._2.Vec2;
import glm.vec._3.Vec3;

public class Class {
    
    Mat4 camera(float translate, Vec2 rotate) {
        
        Mat4 projection = glm.perspective_(45.0f, 4.0f/3.0f, 0.1f, 100.0f);
        Mat4 view = new Mat4(1.0f).translate(new Vec3(0.0f, 0.0f, -translate));
        view.rotate(rotate.y, new Vec3(-1.0f, 0.0f, 0.0f));
        view.rotate(rotate.x, new Vec3(0.0f, 1.0f, 0.0f));
        Mat4 model = new Mat4(1.0f).scale(new Vec3(0.5f));
        
        return projection.mul(view).mul(model);
    }
}
```

All functions with `_` at the end involv implicitly an internal instantiation. They are useful for case scenario when you want the most readable and compact code.

Steps:

- add jars under `\lib`

Enhances:

- support for [openvr](https://github.com/java-graphics-society/openvr) matrices, helpful to avoid all the problems regarding colum or row major order.


Credits: most of `Mat4d` class and a couple of other methods in `Glm` are quoted directly from [JOML](https://github.com/JOML-CI/JOML), by [Kai Burjack](https://github.com/httpdigest)
