package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbph;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ActivityOngoingEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbph();
    public final float a;

    @Deprecated
    public final float b;
    public final ActivityCandidate c;
    public final AdditionalActivityCandidates d;

    public ActivityOngoingEvent(float f, float f2, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.a = f;
        this.b = f2;
        this.c = activityCandidate;
        this.d = additionalActivityCandidates;
    }

    public final String toString() {
        AdditionalActivityCandidates additionalActivityCandidates = this.d;
        return "ActivityOngoingEvent{probability=" + this.a + ", topCandidate=" + String.valueOf(this.c) + ", additionalActivityCandidates=" + String.valueOf(additionalActivityCandidates) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = atzr.a(parcel);
        atzr.l(parcel, 1, f);
        atzr.l(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
