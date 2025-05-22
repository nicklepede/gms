package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvlc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class EmoneyCardFinishSetupStatusData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvlc();
    public int a;
    public String b;
    public String c;

    private EmoneyCardFinishSetupStatusData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmoneyCardFinishSetupStatusData) {
            EmoneyCardFinishSetupStatusData emoneyCardFinishSetupStatusData = (EmoneyCardFinishSetupStatusData) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(emoneyCardFinishSetupStatusData.a)) && atyq.b(this.b, emoneyCardFinishSetupStatusData.b) && atyq.b(this.c, emoneyCardFinishSetupStatusData.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public EmoneyCardFinishSetupStatusData(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
