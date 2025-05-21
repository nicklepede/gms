package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.auxm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auxm();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public CallerInfo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerInfo)) {
            return false;
        }
        CallerInfo callerInfo = (CallerInfo) obj;
        return arwb.b(callerInfo.a, this.a) && arwb.b(callerInfo.b, this.b) && arwb.b(callerInfo.c, this.c) && arwb.b(callerInfo.d, this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
