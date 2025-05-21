package com.google.android.gms.multidevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cevp;
import defpackage.cewj;
import defpackage.fedg;
import defpackage.fvbo;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class XdFeatureStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cevp();
    private final cewj a;

    public XdFeatureStatusUpdate(cewj cewjVar) {
        this.a = cewjVar;
    }

    public final long a() {
        return this.a.c;
    }

    public final Map b() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new fedg(this.a.b, cewj.d));
        fvbo.e(unmodifiableMap, "getStatusMap(...)");
        return unmodifiableMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a.r(), false);
        arxc.c(parcel, a);
    }
}
