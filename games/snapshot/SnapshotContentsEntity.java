package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bjwp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SnapshotContentsEntity extends GamesAbstractSafeParcelable implements SnapshotContents {
    public static final Parcelable.Creator CREATOR = new bjwp();
    public final Contents a;

    public SnapshotContentsEntity(Contents contents) {
        this.a = contents;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }
}
