package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aryz;
import defpackage.arza;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arza();
    public final int a;
    public final int b;
    public final Long c;
    public final Long d;
    public final int e;
    public final aryz f;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = l;
        this.d = l2;
        this.e = i3;
        this.f = (l == null || l2 == null || l2.longValue() == 0) ? null : new aryz(l.longValue(), l2.longValue());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.I(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
