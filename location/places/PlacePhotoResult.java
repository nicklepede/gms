package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccnt;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class PlacePhotoResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new ccnt();
    public final Status a;
    final BitmapTeleporter b;
    private final Bitmap c;

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapTeleporter) {
        this.a = status;
        this.b = bitmapTeleporter;
        this.c = bitmapTeleporter != null ? bitmapTeleporter.a() : null;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.a, arrayList);
        atyp.b("bitmap", this.c, arrayList);
        return atyp.a(arrayList, this);
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
