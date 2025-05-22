package com.google.android.gms.multidevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.chcy;
import defpackage.chds;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class XdFeatureListenerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chcy();
    private final chds a;

    public XdFeatureListenerOptions(chds chdsVar) {
        this.a = chdsVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a.r(), false);
        atzr.c(parcel, a);
    }
}
