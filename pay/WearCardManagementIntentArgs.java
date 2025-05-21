package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctff;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WearCardManagementIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctff();
    public boolean a;
    public boolean b;

    private WearCardManagementIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WearCardManagementIntentArgs) {
            WearCardManagementIntentArgs wearCardManagementIntentArgs = (WearCardManagementIntentArgs) obj;
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(wearCardManagementIntentArgs.a)) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(wearCardManagementIntentArgs.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public WearCardManagementIntentArgs(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
