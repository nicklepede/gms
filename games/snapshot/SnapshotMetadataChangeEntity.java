package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bjwr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SnapshotMetadataChangeEntity extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjwr();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.I(parcel, 2, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.I(parcel, 6, this.e);
        atzr.c(parcel, a);
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
        atzb.m(z, "Cannot set both a URI and an image");
    }
}
