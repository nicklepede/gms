package com.google.android.gms.multidevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cevn;
import defpackage.cewh;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class XdFeatureListenerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cevn();
    private final cewh a;

    public XdFeatureListenerOptions(cewh cewhVar) {
        this.a = cewhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a.r(), false);
        arxc.c(parcel, a);
    }
}
