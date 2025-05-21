package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AddLoyaltyCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbl();
    public long a;
    public String b;
    public boolean c;
    public IntentSource d;
    public String e;

    private AddLoyaltyCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddLoyaltyCardIntentArgs) {
            AddLoyaltyCardIntentArgs addLoyaltyCardIntentArgs = (AddLoyaltyCardIntentArgs) obj;
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(addLoyaltyCardIntentArgs.a)) && arwb.b(this.b, addLoyaltyCardIntentArgs.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(addLoyaltyCardIntentArgs.c)) && arwb.b(this.d, addLoyaltyCardIntentArgs.d) && arwb.b(this.e, addLoyaltyCardIntentArgs.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public AddLoyaltyCardIntentArgs(long j, String str, boolean z, IntentSource intentSource, String str2) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = intentSource;
        this.e = str2;
    }
}
