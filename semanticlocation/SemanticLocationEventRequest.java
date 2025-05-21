package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.czgz;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgz();
    public final float a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public SemanticLocationEventRequest(float f, int i, int i2, float f2, long j) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        return obj instanceof SemanticLocationEventRequest;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return arwa.a(new ArrayList(), this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 1, f);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.l(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
