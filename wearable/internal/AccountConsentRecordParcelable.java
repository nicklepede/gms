package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkgj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountConsentRecordParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgj();
    public final String a;
    private final boolean b;

    public AccountConsentRecordParcelable(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountConsentRecordParcelable)) {
            return false;
        }
        AccountConsentRecordParcelable accountConsentRecordParcelable = (AccountConsentRecordParcelable) obj;
        return this.a.equals(accountConsentRecordParcelable.a) && this.b == accountConsentRecordParcelable.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        boolean z = this.b;
        Boolean.valueOf(z).getClass();
        arxc.e(parcel, 2, z);
        arxc.c(parcel, a);
    }
}
