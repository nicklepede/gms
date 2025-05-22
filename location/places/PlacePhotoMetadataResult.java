package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.ccns;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new ccns();
    public final Status a;
    final DataHolder b;

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this.a = status;
        this.b = dataHolder;
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
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
