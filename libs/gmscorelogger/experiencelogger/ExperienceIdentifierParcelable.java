package com.google.android.gms.libs.gmscorelogger.experiencelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.brpg;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ExperienceIdentifierParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brpg();
    public final Long a;
    public final long b;
    public final long c;
    public final long d;

    public ExperienceIdentifierParcelable(Long l, long j, long j2, long j3) {
        this.a = l;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperienceIdentifierParcelable)) {
            return false;
        }
        ExperienceIdentifierParcelable experienceIdentifierParcelable = (ExperienceIdentifierParcelable) obj;
        return this.b == experienceIdentifierParcelable.b && this.c == experienceIdentifierParcelable.c && this.d == experienceIdentifierParcelable.d && Objects.equals(this.a, experienceIdentifierParcelable.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, l);
        arxc.q(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
