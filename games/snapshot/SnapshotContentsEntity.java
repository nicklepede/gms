package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bhsa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SnapshotContentsEntity extends GamesAbstractSafeParcelable implements SnapshotContents {
    public static final Parcelable.Creator CREATOR = new bhsa();
    public final Contents a;

    public SnapshotContentsEntity(Contents contents) {
        this.a = contents;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.c(parcel, a);
    }
}
