package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bzis;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzis();
    public final boolean a;
    public final boolean b;
    private final List c;

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.c = list;
        this.a = z;
        this.b = z2;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, a(), false);
        arxc.e(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
