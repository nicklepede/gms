package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cbrj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbrj();
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
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, a(), false);
        atzr.e(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
