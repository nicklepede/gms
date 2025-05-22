package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SecureElementPrepaidTosIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnj();
    public SecureElementPrepaidTosSection[] a;
    public String b;

    private SecureElementPrepaidTosIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecureElementPrepaidTosIntentArgs) {
            SecureElementPrepaidTosIntentArgs secureElementPrepaidTosIntentArgs = (SecureElementPrepaidTosIntentArgs) obj;
            if (Arrays.equals(this.a, secureElementPrepaidTosIntentArgs.a) && atyq.b(this.b, secureElementPrepaidTosIntentArgs.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public SecureElementPrepaidTosIntentArgs(SecureElementPrepaidTosSection[] secureElementPrepaidTosSectionArr, String str) {
        this.a = secureElementPrepaidTosSectionArr;
        this.b = str;
    }
}
