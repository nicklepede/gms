package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctxa;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CpgDocumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctxa();
    public final int a;
    public final PreferenceDocumentRequest b;

    public CpgDocumentRequest(int i, PreferenceDocumentRequest preferenceDocumentRequest) {
        this.a = i;
        this.b = preferenceDocumentRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocumentRequest cpgDocumentRequest = (CpgDocumentRequest) obj;
            if (this.a == cpgDocumentRequest.a && eihn.a(this.b, cpgDocumentRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
