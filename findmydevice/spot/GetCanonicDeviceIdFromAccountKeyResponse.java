package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetCanonicDeviceIdFromAccountKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvi();
    public String a;
    public String b;

    public GetCanonicDeviceIdFromAccountKeyResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCanonicDeviceIdFromAccountKeyResponse) {
            GetCanonicDeviceIdFromAccountKeyResponse getCanonicDeviceIdFromAccountKeyResponse = (GetCanonicDeviceIdFromAccountKeyResponse) obj;
            if (arwb.b(this.a, getCanonicDeviceIdFromAccountKeyResponse.a) && arwb.b(this.b, getCanonicDeviceIdFromAccountKeyResponse.b)) {
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
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public GetCanonicDeviceIdFromAccountKeyResponse(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
