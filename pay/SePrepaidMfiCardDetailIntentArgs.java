package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctec;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SePrepaidMfiCardDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctec();
    public SeServiceProvider a;
    public String b;

    private SePrepaidMfiCardDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SePrepaidMfiCardDetailIntentArgs) {
            SePrepaidMfiCardDetailIntentArgs sePrepaidMfiCardDetailIntentArgs = (SePrepaidMfiCardDetailIntentArgs) obj;
            if (arwb.b(this.a, sePrepaidMfiCardDetailIntentArgs.a) && arwb.b(this.b, sePrepaidMfiCardDetailIntentArgs.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public SePrepaidMfiCardDetailIntentArgs(SeServiceProvider seServiceProvider, String str) {
        this.a = seServiceProvider;
        this.b = str;
    }
}
