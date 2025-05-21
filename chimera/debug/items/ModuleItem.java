package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aoix;
import defpackage.arxc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ModuleItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new aoix();
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
        fvbo.f(str, "moduleId");
        fvbo.f(str2, "apkPath");
        fvbo.f(str3, "apkVersionName");
        fvbo.f(str4, "apkPackageName");
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
        fvbo.f(moduleItem, "other");
        return this.b.compareTo(moduleItem.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "out");
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.q(parcel, 6, this.f);
        arxc.v(parcel, 7, this.g, false);
        arxc.o(parcel, 8, this.h);
        arxc.e(parcel, 9, this.i);
        arxc.v(parcel, 10, this.j, false);
        arxc.c(parcel, a);
    }
}
