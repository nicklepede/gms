package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwhd;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CreateCallingCardResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwhd();
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
            if (ekus.a(this.a, createCallingCardResponse.a) && ekus.a(this.b, createCallingCardResponse.b)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, callingCardRequestStatus, i2, false);
        atzr.t(parcel, 2, this.b, i2, false);
        atzr.c(parcel, a);
    }
}
