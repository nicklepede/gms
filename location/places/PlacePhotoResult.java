package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cafc;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class PlacePhotoResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cafc();
    public final Status a;
    final BitmapTeleporter b;
    private final Bitmap c;

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapTeleporter) {
        this.a = status;
        this.b = bitmapTeleporter;
        this.c = bitmapTeleporter != null ? bitmapTeleporter.a() : null;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.a, arrayList);
        arwa.b("bitmap", this.c, arrayList);
        return arwa.a(arrayList, this);
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
