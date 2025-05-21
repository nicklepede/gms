package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bhsc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SnapshotMetadataChangeEntity extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhsc();
    public final String a;
    public final Long b;
    public final Uri c;
    public BitmapTeleporter d;
    public final Long e;

    SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.I(parcel, 2, this.b);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.I(parcel, 6, this.e);
        arxc.c(parcel, a);
    }

    public SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this.a = str;
        this.b = l;
        this.d = bitmapTeleporter;
        this.c = uri;
        this.e = l2;
        boolean z = true;
        if (bitmapTeleporter != null && uri != null) {
            z = false;
        }
        arwm.m(z, "Cannot set both a URI and an image");
    }
}
