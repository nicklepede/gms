package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.defe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ContinueSessionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new defe();
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public ContinueSessionResponse(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContinueSessionResponse) {
            ContinueSessionResponse continueSessionResponse = (ContinueSessionResponse) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(continueSessionResponse.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(continueSessionResponse.b)) && arwb.b(this.c, continueSessionResponse.c) && arwb.b(this.d, continueSessionResponse.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, Integer.valueOf(this.b), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
