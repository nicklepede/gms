package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwgr;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CallingCardMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwgr();
    public final CallingCardFontData a;
    public final CallingCardFullScreenImageData b;

    public CallingCardMetadata(CallingCardFontData callingCardFontData, CallingCardFullScreenImageData callingCardFullScreenImageData) {
        this.a = callingCardFontData;
        this.b = callingCardFullScreenImageData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardMetadata) {
            CallingCardMetadata callingCardMetadata = (CallingCardMetadata) obj;
            if (ekus.a(this.a, callingCardMetadata.a) && ekus.a(this.b, callingCardMetadata.b)) {
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
        CallingCardFontData callingCardFontData = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, callingCardFontData, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
