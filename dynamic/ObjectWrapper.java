package com.google.android.gms.dynamic;

import android.os.IBinder;
import defpackage.atzb;
import defpackage.bblo;
import defpackage.bblp;
import java.lang.reflect.Field;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ObjectWrapper extends bblo {
    private final Object a;

    public ObjectWrapper(Object obj) {
        this.a = obj;
    }

    public static Object a(bblp bblpVar) {
        if (bblpVar instanceof ObjectWrapper) {
            return ((ObjectWrapper) bblpVar).a;
        }
        IBinder asBinder = bblpVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        atzb.s(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
