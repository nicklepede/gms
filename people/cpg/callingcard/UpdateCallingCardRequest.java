package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwhg;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UpdateCallingCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwhg();
    public final CallingCardIdentifier a;
    public final CallingCardFileData b;
    public final CallingCardMetadata c;

    public UpdateCallingCardRequest(CallingCardIdentifier callingCardIdentifier, CallingCardFileData callingCardFileData, CallingCardMetadata callingCardMetadata) {
        this.a = callingCardIdentifier;
        this.b = callingCardFileData;
        this.c = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateCallingCardRequest) {
            UpdateCallingCardRequest updateCallingCardRequest = (UpdateCallingCardRequest) obj;
            if (ekus.a(this.a, updateCallingCardRequest.a) && ekus.a(this.b, updateCallingCardRequest.b) && ekus.a(this.c, updateCallingCardRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardIdentifier callingCardIdentifier = this.a;
        int i2 = i | 1;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, callingCardIdentifier, i2, false);
        atzr.t(parcel, 2, this.b, i2, false);
        atzr.t(parcel, 3, this.c, i2, false);
        atzr.c(parcel, a);
    }
}
