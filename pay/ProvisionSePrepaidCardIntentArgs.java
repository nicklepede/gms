package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ProvisionSePrepaidCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnc();
    public SeServiceProvider a;

    private ProvisionSePrepaidCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionSePrepaidCardIntentArgs) {
            return atyq.b(this.a, ((ProvisionSePrepaidCardIntentArgs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }

    public ProvisionSePrepaidCardIntentArgs(SeServiceProvider seServiceProvider) {
        this.a = seServiceProvider;
    }
}
