package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czhe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TimelineMemory extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czhe();
    public final Trip a;
    public final Note b;

    public TimelineMemory(Trip trip, Note note) {
        this.a = trip;
        this.b = note;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Trip trip = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, trip, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
