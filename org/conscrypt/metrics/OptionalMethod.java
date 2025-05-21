package com.google.android.gms.org.conscrypt.metrics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OptionalMethod {
    private final Method cachedMethod;

    public OptionalMethod(Class cls, String str, Class... clsArr) {
        this.cachedMethod = initializeMethod(cls, str, clsArr);
    }

    private static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }

    private static Method initializeMethod(Class cls, String str, Class... clsArr) {
        try {
            for (Class cls2 : clsArr) {
                if (cls2 == null) {
                    return null;
                }
            }
            if (cls != null) {
                checkNotNull(str);
                return cls.getMethod(str, clsArr);
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    public Object invoke(Object obj, Object... objArr) {
        Method method = this.cachedMethod;
        if (method != null && obj != null) {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    public Object invokeStatic(Object... objArr) {
        Method method = this.cachedMethod;
        if (method != null) {
            try {
                return method.invoke(null, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }
}
