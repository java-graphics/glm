This project isn't being worked anymore, use [this](https://github.com/kotlin-graphics/glm) instead.

If you would like to continue it, let me know

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

About the porting.

### Naming

Since `i32vec2` would have been `I32vec2` because java requires always first letter capital, it has been decided to move the type part at the right and changing the bit lenght directly with the primitive data type (`Vec2i32` would have been confusing), so we simply have `Vec2i`. 

|c++|java|
|---|---|
|`bvec*`|`Vec*bool`|
|`dvec*`|`Vec*d`|
|`vec*`|`Vec*`|
|`i8vec*`|`Vec*b`|
|`i16vec*`|`Vec*s`|
|`i32vec*`|`Vec*i`|
|`i64vec*`|`Vec*l`|
|`u8vec*`|`Vec*ub`|
|`u16vec*`|`Vec*us`|
|`u32vec*`|`Vec*ui`|
|`u64vec*`|`Vec*ul`|
|`dmat*`|`Mat*d`|
|`mat*`|`Mat*`|

`*` means 1, 2, 3 or 4 for c++, but on java only 2, 3 and 4 because we didn't port any `*vec1` for the moment since there is no apparent reason.

### Instantiation

All functions with any underscore `_` at the end involve implicitly an internal instantiation. They are useful for case scenario when you want the most readable and compact code.

This means `Glm.add_(Vec2 a, float b)` does not modify `a` because it instantiates a new `Vec2` internally. On contrary, `Glm.add(Vec2 a, float b)` saves the result on `a`, while `Glm.add(Vec2 res, Vec2 a, float b)` saves the result on `res`.

All of them return the result object (`Vec2` in this case) in order to give you the possibility to concatenate multiple operations in cascade.

The `Glm` class contains all the possible calls. However to improve usability, each vec/mat class have in its own some additional functions (they will refer always to the `Glm` ones though).

Therefore, similarly, if we have a `Vec2 v` and if we want to add `2`, we simply call `v.add(2)`. If we want the result to be saved on v, like `v+= 2`, otherwise `Vec2 a = v.add_(2)` and we save the result in `a`.

However, binary operations involving a scalar in the first place can, off course, only be called by `Glm`, so if you want do `1.0f - v`, you shall call `Glm.sub(1.0f, v)`.

Since java transforms `byte` and `short` value to `int` before doing any operation, we provide the same for classes involving those type, signed or unsigned.


Steps:

- add jars under `\lib`

Enhances:

- support for [openvr](https://github.com/java-graphics-society/openvr) matrices, helpful to avoid all the problems regarding colum or row major order.


Credits:
- [JOML](https://github.com/JOML-CI/JOML), by [Kai Burjack](https://github.com/httpdigest) for `Mat4/d.inverse()`, `Mat4/d.invTransp/3()`, `Mat4.det3()`, `Mat4.scale()`
- [jOOU](https://github.com/jOOQ/jOOU), for the unsigned version for the four Java integer types (`byte`, `short`, `int` and `long`).
