package com.google.android.gms.libs.gmscorelogger.experiencelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.brph;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ExperienceTokenParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brph();
    public final long a;

    public ExperienceTokenParcelable(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExperienceTokenParcelable) && this.a == ((ExperienceTokenParcelable) obj).a;
    }

    public final int hashCode() {
        return (int) this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.c(parcel, a);
    }
}
