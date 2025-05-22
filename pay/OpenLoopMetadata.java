package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenLoopMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmk();
    public String a;
    public String b;
    public String c;
    public Animation d;

    private OpenLoopMetadata() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenLoopMetadata) {
            OpenLoopMetadata openLoopMetadata = (OpenLoopMetadata) obj;
            if (atyq.b(this.a, openLoopMetadata.a) && atyq.b(this.b, openLoopMetadata.b) && atyq.b(this.c, openLoopMetadata.c) && atyq.b(this.d, openLoopMetadata.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public OpenLoopMetadata(String str, String str2, String str3, Animation animation) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = animation;
    }
}
