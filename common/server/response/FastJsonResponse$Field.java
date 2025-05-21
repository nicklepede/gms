package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.arwa;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.asif;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final asif CREATOR = new asif();
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final int g;
    public final Class h;
    protected final String i;
    public FieldMappingDictionary j;
    public StringToIntConverter k;

    public FastJsonResponse$Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = z2;
        this.f = str;
        this.g = i4;
        StringToIntConverter stringToIntConverter = null;
        if (str2 == null) {
            this.h = null;
            this.i = null;
        } else {
            this.h = SafeParcelResponse.class;
            this.i = str2;
        }
        if (converterWrapper != null && (stringToIntConverter = converterWrapper.b) == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.k = stringToIntConverter;
    }

    public final ashs a() {
        Class cls = this.h;
        arwm.s(cls);
        if (cls != SafeParcelResponse.class) {
            return (ashs) cls.newInstance();
        }
        String str = this.i;
        arwm.s(str);
        arwm.t(this.j, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
        return new SafeParcelResponse(this.j, str);
    }

    final String b() {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return str;
    }

    public final Map c() {
        String str = this.i;
        arwm.s(str);
        arwm.s(this.j);
        Map a = this.j.a(str);
        arwm.s(a);
        return a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("versionCode", Integer.valueOf(this.a), arrayList);
        arwa.b("typeIn", Integer.valueOf(this.b), arrayList);
        arwa.b("typeInArray", Boolean.valueOf(this.c), arrayList);
        arwa.b("typeOut", Integer.valueOf(this.d), arrayList);
        arwa.b("typeOutArray", Boolean.valueOf(this.e), arrayList);
        arwa.b("outputFieldName", this.f, arrayList);
        arwa.b("safeParcelFieldId", Integer.valueOf(this.g), arrayList);
        arwa.b("concreteTypeName", b(), arrayList);
        Class cls = this.h;
        if (cls != null) {
            arwa.b("concreteType.class", cls.getCanonicalName(), arrayList);
        }
        StringToIntConverter stringToIntConverter = this.k;
        if (stringToIntConverter != null) {
            arwa.b("converterName", stringToIntConverter.getClass().getCanonicalName(), arrayList);
        }
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.v(parcel, 8, b(), false);
        StringToIntConverter stringToIntConverter = this.k;
        arxc.t(parcel, 9, stringToIntConverter == null ? null : new ConverterWrapper(stringToIntConverter), i, false);
        arxc.c(parcel, a);
    }

    public FastJsonResponse$Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
        this.a = 1;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = str;
        this.g = i3;
        this.h = cls;
        if (cls == null) {
            this.i = null;
        } else {
            this.i = cls.getCanonicalName();
        }
        this.k = null;
    }
}
