package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TimelineMemory extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbrc();
    public final Trip a;
    public final Note b;

    public TimelineMemory(Trip trip, Note note) {
        this.a = trip;
        this.b = note;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Trip trip = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, trip, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
