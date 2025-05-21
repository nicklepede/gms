package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cafb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cafb();
    public final Status a;
    final DataHolder b;

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this.a = status;
        this.b = dataHolder;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
