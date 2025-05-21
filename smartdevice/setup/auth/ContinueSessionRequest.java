package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.defd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ContinueSessionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new defd();
    public final String a;
    public final String b;

    public ContinueSessionRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContinueSessionRequest) {
            ContinueSessionRequest continueSessionRequest = (ContinueSessionRequest) obj;
            if (arwb.b(this.a, continueSessionRequest.a) && arwb.b(this.b, continueSessionRequest.b)) {
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
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
