package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class EmoneyCardFinishSetupStatusData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbx();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(emoneyCardFinishSetupStatusData.a)) && arwb.b(this.b, emoneyCardFinishSetupStatusData.b) && arwb.b(this.c, emoneyCardFinishSetupStatusData.c)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public EmoneyCardFinishSetupStatusData(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
