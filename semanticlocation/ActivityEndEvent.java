package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ActivityEndEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czfi();
    public final float a;

    @Deprecated
    public final float b;
    public final ActivityCandidate c;
    public final AdditionalActivityCandidates d;

    public ActivityEndEvent(float f, float f2, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.a = f;
        this.b = f2;
        this.c = activityCandidate;
        this.d = additionalActivityCandidates;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 1, f);
        arxc.l(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
