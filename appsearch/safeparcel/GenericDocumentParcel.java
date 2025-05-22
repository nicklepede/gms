package com.google.android.gms.appsearch.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.wca;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GenericDocumentParcel extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wca();
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final List g;
    public final List h;
    public final Map i;
    private Integer j;

    public GenericDocumentParcel(String str, String str2, String str3, long j, long j2, int i, List list, List list2) {
        Objects.requireNonNull(list);
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            PropertyParcel propertyParcel = (PropertyParcel) list.get(i2);
            arrayMap.put(propertyParcel.a, propertyParcel);
        }
        this.a = (String) Objects.requireNonNull(str);
        this.b = (String) Objects.requireNonNull(str2);
        this.c = (String) Objects.requireNonNull(str3);
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = (List) Objects.requireNonNull(list);
        this.i = (Map) Objects.requireNonNull(arrayMap);
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericDocumentParcel)) {
            return false;
        }
        GenericDocumentParcel genericDocumentParcel = (GenericDocumentParcel) obj;
        return this.a.equals(genericDocumentParcel.a) && this.b.equals(genericDocumentParcel.b) && this.c.equals(genericDocumentParcel.c) && this.e == genericDocumentParcel.e && this.d == genericDocumentParcel.d && this.f == genericDocumentParcel.f && Objects.equals(this.g, genericDocumentParcel.g) && Objects.equals(this.i, genericDocumentParcel.i) && Objects.equals(this.h, genericDocumentParcel.h);
    }

    public final int hashCode() {
        if (this.j == null) {
            this.j = Integer.valueOf(Objects.hash(this.a, this.b, this.c, Long.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.d), Integer.valueOf(Objects.hashCode(this.g)), Integer.valueOf(Objects.hashCode(this.i)), Integer.valueOf(Objects.hashCode(this.h))));
        }
        return this.j.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wca.a(this, parcel);
    }
}
