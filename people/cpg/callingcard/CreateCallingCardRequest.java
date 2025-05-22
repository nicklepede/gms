package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwhc;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CreateCallingCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwhc();
    public final int a;
    public final CallingCardFileData b;
    public final CallingCardMetadata c;

    public CreateCallingCardRequest(int i, CallingCardFileData callingCardFileData, CallingCardMetadata callingCardMetadata) {
        this.a = i;
        this.b = callingCardFileData;
        this.c = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateCallingCardRequest) {
            CreateCallingCardRequest createCallingCardRequest = (CreateCallingCardRequest) obj;
            if (this.a == createCallingCardRequest.a && ekus.a(this.b, createCallingCardRequest.b) && ekus.a(this.c, createCallingCardRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        int i3 = i | 1;
        atzr.t(parcel, 2, this.b, i3, false);
        atzr.t(parcel, 3, this.c, i3, false);
        atzr.c(parcel, a);
    }
}
