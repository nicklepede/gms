package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.atyp;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.aulz;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final aulz CREATOR = new aulz();
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

    public final aulm a() {
        Class cls = this.h;
        atzb.s(cls);
        if (cls != SafeParcelResponse.class) {
            return (aulm) cls.newInstance();
        }
        String str = this.i;
        atzb.s(str);
        atzb.t(this.j, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
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
        atzb.s(str);
        atzb.s(this.j);
        Map a = this.j.a(str);
        atzb.s(a);
        return a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("versionCode", Integer.valueOf(this.a), arrayList);
        atyp.b("typeIn", Integer.valueOf(this.b), arrayList);
        atyp.b("typeInArray", Boolean.valueOf(this.c), arrayList);
        atyp.b("typeOut", Integer.valueOf(this.d), arrayList);
        atyp.b("typeOutArray", Boolean.valueOf(this.e), arrayList);
        atyp.b("outputFieldName", this.f, arrayList);
        atyp.b("safeParcelFieldId", Integer.valueOf(this.g), arrayList);
        atyp.b("concreteTypeName", b(), arrayList);
        Class cls = this.h;
        if (cls != null) {
            atyp.b("concreteType.class", cls.getCanonicalName(), arrayList);
        }
        StringToIntConverter stringToIntConverter = this.k;
        if (stringToIntConverter != null) {
            atyp.b("converterName", stringToIntConverter.getClass().getCanonicalName(), arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.v(parcel, 8, b(), false);
        StringToIntConverter stringToIntConverter = this.k;
        atzr.t(parcel, 9, stringToIntConverter == null ? null : new ConverterWrapper(stringToIntConverter), i, false);
        atzr.c(parcel, a);
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
