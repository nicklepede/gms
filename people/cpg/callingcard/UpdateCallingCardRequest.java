package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctya;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UpdateCallingCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctya();
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
            if (eihn.a(this.a, updateCallingCardRequest.a) && eihn.a(this.b, updateCallingCardRequest.b) && eihn.a(this.c, updateCallingCardRequest.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, callingCardIdentifier, i2, false);
        arxc.t(parcel, 2, this.b, i2, false);
        arxc.t(parcel, 3, this.c, i2, false);
        arxc.c(parcel, a);
    }
}
