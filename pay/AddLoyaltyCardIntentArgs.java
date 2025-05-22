package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvkp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AddLoyaltyCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvkp();
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
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(addLoyaltyCardIntentArgs.a)) && atyq.b(this.b, addLoyaltyCardIntentArgs.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(addLoyaltyCardIntentArgs.c)) && atyq.b(this.d, addLoyaltyCardIntentArgs.d) && atyq.b(this.e, addLoyaltyCardIntentArgs.e)) {
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public AddLoyaltyCardIntentArgs(long j, String str, boolean z, IntentSource intentSource, String str2) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = intentSource;
        this.e = str2;
    }
}
