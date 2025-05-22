package com.google.android.gms.multidevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.chda;
import defpackage.chdu;
import defpackage.fgrz;
import defpackage.fxxm;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class XdFeatureStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chda();
    private final chdu a;

    public XdFeatureStatusUpdate(chdu chduVar) {
        this.a = chduVar;
    }

    public final long a() {
        return this.a.c;
    }

    public final Map b() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new fgrz(this.a.b, chdu.d));
        fxxm.e(unmodifiableMap, "getStatusMap(...)");
        return unmodifiableMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a.r(), false);
        atzr.c(parcel, a);
    }
}
