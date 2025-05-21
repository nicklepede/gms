package com.google.android.gms.people.cpg.callingcard;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctxz;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctxz();
    public final CallingCardRequestStatus a;
    public final int b;
    public final Uri c;
    public final String d;
    public final CallingCardMetadata e;

    public GetCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, int i, Uri uri, String str, CallingCardMetadata callingCardMetadata) {
        this.a = callingCardRequestStatus;
        this.b = i;
        this.c = uri;
        this.d = str;
        this.e = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCallingCardResponse) {
            GetCallingCardResponse getCallingCardResponse = (GetCallingCardResponse) obj;
            if (eihn.a(this.a, getCallingCardResponse.a) && this.b == getCallingCardResponse.b && eihn.a(this.c, getCallingCardResponse.c) && eihn.a(this.d, getCallingCardResponse.d) && eihn.a(this.e, getCallingCardResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, callingCardRequestStatus, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}
