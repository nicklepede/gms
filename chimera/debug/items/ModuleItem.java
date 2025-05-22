package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqkq;
import defpackage.atzr;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ModuleItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new aqkq();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final int h;
    public final boolean i;
    public final String j;

    public ModuleItem(int i, String str, int i2, String str2, int i3, long j, String str3, int i4, boolean z, String str4) {
        fxxm.f(str, "moduleId");
        fxxm.f(str2, "apkPath");
        fxxm.f(str3, "apkVersionName");
        fxxm.f(str4, "apkPackageName");
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = j;
        this.g = str3;
        this.h = i4;
        this.i = z;
        this.j = str4;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ModuleItem moduleItem = (ModuleItem) obj;
        fxxm.f(moduleItem, "other");
        return this.b.compareTo(moduleItem.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "out");
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.v(parcel, 7, this.g, false);
        atzr.o(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.v(parcel, 10, this.j, false);
        atzr.c(parcel, a);
    }
}
