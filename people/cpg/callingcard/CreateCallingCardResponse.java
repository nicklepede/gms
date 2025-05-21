package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctxx;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class CreateCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctxx();
    public final CallingCardRequestStatus a;
    public final CallingCardIdentifier b;

    public CreateCallingCardResponse(CallingCardRequestStatus callingCardRequestStatus, CallingCardIdentifier callingCardIdentifier) {
        this.a = callingCardRequestStatus;
        this.b = callingCardIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateCallingCardResponse) {
            CreateCallingCardResponse createCallingCardResponse = (CreateCallingCardResponse) obj;
            if (eihn.a(this.a, createCallingCardResponse.a) && eihn.a(this.b, createCallingCardResponse.b)) {
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
        CallingCardRequestStatus callingCardRequestStatus = this.a;
        int i2 = i | 1;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, callingCardRequestStatus, i2, false);
        arxc.t(parcel, 2, this.b, i2, false);
        arxc.c(parcel, a);
    }
}
