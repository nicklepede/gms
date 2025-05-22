package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.ccqa;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AliasedPlacesResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new ccqa();
    public final Status a;
    public final List b;

    public AliasedPlacesResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, status, i, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
